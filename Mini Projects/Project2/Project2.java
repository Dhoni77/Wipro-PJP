package com.Project2;

//Video
//Member variables
//• String videoName
//• boolean checkout
//• int rating
//Member functions
//• String getName();
//• void doCheckout();
//• void doReturn();
//• void receiveRating(int rating);
//• int getRating();
//• boolean getCheckout();
//Constructor
//• Video(String name)

import java.util.Scanner;

class Video {
    private String videoName;
    private boolean checkout;
    private int rating;

    Video(String name) {
        videoName = name;
    }

    String getName() {
        return videoName;
    }


    void doCheckout() {
        checkout = true;
    }

    void doReturn() {
        checkout = false;
    }

    void receiveRating(int rating) {
        this.rating = rating;
    }

    int getRating() {
        return rating;
    }

    boolean getCheckout() {
        return checkout;
    }
}

//VideoStore
//Member variables
//• Video[] store;
//Member functions
//• void addVideo(String name);
//• void doCheckout(String name);
//• void doReturn(String name);
//• void receiveRating(String name, int rating);
//• void listInventory();
class VideoStore extends Video{
    Video[] store=new Video[1];

    VideoStore(String name) {
        super(name);
    }

    void addVideo(String  name){
            store[0]=new Video(name);
    }

    void doCheckout(String name){
        if(store==null || store.length==0){
            System.out.println("Store is empty");
            return;
        }
            if(store[0].getName().equals(name))
                store[0].doCheckout();

    }

    void doReturn(String name){
        if(store==null || store.length==0){
            System.out.println("Store is empty");
            return;
        }
        if(store[0].getName().equals(name)){
                    store[0].doCheckout();
                }
    }

    void receiveRating(String name, int rating){
        if(store==null || store.length==0){
            System.out.println("Store is empty");
            return;
        }
         if (store[0].getName().equals(name)) {
                    store[0].receiveRating(rating);
                }
    }

    void listInventory() {
        if (store == null || store.length == 0) {
            System.out.println("Store is empty");
            return;
        }
                System.out.printf("--------------------------------------------------------\n" +
                        "Video Name | Checkout Status | Rating \n" +
                            "%s     |        %b       | %d \n" +
                        "--------------------------------------------------------", store[0].getName(), store[0].getCheckout(), store[0].getRating());
            }
}

class VideoLauncher{

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name;
        VideoStore videoStore = null;
        int choice=0;
            do  {
                System.out.println("MAIN MENU\n" +
                        "=========\n" +
                        "1.Add Videos: \n" +
                        "2. Check Out Video : \n" +
                        "3. Return Video : \n" +
                        "4. Receive Rating : \n" +
                        "5. List Inventory : \n" +
                        "6. Exit : \n" +
                        "Enter your choice (1..6):");
            switch (choice=scanner.nextInt()){
                case 1:
                    scanner.nextLine();
                    System.out.println("Enter the name of the video you want to add: ");
                    name=scanner.nextLine();
                    videoStore=new VideoStore(name);
                    videoStore.addVideo(name);
                    System.out.printf("Video \"%s\" added successfully.",name);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Enter the name of the video you want to check out: ");
                    name=scanner.nextLine();
                    videoStore.doCheckout(name);
                    System.out.println("Video "+name+" checked out successfully.");
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Enter the name of  the video you want to return: ");
                    name=scanner.nextLine();
                    videoStore.doReturn(name);
                    System.out.println("Video "+name+" returned successfully.");
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Enter the name of the video you want to Rate: ");
                    name=scanner.nextLine();
                    System.out.println("Enter the rating for this video:");
                    int rating=scanner.nextInt();
                    videoStore.receiveRating(name, rating);
                    System.out.printf("Rating \"%d\" has been mapped to the Video \"%s\".",rating,name);
                    break;
                case 5:
                    videoStore.listInventory();
                    break;
                case 6:
                    System.out.println("Exiting...!! Thanks for using the application.");
                    System.exit(1);
                    break;
            }
        }while (choice >0 && choice <= 6);
    }

}

public class Project2 {
}
