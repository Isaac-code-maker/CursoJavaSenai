import java.util.Scanner;

public class PegaInfo {

    
    @SuppressWarnings("resource")
    public static void main(String[] args) {



        int qtd,i;
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas pessoas deseja cadastar? ");
        qtd = scan.nextInt();

        Pessoa[] pessoa = new Pessoa[qtd];

        for(i = 0; i < qtd; i++){

            
            System.out.println("Digite o nome da pessoa:");
            String nome = scan.next();

            System.out.println("Informe a idade da pessoa:");
            int idade = scan.nextInt();

            System.out.println("Informe o sexo da pessoa:");
            char sexo = scan.next().charAt(0);


             pessoa[i] = new Pessoa(nome, idade, sexo);

             try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for(i =0; i < qtd; i++){

            System.out.println(pessoa[i].getPessoa());

        }
        scan.close();
    }
}
