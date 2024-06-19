import Figuras.Circulo;
import Figuras.Dimensao;
// import automovel.Carro;
// import automovel.Veiculo;
import Figuras.Quadrado;
import Figuras.Triangulo;

public class App {

    // public static void ligarMotor(Veiculo veiculo){
    //     veiculo.ligar();
    // }







    public static void main(String[] args) throws Exception {

        // Carro carro1 = new Carro();
        // // App.ligarMotor(carro1);

        Quadrado quadrado1 = new Quadrado("Quadrado1", 5);

        System.out.println("nome: " + quadrado1.getNome());
        System.out.println("area: " + quadrado1.getArea());
        System.out.println("Perimetro: " + quadrado1.getPerimetro());

        Triangulo triangulo1 = new Triangulo(5, 3, 2, "Triangulo1");

        System.out.println("nome: " + triangulo1.getNome());
        System.out.println("area: " + triangulo1.getArea());
        System.out.println("Perimetro: " + triangulo1.getPerimetro());

        Circulo circulo1 = new Circulo(3.5, "Cicrulo1");

        System.out.println("nome: " + circulo1.getNome());
        System.out.println("area: " + circulo1.getArea());
        System.out.println("Perimetro: " + circulo1.getPerimetro());



    }
}
