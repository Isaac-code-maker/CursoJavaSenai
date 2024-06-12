package escola;

public class Aluno {

    private String nome;
    private int idade;
    private float nota1, nota2, media;

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {

        if(nome != null && !nome.isEmpty()){
            this.nome = nome;
        }else{
            System.out.println("Nome inválido!");
        }
    }

    public int getIdade() {
        
        return idade;
    }

    public void setIdade(int idade) {

        if (idade <= 0) {
            System.out.println("Idade Inválida");
        }else{
            this.idade = idade;
        }
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = (nota1 + nota2)/2;
    }

}
