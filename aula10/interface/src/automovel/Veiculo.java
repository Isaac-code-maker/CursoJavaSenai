package automovel;

public interface Veiculo {

    public double velocidadeMax();

    public void ligar();

    public void desligar();
    
    public void parar();

    default void buzinar(){
        System.out.println("Buzina");
    }

}
