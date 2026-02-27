function random(inferior=0, superior=1, tipo='float'){
    if(superior<inferior)
    {
        console
            .error("O Número superior deve ser maior que o número inferior");
        return;
    }

    switch(tipo){
        case 'float': 
            return Math.random()
                *(superior+1-inferior)+(inferior);
        case 'int': 
            return Math.floor(Math.random()
                *(superior+1-inferior))+(inferior);
    }   
}
function validarCPF(cpf) {
    // Remove caracteres não numéricos
    cpf = cpf.replace(/[^\d]/g, '');
  
    // Verifica se tem 11 dígitos ou se é uma sequência repetida
    if (cpf.length !== 11 || /^(\d)\1{10}$/.test(cpf)) {
      return false;
    }
  
    // Validação do primeiro dígito verificador
    let soma = 0;
    for (let i = 0; i < 9; i++) {
      soma += parseInt(cpf.charAt(i)) * (10 - i);
    }
    let resto = (soma * 10) % 11;
    if (resto === 10 || resto === 11) resto = 0;
    if (resto !== parseInt(cpf.charAt(9))) {
      return false;
    }
  
    // Validação do segundo dígito verificador
    soma = 0;
    for (let i = 0; i < 10; i++) {
      soma += parseInt(cpf.charAt(i)) * (11 - i);
    }
    resto = (soma * 10) % 11;
    if (resto === 10 || resto === 11) resto = 0;
    if (resto !== parseInt(cpf.charAt(10))) {
      return false;
    }
  
    return true;
}

function validaremail(email){

    if (email.length <= 254 && /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email)) {
        return true;
    }else{
        return false;
    }
}

function validartelefone(fone){

    if (fone.length <= 11 && /^(\d{2})(\d{8,9})$/.test(fone)){
        return true;
    }else{
        return false;
    }
}
  
module.exports = {
    random,validarCPF,validaremail,validartelefone
}