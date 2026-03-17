import java.util.Scanner;

public class Exemplo03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double [][] notas = new double[3][4];

        System.out.printf("---> Coloque as notas <---");
        for (int a = 0; a < 3; a ++){
            System.out.printf("\nAluno: " + (a+1));
            for (int c = 0; c < 3; c ++){
                System.out.print("\nNota CheckPoint " + (c+1) + ": ");
                notas [a][c] = entrada.nextDouble();
                notas [a][3] += notas [a][c]; //Soma as três notas
            }
            notas [a][3] = notas [a][3]/3; //Atualiza a coluna 3 com a média
        }

        System.out.println("\n---> Listagem de Alunos <---");
        System.out.println("\n-> Media Final:");

        for (int i = 0; i < 3; i++){
            System.out.printf("Aluno %d: %.2f\n", (i+1), notas[i][3]);
        }

    }
}