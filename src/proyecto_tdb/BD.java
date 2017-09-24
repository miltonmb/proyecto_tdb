/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_tdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Mario
 */
public class BD {
    private Connection connection;
    public Statement statement;

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public BD() {
    }

    public void conectar() {
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            System.out.println("Conectando con la base de datos...");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "C##_proyecto", "proyecto");
            statement = connection.createStatement();
            System.out.println("Connectado");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void close() {
        try {
            System.out.println("Base de datos desconectada...");
            connection.close();
            statement.close();
        } catch (Exception e) {
        }
    }
}
