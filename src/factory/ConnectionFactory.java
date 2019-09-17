package br.com.projeto.factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/projetojava", "root", "");
        }
        catch(SQLException excecao){
            throw new RuntimeException(excecao);
        } //catch

    }//getConnection
  
}//class
