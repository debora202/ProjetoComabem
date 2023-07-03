import java.sql.*;
public class DAO_Unidade {
Connection conexao;

public void  inserir(Unidade ux) {
    try {
        conexao=new Conexao().getConexao();
        String Sql= "Insert into unidade values (default,?)";
        PreparedStatement pst = conexao.prepareStatement(Sql);
        pst.setString (1,ux.getUni_medida());
        pst.setInt (2, ux.getUnidade_unicod());
        pst.execute();
        this.conexao.close();
    } catch (Exception e ) {System.out.println("Erro ao inserir unidade"+e );}
}
public void alterar (Unidade ux){
    try {
        conexao=new Conexao().getConexao();
        String Sql= "Update Unidade SET uni_medida=? WHERE uni_cod=?";
        PreparedStatement pst = conexao.prepareStatement(Sql);
        pst.setString (1,ux.getUni_medida());
        pst.setInt (2, ux.getUnidade_unicod());
        pst.execute();
this.conexao.close();
    } catch (Exception e ) {System.out.println("Erro ao Alterar a unidade"+e );}
}

public void excluir (Unidade ux){
    try {
        conexao=new Conexao().getConexao();
        String Sql= "Delete from unidade WHERE uni_cod=?";
        PreparedStatement pst = conexao.prepareStatement(Sql);
        pst.setInt (1,ux.getUnidade_unicod());
        pst.execute();
        this.conexao.close();
    } catch (Exception e ) {System.out.println("Erro ao excluir "+e );}
}
public void consultar () {

 try {

     String Sql = "Select * from unidade";
     Statement stm= conexao.createStatement();
     ResultSet rs= stm.executeQuery(Sql);
System.out.println("\nDados cadastrados em Unidades:\n");
     while (rs.next())

     {
         System.out.println("-----------------");
      System.out.println("O codigo:"+rs.getString(1));
         System.out.println("A medida:"+rs.getString(2));

     }
     this.conexao.close();
 }catch (Exception e ) {System.out.println("Erro ao inserir unidade"+e );

 }

}


 }