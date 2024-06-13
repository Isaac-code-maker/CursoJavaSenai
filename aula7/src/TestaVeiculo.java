public class TestaVeiculo {

    public static void main(String[] args) {

        Carro carro = new Carro("Sentra", 151, "2.0 Exclusive CVT Int. Premium", false, false, 0.0);

        Moto moto = new Moto("Titan", 2, "CG 160", false, false, 0);

        Caminhao caminhao = new Caminhao("Atego", 4, "Mercedes-Benz Atego 2024", false, false, 0);

        System.out.println("Nome do carro: " + carro.getNome());
        System.out.println("Potencia do carro: " + carro.getPotencia());
        System.out.println("Numero de rodas: " + carro.getRodas());
        System.out.println("Modelo: " + carro.getModelo());
        
        carro.ligar();
        carro.desligar();
        carro.ligar();
        carro.acelerar();
        carro.frear();

        System.out.println("\n\n\n\n\n");

        System.out.println("Nome da moto: " + moto.getNome());
        System.out.println("Numero de cilindros: " + moto.getRodas());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Numero de rodas: " + moto.getRodas());
        
        moto.ligar();
        moto.desligar();
        moto.ligar();
        moto.acelerar();
        moto.frear();

        System.out.println("\n\n\n\n\n");

        System.out.println("Nome do caminhão: " + caminhao.getNome());
        System.out.println("Numero de eixos: " + caminhao.getEixos());
        System.out.println("Numero de rodas: " + caminhao.getRodas());
        System.out.println("Modelo: " + caminhao.getModelo());
        
        caminhao.ligar();
        caminhao.desligar();
        caminhao.ligar();
        caminhao.acelerar();
        caminhao.frear();
        caminhao.AcionarCacamba();
        caminhao.DesativarCacamba();
        caminhao.AcionarCacamba();





    }
    
}
