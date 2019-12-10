package contacorrente;
import java.time.LocalDateTime;

public class ContaCorrenteExtrato {

    private LocalDateTime data;
    private ContaCorrenteDepositoSaque tipoOperacao;
    private Double valor;

    public ContaCorrenteExtrato(ContaCorrenteDepositoSaque tipoOperacao, Double valor) {
        this.data = LocalDateTime.now();
        this.tipoOperacao = tipoOperacao;
        this.valor = valor;
    }

}

