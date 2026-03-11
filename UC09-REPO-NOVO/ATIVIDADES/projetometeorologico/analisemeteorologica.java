package ATIVIDADES.projetometeorologico;
public class analisemeteorologica {

    //O que é um programa java?: Escreva uma vez, rode em qualquer lugar.

    // Vetor de temperaturas, criado em double para poder trabalhar com temperaturas quebradas.
    // Tipos de variaveis: Int: Númeoros inteiros/Double: Números quebrados/ String: É classe! Não primitivo/ Boolean: Apenas true ou false.
    // Operadores relacionais: == != < > <= >=.
    // Operadores lógicos: && || !.
    // Tipos de print: print: não pula linha / println: pula uma linha no final do texto./ printf: permite criar textos mais complexos usando marcadores.
    
    static double[][] temperaturas = {
            {22.5, 16.1},
            {28.3, 18.1},
            {31.8, 19.3},
            {37.2, 24.5},
            {46.7, 30.3}
    };

    // Vetor de umidades, criado em int já que diferentemente das temperaturas não trabalha com numeros quebrados.
    static int[][] umidades = {
            {83, 54, 72},
            {74, 55, 74},
            {87, 62, 85},
            {71, 58, 67},
            {70, 48, 64}
    };

    //Método que classifica o clima, retorna uma string 
    public static String classificarClima(double tempMedia, int umidadeMedia) {

        if (tempMedia > 30 && umidadeMedia > 75)
            return "PEGANDO FOGO (MUITO QUENTE)";

        else if (tempMedia >= 20 && tempMedia <= 25 && umidadeMedia >= 50 && umidadeMedia <= 70)
            return "CONFORTAVEL";

        else if (tempMedia < 15 && umidadeMedia < 50)
            return "OOOOOOOOOO LUGAR GELADOOOOO (FRIO E SECO)";

        else if (tempMedia > 25)
            return "QUENTE MODERADO";

        else
            return "QUENTE LEVE";

    //Método que gera os alertas, devolve valor em int para depois ser interpretado em Verde, Amarelo ou Vermelho no método gerarRelatorioDetalhado
    }
    public static int gerarAlertas(int cidadeIndex) {

        double max = temperaturas[cidadeIndex][0];
        double min = temperaturas[cidadeIndex][1];
        double variacao = max - min;

        int umidadeMedia = (umidades[cidadeIndex][0] +
                umidades[cidadeIndex][1] +
                umidades[cidadeIndex][2]) / 3;

        if (max > 35 || umidadeMedia > 90)
            return 2;

        else if ((max >= 30 && max <= 35 && umidadeMedia > 80) || variacao > 15)
            return 1;

        else
            return 0;
    }

    //Método que calcula a media ponderada de temperatura, retorna double.
    public static double calcularMediaPonderadaTemperatura(double max, double min) {

        if (max < -50 || max > 60 || min < -50 || min > 60) {

            return 0;
        }

        return (max * 0.7) + (min * 0.3);
    }

    //Método que identifica a cidade com maior amplitude térmica.
    public static int identificarCidadeComMaiorAmplitudeTermica() {

        double maiorAmplitude = 0;
        int indice = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            double amplitude = temperaturas[i][0] - temperaturas[i][1];

            if (amplitude > maiorAmplitude) {
                maiorAmplitude = amplitude;
                indice = i;
            }
        }

        return indice;
    }

    //Método que calcula o indice de calor.
    public static double calcularIndiceCalor(double temp, int umidade) {

        double indice = temp + 0.5 * (umidade / 100.0) * (temp - 20);

        return Math.round(indice * 10.0) / 10.0;
    }

    //Método que calcula as estatisticas avancadas para o relátorio final, retorna double
    public static double[] calcularEstatisticasAvancadas() {

        double soma = 0;//inicio da soma acumulada.
        double maior = temperaturas[0][0];//inicia o primeiro valor com o maior para referencia
        double menor = temperaturas[0][0];//inicia o segundo valor com o menor para comparar
        int total = 0;//contagem de items 

        for (double[] cidade : temperaturas) {//loop de cada cidade
            for (double temp : cidade) {//loop de temperaturas dentro da cidade atual
                soma += temp;//acumula o valor de todas as temperaturas
                total++;//soma as temperaturas processadas
                if (temp > maior) maior = temp;//atualiza o maior valor encontrado
                if (temp < menor) menor = temp;//atualiza o menor valor encontrado
            }
        }

        double media = soma / total;//calcula a media

        double somaQuadrados = 0;
        for (double[] cidade : temperaturas) {
            for (double temp : cidade) {
                somaQuadrados += Math.pow(temp - media, 2);
            }
        }

        double desvio = Math.sqrt(somaQuadrados / total);

        return new double[]{media, maior, menor, desvio};//retorna um array com os 4 valores
    }

    //Método que compara as cidades para avaliar qual tem a temperatura mais alta, retorna String.
    public static String compararCidades(int c1, int c2, int c3, int c4) {

        double media1 = calcularMediaPonderadaTemperatura(
                temperaturas[c1][0], temperaturas[c1][1]);

        double media2 = calcularMediaPonderadaTemperatura(
                temperaturas[c2][0], temperaturas[c2][1]);

         double media3 = calcularMediaPonderadaTemperatura(
                temperaturas[c3][0], temperaturas[c3][1]);

         double media4 = calcularMediaPonderadaTemperatura(
                temperaturas[c4][0], temperaturas[c4][1]);

        if (media1 > media2 && media1 > media3 && media1 > media4)
            return "Cidade #" + (c1 + 1) + " é mais quente.";
        else if (media2 > media1 && media2 > media3 && media2 > media4)
            return "Cidade #" + (c2 + 1) + " é mais quente.";
        else if (media3 > media1 && media3 > media2 && media3 > media4)
            return "Cidade #" + (c3 + 1) + " é mais quente.";
        else if (media4 > media1 && media4 > media2 && media4 > media3)
            return "Cidade #" + (c4 + 1) + " é mais quente.";
        
            
        return "Temperaturas equivalentes.";
    }

    //Método que vai gerar o relátorio completo com todos os datos, criado em void pois não precisa retornar valor.
    public static void gerarRelatorioDetalhado() {

        System.out.println("=================================================");
        System.out.println("   SISTEMA DE ANÁLISE METEOROLÓGICA SUPER FODA");
        System.out.println("=================================================\n");

        System.out.println("CIDADE | T.MAX | T.MIN | T.MÉD | UMID%| CLASSIFICAÇÃO     | ALERTA");

        for (int i = 0; i < temperaturas.length; i++) {

            double max = temperaturas[i][0];
            double min = temperaturas[i][1];

            double media = calcularMediaPonderadaTemperatura(max, min);

            int umidadeMedia = (umidades[i][0] +
                    umidades[i][1] +
                    umidades[i][2]) / 3;

            String classificacao = classificarClima(media, umidadeMedia);

            int alerta = gerarAlertas(i);

            String alertaStr = (alerta == 2) ? "VERMELHO"
                    : (alerta == 1) ? "AMARELO" : "VERDE";

            System.out.printf("   %d   | %.1f°C| %.1f°C| %.1f°C|  %d  | %-18s| %s\n",
                    (i + 1), max, min, media, umidadeMedia,
                    classificacao, alertaStr);
        }

        double[] stats = calcularEstatisticasAvancadas();

        System.out.println("\nDADOS GERAIS:");
        System.out.printf(" Temperatura média geral: %.1f°C\n", stats[0]);
        System.out.printf(" Temperatura mais alta: %.1f°C\n", stats[1]);
        System.out.printf(" Temperatura mais baixa: %.1f°C\n", stats[2]);
        System.out.printf(" Desvio padrão: %.2f\n", stats[3]);

        int maiorAmplitude = identificarCidadeComMaiorAmplitudeTermica();
        System.out.println(" Maior amplitude térmica: Cidade #" + (maiorAmplitude + 1));

        System.out.println("\nCOMPARAÇÃO:");
        System.out.println(compararCidades(1, 2, 3, 4));
    }


    public static void main(String[] args) {

        gerarRelatorioDetalhado();
    }
}



