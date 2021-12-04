
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Man {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//                      Test code for storing commission objects


//        User artist = new User("testArtist", "testPass", "artist@gmail.com");
//        User user = new User("testUser", "testPass", "user@gmail.com");
//
//
//        Commission testComm = new Commission(user, artist, "art and shit", 500);
//        Commission testComm2 = new Commission(user, artist, "art and shit", 1000);
//
//        DBManager.addComm(testComm, 0);
//        DBManager.addComm(testComm2, 1);
//
//        System.out.println(DBManager.readComm(0));
//        System.out.println(DBManager.readComm(1));


        String relativeResourcePath = "../resources/";
        String userName = "temp", password = "passTemp";
        String input = "Z";
        Scanner userInput = new Scanner(System.in);

        // Make DBManager Object
        DBManager database = new DBManager();
        database.addUser(new User("freshman", "passpp", "freshman@gmail.com"));

        // Login or Register Prompt
        // Catches invalid input
        do {
            System.out.println("A: Login \n B: Register");
            input = userInput.next();
        }while(!input.equals("A") && !input.equals("B"));

        if(input.equals("A")){
            System.out.println("Enter username");
            input = userInput.next();
            System.out.println(userInput);
        }

         //View Portfolio Prompt
    }
}
