public class App {
    public static void main(String[] args) throws Exception {

        String caminho = "aula13\\manipulaArquivos\\src\\teste.txt";

        // ManipuladorArquivos.escrita(caminho);
        // ManipuladorArquivos.leitura(caminho);
        ManipuladorArquivos.gerarTabuada(caminho);
        ManipuladorArquivos.gerarTabuadaReversa(caminho);
        
        
    }
}
