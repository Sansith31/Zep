import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class jslider implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JLabel lebal;
    JSlider slider;

    jslider() {
        frame = new JFrame("Age of your choosing");
        panel = new JPanel();
        label = new JLabel();
        lebal = new JLabel();

        slider = new JSlider(10, 32, 18);
        slider.addChangeListener(this);
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(1);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(2);
        slider.setForeground(new Color(0, 0, 0));
        slider.setBackground(new Color(173, 200, 255));
        slider.setPaintLabels(true);
        slider.setFont(new Font("Consolas", Font.PLAIN, 8));

        panel.setBackground(new Color(173, 200, 255));

        label.setText("Select Age: ");
        label.setFont(new Font("Consolas", Font.PLAIN, 15));

        panel.add(lebal);
        panel.add(label);
        panel.add(slider);
        frame.add(panel);
        frame.setSize(420, 210);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        lebal.setText("Age: " + slider.getValue());

        int value = slider.getValue();

        if (value <= 14) {
            System.out.println("Pedoooooooo " + value);
        } else if (value > 14 && value <= 16) {
            System.out.println("Game is game " + value);
        } else if (value > 16 && value <= 19) {
            System.out.println("Boring ahhhhh " + value);
        } else if (value > 19) {
            System.out.println("Mommy plss (,,>_<,,) " + value);
        }
    }
}