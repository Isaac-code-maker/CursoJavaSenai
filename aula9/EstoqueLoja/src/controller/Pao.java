package controller;

import java.time.LocalDate;


public class Pao extends Produto {

    private String tipoPao;

    public Pao(String nome2, int quantidade2, double valor2, LocalDate vence2) {
        super(nome2, quantidade2, valor2, vence2);
    
    }
    public String getTipoPao() {
        return tipoPao;
    }

    public void setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
    }

    @Override
    public LocalDate validade(LocalDate fabricacao) {
        
        return fabricacao.plusDays(10);
    }

    @Override
    public LocalDate validade(LocalDate fabricacao, LocalDate validade) throws IllegalAccessException {
        LocalDate hoje = LocalDate.now();

        if (validade.isAfter(hoje) || validade.isEqual(fabricacao)) {
            return validade;
        } else {
            throw new IllegalAccessException("A data de validade não pode ser anterior à data de fabricação do produto");
        }
    }

    @Override
    public LocalDate validade(LocalDate fabricacao, LocalDate validade, LocalDate validadeAfter) throws IllegalAccessException {
        if (validadeAfter != null) {
            return validadeAfter;
        } else {
            return validade(fabricacao, validade);
        }
    }

    @Override
    public boolean isDentroDoPrazo() {
        LocalDate hoje = LocalDate.now();
        LocalDate validade = convertToLocalDateViaInstant(this.getVence());
        return hoje.isBefore(validade) || hoje.isEqual(validade);
    }
}
