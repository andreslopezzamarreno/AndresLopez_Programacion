package controller;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JSONController {

    public void readFirstfiveleagues(){
        String urlString = "https://www.thesportsdb.com/api/v1/json/2/all_leagues.php";
        BufferedReader bufferedReader = null;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            StringBuffer lectura = new StringBuffer();
            String line = null;

            while ((line=bufferedReader.readLine())!=null){
                lectura.append(line);
            }

            String jsonString = lectura.toString();
            JSONObject jsonObject = new JSONObject(jsonString);

            JSONArray jsonArray = jsonObject.getJSONArray("leagues");

            for (int i = 0; i < 5; i++) {
                JSONObject league = jsonArray.getJSONObject(i);
                System.out.println(league.getString("idLeague") + " - " +league.getString("strLeagueAlternate"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void showSeason(int league){
        String urlString = "https://www.thesportsdb.com/api/v1/json/2/lookuptable.php?l="+ league+"&s=2020-2021";
        BufferedReader bufferedReader = null;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String lectura = bufferedReader.readLine();

            JSONObject responseObj = new JSONObject(lectura);

            JSONArray jsonArray = responseObj.getJSONArray("table");

            int contador = 1;
            for (int i = 0; i < jsonArray.length(); i++) {
                System.out.println(contador +"º. " + jsonArray.getJSONObject(i).getString("strTeam"));
                contador++;
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

    public void teams(String country){
        String urlString = "https://www.thesportsdb.com/api/v1/json/2/search_all_teams.php?s=Soccer&c=" + country;
        BufferedReader bufferedReader = null;

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String lectura = bufferedReader.readLine();

            JSONObject jsonObject = new JSONObject(lectura);

            JSONArray jsonArray = jsonObject.getJSONArray("teams");

            for (int i = 0; i < jsonArray.length(); i++) {
                System.out.println(jsonArray.getJSONObject(i).getString("idTeam") + " - "
                        +jsonArray.getJSONObject(i).getString("strTeam"));
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

    public void consultTeam(int team){


    }
}
