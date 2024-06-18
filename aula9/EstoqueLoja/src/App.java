import controller.Salgado;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        try {
            Salgado[] vetor = new Salgado[5];

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            LocalDate datavalidade = LocalDate.parse("01/12/2030", formatter);

            LocalDate datavalidade2 = LocalDate.parse("01/12/2030", formatter);
            
       
            LocalDate dataVence = LocalDate.parse("21/06/2024", formatter);
            Salgado salgado1 = new Salgado("Coxinha", 1, 3, dataVence, "Frango");
            vetor[0] = salgado1;

            
            LocalDate dataVence1 = LocalDate.parse("21/07/2024", formatter);
            Salgado salgado2 = new Salgado("Coxinha", 1, 3, dataVence1, "Frango");
            vetor[1] = salgado2;

            //Corrigindo erro de formatação da data
            LocalDate dataVence2 = LocalDate.parse("11/08/2024", formatter);
            Salgado salgado3 = new Salgado("Coxinha", 1, 3, dataVence2, "Frango");
            vetor[2] = salgado3;

            for (Salgado salgado : vetor) {
                if (salgado != null) {
                    System.out.println("Nome: " + salgado.getNome());
                    System.out.println("Recheio: " + salgado.getRecheio());
                    System.out.println("Data de validade: " + salgado.getVence().format(formatter));
                    System.out.println("----------------------");
                }
            }

            //cálculo de validade e verificação
            LocalDate dataValidadeCalculada = salgado1.validade(LocalDate.now());
            System.out.println("Data de validade calculada para " + salgado1.getNome() + ": " + dataValidadeCalculada);

            if (salgado1.isDentroDoPrazo()) {
                System.out.println("O produto " + salgado1.getNome() + " está dentro do prazo de validade.");
            } else {
                System.out.println("O produto " + salgado1.getNome() + " está fora do prazo de validade.");
            }

            //chamadas de método
            salgado1.validade(LocalDate.now(), dataVence);
            salgado1.validade(LocalDate.now(), datavalidade, datavalidade2 );

        } catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
