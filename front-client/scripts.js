const getHello = async () => {
  const response = await fetch("http://127.0.0.1:8762/hello");
  const json = await response.json();
  return json.data;
};

const getWorld = async () => {
  const response = await fetch("http://127.0.0.1:8763/world");
  const text = await response.text();
  return text;
};

const insertResponses = async () => {
  const mainTitle = document.getElementById("mainTitle");
  const responseHello = await getHello();
  const responseWorld = await getWorld();
  mainTitle.innerText = responseHello + responseWorld;
};

insertResponses();
