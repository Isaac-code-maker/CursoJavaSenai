public class Carro extends Veiculo {

    private double potencia;

    public Carro(String nome, int rodas, String modelo, boolean CarroLigado, boolean estado, double velocidade) {

        super(nome, rodas, modelo, CarroLigado, estado, velocidade);
        this.potencia = 1.0;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
}
