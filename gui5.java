import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;

public class gui5 {

    public static void main(String[] args) {
        
        JFrame frame=new JFrame("Greeting application");

        JLabel label=new JLabel("Enter your name");
        label.setBounds(30,30,150,30);

        JTextField textfield=new JTextField();
        textfield.setBounds(60,80,300,70);

        JButton button =new JButton("Greet");
        button.setBounds(70,130,40,50);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=textfield.getText();
                label.setText("hello"+name);
            }
        });

         frame.add(label);
         frame.add(button);
         frame.setSize(300,200);
         frame.setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
    
}
