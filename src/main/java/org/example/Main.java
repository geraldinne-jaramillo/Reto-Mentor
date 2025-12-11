package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName, lastName;
        String careerSummary;
        String SummaryQualifications;
        String languages;
        String careerHistory;
        String companyName, companyCity, companyCoutry;
        String companyResponsibilities;
        LocalDate DatesWorked;
        
        boolean salir = false;
        int opcion;

        while (!salir){
            System.out.println("LECTOR DE CV \n------------------");
            System.out.println("1. Ver CV \n2. Editar CV \n3. Salir ");
            System.out.print("Digite una opcion: ");
            opcion = sc.nextByte();

            switch (opcion){
                case 1:
                    System.out.println("trabaja en globant");
                    break;

                case 2:
                    System.out.println("gracias por ver");
                    salir = true;
                    break;

                default:
                    System.out.println("DIGITE UNA OPCION CORRECTA");
                    break;
            }
        }
    }
}
