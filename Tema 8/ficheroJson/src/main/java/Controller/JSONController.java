package Controller;

import com.google.gson.Gson;
import model.Asignatura;
import model.Conocimiento;
import model.Profesor;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


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

    public void leerJSONAsignaturas(String ciclo, int curso){

        File file = new File("src/main/resources/asignaturas.json");

        BufferedReader br = null;
        try {

            br = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            String linea = null;
            while ((linea = br.readLine()) != null){
                sb.append(linea);
            }

            JSONObject jsonAsignatura = new JSONObject(sb.toString());

            JSONArray asignaturas = jsonAsignatura.getJSONArray("asignaturas");


            for (int i = 0; i < asignaturas.length(); i++) {
                JSONObject asignaturaJSON = asignaturas.getJSONObject(i);
                Gson gson = new Gson();
                Asignatura asignatura = gson.fromJson(asignaturaJSON.toString(), Asignatura.class);
                //caracteristicaAsignatura(asignatura);

                // Captura todas las asignaturas individuales y tener la posibilidad de
                // tratarlas como objetos JAVA
                // y ver su curso y su ciclo
                // Pedir al usuario un curso y un ciclo del que quiere ver las asignturas
                // dam
                // 1
                // si se introduce un curso que no esta en el JSON, el sistema indica CURSO NO ENCONTRADO
                // el sistema deber mostrar las asignaturas del ciclo y curso pedido con el siguiente formato
                // Nombre: XX
                // Profesor: NOM AP
                // Sigras: XX
                // Duracion: XX
                // Conocimientos: XX,XX,XX

                if (asignatura.getCiclo().contains(ciclo) && asignatura.getCurso()== curso){
                    caracteristicaAsignatura(asignatura);
                }
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

    public void caracteristicaAsignatura(Asignatura asignatura){
        Profesor profesor2 = asignatura.getProfesor();
        System.out.println("Nombre: " +asignatura.getNombre());
        System.out.println("Profesor:");
        System.out.println("\tnombre: "+profesor2.getNombre());
        System.out.println("\tapellido: " +profesor2.getApellido());
        System.out.println("siglas: " +asignatura.getSiglas());
        System.out.println("horas: "+asignatura.getHora());
        System.out.println("Conocimientos:");
        for (String item: asignatura.getConocimientos()) {
            System.out.println("\t" +item);
        }
        System.out.println();
    }


    public void lecturaJsonApi(){
        String urlString = "https://randomuser.me/api/?results=5";
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String lectura = bufferedReader.readLine();

            JSONObject jsonObject = new JSONObject(lectura);

            System.out.println(jsonObject);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void lecturaUsers(){
        String urlString = "https://randomuser.me/api/?results=2";

        try {
            URL url = new URL(urlString);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            BufferedReader bufferedReader;

            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String response = bufferedReader.readLine();

            JSONObject responseJson = new JSONObject(response);

            JSONArray arrayResultados = responseJson.getJSONArray("results");

            for (int i = 0; i <arrayResultados.length() ; i++) {
                JSONObject objetoResultado = arrayResultados.getJSONObject(i);
                String mail = objetoResultado.getString("email");
                System.out.println(mail);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
