package com.mcfadden.project1;
//Ean McFadden
//Project 1
//February 1, 2018
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<String>();
        System.out.println("Please choose an option:\n(1) Add a task.\n(2) Remove a task.\n(3) Update a task.\n(4) List all tasks.\n(0) Exit.");
        float choice = input.nextFloat();
        while (choice != 0) {
            if (choice == 1) {
                String task = add();
                tasks.add(task);
            }
            else if (choice == 2) {
                String removed = remove();
                tasks.remove(removed);
            }
            else if (choice == 3) {
                String change = changeRemove();
                tasks.remove(change);
                change = changeUpdate();
                tasks.add(change);
            }
            else if (choice == 4) {
                System.out.println(tasks);
            }
            else {
                System.out.println("You have entered an incorrect number");
            }
            System.out.println("Please choose an option:\n(1) Add a task.\n(2) Remove a task.\n(3) Update a task.\n(4) List all tasks.\n(0) Exit.");
            choice = input.nextFloat();
        }
        System.out.println("Thank you for using the task list.");

    }
    static String add(){
        Scanner addition = new Scanner(System.in);
        System.out.println("Please provide a description of the tasks you wish to add");
        String taskadd = addition.nextLine();
        return taskadd;
    }
    static String remove(){
        Scanner remove = new Scanner(System.in);
        System.out.println("What task do you wish to remove.");
        String taskremove = remove.nextLine();
        return taskremove;
    }
    static String changeRemove(){
        Scanner update = new Scanner(System.in);
        System.out.println("What task do you wish to update?");
        String changeRemoved = update.nextLine();
        return changeRemoved;
    }
    static String changeUpdate(){
        Scanner update = new Scanner(System.in);
        System.out.println("What do you wish to change it to?");
        String changeUpdated = update.nextLine();
        return changeUpdated;
    }
}
