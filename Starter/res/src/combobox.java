import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class combobox extends JFrame implements ActionListener {

    String[] colors = { "Red", "Blue", "Green", "Yellow", "Black", "White" };
    JComboBox<String> combobox = new JComboBox<String>(colors);

    combobox() {

        combobox.addActionListener(this);
        this.add(combobox);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == combobox) {
            System.out.println(combobox.getSelectedItem());
        }
    }
}
