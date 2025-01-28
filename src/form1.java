import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame {
    private JButton okButton;
    private JButton cancelButton;
    private JTextArea bodyText;
    private JTextField titleText;
    private JPanel contentPane;

    public form1() {
        this.add(this.contentPane);
        okButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.printf("Hello and welcome!");
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Cancelled by user");
                System.exit(0);
            }
        });
    }
}
