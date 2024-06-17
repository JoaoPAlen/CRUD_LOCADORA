package locadora;

import java.sql.Connection; // Possui a função de conectar ao banco de dados e traz o resultado dentro do import java.sql.Statement.
import java.sql.DriverManager; // Traz consigo os resultados de pesquisa do Banco de dados, como SELECT, INSERT, DELETE, USE, UPDATE, ETC...
import java.sql.SQLDataException; // Passa os paraemtros SQL e instruções para o banco de dados. (passa o insert e etc...)
import java.sql.SQLException; // Entrada de dados pelo usuário via console.

/**
 * Classe de parâmetros para acesso ao banco de dados.
 */
public class DbConfig {
  /**
   * URL do banco de dados.
   */
  private static final String url = "jdbc:mysql://localhost:3306/locadoradeveiculos";
    /**
   * Login para o banco (Usuário).
   */
  private static final String user = "root";
    /**
   * Senha para o banco.
   */
  private static final String password = "Galo@15/19993";
  /**
   * Método para obter a conexão com o banco de dados.
   *
   * @return a conexão com o banco de dados
   * @throws SQLException se ocorrer um erro ao tentar se conectar ao banco de dados
   */
  public static Connection getConnection() throws SQLException{
    return DriverManager.getConnection(url, user, password);
  }
}
