package Controller;

import com.google.gson.Gson;
import model.Conocimiento;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

public class JSONController {

    String jsonString = "{\n" +
            "  \"nombre\": \"Borja\",\n" +
            "  \"apellidos\": \"Martin Herrera\",\n" +
            "  \"edad\": 38,\n" +
            "  \"hobbies\": [\n" +
            "    \"musica\",\n" +
            "    \"deporte\",\n" +
            "    \"cine\",\n" +
            "    \"informática\"\n" +
            "  ]}";

    public void pasarStringJSON(){
        //System.out.println(jsonString); --> se imprime tal y como lo hemos creado en la variable(es un String), no lo entiende

        // STRING --> JSON (org.json)
        JSONObject jsonObject = new JSONObject(jsonString);
        //System.out.println(jsonObject); --> ahora lo imprime en formato json

        String nombre = jsonObject.getString("nombre");
        int edad = jsonObject.getInt("edad");
        JSONArray hobbies = jsonObject.getJSONArray("hobbies");
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println("Tus hobbies son: ");
        for (int i = 0; i < hobbies.length(); i++) {
            System.out.println(hobbies.getString(i));
        }
    }

    public void leerFicheroJSON(){
        File file = new File("src/main/resources/persona.json");
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));
            //br.readLine() --> lee una linea completa
            String linea = null;
            StringBuilder lecturaCompleata = new StringBuilder();
            while ((linea = br.readLine()) != null){
                lecturaCompleata.append(linea);
            }

            JSONObject jsonObject = new JSONObject(lecturaCompleata.toString());
            System.out.println(jsonObject);

            JSONArray arrayConocimientos = jsonObject.getJSONArray("conocimientos");
            for (int i = 0; i < arrayConocimientos.length(); i++) {
                JSONObject conocimiento = arrayConocimientos.getJSONObject(i);
                Gson gson = new Gson();
                Conocimiento conocimientoJava = gson.fromJson(conocimiento.toString(),Conocimiento.class);
                System.out.println(conocimientoJava.getConcepto());
                /*String concepto = conocimiento.getString("concepto");
                int experiencia = conocimiento.getInt("experiencia");
                System.out.println(concepto);
                System.out.println(experiencia);
                System.out.println("Los detalles del conocimiento " + concepto + " son:");
                JSONArray detalles = conocimiento.getJSONArray("detalle");

                for (int j = 0; j < detalles.length(); j++) {
                    String detalle = detalles.getString(j);
                    System.out.println(detalle);
                }*/
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
