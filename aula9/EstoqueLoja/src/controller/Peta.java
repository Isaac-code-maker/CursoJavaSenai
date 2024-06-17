package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Peta extends Produto {

    private String sabor;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @SuppressWarnings("deprecation")
    @Override
    public String validade(Date fabricacao){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");

        fabricacao.setDate(fabricacao.getDate() + 30);

        return fs.format(fabricacao);
    }

    public double venda(int pacote){
        
        return pacote * 6.70;

    }

    public double venda(double quilo){
        
         return quilo * 15.45;
    }

    @SuppressWarnings("deprecation")
    @Override
    public String validade(Date fabricacao, Date validadeAberto){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");

        validadeAberto.setDate(validadeAberto.getDate() - fabricacao.getDate());

        return fs.format(validadeAberto);
    }

    @SuppressWarnings("deprecation")
    @Override
    public String validade(Date validade, Date fabricacao, Date validadeAberto){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");

        validade.setDate(validade.getDate() + 180);

        return fs.format(validade);
    }
}
