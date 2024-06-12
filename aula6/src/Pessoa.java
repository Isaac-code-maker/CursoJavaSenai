public class Pessoa {

    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String nome, int idade, char sexo){

        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;

    }

    public String getPessoa(){

        String info = "A pessoa se chama " + nome + ", tem a idade de " + idade + " anos e é do sexo " + sexo;
        return info;
    }
}
