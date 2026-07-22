import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;

public class gui3{

    public static void main(String[] args) {
        
        JFrame frame=new JFrame("textfield example");
        JButton button=new JButton("click");
        JTextField textfield=new JTextField();
        textfield.setBounds(80,100,100,30);

        button.addActionListener(new ActionListener()  {
            public void actionPerformed(ActionEvent e) {
                String text=textfield.getText();

                System.out.println("Enter the text:"+text);
            }
        });
        frame.add(textfield);
        frame.add(button);
        frame.setSize(300,200);
        frame.setLayout(null);

        frame.setVisible(true);
    }
}
