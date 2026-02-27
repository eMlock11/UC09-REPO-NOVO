const input = require("../input");

const { validaremail } = require("./jonas");

const { validartelefone } = require("./jonas");

(async () => {

    let agenda = [];
    let continuar = "sim";
    do {
        console.log("Digite um nome:")
        let nome = await input();

        console.log("Digite um telefone:")
        let fone = await input();

        console.log("Digite um email:")
        let email = await input();

        if (validaremail(email) && validartelefone(fone)) {

            console.log("Sua agenda está pronta!: " + agenda)


            agenda.push(
                {
                    email: email,
                    nome: nome,
                    telefone: fone
                }
            );

            console.log("Deseja continuar? (sim)")
            continuar = (await input()).toLowerCase();

        }

    } while (agenda.length <= 5 && continuar == "sim")
        console.log(agenda)

})(); 
