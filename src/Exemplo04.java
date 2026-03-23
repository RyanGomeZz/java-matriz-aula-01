import java.util.Scanner;

public class Exemplo04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[][] preco = new double[5][2];
        int[][] produto = new int[5][2];
        double totalGeral=0;

        System.out.println("---> Atividade 04 <---");

        for (int i = 0; i < 5; i++) {

            System.out.println("\nProduto " + (i + 1));

            System.out.print("Codigo do produto: ");
            produto[i][0] = entrada.nextInt();// o 0 ou 1 fala qual a coluna a ser inserida o conteudo

            System.out.print("Quantidade: ");
            produto[i][1] = entrada.nextInt();

            System.out.print("Preço: ");
            preco[i][0] = entrada.nextDouble();

            // subtotal
            preco[i][1] = produto[i][1] * preco[i][0];
            totalGeral += preco[i][1];
        }

        // RELATÓRIO
        System.out.println("\n--- RELATORIO ---");
        System.out.println("Cod\tQtd\tPreco\tSubtotal");

        for (int i = 0; i < 5; i++) {
            System.out.println(
                    produto[i][0] + "\t" +
                            produto[i][1] + "\t" +
                            preco[i][0] + "\t" + "\t"+
                            preco[i][1]
            );
        }
        System.out.println("\n--- TOTAL ---");
        System.out.println("Total Geral: "+totalGeral);


    }
}