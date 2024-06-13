public class Veiculo {

    private String nome;
    private int rodas;
    private String modelo;

    private boolean Ligado;
    private boolean estado;
    private double velocidade;

    public Veiculo(String nome, int rodas, String modelo, boolean Ligado, boolean estado, double velocidade) {

        this.nome = nome;
        this.rodas = rodas;
        this.modelo = modelo;
        this.Ligado = false;
        this.estado = false;
        this.velocidade = 0.0;
        
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isCarroLigado() {
        return Ligado;
    }

    public void setCarroLigado(boolean Ligado) {

        Ligado = false;
    }

    public double getVelocidade(){
        return velocidade;
    }

    public void setVelocidade(){
        this.velocidade = 0.0;
    }

    public void ligar() {
        if (!Ligado) {
            System.out.println("Carro ligado!");
            Ligado = true;
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (Ligado) {
            System.out.println("Carro desligado.");
            Ligado = false;
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

        public void acelerar() {
            if (Ligado) {
                System.out.println("Carro acelerando!");
                velocidade++;
                System.out.println("Velocidade: " + getVelocidade());
            } else {
                System.out.println("Ligue o carro antes de acelerar");
            }
        }
    
        public void frear() {
            if (Ligado ) {
                System.out.println("O carro está freiando");
                velocidade--;
                System.out.println("Velocidade: " + getVelocidade());
            } else{
                System.out.println("Ligue o carro antes de freiar");
            }
        }
}
    
