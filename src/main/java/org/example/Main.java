package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Color Ansi
        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_WHITE = "\u001B[37m";
        String ANSI_RESET = "\u001B[0m";
        String ANSI_GREEN = "\u001B[32m";

        String firstName = "Diego";
        String lastName = "Osorno";
        String careerSummary = "Diego is a professional with several years of experience in commercial areas and telecommunications.\n " +
                "Although he has not held official leadership positions,\n" +
                "He has demonstrated skills in project management and customer service.\n" +
                "Recently,he completed official training in Quality Control at Globant and has empirical knowledge in Java and HTML";


        String summaryQualifications= "Quality Control:" +
                "Java, HTML, Css, Project Management, telecomunications";

        String languages = "\nspanish native C1, English B1";
        String careerHistory = "Teleperformance: Medellín, Colombia,\n" +
                "Sales Advisor;\n" +
                "Start Date: November 25, 2022 – End Date: February 9, 2023\n" +
                "Focused on achieving tangible and intangible sales goals.\n" +
                "Customer service and relationship management.\n";
        String companyName = "\nTeleperformance\"", companyCity = "\nMedellín\"", companyCoutry = "\nColombia\"";
        String companyResponsibilities = "Customer service and relationship management.\n" +
                "Customer service and relationship management.\n";
        LocalDate datesWorked = LocalDate.of(2023,03,03);

        boolean salir = false;
        int opcion;

        while (!salir){
            System.out.println(ANSI_GREEN + "==================== " + ANSI_RESET + "LECTOR DE CV " + ANSI_GREEN+ "====================" + ANSI_RESET);
            System.out.println("1. Ver CV \n2. Editar CV \n3. Salir ");
            System.out.print("Digite una opcion: ");
            opcion = sc.nextByte();

            switch (opcion){
                case 1:
                    System.out.println(ANSI_GREEN + "===== " + ANSI_RESET + "PERSONAL INFORMATION" + ANSI_GREEN +" =====" + ANSI_RESET);
                    System.out.println("\nFirst Name: " + firstName);
                    System.out.println("Last Name: " + lastName);
                    System.out.println();

                    System.out.println(ANSI_GREEN + "===== " + ANSI_RESET + "CAREER SUMMARY" + ANSI_GREEN +" =====" + ANSI_RESET);
                    System.out.println(careerSummary);
                    System.out.println();

                    System.out.println(ANSI_GREEN + "===== " + ANSI_RESET + "SUMMARY QUALIFICATIONS" + ANSI_GREEN +" =====" + ANSI_RESET);
                    System.out.println(summaryQualifications);
                    System.out.println();

                    System.out.println(ANSI_GREEN + "===== " + ANSI_RESET + "LANGUAGES" + ANSI_GREEN +" =====" + ANSI_RESET);
                    System.out.println(languages);
                    System.out.println();

                    System.out.println(ANSI_GREEN + "===== " + ANSI_RESET + "CAREER HISTORY" + ANSI_GREEN +" =====" + ANSI_RESET);
                    System.out.println(careerHistory);
                    System.out.println();

                    System.out.println(ANSI_GREEN + "===== " + ANSI_RESET + "COMPANY DETAILS: " + ANSI_GREEN +" =====" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "Company Name: " + ANSI_RESET + companyName);
                    System.out.println(ANSI_GREEN + "City: " + ANSI_RESET + companyCity);
                    System.out.println(ANSI_GREEN + "Country: " + ANSI_RESET + companyCoutry);
                    System.out.println(ANSI_GREEN + "Responsibilities: " + ANSI_RESET + companyResponsibilities);
                    System.out.println(ANSI_WHITE + "--------------------------------------------------------------------------------\n" + ANSI_RESET);

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
