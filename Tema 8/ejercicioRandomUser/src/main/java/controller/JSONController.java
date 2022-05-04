package controller;

import com.google.gson.Gson;
import model.Location;
import model.Name;
import org.json.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JSONController {

    

    public void buscarUsuario(int numUsers, String gender){
        String urlString = "https://randomuser.me/api/?results="+numUsers+"&gender="+gender;
        BufferedReader bufferedReader = null;

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();


            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String response = bufferedReader.readLine();

            JSONObject responseObj = new JSONObject(response);

            JSONArray arrayResultados = responseObj.getJSONArray("results");

            for (int i = 0; i < arrayResultados.length(); i++) {
                JSONObject name = (JSONObject) arrayResultados.getJSONObject(i).get("name");
                Gson gson = new Gson();
                Name nombre = gson.fromJson(name.toString(), Name.class);
                System.out.println(nombre.getTitle());
                System.out.println(nombre.getFirst());
                System.out.println(nombre.getLast());
                JSONObject location = (JSONObject) arrayResultados.getJSONObject(i).get("location");
                Location location1 = gson.fromJson(location.toString(),Location.class);
                System.out.println(location1.getCity());
                System.out.println(location1.getCountry());
                JSONObject picture = (JSONObject) arrayResultados.getJSONObject(i).get("picture");
                URL foto = new URL(picture.getString("large"));
                System.out.println(foto);
                String email = (String) arrayResultados.getJSONObject(i).get("email");
                System.out.println(email);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
