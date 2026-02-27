const input = require("../input");


(async () => {
    console.log ("Digite uma frase");
    let pri = await input ();
    console.log (`A sua frase tem ${pri.length} caracteres`)
    
})();