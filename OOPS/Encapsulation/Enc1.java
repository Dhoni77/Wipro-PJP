package com.OOPS.Encapsulation;

//encapsulation💻
//
//1)Create a class Author with the following information.
//Member variables : name (String), email (String), and gender (char)
//Parameterized Constructor: To initialize the variables
//
//
//Create a class Book with the following information.
//Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)
//[Assumption: Each book will be written by exactly one Author]
//Parameterized Constructor: To initialize the variables
//Getters and Setters for all the member variables
//
//In the main method, create a book object and print all details of the book (including the author details)
//Encapsulation / Abstraction
class Author{
    String name;
    String email;
    char gender;
    Author(String name, String email, char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

}
class Book{
    String name;
    double price;
    Author author;
    int qtyInStock;

    Book(String name, double price, Author author, int qtyInStock){
        this.name=name;
        this.price=price;
        this.author=author;
        this.qtyInStock=qtyInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    void printDetails(){
        System.out.printf("Book: %s\nPrice: %.1f\n" +
                "Author: %s\n"
                + "Quantity in Stock: %d",this.getName(),this.getPrice(),this.getAuthor().name,this.getQtyInStock());
    }

    public static void main(String[] args) {
        Author author = new Author("J.K Rowling", "jkrowling@email.com", 'F');
        Book book = new Book("Harrry Potter", 500.0, author, 5);
        book.printDetails();
    }
}
public class Enc1 {

}

