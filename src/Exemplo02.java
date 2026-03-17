import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int [][] num = new int[4][4];
        int somaLinha = 0;
        int totalGeral = 0;

        // CARREGA MATRIZ
        for (int i = 0; i < 4; i ++){
            for (int j = 0; j < 4; j++){
                System.out.print("Digite [ " + i + " | " + j + " ]: ");
                num[i][j] = entrada.nextInt();
            }
        }

        // SOMAR MATRIZ
        for (int i = 0; i < 4; i ++){
            for (int j = 0; j < 4; j++){
                somaLinha += num[i][j];

            }
            System.out.println("Soma da linha " + i + ": " + somaLinha);
            totalGeral += somaLinha;
            somaLinha = 0;
        }
        System.out.println("Total geral: " + totalGeral














































































































































































    );


    }
}
