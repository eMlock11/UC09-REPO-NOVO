const input = require("../input");

(async () => {
    console.log(`Quantos pontos você tem?`)
    var coiso = Number (await input())
   
switch (true){

case coiso <100:
    console.log(`Cliente iniciante, sem benefícios`)
    break

case coiso >=100 && coiso <300:
    console.log(`Cliente Bronze, 5% de desconto em todas as compras`)
    break

case coiso >=300 && coiso <700:
    console.log(`Cliente Prata, 10% de desconto em todas as compras`)       
    break

case coiso >=700:
    console.log(`Cliente Ouro, um combo grande grátis por mês`)       
break

default:
    console.log(`Valor Inválido`)
    break
}})();