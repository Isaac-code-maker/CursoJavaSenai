public class Vendedor extends Funcionario {
    
    private int matricula;
    private String setor;
    private boolean sapato;

    public Vendedor(String nome, String cpf, double salario, boolean sapato, int matricula, String setor) {
        super(nome, cpf, salario);

        this.matricula = matricula;
        this.setor = setor;

    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isSapato(){
        return sapato;
    }

    public void setSapato(boolean sapato){
        this.sapato = false;
    }

    public boolean VenderSapato(boolean sapato){
        if (sapato == false) {
            System.out.println("Não tem sapato pra vender");
            return false;
            
        }else{
            System.out.println("Tem sapato pra vender");
            return true;
        }
    }

    @Override
    public double Bonus(){
        return super.Bonus() * 1.10;
    }
}
