const input = require("../input");


(async () => {
    console.log ("Escolha um número");
    let pri = await input ();
    console.log ("Escolha outro número");
    let seg = await input ();
    let soma = Number (pri) + Number (seg)
    console.log("A soma dos seus números é "+ soma);
})();