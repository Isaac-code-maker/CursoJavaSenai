package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pao extends Produto {

    private String tipoPao;



    public String getTipoPao() {
        return tipoPao;
    }

    public void setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
    }

    @SuppressWarnings("deprecation")
    @Override
    public String validade(Date fabricacao){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");

        fabricacao.setDate(fabricacao.getDate() + 1);

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
