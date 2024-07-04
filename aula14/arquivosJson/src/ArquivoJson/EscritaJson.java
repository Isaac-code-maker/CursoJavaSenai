// package ArquivoJson;
// // import org.json.simple.parser.*;
// // import org.json.simple.JSONObject;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;

// @SuppressWarnings("deprecation")
// public class EscritaJson {


// @SuppressWarnings("unchecked")
// public static void main(String[] args) throws IOException, ParseException {

//     JSONObject jsonObject = new JSONObject();
//     JSONParser parse = new JSONParser();

//     String nome;
//     String ultimoNome;
//     String cidade;
//     String estado;

//     try {
//         jsonObject = (JSONObject) parse.parse(new FileReader("aula14\\arquivosJson\\src\\teste.json"));

//         nome = (String) jsonObject.get("Nome");
//         ultimoNome = (String) jsonObject.get("Ultimo nome");
//         cidade = (String) jsonObject.get("Cidade");
//         estado = (String) jsonObject.get("Estado");

//         System.out.println("O nome completo é: " + nome + " de " + ultimoNome + ", nascido em " + cidade + " - " + estado);
        
//     } catch (FileNotFoundException e) {
//         e.printStackTrace();
//     }
    
//     FileWriter escreve = null;
    
//     jsonObject.put("Nome" , "Armando");
//     jsonObject.put("Ultimo nome", "Sousa");
//     jsonObject.put("Cidade", "Planaltina");
//     jsonObject.put("Estado", "DF");
    
//     try {
//         escreve = new FileWriter("aula14\\arquivosJson\\src\\teste.json");
//         escreve.write(jsonObject.toString());
//     } catch (Exception e) {
//         e.printStackTrace();
//     }
        
//     escreve.close();
//     }
// }


