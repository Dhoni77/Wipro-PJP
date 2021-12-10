package com.Collections.Project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//Write a Program to perform the basic operations like insert, delete, display and search in list. List contains
//String object items where these operations are to be performed.
//Sample Input and Output :
//1. Insert
//2. Search
//3. Delete
//4. Display
//5. Exit
//Enter your choice :
//1
//Enter the item to be inserted:
public class Prj2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter your Choice\n" +
                    "1.Insert\n" +
                    "2.Search\n" +
                    "3.Delete\n" +
                    "4.Display\n" +
                    "5.Exit\n");
            switch (choice = scanner.nextInt()) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Enter the element to be inserted");
                    String s=scanner.next();
                    arrayList.add(s);
                    System.out.println("Inserted Successfully");
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Enter the element to be searched");
                    String key=scanner.next();
                    boolean isFound=false;
                    Iterator<String> iterator=arrayList.iterator();
                    while (iterator.hasNext()){
                        if(iterator.next().equals(key)) isFound=true;
                    }
                    if(isFound)System.out.println("Item found in the list");
                    else System.out.println("Item not found in the list");
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Enter the element to be removed");
                    String keyToDelete=scanner.next();
                    boolean isFoundEle=false;
                    Iterator<String> i=arrayList.iterator();
                    int j=0;
                    while (i.hasNext()){
                        if(i.next().equals(keyToDelete)) {
                            isFoundEle=true;
                            arrayList.remove(keyToDelete);
                        }
                    }
                    if(isFoundEle)System.out.println("Item Removed Successfully");
                    else System.out.println("Item not found in the list");
                    break;
                case 4:
                    System.out.println("The items in the list are");
                    i=arrayList.iterator();
                    while (i.hasNext()) System.out.println(i.next());
                    break;
                case 5:
                    System.out.println("Program terminated successfully");
                    System.exit(1);
                    break;
            }
        }while (choice>0);
    }
}
