const input = require("../input");


(async () => {
    console.log ("Digite um número");
    let num = await input ();
    console.log("O seu número multiplicado por 2 é "+ num * 2)
})();