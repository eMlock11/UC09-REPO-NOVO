const input = require("../input");


(async () => {
    console.log ("Digite uma frase contendo a palavra startup");
    let fra = await input ();
    console.log(`${fra}`.replace("startup", "empresa"))
})();