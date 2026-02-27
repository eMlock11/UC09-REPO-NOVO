const input = require("../input");

(async () => {
    console.log(`Qual combo você deseja?\n 1: Só lanche\n 2- Lanche e batata\n 3- Lanche, batata e refrigerante:`)
    var coiso = Number(await input())
switch (true){

case coiso == 3:
    console.log(`Refrigerante`)  
    

case coiso == 2:
    console.log(`Batata`)
    

case coiso == 1:
    console.log(`Lanche`)   
    

default:
    console.log(`Combo inválido`)
    
}
})(); 