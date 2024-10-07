import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Corrente c = new Corrente();
        Poupança p = new Poupança();
        String x;
        do {

            System.out.println(" olá, voce deseja fazer uma conta corrente (corrente) ou conta poupança (poupança) ");
            String a, b, f;
            a = sc.next();
            switch (a) {
                case "corrente":
                    System.out.println("insira valor de deposito");
                    c.setDeposito(sc.nextDouble());
                    System.out.println("insira o valor de saque");
                    c.setSacar(sc.nextDouble());
                    System.out.println("deseja fazer o cheque especial ? ( sim ou não)");
                    c.setChequesp(sc.next());

                    c.especial();
                    System.out.println("Deseja ver os dados da conta corrente ? (sim ou não)");
                    b = sc.next();
                    switch (b) {
                        case "sim":
                            c.DadosC();
                            break;
                    }
                    break;
                case "poupança":
                    System.out.println("Insira o valor do depósito na poupança:");
                    p.setDeposito(sc.nextDouble());
                    System.out.println("Insira o valor de saque:");
                    p.setSacar(sc.nextDouble());
                    System.out.println("Quantos anos a sua poupança vai render?");
                    p.setAnos(sc.nextDouble());
                    System.out.println("Qual a taxa de juros aplicada à conta?");
                    p.setSelic(sc.nextDouble());

                    double rendimento = p.jurus();
                    System.out.println("Rendimento da poupança: " + rendimento);

                    System.out.println("Deseja ver os dados da conta Poupança? (sim ou não)");
                    f = sc.next();
                    switch (f) {
                        case "sim":
                            p.DadosP();
                            System.out.println("teve um rendimento de " + rendimento);
                            break;
                    }
                    break;
            }

            System.out.println("deseja repetir (Sim ou Não)");
            x = sc.next();
        }while (x.equalsIgnoreCase("sim"));
    }
}