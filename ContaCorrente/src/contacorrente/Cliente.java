package contacorrente;

public class Cliente {

    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        if (nome != null){

            if (nome.replaceAll(" ", "").length() > 5) {

                this.nome = nome;

            } else {

                throw new RuntimeException("Nome muito curto!");
            }

        } else {

            CampoNaoPodeSerNulo.notNull(nome, "nome");
        }

        if (cpf != null) {

            if (cpf.replaceAll("-", "").length() == 13
                    || cpf.replaceAll("-", "").length() == 11) {

                this.cpf = cpf;

            } else {

                throw new RuntimeException("CPF inválido!");

            }
        } else {

            CampoNaoPodeSerNulo.notNull(cpf, "cpf");

        }
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

}