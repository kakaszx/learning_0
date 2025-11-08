import User from "./User.js";

export default class Docente extends User {
  constructor(nome, email, nascimento, role = "docente", ativo = "true") {
    super(nome, email, nascimento, role, ativo);
  }

  aprovarEstudante(estudante, curso) {
    return `estudante ${estudante} passou no cruso de ${curso}, responsavel ${this.nome}`;
  }
}

// const novaDocente = new Docente("Ana", "a@a.com", "2024-01-03");
// console.log(novaDocente.aprovarEstudante("Juliana", "Javascript"));
