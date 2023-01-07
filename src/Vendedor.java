import java.util.Date;

public class Vendedor extends Funcionario  {

    private int vendas;
    private float comissao;
    public Vendedor(){
        super();
    }

    public float calculaSalario(){
        return  getSalario() + (this.comissao * vendas);
     }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
}
