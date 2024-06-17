package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Salgado extends Produto{

    private String recheio;



    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    @SuppressWarnings("deprecation")
    @Override
    public String validade(Date fabricacao){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");

        fabricacao.setDate(fabricacao.getDate() + 2);

        return fs.format(fabricacao);
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
