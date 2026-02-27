const input = require("../input");

(async () => {
    console.log ("Insira o angulo do primeiro vértice do seu triangulo");
    let ang1 =Number( await input ());
    
    console.log ("Insira o angulo do segundo vértice do seu triangulo");
    let ang2 =Number( await input ());
    
    console.log ("Insira o angulo do terceiro vértice do seu triangulo");
    let ang3 =Number( await input ());

    if(isNaN(ang1) ||  ang1 <= 0){
        console.log("Número invalido");
    }else if(isNaN(ang2) ||  ang2 <= 0){
        console.log("Número invalido");
    }else if(isNaN(ang3) ||  ang3 <= 0){
        console.log("Número invalido");
    }else if((ang1 > ang2 + ang3) || (ang2 > ang3 + ang1) || (ang3 > ang1 + ang2)){
        console.log("Triangulo Quebrado");
    }else if(ang1 == ang2 && ang3 == ang2){
        console.log("Seu trangulo é equilátero");
    }else if(ang1 != ang2 && ang2!= ang3 && ang1!= ang3){
        console.log("Seu trangulo é escaleno");
    }else{
        console.log("Seu trangulo é isósceles");
    }
    
})()