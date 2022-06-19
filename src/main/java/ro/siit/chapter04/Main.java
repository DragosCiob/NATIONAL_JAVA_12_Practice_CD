package ro.siit.chapter04;

import functions.SalesRepresentative;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("type the action that you need : add, delete or list ");

        String action;
        Scanner in=new Scanner(System.in);
        action = in.nextLine();
        //System.out.println(action);

        if(action.equals("add")){
            //System.out.println("add");
            LibraryCatalog.addTitle();
        } else if (action.equals("delete")) {
            //System.out.println("delete");
            LibraryCatalog.deleteTitle();
        }else if (action.equals("list")){
            //System.out.println("listTitles");
            LibraryCatalog.listTitles();
        }else{
            System.out.println("the action typed is not recognized, please insert one of the following actions: add, delete or list");
        }


    }



}
