export default function trataErros(erro) {
  if (erro.code === "ENOENT") {
    throw new Error("Arquivo não encontrado");
    // Para nao aparecer o stack trace / e coloca console log no trataErros index.js
    // return "Arquivo não encontrado";
  } else {
    return "Erro na aplicação";
  }
}
