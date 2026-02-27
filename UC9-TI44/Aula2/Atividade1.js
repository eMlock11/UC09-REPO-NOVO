const input = require("../input");


(async () => {
    console.log ("Qual o seu primeiro nome");
    let pri = await input ();
    console.log ("Qual o seu segundo nome");
    let sob = await input ();

    let r = sob[0].toUpperCase();
    let min = pri.toLowerCase();
    let resul = min[0].toUpperCase() + min.slice(1);
    console.log(`Citação ${r}. ${resul}`);
})();