const input = require("../input");

const { validaremail } = require("./jonas");

(async () => {

    console.log("Por favor insira seu E-mail nesse site muito confiável e nem um pouco suspeito")

    let email = await input ();

    if(validaremail(email)){

        console.log("Seu E-mail é valido")

    }else{

        console.log("Seu E-mail é invalido escreva essa merda direito seu animal")

    }

})();