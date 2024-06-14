public class TestarLoja {
    public static void main(String[] args) throws Exception {

        //Adicionar classe Cliente.
        
        Gerente gerente1 = new Gerente("Carlos", "123.432.654-02", 3000, false, 9100, "Vendas");
        
        Secretario secretario1 = new Secretario("Amanda", "435.653.112-09", 2500, false, 888, "Matutino");

        Vendedor vendedor1 = new Vendedor("João", "856.876.123.-08", 1815, true, 520, "Sapatos");

        System.out.println("\n");
        System.out.println("Nome do vendedor: " + vendedor1.getNome() + " " + vendedor1.getMatricula());
        System.out.println("CPF do vendedor: " + vendedor1.getCpf());
        System.out.println("Salário do gerente sem bonus: " + vendedor1.getSalario());
        System.out.println("Salário do gerente com bônus: " + vendedor1.Bonus());
        
        
        
        System.out.println("\n\n\n\n");
        
        
        
        System.out.println("Nome do secretário: " + secretario1.getNome() + ", Ramal: " + secretario1.getRamal());
        System.out.println("Turno " + secretario1.getTurno());
        System.out.println("CPF do secretário: " + secretario1.getCpf());
        System.out.println("Salário do gerente sem bonus: " + secretario1.getSalario());
        System.out.println("Salário do gerente com bônus: " + secretario1.Bonus());
        
        

        System.out.println("\n\n\n\n");


        
        System.out.println("Nome do gerente: " + gerente1.getNome() + " " + gerente1.getUsuario());
        System.out.println("Departamento: " + gerente1.getDepartamento());
        System.out.println("CPF do gerente: " + gerente1.getCpf());
        System.out.println("Salário do gerente sem bonus: " + gerente1.getSalario());
        System.out.println("Salário do gerente com bônus: " + gerente1.Bonus());
        
        
        
        System.out.println("\n\n");


        vendedor1.VenderSapato(true);

        System.out.println("\n\n");

        secretario1.MarcarReuniao(false);

        System.out.println("\n\n");

        gerente1.RealizarReuniao(false);

    }
}
