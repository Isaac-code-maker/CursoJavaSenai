package controller;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {

    private String nome;
    private int quantidade;
    private double valor;
    private Date vence;



    public Date getVence() {
        return vence;
    }

    public void setVence(Date data) {
        this.vence = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @SuppressWarnings("deprecation")
    
    public String validade(Date fabricacao){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");

        fabricacao.setDate(fabricacao.getDate() + 180);

        return fs.format(fabricacao);
    }

    @SuppressWarnings("deprecation")
    
    public String validade(Date validade, Date validadeAberto){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");

        validadeAberto.setDate(validadeAberto.getDate() + 180);

        return fs.format(validadeAberto);
    }

    @SuppressWarnings("deprecation")
    
    public String validade(Date validade, Date fabricacao, Date validadeAberto){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");

        validade.setDate(validade.getDate() + 180);

        return fs.format(validade);
    }
}
