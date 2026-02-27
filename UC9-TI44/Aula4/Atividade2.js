const input = require("../input");

(async () =>{
console.log("Insira o valor para o pão: ")
let pao = Number (await input())
console.log("Insira o valor para a salsicha: ")
let sic = Number (await input())
console.log("Insira o valor para o bacon: ")
let bac = Number (await input())
console.log("Insira o valor para o pure de batata: ")
let bat = Number (await input())
console.log("Insira o valor para a salada: ")
let sal = Number (await input())
console.log("Insira o valor para a batata palha: ")
let pal = Number (await input())
console.log("Insira a % de lucro desejada: ")
let lucro = Number (await input())/100



//% de lucro escolhida de 50%

console.log("Você deseja calcular o valor de qual lanche? (1-4)")
let lanche = await input()
    if(lanche =="1"){
        console.log(`O preço de custo do lanche 1 é de: ${pao + sic + bat +pal}R$, o valor de lucro é de: ${(pao + sic + bat +pal)*lucro} R$ \nE o valor final é de: ${pao + sic + bat +pal +(pao + sic + bat +pal)*lucro}R$`)

    }else if(lanche =="2"){
        console.log(`O preço de custo 2 é de: ${pao + sic + sal +pal}R$, o valor de lucro é de: ${(pao + sic + sal +pal)*lucro} R$ \nE o valor final é de: ${pao + sic + sal +pal +(pao + sic + sal +pal)*lucro}R$`)

    }else if(lanche =="3"){
        console.log(`O preço de custo 2 é de: ${pao + pal + (sic*2) + bat + bac }R$, o valor de lucro é de: ${(pao + pal + (sic*2) + bat + bac )*lucro} R$ \nE o valor final é de: ${pao + pal + (sic*2) + bat + bac  +(pao + pal + (sic*2) + bat + bac )*lucro}R$`)

    }else if(lanche =="4"){
        console.log(`O preço de custo 2 é de: ${pao + pal + (sic*2) + (bat*2) + bac +sal }R$, o valor de lucro é de: ${(pao + pal + (sic*2) + (bat*2) + bac +sal)*lucro} R$ \nE o valor final é de: ${pao + pal + (sic*2) + (bat*2) + bac +sal +(pao + pal + (sic*2) + (bat*2) + bac +sal)*lucro}R$`)


    }
    



})()