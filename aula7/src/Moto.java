public class Moto extends Veiculo {

    private int cilindros;
    
    public Moto(String nome, int rodas, String modelo, boolean CarroLigado, boolean estado, double velocidade) {
        super(nome, rodas, modelo, CarroLigado, estado, velocidade);
        this.cilindros = 4;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }
}
