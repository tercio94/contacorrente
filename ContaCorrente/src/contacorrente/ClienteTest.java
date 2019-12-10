package contacorrente;


import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

    @Test
    public void DeveCriarClienteNovoPorMeioDoConstrutor() {
        String nome = "Tercio Rodrigues";
        String cpf = "089.455.599-57";
        Cliente cliente = new Cliente(nome, cpf);
        Assert.assertEquals(nome, cliente.getNome());
        Assert.assertEquals(cpf, cliente.getCpf());
    }

}
