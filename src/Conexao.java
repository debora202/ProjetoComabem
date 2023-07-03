import java.sql.*;

/**
 * Classe que faz a Conexao via JDBC com pacote
 * mysql- connect 8.0.30
 */
public class Conexao {
    /** objeto Connection
     *
     */
   private Connection conexao;
    /** Construtor do objeto Conexao ue faz a
     * ligação com o Banco de Dados
     */
    public Conexao() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/comabem",
                            "debora",
                            "Arapixi45");

        } catch (Exception e) {
            System.out.println("Erro na Conexao:" + e);

        }
    }

    /**
     *Metodo que retorna a conexao criada
     *
     */
    public Connection getConexao()
{
    return this.conexao;
}

               }