import java.io.Serializable;

public class Commission implements Serializable {

    private User customer;
    private User artist;

    public String id;
    private String customerEmail, artistEmail, description;
    private int status;
    private double price;

    // for status 1 = pending, 2 = accepted, 3 = compiled, 4 = paid
    // and 5 = canceled

    public Commission(User newCustomer, User newArtist, String newDescription, double newPrice){
        customer = newCustomer;
        artist = newArtist;
        description = newDescription;
        price = newPrice;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int newStatus){
        status = newStatus;
    }

    @Override
    public String toString()
    {
        return "Customer: " + this.customer.getUsername() + " | Artist: " + artist.getUsername() + " | Price: " + this.price;
    }
}
