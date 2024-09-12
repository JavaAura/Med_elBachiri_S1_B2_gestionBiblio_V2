package com.library.ui;

import com.library.service.Library;
import com.library.utils.InputValidator;
import com.library.utils.UI;


import java.util.Scanner;

public class DocumentMenu {

    private static Scanner scanner = new Scanner(System.in);
    private static Library library = new Library();

    public static void display() {
        System.out.println("===== Document Management =====");
        System.out.println("1. Add Document");
        System.out.println("2. View All Documents");
        System.out.println("3. Search Document ");
        System.out.println("4. Delete Document");
        System.out.println("5. Back to Main Menu");

        String choice = scanner.nextLine();
        if (!InputValidator.isValidNumber(choice)) {
            System.out.println("Invalid choice, try again.");
            display();
            return;
        }
        switch (choice) {
            case "1":
                UI.clear();
                add();
                break;
            case "2":
                UI.clear();
                viewAll();
                break;
            case "3":
                UI.clear();
                search();
                break;
            case "4":
                UI.clear();
                delete();
                break;
            case "5":
                MainMenu.display();
                return;
            default:
                System.out.println("Invalid choice.");
                display();
        }
    }

    private static void add() {
       library.addDocument();
       display();
    }

    private static void viewAll(){
        library.viewAllDocs();
        display();
    }
    private static void search(){
        library.search();
        display();
    }
    private static void delete(){
        library.delete();
        display();
    }
}
