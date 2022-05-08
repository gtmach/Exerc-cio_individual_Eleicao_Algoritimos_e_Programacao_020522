import java.util.Scanner; //importa o scanner para receber entradas

public class eleicao { //inicia a classe
    public static void main(String[] args) { //inicia o metodo main
        Scanner sc = new Scanner(System.in); //inicia um scanner
        int voto, i = 0; //inicia variaveis int
        double votosPT = 0, votosPDT = 0, votosPL = 0, votosPSDB = 0, votosNulo = 0, votosBranco = 0; //inicia variaveis double

        System.out.println("Numero de eleitores nesta urna:"); //exibe instrucoes na tela em formato de texto
        int n = sc.nextInt(); //atribui valor digitado a variavel n

        if (n <= 0) { //verifica se o numero de eleitores é menor ou igual a zero (nao pode ser negativo nem zero)
            System.err.println("Digite um numero de eleitores maior do que zero!"); //exibe texto em formato de erro
            censo.main(args); //reinica o programa para que o valor seja digitado novamente
        }
        do { //inicia o loop do while
            System.out.println("digite o codigo do candidato: <1 = PT, 2 = PDT , 3 = PL, 4 - PSDB, 5 = voto nulo, 6 = voto em branco>"); //exibe instrucoes em texto
            voto = sc.nextInt(); //armazena o valor digitado a varivel voto
            switch (voto) { //inicia o seletor switch com a opcao digitada armazenada em voto
                case 1 -> votosPT++; //caso 1, adiciona +1 a variavel
                case 2 -> votosPDT++; //caso 2, adiciona +1 a variavel
                case 3 -> votosPL++; //caso 3, adiciona +1 a variavel
                case 4 -> votosPSDB++; //caso 4, adiciona +1 a variavel
                case 5 -> votosNulo++; //caso 5, adiciona +1 a variavel
                case 6 -> votosBranco++; //caso 6, adiciona +1 a variavel
                default -> { //caso seja digitado uma opcao nao listada
                    System.err.println("Opcao invalida!"); //exibe texto em formato de erro (poderia tambem ser atribuido ao  voto nulo)
                    continue; //retorna ao inicio do switch sem aumentar o contador, para tentar novamente caso valor invalido seja digitado
                }

            }
            i++; //adiciona +1 ao contador
        } while (i < n); //verifica se o contador chegou ao valor de n para interromper o loop

        System.out.println("--Apuracao dos resultados--"); //exibe instrucoes em forma de texto
        System.out.println("Votos do partido (13)PT: " + String.format("%.0f",votosPT) + " - " + (String.format("%.2f",(votosPT/n)*100) + "%")); //exibe texto, calcula media e exibe total de votos, formatando em casas decimais adequadas
        System.out.println("Votos do partido (12)PDT: " + String.format("%.0f",votosPDT) + " - " + (String.format("%.2f",(votosPDT/n)*100) + "%")); //exibe texto, calcula media e exibe total de votos, formatando em casas decimais adequadas
        System.out.println("Votos do partido (22)PL: " + String.format("%.0f",votosPL) + " - " + (String.format("%.2f",(votosPL/n)*100) + "%")); //exibe texto, calcula media e exibe total de votos, formatando em casas decimais adequadas
        System.out.println("Votos do partido (45)PSDB: " + String.format("%.0f",votosPSDB) + " - " + (String.format("%.2f",(votosPSDB/n)*100) + "%")); //exibe texto, calcula media e exibe total de votos, formatando em casas decimais adequadas
        System.out.println("Votos nulos: " + String.format("%.0f",votosNulo) + " - " + (String.format("%.2f",(votosNulo/n)*100) + "%")); //exibe texto, calcula media e exibe total de votos, formatando em casas decimais adequadas
        System.out.println("Votos brancos: " + String.format("%.0f",votosBranco) + " - " + (String.format("%.2f",(votosBranco/n)*100) + "%")); //exibe texto, calcula media e exibe total de votos, formatando em casas decimais adequadas
        // Sugestao: opcao 0 poderia ser branco, e opcoes fora das citadas poderiam ser nulos
    }

}
