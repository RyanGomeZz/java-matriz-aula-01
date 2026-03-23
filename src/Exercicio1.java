import java.util.Scanner;

public class Exercicio1 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] milhagem = new int[4][5];

        for (int i = 0; i < 4; i++) {

            System.out.println("digite o codigo do cliente: "+(i+1));
            milhagem[i][0] = entrada.nextInt();
            System.out.println("Digite a quantidade de milhas: ");
            milhagem[i][1] = entrada.nextInt();

            System.out.println("Categoria: ");
            milhagem[i][2] = entrada.nextInt();

            while (milhagem[i][2] != 1 && milhagem[i][2]!= 2 && milhagem[i][2] != 3 ){

                System.out.println("Digite uma Categoria valida: ");
                milhagem[i][2] = entrada.nextInt();



            }

            if (milhagem[i][2]== 1){
                milhagem[i][3] = 10000;

            } else if (milhagem[i][2]== 2) {
                milhagem[i][3] = 5000;

            }
            else {
                milhagem [i][4] =0;
            }



            milhagem[i][4] = milhagem[i][1] + milhagem[i][3];






        }
        System.out.println("\n--- RELATORIO ---");
        System.out.println("Cod do cliente\tQtd de milhas\tCategoria\tBonus\tTotal");
        for (int i = 0; i < 4; i++) {
            System.out.println(
                    milhagem[i][0] + "\t" + "\t"+  "\t"+ "\t"+
                            milhagem[i][1] + "\t" + "\t"+ "\t"+
                            milhagem[i][2] + "\t" + "\t"+ "\t"+
                            milhagem[i][3] + "\t" +  "\t"+
                            milhagem [i][4]
            );
        }


    }
}
