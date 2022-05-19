package controller;

import com.google.gson.Gson;
import database.SchemaDB;
import model.Factura;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioController {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Factura> arrayListFacturas;
    private Connection conn;
    private Statement statement;
    private ResultSet resultSet;

    public void ejercicio() {
        leerjson();
        importarDatos();
    }

    private void leerjson() {
        String urlString = "https://run.mocky.io/v3/f608b6c0-260b-4600-a929-be12fac14261";
        BufferedReader bufferedReader = null;
        arrayListFacturas = new ArrayList<>();
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                stringBuffer.append(linea);
            }
            JSONObject jsonObject = new JSONObject(stringBuffer.toString());
            JSONArray jsonArray = jsonObject.getJSONArray("results");

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject factura = jsonArray.getJSONObject(i);
                Gson gson = new Gson();
                Factura factura1 = gson.fromJson(factura.toString(), Factura.class);
                arrayListFacturas.add(factura1);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void getConnection() {
        String host = SchemaDB.URL_SERVER;
        String dtbs = SchemaDB.DB_NAME;
        String user = SchemaDB.USER;
        String pass = SchemaDB.PASS;
        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs
                + "?" + "user=" + user + "&password=" + pass;

        try {
            conn = DriverManager.getConnection(newConnectionURL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void importarDatos() {
        try {
            getConnection();
            statement = conn.createStatement();
            for (Factura item : arrayListFacturas) {
                String query = String.format("INSERT INTO %s (%s,%s,%s,%s,%s) values ('%s','%s','%s','%s',%d)",
                        SchemaDB.TAB_FAC, SchemaDB.COL_ID, SchemaDB.COL_COMPANIA, SchemaDB.COL_PAIS, SchemaDB.COL_TELEFONO, SchemaDB.COL_TOTAL,
                        item.get_id(), item.getCompany(), item.getCountry(), item.getPhone(), item.getInvoice());
                statement.executeUpdate(query);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }


    public void invoiceFiltrada(int total) {
        String id,compania,pais,telefono;
        int total2;
        ArrayList<Factura>arrayList = new ArrayList<>();
        try {
            getConnection();
            statement = conn.createStatement();
            String query = String.format("SELECT * from %s where %s >= %d", SchemaDB.TAB_FAC, SchemaDB.COL_TOTAL, total);
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                id =resultSet.getString(SchemaDB.COL_ID);
                compania =resultSet.getString(SchemaDB.COL_COMPANIA);
                pais = resultSet.getString(SchemaDB.COL_PAIS);
                telefono =resultSet.getString(SchemaDB.COL_TELEFONO);
                total2 = resultSet.getInt(SchemaDB.COL_TOTAL);
                System.out.println("id: " +id);
                System.out.println("Compañia: " + compania);
                System.out.println("Pais: " + pais);
                System.out.println("Telefono: " + telefono);
                System.out.println("Total: " + total2 + "\n");
                Factura factura = new Factura(total2,id,compania,telefono,pais);
                arrayList.add(factura);
            }
            for (Factura item: arrayList) {
                String query2 = String.format("INSERT INTO %s (%s,%s,%s,%s,%s) values ('%s','%s','%s','%s',%d)",
                        SchemaDB.TAB_FIL, SchemaDB.COL_ID, SchemaDB.COL_COMPANIA, SchemaDB.COL_PAIS, SchemaDB.COL_TELEFONO, SchemaDB.COL_TOTAL,
                        item.get_id(), item.getCompany(), item.getCountry(), item.getPhone(),item.getInvoice());
                statement.executeUpdate(query2);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    public void countryFintrada(String pais) {

        String id,compania,pais2,telefono;
        int total;
        ArrayList<Factura>arrayList = new ArrayList<>();
        try {
            getConnection();
            statement = conn.createStatement();
            String query = String.format("SELECT * from %s where %s like '%s'", SchemaDB.TAB_FAC, SchemaDB.COL_PAIS, pais);
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                id =resultSet.getString(SchemaDB.COL_ID);
                compania =resultSet.getString(SchemaDB.COL_COMPANIA);
                pais2 = resultSet.getString(SchemaDB.COL_PAIS);
                telefono =resultSet.getString(SchemaDB.COL_TELEFONO);
                total = resultSet.getInt(SchemaDB.COL_TOTAL);
                System.out.println("id: " +id);
                System.out.println("Compañia: " + compania);
                System.out.println("Pais: " + pais2);
                System.out.println("Telefono: " + telefono);
                System.out.println("Total: " + total + "\n");
                Factura factura = new Factura(total,id,compania,telefono,pais);
                arrayList.add(factura);
            }
            for (Factura item: arrayList) {
                String query2 = String.format("INSERT INTO %s (%s,%s,%s,%s,%s) values ('%s','%s','%s','%s',%d)",
                        SchemaDB.TAB_FIL, SchemaDB.COL_ID, SchemaDB.COL_COMPANIA, SchemaDB.COL_PAIS, SchemaDB.COL_TELEFONO, SchemaDB.COL_TOTAL,
                        item.get_id(), item.getCompany(), item.getCountry(), item.getPhone(),item.getInvoice());
                statement.executeUpdate(query2);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }

    }
}
