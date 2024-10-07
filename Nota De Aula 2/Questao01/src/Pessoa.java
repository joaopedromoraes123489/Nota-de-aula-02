public class Pessoa {
    protected  double deposito,sacar;

    public double getDeposito() {
        return deposito;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public Pessoa(){

    }

    public Pessoa(double deposito, double sacar){
        this.deposito = deposito;
        this.sacar = sacar;
    }
}
