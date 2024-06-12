package escola;

public class Escola {

    public static void main(String[] args) {
        
        Aluno pessoa = new Aluno();

        pessoa.setNome("André Felipe");
        pessoa.setIdade(15);
        pessoa.setNota1(6);
        pessoa.setNota2(5);  
        pessoa.setMedia(0); 

        System.out.println("O nome do aluno é: " + pessoa.getNome());
        System.out.println("A idade do aluno é: " + pessoa.getIdade());

        if (pessoa.getMedia() > 5.9) {

            System.out.println("A média do aluno é: " + pessoa.getMedia());
            System.out.println("Aluno aprovado");
     
        }else{

            System.out.println("A média do aluno é: " + pessoa.getMedia());
            System.out.println("Aluno reprovado");

        }
        
    }
}
