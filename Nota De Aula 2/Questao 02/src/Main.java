import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Uber u = new Uber();
        String x, a, b;
        do {

            System.out.println(" bem vindo a uber por favor complete os requisitos pedidos ");

            System.out.println("insira a distancia em km/h : ");
            u.setDistancia(sc.nextDouble());

            System.out.println("insira o tempo de espera em horas: ");
            u.setTempoEspera(sc.nextInt());

            System.out.println("insira tarifa base : ");
            u.setTarifaBase(sc.nextDouble());

            System.out.println("insira o fator demanda : ");
            u.setFatorDemanda(sc.nextDouble());


            System.out.println("deseja ver os detalhes da corrida ? (sim ou não)");
            a = sc.next();
            switch (a) {
                case "sim":
                    u.exibirDetalhesCorrida();
            }

            System.out.println("deseja calcular os valored da corrida ? ");
            b= sc.next();
            switch (b) {
                case "sim":

                    System.out.println(u.CalcularValorCorrida());

            }
            System.out.println("deseja repetir o processo ? (Sim ou não)");
            x = sc.next();


        }while (x.equalsIgnoreCase("Sim")) ;
    }
}