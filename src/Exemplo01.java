import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int [][] numeros = new int [3][3];

        for (int linhas = 0; linhas < 3; linhas ++){
            for (int colunas = 0; colunas < 3; colunas++){
                System.out.println("Informe o elemento da matriz " + "linha " +
                        linhas + " coluna " + colunas + ":");
                numeros [linhas][colunas] = entrada.nextInt();

            }
        }

        for (int linha = 0; linha< 3; linha ++){
            for (int coluna = 0; coluna < 3; coluna ++){
                System.out.print("Matriz Números [" + linha + " ," +
                        coluna + "]" + numeros[linha][coluna]);
            }
        }

        System.out.println("|-> Exibindo Matriz Formatada <-|");
        for (int li = 0; li < 3; li ++){
            for (int col = 0; col < 3; col ++){
                System.out.print(numeros[li][col] + "\t");
            }
            System.out.println();
        }

    }
}
