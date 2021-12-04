import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaymentOrder extends JFrame {
    private JTextField paymentNum;
    private JTextField expireDate;
    private JTextField payDate;
    private JTextField secureCode;
    private JButton cancelButton;
    private JPanel payPanel;
    private JButton submitButton;

    //GUI Constructor
    public PaymentOrder(){
        setContentPane(payPanel);
        setTitle("Order Payment");
        setSize(450,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        //Actions for the submit Button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cardNum = paymentNum.getText();
                String expiration = expireDate.getText();
                String date = payDate.getText();
                String code = secureCode.getText();

                //Message Dialog upon selecting submit
                JOptionPane.showMessageDialog(null, "Payment Sent. " +
                        "An Email receipt has been sent to you and the Artist.");
                //Window closes after selecting OK
                System.exit(0);

            }
        });

        //Actions for the cancel button
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Order has been canceled.");
                System.exit(0);

            }
        });
    }



    //Main function as Driver
    public static void main(String[] args) {

        PaymentOrder payGUI = new PaymentOrder();
    }


}