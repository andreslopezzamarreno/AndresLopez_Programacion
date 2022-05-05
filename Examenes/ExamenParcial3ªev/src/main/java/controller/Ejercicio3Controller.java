package controller;

import com.google.gson.Gson;
import model.Pelicula;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class Ejercicio3Controller {

    private ArrayList<Pelicula> peliculas;

    public void ejercicio(String urlPasada){
        String urlString = urlPasada;
        peliculas = new ArrayList<>();
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String lectura = bufferedReader.readLine();
            JSONObject jsonObject = new JSONObject(lectura);
            JSONArray jsonArray = jsonObject.getJSONArray("results");

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject peliculaJson = jsonArray.getJSONObject(i);
                Pelicula pelicula = convertirJava(peliculaJson);
                mostrarDatos(pelicula);
                peliculas.add(pelicula);
            }
            meterFichero(urlString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void mostrarDatos(Pelicula pelicula){
        System.out.println("Nombre: " +pelicula.getTitle());
        System.out.println("Fecha de lanzamineto: " + pelicula.getRelease_date());
        System.out.println("Descripcion: " + pelicula.getOverview());
        mostrarCarteles(pelicula);
    }

    public void mostrarCarteles(Pelicula pelicula){
        System.out.println("Poster: https://image.tmdb.org/t/p/w500/" + pelicula.getPoster_path() + "\n");
    }

    public Pelicula convertirJava(JSONObject object){
        Gson gson = new Gson();
        Pelicula pelicula = gson.fromJson(object.toString(),Pelicula.class);
        añadirArrylist(pelicula);
        return pelicula;
    }

    public void añadirArrylist(Pelicula pelicula){
        peliculas.add(pelicula);
    }

    public void meterFichero(String url){
        File file = null;
        if (url.equalsIgnoreCase("https://api.themoviedb.org/3/movie/now_playing?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&page=1")){
            file = new File("src/main/resources/Cartelera.bin");
        }else{
            file = new File("src/main/resources/proximamente.bin");
        }
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            for (Pelicula item: peliculas) {
                oos.writeObject(item);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


