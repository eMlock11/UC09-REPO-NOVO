const input = require("../input");

(async () => {
    console.log(`Cardápio:\n 100 - X-Salada (R$ 12.00)\n 101 - X-Burger (R$ 10.00)\n 102 - Cachorro-Quente (R$ 8.50)\n 103 - Suco (R$ 6.00)\n 104 - Refrigerante (R$ 5.00)`)
    var coiso = Number (await input())
    console.log(`Escolha a quantidade de unidades do item desejado: `)
    var quantidade = Number (await input())


switch (true){
case coiso == 100:
    let valor = 12
    console.log(`Você escolheu ${quantidade} unidades de X Salada, valor total: ${valor*quantidade} R$`)
    break
case coiso == 101:
    let valor1 = 10
    console.log(`Você escolheu ${quantidade} unidades de X Burguer, valor total: ${valor1*quantidade} R$`)
    break
case coiso == 102:
    let valor2 = 8.50
    console.log(`Você escolheu ${quantidade} unidades de Cachorro-Quente, valor total: ${valor2*quantidade} R$`)       
    break
case coiso == 103:
    let valor3 = 6
    console.log(`Você escolheu ${quantidade} unidades de Suco, valor total: ${valor3*quantidade} R$`)
    break
case coiso == 104:
    let valor4 = 5
    console.log(`Você escolheu ${quantidade} unidades de Refrigerante, valor total: ${valor4*quantidade} R$`)
    break
default:
    console.log(`Você não escolheu nada`)
}})();