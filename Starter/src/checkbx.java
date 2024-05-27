import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class checkbx extends JFrame implements ActionListener {

    JCheckBox checkBox = new JCheckBox();
    JButton button = new JButton();

    JRadioButton ass = new JRadioButton();
    JRadioButton boobs = new JRadioButton();
    JRadioButton personality = new JRadioButton();

    ImageIcon right;
    ImageIcon wrong;

    checkbx() {

        button.setText("Confirm");
        button.addActionListener(this);

        checkBox.setText("Are you a human?");
        checkBox.setFocusable(true); // false if want to
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 12));

        right = new ImageIcon("assets//right.png");
        wrong = new ImageIcon("assets//wrong.png");
        checkBox.setIcon(wrong);
        checkBox.setSelectedIcon(right);

        ass.setText("Ass");
        boobs.setText("Boobs");
        personality.setText("Personality");

        ButtonGroup women = new ButtonGroup();
        women.add(ass);
        women.add(boobs);
        women.add(personality);

        this.add(ass);
        this.add(boobs);
        this.add(personality);
        this.add(checkBox);
        this.add(button);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {

            System.out.println("This person ");
            System.out.println("is human: " + checkBox.isSelected());

            boolean x = boobs.isSelected();
            boolean y = ass.isSelected();
            boolean z = personality.isSelected();

            if (x == true) {
                System.out.println("Likes Boobs");
            } else if (y == true) {
                System.out.println("Likes Ass");
            } else if (z == true) {
                System.out.println("Likes Personality");
            }
        }
    }
}