import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int n1, n2, r, ope = 0;

        while (ope >= 0) {

            System.out.println("Esolha a operação: ");
            System.out.println("1)Soma\n2)Subtração\n3)Multiplicação\n4)Divisão\nDigite 0 para sair\n");
            ope = scan.nextInt();

            switch (ope) {
                case 1:

                    System.out.print("Escolha o primeiro número: ");
                    n1 = scan.nextInt();

                    System.out.print("Escolha o segundo número: ");
                    n2 = scan.nextInt();
                    r = n1 + n2;

                    System.out.println(r);

                    break;

                case 2:

                    System.out.print("Escolha o primeiro número: ");
                    n1 = scan.nextInt();

                    System.out.print("Escolha o segundo número: ");
                    n2 = scan.nextInt();
                    r = n1 - n2;

                    System.out.println(r);

                    break;

                case 3:

                    System.out.print("Escolha o primeiro número: ");
                    n1 = scan.nextInt();

                    System.out.print("Escolha o segundo número: ");
                    n2 = scan.nextInt();
                    r = n1 * n2;

                    System.out.println(r);

                    break;

                case 4:

                    System.out.print("Escolha o primeiro número: ");
                    n1 = scan.nextInt();

                    System.out.print("Escolha o segundo número: ");
                    n2 = scan.nextInt();

                    double z = (double) n1 / (double) n2;

                    System.out.println(z);

                    break;

                case 0:
                    System.out.println("Encerrando...");
                    ope--;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        scan.close();
    }
}
