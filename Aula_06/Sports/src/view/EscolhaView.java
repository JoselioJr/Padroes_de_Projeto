package view;

import java.util.Scanner;

public class EscolhaView {
    private Scanner scan = new Scanner(System.in);

    public int getTime(){
        System.out.println("Escolha um time dentre estas opções:");
        System.out.println("1 - Brasil");
        System.out.println("2 - Flamengo");
        System.out.println("3 - Botafogo");
        System.out.println("4 - Fluminense");
        System.out.println("5 - Vasco");
        System.out.print("Time: ");

        return scan.nextInt();
    }
}
