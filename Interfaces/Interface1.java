package com.AbstractionPackagesExceptionHandling.Interfaces;

// 1)An online library application need to be created for two types of users/roles-Adults and children.
// Both of these users should be able to register an account.
//
//Any user who is less than 12 years of age will be registered as a child and they can borrow a “Kids”
// category book for 10 days, whereas an adult can borrow “Fiction” category books which need to be returned within 7 days.
//
//
//
//Note: In future, more users/roles might be added to the library where similar rules will be enforced.
//
//Develop Interfaces and classes for the categories mentioned above.
//
//
//1. Create an interface LibraryUser with the following methods
//void registerAccount()
//
//void requestBook
//()
//registerAccount():
//
//if age > 12, a message displaying “You have successfully registered under an Adult Account” should be displayed in the console.
//
//If age<12, a message displaying, “Sorry, Age must be greater than 12 to register as an adult” should be displayed in the console.
//
//
//requestBook function:
//
//if bookType is “Fiction”, a message displaying “Book Issued successfully, please return the book within 7 days” should be displayed in the console., else, a message displaying, “Oops, you are allowed to take only adult Fiction books” should be displayed in the console.
//
//
//6. Create a class “LibraryInterfaceDemo.java” with a main method and test the functionalities by creating objects of KidUser and AdultUser classes.

interface LibraryUser{
    void registerAccount();
    void requestBook();
}

class Children  implements LibraryUser{
    int age;
    String bookCategory;

   Children(int age, String bookCategory){
        this.age=age;
        this.bookCategory=bookCategory;
    }

    @Override
    public void registerAccount() {
        if(age<=12) System.out.println("Registration Successful");
        else System.out.println("Age must be less than 12");
    }

    @Override
    public void requestBook() {
        if (bookCategory.equals("Kid"))
            System.out.println("Book issued ,Must return the book within 10 days");
        else System.out.println("You can borrow only kids books");
    }
}

class Adult  implements LibraryUser{
    int age;
    String bookCategory;

   Adult(int age, String bookCategory){
        this.age=age;
        this.bookCategory=bookCategory;
    }

    @Override
    public void registerAccount() {
        if(age>12) System.out.println("You have successfully registered under an Adult Account");
        else System.out.println("Sorry, Age must be greater than 12 to register as an adult");
    }

    @Override
    public void requestBook() {
       if (bookCategory.equals("Fiction"))
         System.out.println("Book Issued successfully, please return the book within 7 days");
       else System.out.println("Oops, you are allowed to take only adult Fiction books");
    }
}
public class Interface1 {
    public static void main(String[] args) {
        Children children=new Children(11, "Kid");
        children.registerAccount();
        children.requestBook();
    }
}
