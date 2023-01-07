import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        v.setNome("Cachorro da mulesta");
        v.setCpf("12313123");
        v.setSalario(100);
        v.setDataNascimento(new Date());
        v.setComissao(10);
        v.setVendas(100);

        System.out.println("O salario do vendedor é "+ v.getComissao());
    }
}