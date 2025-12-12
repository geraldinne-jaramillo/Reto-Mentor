package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName="Geraldine", lastName="Jaramillo";
        String careerSummary="";
        String summaryQualifications="This should be 2-3 lines long and include number of years experience, methodologies, frameworks, languages, projects and technologies worked on, and their role (any leadership positions?). As with the rest of the CV, this should be written in the 3rd person (eg, Juan led a team…).\n" +
                "\n";
        String languages;
        String careerHistory;
        String companyName, companyCity, companyCoutry;
        String companyResponsibilities;
        LocalDate datesWorked; //no puede tener valor se declara

        boolean salir = false;
        int opcion;

        while (!salir){
            System.out.println("LECTOR DE CV \n------------------");
            System.out.println("1. Ver CV \n2. Editar CV \n3. Salir ");
            System.out.print("Digite una opcion: ");
            opcion = sc.nextByte();

            switch (opcion){
                case 1:
                    System.out.println("First Name "+ firstName );
                    break;

                case 2:
                    System.out.println("= Editor Activo =");

                    sc.nextLine();

                    System.out.print("First name: ");
                    firstName = sc.nextLine();

                    System.out.print("Last name: ");
                    lastName = sc.nextLine();

                    System.out.print("Career Summary: ");
                    careerSummary = sc.nextLine();

                    System.out.print("Summary of Qualifications. \nPoficient in: ");
                    summaryQualifications = sc.nextLine();

                    System.out.print("Languages: ");
                    languages = sc.nextLine();

                    System.out.print("career History: ");
                    careerHistory = sc.nextLine();

                    System.out.print("Company Name: ");
                    companyName = sc.nextLine();

                    System.out.print("Company city: ");
                    companyCity = sc.nextLine();

                    System.out.print("Company coutry: ");
                    companyCoutry = sc.nextLine();

                    System.out.print("Company Responsibilities: ");
                    companyResponsibilities = sc.nextLine();

                    break;

                case 3:
                    System.out.println("--- Gracias por ver ---");
                    salir = true;
                    break;

                default:
                    System.out.println("DIGITE UNA OPCION CORRECTA");
                    break;
            }
        }
    }
}
