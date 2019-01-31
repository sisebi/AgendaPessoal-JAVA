
package UTIL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public Conexao() {
    }
    
    /*Criar uma Conexao para Cada Classe é bom para Aprender...*/
    public Connection criaConector() throws Exception{   
            Connection conector = null;
            try{               
                String URL = "jdbc:mysql://localhost:3306/AGENDA";
                String USUARIO = "root";
                String SENHA = null;
                Class.forName("com.mysql.jdbc.Driver");
                conector = DriverManager.getConnection(URL,USUARIO,SENHA);             
                return conector;
            }catch (ClassNotFoundException e){
                throw new Exception("Erro de Arquivo .jar :",e);                      
            }catch (SQLException e){
                throw new Exception("Erro ao Acessar Banco de Dados :",e);                         
            }
    } 
    
}
