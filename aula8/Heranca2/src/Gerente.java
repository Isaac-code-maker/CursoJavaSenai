public class Gerente extends Funcionario{


    private int usuario;
    private String departamento;
    private boolean agenda;

    public Gerente(String nome, String cpf, double salario, boolean agenda, int usuario, String departamento) {
        super(nome, cpf, salario);

        this.usuario = usuario;
        this.departamento = departamento;
        
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean isAgenda(){
        return agenda;
    }

    public void setAgenda(boolean agenda){
        this. agenda = false;
    }

    public boolean RealizarReuniao(boolean agenda){

        if (agenda == true) {
            System.out.println("Realizar Reuniao");
            return true;
            
        }else{
            System.out.println("Agenda vazia");
            return false;
        }

    }

    @Override
    public double Bonus(){
        
        return super.Bonus() * 1.50;
    }
}
