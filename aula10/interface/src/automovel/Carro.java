package automovel;

public class Carro implements Veiculo, Proprietario {

    public void ligar(){
        System.out.println("Ligando carro...");
    }

    public void desligar(){
        System.out.println("Desligando carro...");
    }

    public void parar(){
        System.out.println("Parando carro...");

    }

    public double velocidadeMax(){
        return 0;
    }

    public String getNome(String nome){
        return nome;

    }

    public String getEndereco(){
        return "Gama";
    }
    

    
}
