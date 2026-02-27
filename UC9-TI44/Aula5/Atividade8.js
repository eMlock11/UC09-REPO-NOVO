(async () => {
    let sorteio = Math.floor (Math.random()*10);

    switch (true){
        
        case sorteio == 10 :
            console.log("Parabéns! Você ganhou um combo completo grátis")
            break

        case sorteio >= 7 && sorteio <=10:
            console.log("Você ganhou uma sobremesa grátis!")
            break

        default:
            console.log("Não foi dessa vez.")
    }

})(); 