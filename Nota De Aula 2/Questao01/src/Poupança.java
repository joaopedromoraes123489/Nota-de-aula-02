public class Poupança extends Pessoa {

    private double anos;




    public double getSelic() {
        return selic;
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }

    public double getAnos() {
        return anos;
    }

    public void setAnos(double anos) {
        this.anos = anos;
    }

    double selic;

    public Poupança() {

    }

    public Poupança(double deposito, double sacar, double anos, double selic) {
        super(deposito, sacar);
        this.anos = anos;
        this.selic = selic;

    }

    public double jurus() {
        double saldo = deposito - sacar;
        double rendimento;

        if (selic > 8.5) {
            rendimento = 0.005 * saldo * anos;
        } else {
            rendimento = 0.007 * selic * saldo * anos;
        }
        return rendimento;
    }

    public void DadosP(){
        System.out.println("o deposito foi de : " + getDeposito());
        System.out.println(" o saque foi de : "+ getSacar());
        System.out.println("a quantidade de anos que a popança vai render é : " + getAnos());
        System.out.println("a taxa de juros apliacada a conta foi de :  " +getSelic());
    }

}
