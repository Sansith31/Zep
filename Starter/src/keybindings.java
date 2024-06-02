import java.awt.event.*;
import javax.swing.*;

public class keybindings {

    JFrame frame = new JFrame("Keybinding");
    JLabel label = new JLabel();

    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;

    keybindings() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);

    }

    public class UpAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {

        }

    }

    public class DownAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {

        }

    }

    public class LeftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
        }

    }

    public class RightAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
        }

    }

}
