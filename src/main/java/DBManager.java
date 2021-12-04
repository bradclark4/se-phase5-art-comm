import java.net.URL;
import java.util.ArrayList;
import java.io.*;

public class DBManager {

    String relativeResourcePath = "../resources/";

    URL url = getClass().getResource("users.txt");
    File usersFile = new File(url.getPath());

    ArrayList<User> users = new ArrayList<User>();
    ArrayList<Commission> commissions;


    // Everytime the DBManager is constructed
    // new arraylists are made from looking
    // at files in:
    // ../resources/


    public DBManager() throws IOException {

        // BufferedReader to get information for
        // all users.
        FileReader fr = new FileReader(usersFile);
        BufferedReader br = new BufferedReader(fr);

        // Create all users into ArrayList.
        // from users file contents.
        String line;
        String line2;
        String line3;
        while((line=br.readLine())!=null){
            line2 = br.readLine();
            line3 = br.readLine();

            User lineUser = new User(line, line2, line3);

            // skip empty delimiter line
            line = br.readLine();

            users.add(lineUser);
        }

    }

    // TODO: Make it so you can add new user to users.txt file
    public void addUser(User newUser) throws IOException {
            System.out.println(usersFile);
            PrintWriter out = new PrintWriter(usersFile);

            //Print information from User object onto users file
            out.write(newUser.getUsername()+"\n");
            out.write(newUser.getPassword()+"\n");
            out.write(newUser.getEmail()+"\n");

            out.flush();
            out.close();

            users.add(newUser);
            System.out.println("Added user to DBManager and records");

            for(int c = 0; c < users.size(); c++)
                System.out.println(users.get(c).getUsername());
    }

    public static void addComm(Commission comm, int id){
        fileIO.writeObjToFile(comm, id);
    }

    public static Object readComm(int id) throws IOException, ClassNotFoundException {
        return fileIO.readObjFromFile(id);
    }

}
