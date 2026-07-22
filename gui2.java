import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;

public class gui2 {

    public static void main(String[] args) {
        
        JFrame frame=new JFrame("button example");
        JButton button =new JButton("Click me");

        button.setBounds(100,70,120,40);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
            }
        });
        frame.add(button);
        frame.setSize(350,200);
        frame.setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
    
}
