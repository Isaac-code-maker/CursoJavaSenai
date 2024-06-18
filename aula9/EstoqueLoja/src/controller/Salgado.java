package controller;

import java.time.LocalDate;


public class Salgado extends Produto {

    private String recheio;

    public Salgado(String nome, int quantidade, double valor, LocalDate dataVence, String recheio) {
        super(nome, quantidade, valor, dataVence);
        this.recheio = recheio;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    @Override
    public LocalDate validade(LocalDate fabricacao) {
        if (fabricacao == null) {
            System.out.println("A data de fabricação não pode ser nula");
        }
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
        LocalDate validade = convertToLocalDateViaInstant(this.vence);
        return hoje.isBefore(validade) || hoje.isEqual(validade);
    }
}
