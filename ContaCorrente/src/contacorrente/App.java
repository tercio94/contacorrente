package contacorrente;

public class App {

    public static void main(String...args) {
        Cliente cliente = new Cliente("Tercio Rodrigues", "089.455.599-57");
        ContaCorrente contaCorrente = new ContaCorrente("03515-7",
                "1253",
                10500.5,
                cliente);

     try {
        contaCorrente.depositar(2000.0);
    }catch (RuntimeException RuntimeException) {
     }
    }


}



