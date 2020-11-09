package practica1;

import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Momento Inicial: ");
            System.out.println("---------------- ");
            System.out.println("                 ");
                System.out.println("Introduce la hora");
                int horainicial = sc.nextInt();
                System.out.println("Introduce los Minutos");
                int minutoinicial = sc.nextInt();
                System.out.println("Introduce los Segundos");
                int segundoinicial = sc.nextInt();
                System.out.println("                 ");
            int segundosTotales = ((horainicial * 3600) + (minutoinicial * 60) + (segundoinicial));


            System.out.println("Momento Final:   ");
            System.out.println("---------------- ");
            System.out.println("                 ");
                System.out.println("Hora final");
                int horaFinal = sc.nextInt();
                System.out.println("Minutos finales");
                int minutoFinal = sc.nextInt();
                System.out.println("Segundos finales");
                int segundoFinal = sc.nextInt();
                int segundosTotalesFinales = ((horaFinal * 3600) + (minutoFinal * 60) + (segundoFinal));
                

            int restaSegundos = (segundosTotalesFinales - segundosTotales);
            int segundos = (restaSegundos % 60);
            int divisionSegundos = (restaSegundos / 60);
            int minutos = (divisionSegundos % 60);
            int hora = (divisionSegundos / 60);

                System.out.println("Datos introducidos: La hora inicial es: " + horainicial + ":" + minutoinicial + ":" + segundoinicial + "   Momento final: " + horaFinal + ":" + minutoFinal + ":" + segundoFinal);
                System.out.println("");
                System.out.println("La diferencia entre ambos momentos es: " + hora + ":" + minutos + ":" + segundos);




    }
}
