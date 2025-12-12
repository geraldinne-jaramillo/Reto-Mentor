package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Color Ansi
        String ANSI_WHITE = "\u001B[37m";
        String ANSI_RESET = "\u001B[0m";
        String ANSI_GREEN = "\u001B[32m";

        String firstName = "Diego";
        String lastName = "Osorno";
        String careerSummary = "Diego is a professional with several years of experience in commercial areas and\ntelecommunications. Although he has not held official leadership positions,\nHe has demonstrated skills in project management and customer service.\nRecently,he completed official training in Quality Control at Globant\nand has empirical knowledge in Java and HTML";
        String summaryQualifications= "Quality Control: \nJava, HTML, Css, Project Management, telecomunications";
        String languages = "spanish native C1, \nEnglish B1";
        String careerHistory = "Teleperformance: Medellín, Colombia, Sales Advisor;\nStart Date: November 25, 2022 – End Date: February 9, 2023\nFocused on achieving tangible and intangible sales goals.\nCustomer service and relationship management.\n";
        String companyName = "Teleperformance", companyCity = "Medellín", companyCoutry = "Colombia";
        String companyResponsibilities = "Customer service and relationship management.\nCustomer service and relationship management.";

        boolean salir = false;
        int opcion;

        while (!salir){
            System.out.println(ANSI_GREEN + "==================== " + ANSI_RESET + "LECTOR DE CV " + ANSI_GREEN+ "====================" + ANSI_RESET);
            System.out.println("1. Ver CV \n2. Editar CV \n3. Salir ");
            System.out.print("Digite una opcion: ");
            opcion = sc.nextByte();
            System.out.println(ANSI_WHITE + "--------------------------------------------------------------------------------\n" + ANSI_RESET);

            switch (opcion){
                case 1:
                    System.out.println(ANSI_GREEN + "===== " + ANSI_RESET + "PERSONAL INFORMATION" + ANSI_GREEN +" =====" + ANSI_RESET);
                    System.out.println("First Name: " + firstName);
                    System.out.println("Last Name: " + lastName);

                    System.out.println(ANSI_GREEN + "\n===== " + ANSI_RESET + "CAREER SUMMARY" + ANSI_GREEN +" =====\n" + ANSI_RESET + careerSummary);

                    System.out.println(ANSI_GREEN + "\n===== " + ANSI_RESET + "SUMMARY QUALIFICATIONS" + ANSI_GREEN +" =====\n" + ANSI_RESET + summaryQualifications);

                    System.out.println(ANSI_GREEN + "\n===== " + ANSI_RESET + "LANGUAGES" + ANSI_GREEN +" =====\n" + ANSI_RESET + languages);

                    System.out.println(ANSI_GREEN + "\n===== " + ANSI_RESET + "CAREER HISTORY" + ANSI_GREEN +" =====\n" + ANSI_RESET + careerHistory);

                    System.out.println(ANSI_GREEN + "===== " + ANSI_RESET + "COMPANY DETAILS" + ANSI_GREEN +" =====" + ANSI_RESET);
                    System.out.println("Company Name: " + companyName);
                    System.out.println("City: " + companyCity);
                    System.out.println("Country: " + companyCoutry);
                    System.out.println("Responsibilities: " + companyResponsibilities);
                    System.out.println(ANSI_WHITE + "-------------------------------------------------------------------\n" + ANSI_RESET);

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
                    System.out.println("--- Cerrando CV ---");
                    salir = true;
                    break;

                default:
                    System.out.println("DIGITE UNA OPCION CORRECTA\n");
                    System.out.println(ANSI_WHITE + "--------------------------------------------------------------------------------" + ANSI_RESET);
                    break;
            }
        }
    }
}
