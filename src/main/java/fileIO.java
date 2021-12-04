//class for reading and writing serialized objects from a file

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class fileIO {

    private static final String filepath = "src/main/resources/Commissions/commission";

    public static void main(Commission commission){
        fileIO objID = new fileIO();

    }

    public static void writeObjToFile(Object comm, int id){

        try{
            FileOutputStream fileOut = new FileOutputStream(filepath + id + ".db");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(comm);
            objectOut.close();
            System.out.println("Object written successfully");

        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static Object readObjFromFile(int id) throws IOException, ClassNotFoundException {
        Object result = null;
        FileInputStream fileIn = new FileInputStream(filepath + id + ".db");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);

        try{
            fileIn = new FileInputStream(filepath + id + ".db");
            result = objectIn.readObject();

        } catch (EOFException ignored){

        } finally {
            fileIn.close();
        }
        return result;
    }
}

