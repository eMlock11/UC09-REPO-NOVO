console.log("Olá Mundo");

var nome = "Jonas";
//estou fazendo uma concatenação
console.log("Olá "+nome)

var idade = 20;
//estou fazendo uma interpolação
console.log(`Ola ${nome}, sua idade é ${idade}`);

//camelcase
var cestacafe = [] //vetor
cestacafe[0] = "café";//atribuição
cestacafe[1]= "ovo";
//undercase
var cesta_cafe = ["café", "ovo"];

cestacafe.push("bacon");
cesta_cafe.push("pão");

console.log(cestacafe);
console.log(cesta_cafe);

/*
() parenteses-
[] colchete-
{} chaves-
 */

var informacoes = ["Jonas/20 Anos/19971024228"];

console.log(informacoes);

//estrutura dicionário, classe anonima
var usuario = {
    nome: "Jonas", 
    idade: "20",
    telefone: "19971024228"


};

console.log(usuario.idade);


var telefonica = {
    pessoa1: "José Bonifácio, 199897365, São Carlos Rua dos Guadalupes 1203",
    pessoa2: "Paulo Fernandes, 169883276, Itirapina Centro 87"
}

console.log(telefonica);

var lista = [];

lista.push({id:1, nome: "Cebola", valor: 2});
lista.push({id:2, nome: "Alho", valor: 1});



console.log(lista.produto1);
console.log("A soma dos produtos é R$3,00")

var alunos = [];

alunos.push({nome: "Carlos Feliciano", nota: 6});
alunos.push({nome: "João Felipe", nota: 4});
alunos.push({nome: "Paulo Henrique", nota: 8});

var soma = alunos[0].nota + alunos[1].nota + alunos[2].nota;

console.log(soma/3);

