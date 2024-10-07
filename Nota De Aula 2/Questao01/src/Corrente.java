public class Corrente extends Pessoa {
    private String chequesp;

    public String getChequesp() {
        return chequesp;
    }

    public void setChequesp(String chequesp) {
        this.chequesp = chequesp;
    }

    public Corrente() {

    }

    public Corrente(double sacar, double deposito, String chequesp) {
        super(deposito, sacar);
        this.chequesp = chequesp;

    }

    public void especial() {
        if (chequesp.equalsIgnoreCase("sim")) {
            System.out.println("como voce desejou fazer aqui está o cheque especial de 1000 reais");
        } else {
            System.out.println("obrigado, tenha um otimo dia");
        }

    }

    public void DadosC() {
        System.out.println("o deposito foi de : " + getDeposito());
        System.out.println(" o saque foi de : " + getSacar());
        System.out.println(" o cheque especial foi aceito :" + getChequesp());
    }
}