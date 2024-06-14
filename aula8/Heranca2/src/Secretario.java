public class Secretario extends Funcionario {
    
    private int ramal;
    private String turno;
    private boolean reuniao;

    public Secretario(String nome, String cpf, double salario, boolean reuniao, int ramal, String turno) {
        super(nome, cpf, salario);
        this.ramal = ramal;
        this.turno = turno;
        
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public boolean isReuniao(){
        return reuniao;        
    }

    public void setReuniao(boolean reuniao){
        this.reuniao = false;
    }

    public boolean MarcarReuniao(boolean reuniao){

        if (reuniao == false) {
            System.out.println("Sem reuniao marcada");
            return false;
            
        }else{
            System.out.println("Reunião Marcada");
            return true;
        }
    }

    @Override
    public double Bonus(){
        return super.Bonus() * 1.20;
        
    }
}
