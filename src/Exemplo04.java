import java.util.Scanner;

public class Exemplo04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double [][] preco = new double [5][2];
        int [][] codigoProduto = new int [5][2];

        System.out.printf("---> Atividade 04 <---");
        for (int i = 0; i <5 ; i++) {
            System.out.println("Codigo do produto: " );
            preco [i][0] = entrada.nextDouble();
            System.out.println("Quantidade: ");
            codigoProduto [i][0] = entrada.nextInt();

        }



    }
}
