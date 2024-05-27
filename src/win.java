import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class win extends JFrame implements ActionListener {
    ImageIcon icon = new ImageIcon("res/icons/ico.png");
    JTextField text = new JTextField();
    JButton convertButton = new JButton("Convert");

    win() {
        text.setFont(new Font("Arial", Font.PLAIN, 16));
        text.setCaretColor(new Color(22, 65, 124));
        text.setPreferredSize(new Dimension(220, 40));

        convertButton.addActionListener(this);
        convertButton.setForeground(new Color(53, 128, 187));
        convertButton.setPreferredSize(new Dimension(80, 40));

        this.setBackground(new Color(192, 192, 192));
        this.setIconImage(icon.getImage());
        this.setTitle("Miles to KM");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(text);
        this.add(convertButton);
        this.setLayout(new FlowLayout());
        this.setSize(350, 100);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double answer;
        float value;

        ImageIcon icon = new ImageIcon("res/icons/hyoon.jpg");

        if (e.getSource() == convertButton) {
            value = Float.parseFloat(text.getText());

            if (value > 0) {
                answer = value * 1.6;
            } else {
                answer = 0;
            }

            JOptionPane.showMessageDialog(null, value + "mi is " + answer + "km", "Answer", 1, icon);
        }
    }
}
