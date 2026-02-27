const input = require("../input");

(async () => {
    console.log(`Qual o valor da sua compra?`)
    var coiso = Number(await input())
    console.log(`Qual a sua forma de pagamento?\n 1- Dinheiro(10% de desconto) \n 2- Débito(5% de desconto) \n 3- Crédito(sem desconto\n 4- Pix(*% de desconto)`)
    let pag = Number(await input())


switch (true){

case pag ==1:
    let desc = 10/100*coiso
    console.log(`Forma escolhida: Dinheiro, valor total: ${coiso-desc} R$`)
    break

case pag == 2:
    let desc1 = 5/100*coiso
    console.log(`Forma escolhida: Débito, Valor total: ${coiso-desc1} R$`)
    break

case pag ==3 :
    console.log(`Forma escolhida: Crédito, Valor total: ${coiso} R$`)       
    break

case pag ==4:
    let desc2 = 8/100*coiso
    console.log(`Forma escolhida: Pix, Valor total: ${coiso-desc2} R$`)
break

default:
    console.log(`Forma de pagamento inválida`)
    break
}})();