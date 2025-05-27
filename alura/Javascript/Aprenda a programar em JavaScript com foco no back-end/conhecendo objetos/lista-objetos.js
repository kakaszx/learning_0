const estudante = {
  nome: "José Silva",
  idade: 32,
  cpf: "12312312312",
  turma: "JavaScript",
  bolsista: true,
  telefones: ["551199999998", "551199999993"],
  endereco: [
    {
      rua: "Rua Joseph Joestar",
      numero: "2",
      complemento: "Apto 22",
    },
  ],
};

estudante.endereco.push({
  rua: "Rua Dio Brando",
  numero: "3",
  complemento: null,
});

// console.log(estudante.endereco);
// console.log(estudante.endereco[1]);

const listaEnderecosComComplemento = estudante.endereco.filter(
  (endereco) => endereco.complemento
);

console.log(listaEnderecosComComplemento);
