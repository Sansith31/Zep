import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Colorchooser extends JFrame implements ActionListener {
    JButton button = new JButton("Pick a color");
    JLabel label = new JLabel();

    Colorchooser() {

        button.addActionListener(this);
        label.setBackground(Color.white);

        label.setOpaque(true);
        label.setText("ColorChooser");
        label.setFont(new Font("Arial", Font.PLAIN, 15));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(button);
        this.add(label);

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("niga");
            @SuppressWarnings("unused") //ignoring the warning
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "Pick a color", Color.red);
            label.setBackground(color);
        }
    }

}
