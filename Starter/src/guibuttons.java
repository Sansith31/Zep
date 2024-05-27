import javax.swing.*;
import java.awt.*;

class guibuttons extends JFrame {

    JButton button;

    guibuttons() {

        ImageIcon img = new ImageIcon("assets//clown420.png");

        button = new JButton();
        button.setBounds(87, 100, 200, 100);
        button.setText("Certified Clowns");
        button.addActionListener(e -> System.out.println("Niggas be robbing"));
        button.setFocusable(false); // to remove the annoying border around the text
        button.setIcon(img);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("SansSerif", Font.PLAIN, 16));
        button.setForeground(Color.black);
        button.setBackground(Color.yellow);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Selling Crack");
        this.setSize(400, 400);
        this.setResizable(false);
        this.setVisible(true);

        ImageIcon logo = new ImageIcon("assets//clown420.jpg");
        this.setIconImage(logo.getImage());

        this.add(button);
        button.setVisible(true);
        this.pack();
        this.setSize(400, 400);

    }
}