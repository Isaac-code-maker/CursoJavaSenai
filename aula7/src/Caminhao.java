public class Caminhao extends Veiculo {

    private int eixos;
    private boolean cacamba;
    public Caminhao(String nome, int rodas, String modelo, boolean CarroLigado, boolean estado, double velocidade) {

        super(nome, rodas, modelo, CarroLigado, estado, velocidade);
        this.eixos = 5;
        this.cacamba = false;

    }

    public boolean isCacamba() {
        return cacamba;
    }

    public void setCacamba(boolean cacamba) {
        this.cacamba = cacamba;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public void AcionarCacamba(){
        if (!cacamba) {

            System.out.println("Caçamba acionada");
            cacamba = true;
            
        }else{
            System.out.println("Caçamba não está acionada");
        }
    }

    public void DesativarCacamba(){
        if (cacamba) {
            System.out.println("Caçamba desativada");
            cacamba = false;
            
        }else{
            System.out.println("Caçamba ainda está acionada");
        }
    }



}
