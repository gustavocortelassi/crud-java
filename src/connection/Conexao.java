package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String url = "jdbc:mysql://localhost:3306/BancoCRUDJava"; // conecta no banco de dados
    private static final String user = "root"; // conecta no usuario
    private static final String password = "root"; // conecta na senha

    private static Connection conn;

    public static Connection getConexao(){

        try {
            if(conn == null){ // se a conexao é igual a null, ou seja, nao foi feita
                conn = DriverManager.getConnection(url, user, password); // cria a conexao e retorna
                return conn;
            } else {
                return conn;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
