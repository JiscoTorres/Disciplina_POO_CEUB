package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class BancoDeDados {

    //propiedades da classe
    private Connection objConexao = null;


    //metodos da classe

    void conectar() throws Exception{
        objConexao = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/aula12?"+ 
            "user=root&password=ceub123456&"+ 
            "serverTimezone=UTC&useSSL=false");
    }
    void desconectar() throws Exception{
        objConexao.close();
    }
    Connection getObjConexao(){
        return objConexao;
    }
}
