package contacorrente;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {

    private String numero;
    private String agencia;
    private Double saldo;
    private List<ContaCorrenteExtrato> extrato = new ArrayList<>();
    private Cliente cliente;


    public ContaCorrente(String numero, String agencia, Double saldo,
                         Cliente cliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public String getNumero() {
        return this.numero;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public List<ContaCorrenteExtrato> getExtrato(){
        return this.extrato;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void sacar(Double valor){

        if (valor > this.saldo) {
            throw new RuntimeException ("Saldo indisponível!");
        }

        this.saldo -= valor;
        adicionarExtrato(ContaCorrenteDepositoSaque.SAQUE, valor);
    }

    public void depositar(Double valor){

        if (valor <= 0){
            throw new RuntimeException ("Valor inválido!");
        }

        this.saldo += valor;
        adicionarExtrato(ContaCorrenteDepositoSaque.DEPOSITO, valor);

    }

    public void transferir( Double valor, ContaCorrente contaAlvo){

        if (valor <= 0) {
            throw new RuntimeException("É necessário que o valor do depósito seja maior do que zero!");
        }

        if (contaAlvo == null) {
            throw new RuntimeException("Conta de destino é necessário!");
        }

        this.sacar(valor);
        contaAlvo.depositar(valor);

    }

    private void adicionarExtrato(ContaCorrenteDepositoSaque tipo, Double valor) {

        ContaCorrenteExtrato extrato = new ContaCorrenteExtrato(tipo, valor);
        this.extrato.add(extrato);

    }

}
