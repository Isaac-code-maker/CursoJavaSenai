package Figuras;

public class Quadrado implements Dimensao{

    private String nome;
    private int lado;
    
    public Quadrado(String nome, int lado) {

        this.lado = lado;
        this.nome = nome;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String getNome(String nome){

       return nome;

    }

    @Override
    public double getPerimetro(){
        return 4 * lado;
    }

    public double getArea(){
        return lado * lado;
    }







    
    

}
