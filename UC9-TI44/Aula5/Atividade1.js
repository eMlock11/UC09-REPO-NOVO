const input = require("../input");

(async () => {
    console.log(`Cardápio:\n 1- X Salada\n 2- X Burguer\n 3- Misto Quente\n 4- Suco Natural\n 5- Refrigerante`)
    var coiso = await input()


switch (true){
case coiso == 1:
    console.log("Você escolheu o X Salada!")
    break
case coiso == 2:
    console.log("Você escolheu o X Burguer!")
    break
case coiso == 3:
    console.log("Você escolheu o Misto Quente!")       
    break
case coiso == 4:
    console.log("Você escolheu o Suco Natural!")
    break
case coiso == 5:
    console.log("Você escolheu o Refrigerante!")
    break
default:
    console.log("Você não escolheu nada")
}})();