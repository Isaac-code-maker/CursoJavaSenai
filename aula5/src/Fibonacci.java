import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int n1 = 0, n2 = 1, qtd;

        System.out.println("Quantos elementos? ");
        qtd = scan.nextInt();

        for(int i = 1; i <= qtd; i++){
            System.out.println("(" + i + ")" + n1 );

            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

        }
        System.out.println("Fim");

        scan.close();
    }
}
