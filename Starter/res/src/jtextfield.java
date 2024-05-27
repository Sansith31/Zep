import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class jtextfield extends JFrame implements ActionListener {

    JButton button = new JButton("Submit");
    JTextField name = new JTextField();

    jtextfield() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button.addActionListener(this);

        name.setPreferredSize(new Dimension(250, 40));
        name.setFont(new Font("Consolas", Font.PLAIN, 15));
        name.setForeground(new Color(0, 0, 255));
        name.setBackground(new Color(128, 128, 128));
        name.setCaretColor(new Color(255, 234, 0));
        name.setText("Enter your name: ");

        this.add(name);
        this.add(button);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {

            String response = name.getText();
            JOptionPane.showMessageDialog(null, "Welcome to the cult " + response, "Zesty ahh",
                    JOptionPane.PLAIN_MESSAGE);

            name.setEditable(false);
            button.setEnabled(false);
        }
    }
}