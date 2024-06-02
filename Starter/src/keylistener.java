import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keylistener extends JFrame implements KeyListener {

    JLabel label = new JLabel();
    ImageIcon icon = new ImageIcon("assets//clown420.png");
    int x;

    keylistener() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.addKeyListener(this);
        this.setLayout(null);

        label.setBounds(175, 100, 100, 100);
        label.setIcon(icon);

        this.add(label);
        this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // System.out.println("KeyChar: " + e.getKeyChar());
        // keyTyped = Invoked when a key is typed. Uses KeyChar, char output
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'A':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'D':
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 'W':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 'S':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            default:
                System.out.println("Invalid Input " + e.getKeyChar() + " " + x);
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // System.out.println("Keycode: " + e.getKeyCode());
        // keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int
        // output
        x = e.getKeyCode();

        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 5, label.getY());
                break;
            case 39:
                label.setLocation(label.getX() + 5, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 5);
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() + 5);
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // System.out.println("You released (Keychar):" + e.getKeyChar());
        // System.out.println(e.getKeyCode());
        // keyReleased = called whenever a button is released
    }
}
