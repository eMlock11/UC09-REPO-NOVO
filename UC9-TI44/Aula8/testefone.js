const input = require("../input");

const { validartelefone } = require("./jonas");

(async () => {

    console.log("Por favor insira seu Telefone nesse site muito confiável e nem um pouco suspeito")

    let fone = await input ();

    if(validartelefone(fone)){

        console.log("Seu Telefone é valido")

    }else{

        console.log("Seu Telefone é invalido escreva essa merda direito seu animal")

    }

})();