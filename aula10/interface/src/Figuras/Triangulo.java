package Figuras;

public class Triangulo implements Dimensao{

    private int base;
    private int altura;
    private int lado;
    private String nome;

    
    public Triangulo(int base, int altura, int lado, String nome) {
        this.base = base;
        this.altura = altura;
        this.base = base;
        this.nome = nome;
    }

    
    public int getBase() {
        return base;
    }


    public void setBase(int base) {
        this.base = base;
    }


    public int getAltura() {
        return altura;
    }


    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLado() {
        return base;
    }


    public void setLado(int base) {
        this.base = base;
    }
    
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    

    @Override
    public String getNome(String nome){

       return nome;

    }
    public double getPerimetro(){
        return 4 * lado;
    }

    public double getArea(){
        return (base*altura)/2;
    }



}
