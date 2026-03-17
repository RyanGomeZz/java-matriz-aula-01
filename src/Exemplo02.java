import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int [][] num = new int[4][4];
        int somaLinha = 0;
        int somaColuna = 0;
        int totalGeralLinha = 0;
        int totalGeralColuna = 0;


        // CARREGA MATRIZ
        for (int i = 0; i < 4; i ++){
            for (int j = 0; j < 4; j++){
                System.out.print("Digite [ " + i + " | " + j + " ]: ");
                num[i][j] = entrada.nextInt();
            }
        }

        // SOMAR MATRIZ (LINHA)
        System.out.println("\n---> Somando Matriz Horizontal <---");
        for (int i = 0; i < 4; i ++){
            for (int j = 0; j < 4; j++){
                somaLinha += num[i][j];

            }
            System.out.println("Soma da linha " + i + ": " + somaLinha);
            totalGeralLinha += somaLinha;
            somaLinha = 0;
        }



        // SOMAR MATRIZ (COLUNA)
        System.out.println("\n ---> Somando Matriz Vertical <---");
        for (int j = 0; j < 4; j ++){
            for (int i = 0; i < 4; i++){
                somaColuna += num[i][j];

            }
            System.out.println("Soma da linha " + j + ": " + somaColuna);
            totalGeralColuna += somaColuna;
            somaColuna = 0;
        }
        System.out.println("\nTotal geral horizontal: " + totalGeralLinha +
                "\nTotal geral vertical: " + totalGeralColuna);
    }
}
