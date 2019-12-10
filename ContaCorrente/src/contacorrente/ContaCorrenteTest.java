package contacorrente;

import org.junit.Assert;
import org.junit.Test;

public class ContaCorrenteTest {

    @Test
    public void DeveCriarContaNovaPorMeioDoConstrutor() {

        String numero = "03512-7";
        String agencia = "0001";
        Double saldo = 10.5;
        Cliente cliente = new Cliente("Tercio Rodrigues", "088.454.598-56");

        ContaCorrente contaCorrente = new ContaCorrente(numero, agencia, saldo,cliente);
        Assert.assertEquals(numero, contaCorrente.getNumero());
        Assert.assertEquals(agencia, contaCorrente.getAgencia());
        Assert.assertEquals(saldo, contaCorrente.getSaldo());
        Assert.assertEquals(cliente, contaCorrente.getCliente());
    }

    @Test
    public void deveJogarExceptionComSaldoIndisponivel() {
        String numero = "03512-7";
        String agencia = "0001";
        Double saldo = 10.5;
        Cliente cliente = new Cliente ("Tercio Rodrigues", "088.454.598-56");
        try {
            ContaCorrente contaCorrente = new ContaCorrente(numero,agencia, saldo,cliente);
        } catch (RuntimeException RuntimeException) {
            Assert.assertEquals("Saldo indisponível", RuntimeException.getMessage());
        }
    }

}
