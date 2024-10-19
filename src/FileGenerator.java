import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {

    public void saveFile(Adress adress) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        FileWriter writer = new FileWriter(adress.cep() + ".json");
        writer.write(gson.toJson(adress));
        writer.close();
    }
}
