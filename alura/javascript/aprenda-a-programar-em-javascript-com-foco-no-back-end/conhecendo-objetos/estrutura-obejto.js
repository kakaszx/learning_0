const estudante = {
  nome: "José Silva",
  idade: 32,
  cpf: "12312312312",
  turma: "JavaScript",
};

// console.log(estudante.nome);
// console.log(estudante.idade);
// console.log(estudante.cpf);
// console.log(estudante.turma);

// console.log(`O nome do estudante é ${estudante.nome}`);
// console.log(`A idade do estudante é ${estudante.idade}`);
// console.log(`O cpf do estudante é ${estudante.cpf}`);
// console.log(`A turma do estudante é ${estudante.turma}`);

console.log(estudante.nome);
console.log(`O nome do estudante é ${estudante.nome}`);
console.log(`os três primeiros números do CPF são ${estudante.cpf.substring(0, 3)}`);
