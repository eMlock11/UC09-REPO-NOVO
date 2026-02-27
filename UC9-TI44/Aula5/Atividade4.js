const input = require("../input");

(async () => {
    console.log(`Qual o valor total da sua compra?`)
    var coiso = Number(await input())

switch (true){

case coiso >=20 && coiso <50:
    conta = 5/100*coiso
    console.log(`Desconto de 5% aplicado!, Valor total: ${coiso-conta} R$`)
    break

case coiso <=50 && coiso <100:
    conta1 = 10/100*coiso
    console.log(`Desconto de 10% aplicado!, Valor total: ${coiso-conta1} R$`)
    break

case coiso >=100:
    conta2 = 20/100*coiso
    console.log(`Desconto de 20% aplicado!, Valor total: ${coiso-conta2} R$`)       
    break

default:
    console.log(`Sem desconto valor muito baixo, Valor total: ${coiso} R$`)
    break
}})();