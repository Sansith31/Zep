import javax.swing.*;

public class guiframe extends JFrame {

    guiframe() {

        this.setTitle("Selling Crack");
        this.setSize(420, 420);
        this.setResizable(false);
        this.setVisible(true);

        JLabel label = new JLabel();
        ImageIcon icon = new ImageIcon("assets//baba.png");
        label.setIcon(icon);

        ImageIcon logo = new ImageIcon("assets//download.jpg");
        this.setIconImage(logo.getImage());

        this.add(label);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closing the program with the window
    }
}

class averageframe extends JFrame {

    averageframe() {

        this.setTitle("Selling Crack");

        this.setResizable(false);

        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon logo = new ImageIcon("assets//download.jpg");
        this.setIconImage(logo.getImage());
    }
}