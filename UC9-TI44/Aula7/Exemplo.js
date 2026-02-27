const input = require("../input");

(async () => {

    var num = 0

    do {
        console.log("Digite (sim) ou (não)")

        var coiso = await input()

        num++

        console.log(num)

    } while (coiso == "sim")

})();