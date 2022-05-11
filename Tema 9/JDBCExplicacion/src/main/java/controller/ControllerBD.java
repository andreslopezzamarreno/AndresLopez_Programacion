package controller;

import database.SchemaDB;
import model.Alumno;

import java.sql.*;

public class ControllerBD {

    private Connection conn;
    //o comprueba tipos
    private Statement statement;
    //CRUD -> create read update delete
    private PreparedStatement preparedStatement;

    private void getConnection(){
        String host = SchemaDB.URL_SERVER;
        String dtbs= SchemaDB.DB_NAME;
        String user = "root";
        String pass = "";

        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs
                + "?" + "user=" + user + "&password=" + pass;
        try {
            conn = (Connection) DriverManager.getConnection(newConnectionURL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertarAlumno(){
        String nombre = "Borja";
        String apellido = "Martin";
        int edad = 38;

        //insert into alumnos (nombre, apellido,edad) values ('andres','lopez',21);
        try {
            getConnection();
            statement = conn.createStatement();
            String queryFormat = String.format("INSERT INTO %s (%s, %s,%s) values ('%s','%s',%d)",
                    SchemaDB.TAB_ALU,SchemaDB.COL_NOMBRE,SchemaDB.COL_APELLIDO,SchemaDB.COL_EDAD,nombre,apellido,edad);
            int numeroRow = statement.executeUpdate(queryFormat);
            System.out.println(numeroRow);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    public void insertarAlumnoEjercicio(Alumno alumno){

        try {
            getConnection();
            statement = conn.createStatement();
            String queryFormat = String.format("INSERT INTO %s (%s, %s,%s) values ('%s','%s',%d)",
                    SchemaDB.TAB_ALU,SchemaDB.COL_NOMBRE,SchemaDB.COL_APELLIDO,SchemaDB.COL_EDAD,alumno.getNombre(),alumno.getNombre(),alumno.getEdad());
            int numeroRow = statement.executeUpdate(queryFormat);
            System.out.println(numeroRow);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    public void insertarAlumnoPreparedStatement(){
        String nombre = "jessica";
        String apellido = "marulanda";
        int edad = 24;
        String query = "Insert into alumnos(nombre, apellido, edad) values(?,?,?)";
        try {
            getConnection();
            //no ejecuta la query --> solo comprueba
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1,nombre);
            preparedStatement.setString(2,apellido);
            preparedStatement.setInt(3,edad);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    public void cambiarEdad(String nombre,int edad){
        try {
            getConnection();
            //no ejecuta la query --> solo comprueba
            statement = conn.createStatement();
            String query = String.format("Update %s set %s = %d where %s = '%s'",SchemaDB.TAB_ALU,SchemaDB.COL_EDAD,edad,SchemaDB.COL_NOMBRE,nombre);
            int numero = statement.executeUpdate(query);
            System.out.println("Se han modificado " + numero + " tuplas");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    public void borrarUsuario(int edad){
        try {
            getConnection();
            //no ejecuta la query --> solo comprueba
            statement = conn.createStatement();
            String query = String.format("DELETE FROM %s WHERE %s < %d",SchemaDB.TAB_ALU,SchemaDB.COL_EDAD,edad);
            int numTuplas = statement.executeUpdate(query);
            System.out.println("Se han modificado " + numTuplas + " tuplas");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    public void select(){

    }
}
