package contacorrente;

public class CampoNaoPodeSerNulo {

    public static void notNull(Object value, String field) {

        if (value == null) {
            throw new RuntimeException("Campo " + field + " é obrigatório!");
        }
    }

}
