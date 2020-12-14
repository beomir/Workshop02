package pl.coderslab.entity;

import pl.coderslab.ConsoleColors;

import java.util.Scanner;

public class Menu {
    public static void menu() {

        int create = 1;
        int delete = 2;
        int readSelected = 3;
        int readAll = 4;
        int update = 5;
        int exit = 6;

        System.out.println(ConsoleColors.BLUE_BOLD + "Please select which action do you want make on data base");
        System.out.println(ConsoleColors.GREEN + create + ". create" + ConsoleColors.CYAN + "   new index");
        System.out.println(ConsoleColors.GREEN + delete + ". delete" + ConsoleColors.CYAN + "   existed index");
        System.out.println(ConsoleColors.GREEN + readSelected + ". read" + ConsoleColors.CYAN + "     selected position");
        System.out.println(ConsoleColors.GREEN + readAll + ". read all" + ConsoleColors.CYAN + " positions");
        System.out.println(ConsoleColors.GREEN + update + ". update" + ConsoleColors.CYAN + "   data");
        System.out.println(ConsoleColors.GREEN + exit + ". exit");

        Scanner optionScanner = new Scanner(System.in);
        label:
        while (true) {
            String options = optionScanner.nextLine();
            switch (options) {
                case "create":
                    DaoCreate.daoCreate();
                    break label;
                case "1":
                    DaoCreate.daoCreate();
                    break label;
                case "delete":
                    DaoDelete.daoDelete();
                    break label;
                case "2":
                    DaoDelete.daoDelete();
                    break label;
                case "read":
                    DaoReadAll.daoReadAll();
                    break label;
                case "4":
                    DaoReadAll.daoReadAll();
                    break label;
                case "read all":
                    DaoRead.daoRead();
                    break label;
                case "3":
                    DaoRead.daoRead();
                    break label;
                case "update":
                    DaoUpdate.daoUpdate();
                    break label;
                case "5":
                    DaoUpdate.daoUpdate();
                    break label;
                case "exit":
                    exit();
                    break label;
                case "6":
                    exit();
                    break label;
                default:
                    System.out.println(ConsoleColors.YELLOW + "Remember to choose something from selected options by using number or description from the list");
                    break;
            }
        }
    }

    public static void exit() {
        System.out.println(ConsoleColors.RED + "See you next time");
    }
}


