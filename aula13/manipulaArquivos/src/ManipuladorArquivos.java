import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipuladorArquivos {

    public static void leitura(String caminho) throws IOException {
        BufferedReader buff = new BufferedReader(new FileReader(caminho));
        String linha;

        while ((linha = buff.readLine()) != null) {
            System.out.println(linha);
        }

        buff.close();
    }

    public static void escrita(String caminho) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(caminho, true));
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite algum texto: ");
        String linha = scan.nextLine();

        String[] wrd = linha.split(" ");
        int resultado[] = new int[wrd.length];

        for(int i = 0; i < wrd.length; i++) {
            resultado[i] = Integer.parseInt(wrd[i]);
        }

        int multi = resultado[0] * resultado[1];
    
        writer.append(resultado[0] + " X " + resultado[1] + " = " + multi + "\n");

        writer.close();
        scan.close();
    }

    public static void gerarTabuada(String caminho)throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(caminho, true));

        for(int i = 0, j = 100; i<= 100;i++, j--){
            int resultado = i * j;
            writer.append(i + " X " + j + " = " + resultado);
            
            writer.append("\n\n");
        }

        writer.close();
    }

    public static void gerarTabuadaReversa(String caminho)throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(caminho, true));

        for(int i = 100, j = 1; j<= 100;i--, j++){
            int resultado = i * j;
            writer.append(i + " X " + j + " = " + resultado);
            
            writer.append("\n\n");
        }

        writer.close();
    }
}
