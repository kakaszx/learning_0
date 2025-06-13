import { MongoClient } from "mongodb";

const cliente = new MongoClient(
  "mongodb+srv://kakaszx:...@cluster.zn4xpxs.mongodb.net/?retryWrites=true&w=majority&appName=Cluster"
);

let documentosColecao;

try {
  await cliente.connect();

  const db = cliente.db("alura-websockets");
  documentosColecao = db.collection("documentos");

  console.log("conexao foda!");
} catch (erro) {
  console.log(erro);
}

export { documentosColecao };
