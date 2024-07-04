package ArquivoJson;

// import org.json.simple.JsonArray;
// import org.json.simple.JsonObject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonException;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

public class ibgecnae {

    public static void main(String[] args)throws JsonException {

      
        JsonObjectBuilder object1Builder = Json.createObjectBuilder();
        object1Builder.add("nome", "João");
        object1Builder.add("idade", 30);
        JsonObject object1 = object1Builder.build();

        JsonObjectBuilder object2Builder = Json.createObjectBuilder();
        object2Builder.add("nome", "Maria");
        object2Builder.add("idade", 25);
        JsonObject object2 = object2Builder.build();
      
        JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
        arrayBuilder.add(object1);
        arrayBuilder.add(object2);
        JsonArray jsonArray = arrayBuilder.build();

        String jsonString = jsonArray.toString();
        System.out.println(jsonString);

    }
}
