import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class createArtistPortfolio extends JFrame{
    private JPanel createArtistPortfolio;
    private JLabel profilePic;
    private JTextField profileAttach;
    private JTextField nameStr;
    private JLabel portfolio;
    private JButton cancel;
    private JButton submit;
    private JTextField textField1;

    public createArtistPortfolio(){
        setContentPane(createArtistPortfolio);
        setTitle("Create Artist Portfolio");
        setSize(450, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        //Actions for the submit button
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String profile = profileAttach.getText();
                String nameUser = nameStr.getText();
                String art = portfolio.getText();

                //Message Dialog upon selecting submit
                JOptionPane.showMessageDialog(null, "Artist Portfolio" +
                        " created. Your portfolio is now ready to be displayed!");
                //Window closes after selecting OK
                System.exit(0);
            }
        });

        //Actions for the cancel button
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Message Dialog upon selecting cancel
                JOptionPane.showMessageDialog(null, "Artist Portfolio" +
                        " canceled. Portfolio not Created.");
                //Window closes after selecting OK
                System.exit(0);
            }
        });
    }

    //Main function as Driver
    public static void main(String[] args) {
        createArtistPortfolio artist = new createArtistPortfolio();
    }
}

