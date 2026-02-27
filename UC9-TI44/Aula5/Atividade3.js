const input = require("../input");

(async () => {
    console.log(`Escolha o tamanho do seu combo entre P,M ou G:`)
    var coiso = (await input())
    let coiso1 = coiso.toUpperCase()
switch (true){

case coiso1 == "P":
    console.log(`Você escolheu o combo pequeno (R$15.00)`)
    break

case coiso1 == "M":
    console.log(`Você escolheu o combo médio (R$20.00)`)
    break

case coiso1 == "G":
    console.log(`Você escolheu o combo grande(R$25.00)`)       
    break

default:
    console.log(`Tamanho Inválido`)
    break
}})();