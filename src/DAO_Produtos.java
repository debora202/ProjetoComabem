import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO_Produtos {
    Connection conexao;
    public void consulta() {
        try {
            conexao=new Conexao().getConexao();
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery("select *from produtos");
            System.out.println("/nDados cadastrados no Sistema");
            while (rs.next()) {
                System.out.println("-------------------------------");
                System.out.println("Codigo" + rs.getString(1));
                System.out.println("Codigo:" + rs.getString(1));
                System.out.println("Nome:" + rs.getString(2));
                System.out.println("Valor:" + rs.getString(3));
                System.out.println("Quantidade:" + rs.getString(4));
                System.out.println("Unidade:" + rs.getString(5));
            }

        } catch (Exception e) {
            System.out.println("Erro na consulta");
        }
    }


    public boolean inserir(Produtos p1) {


        try {
            conexao=new Conexao().getConexao();
            String Sql="Insert into produtos values(default,?,?,?,?)";
            PreparedStatement pst = conexao.prepareStatement(Sql);
            pst.setString (1,p1.getProd_nome());
            pst.setDouble(2,p1.getProd_valor());
            pst.setDouble(3,p1.getProd_quantidade());
            pst.setInt(4,p1.getUni_cod());

            pst.execute();
            this.conexao.close();
            return true;

        } catch (Exception e) {System.out.println("Erro na consulta");
        }
        return false;
    }
    public void alterar (Produtos px) {
        try {
            conexao=new Conexao().getConexao();
            String Sql="Update produtos set prod_nome=?,prod_valor=?,prod_quantidade=?,uni_cod?,";
            Sql =Sql + "where prod_cod =?";


            PreparedStatement pst =conexao.prepareStatement (Sql);
            pst.setString(1,px.getProd_nome());
            pst.setDouble(2,px.getProd_valor());
            pst.setDouble(3,px.getProd_quantidade());
            pst.setInt(4,px.getUni_cod());
            pst.setInt(5,px.getProd_cod());
            pst.execute();
            this.conexao.close();

        } catch (Exception e) {
            System.out.println("Erro na consulta");
        }
    }

    public void excluir(Produtos px )
    {
        try {
            conexao=new Conexao().getConexao();
            String Sql="Delete from produtos WHERE prod_cod=?";

            PreparedStatement pst =conexao.prepareStatement(Sql);
            pst.setInt(1,px.getProd_cod());
            pst.execute ();
            this.conexao.close();
        } catch (Exception e) {
            System.out.println("Erro na consulta");
        }

    }
}
