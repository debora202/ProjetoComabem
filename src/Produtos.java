public class Produtos
{
  int  Prod_cod;
   String Prod_nome;
  Double  Prod_valor;
    Double Prod_quantidade;

    public int getProd_cod() {
        return Prod_cod;
    }

    public void setProd_cod(int prod_cod) {
        Prod_cod = prod_cod;
    }

    public String getProd_nome() {
        return Prod_nome;
    }

    public void setProd_nome(String prod_nome) {
        Prod_nome = prod_nome;
    }

    public Double getProd_valor() {
        return Prod_valor;
    }

    public void setProd_valor(Double prod_valor) {
        Prod_valor = prod_valor;
    }

    public Double getProd_quantidade() {
        return Prod_quantidade;
    }

    public void setProd_quantidade(Double prod_quantidade) {
        Prod_quantidade = prod_quantidade;
    }


    public int getUni_cod() {
        return Uni_cod;
    }

    public void setUni_cod(int uni_cod) {
        Uni_cod = uni_cod;
    }

    int Uni_cod;
}
