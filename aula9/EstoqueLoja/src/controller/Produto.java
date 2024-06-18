package controller;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Produto {

    private String nome;
    private int quantidade;
    private double valor;
    protected LocalDate vence;

    public Produto(String nome, int quantidade, double valor, LocalDate vence) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.vence = vence;
    }

    public LocalDate getVence() {
        return vence;
    }

    public void setVence(LocalDate data) {
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

    public LocalDate validade(LocalDate fabricacao) {
        return fabricacao.plusDays(10);
    }

    public LocalDate validade(LocalDate fabricacao, LocalDate validade) throws IllegalAccessException {
        LocalDate hoje = LocalDate.now();

        if (validade.isAfter(hoje) || validade.isEqual(fabricacao)) {
            return validade;
        } else {
            throw new IllegalAccessException("A data de validade não pode ser anterior à data de fabricação do produto");
        }
    }

    public LocalDate validade(LocalDate fabricacao, LocalDate validade, LocalDate validadeAfter) throws IllegalAccessException {
        if (validadeAfter != null) {
            return validadeAfter;
        } else {
            return validade(fabricacao, validade);
        }
    }

    public boolean isDentroDoPrazo() {
        LocalDate hoje = LocalDate.now();
        LocalDate validade = convertToLocalDateViaInstant(this.getVence());
        return hoje.isBefore(validade) || hoje.isEqual(validade);
    }

    
    protected LocalDate convertToLocalDateViaInstant(LocalDate vence2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'convertToLocalDateViaInstant'");
    }

    protected LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                            .atZone(ZoneId.systemDefault())
                            .toLocalDate();
    }

    
}
