import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    public String username;
    private String password;
    private String email;

    private ArrayList<Commission> commissions;
    private Portfolio portfolio;
    private Payment fiat;

    public User(String usernameNew, String passwordNew, String emailNew){
        username = usernameNew;
        password = passwordNew;
        email = emailNew;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String newUsername){
        username = newUsername;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String newPassword){
        password = newPassword;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String newEmail){
        email = newEmail;
    }

    public ArrayList<Commission> getComm(){return commissions;}
}
