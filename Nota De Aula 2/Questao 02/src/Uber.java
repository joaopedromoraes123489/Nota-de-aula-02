public class Uber {
    double distancia;
    int tempoEspera;

    public double getFatorDemanda() {
        return fatorDemanda;
    }

    public void setFatorDemanda(double fatorDemanda) {
        this.fatorDemanda = fatorDemanda;
    }

    double tarifaBase;

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    double fatorDemanda;

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    double valorfinal;

    public double CalcularValorCorrida(){
        valorfinal = (distancia * 2) + (tempoEspera * 0.5) + (tarifaBase) + (fatorDemanda);
        return valorfinal;
    }

    public void exibirDetalhesCorrida(){
        System.out.println(" a distancia foi de " + getDistancia()+"km");
        System.out.println("o tempo de espera foi de " + getTempoEspera()+"H");
        System.out.println("a tarifa base foi de " + getTarifaBase());
        System.out.println("o fator demanda foi de "+ getFatorDemanda());
    }
}