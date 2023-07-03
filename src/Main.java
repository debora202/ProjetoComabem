public class Main {
    //Codifique as classes de objeto para a aplicação de compras dos produtos,
    //com uma classe para cada tabela, utilizando a ferramenta Inteliji.

    public static void main(String args []) {

/*
Produtos p1= new Produtos();
Unidade u1= new Unidade();

p1.setProd_cod(2);
p1.setProd_nome("Carne");
p1.setProd_quantidade(2.00);
p1.setProd_valor(30.00);
p1.setUni_cod(1);

u1.setUni_cod(1);
u1.setUni_medida("Kilo");

//System.out.println("O produto cadastrado é:");
//System.out.println("O código é:"+ p1.getProd_cod());
//System.out.println("A quantidade é:"+ p1.getProd_quantidade());
//System.out.println("O valor é:"+ p1.getProd_valor());
//System.out.println("A unidade de medida é:"+ p1.getUni_cod());

//Conexao con= new Conexao();


Produtos p2 = new Produtos();
///p2.setProd_cod(10);
///p2.setProd_nome("Peixe-Sardinha");
///p2.setProd_quantidade(4.00);
///p2.setProd_valor(11.00);
///p2.setUni_cod(2);

DAO_Produtos produtosdao=new DAO_Produtos();
///produtosdao.consultar();

DAO_Unidade unidaddao=new DAO_Unidade();
///unidadedao.consultar();
*/

        System.out.println("Deseja consultar 1 - Produtos, 2 - Unidades");
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        String opcao = teclado.next();
        if (opcao.equals("1"))
        {
            DAO_Produtos daoprod = new DAO_Produtos();
            daoprod.consulta();
//......
        }
          else if (opcao.equals("2")) {

            DAO_Unidade daouni = new DAO_Unidade();
            daouni.consultar();
//...
        }
        Conexao conexao=new Conexao();
          conexao.getConexao();
    }
}
