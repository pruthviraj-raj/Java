import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;

public class gui4 {

    public static void main(String[] args) {
        
        JFrame frame=new JFrame("lable update");

        JLabel lable=new JLabel("welcom");
        lable.setBounds(80,40,200,30);

        JButton button=new JButton("upadate");
        button.setBounds(80,90,100,30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e) {
                lable.setText("WELCOM TO JAVA GUI");
            }
        });
        frame.add(lable);
        frame.add(button);
        frame.setSize(300,200);
        frame.setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

    }
    
}
