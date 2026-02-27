let prompt = require("prompt-sync")()


let n = 0

let resposta = 7

while(true){
    
    let tr = 0
    
    n = Number (prompt ("Digite um número: "))
    
    if(resposta == n){

        console.log("Parabéns!")

        break

    }else if(resposta != n){

        console.log("Desista dos seus sonhos e morra")

        tr++

    }else if(tr == 3)

            console.log("Suas tentativas acabaram.")

            break
        }
    
    



