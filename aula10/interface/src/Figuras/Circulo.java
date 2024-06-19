package Figuras;

public class Circulo implements Dimensao{

    private double raio;
    private String nome;


    

    public Circulo(double raio, String nome) {
        this.raio = raio;
        this.nome = nome;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getNome() {
        return raio;
    }

    public void seNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String getNome(String nome){

       return nome;

    }

    @Override
    public double getPerimetro(){
        return Math.PI * (2 * raio);
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(raio, 2);
    }

}
