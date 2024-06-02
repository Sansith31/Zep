import javax.swing.*;

class Guijoptionpane {

    Guijoptionpane() {

        ImageIcon logo = new ImageIcon("assets//clown420.png");
        int x = JOptionPane.showConfirmDialog(null, "Did you wash your ass today?", "Ass Hygiene",
                JOptionPane.YES_NO_CANCEL_OPTION, 0, logo);

        switch (x) {
            case 0:
                JOptionPane.showMessageDialog(null, "Spread Cheeks", "Well Done", JOptionPane.PLAIN_MESSAGE);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Spread Cheeks", "Game is game", JOptionPane.PLAIN_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Kill yourself", "NPC", JOptionPane.PLAIN_MESSAGE);
                break;
            case -1:
                JOptionPane.showMessageDialog(null, "Kill yourself", "NPC", JOptionPane.PLAIN_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "How retarded are you", "Fking Dumbass", 3);
                break;
        }
        ImageIcon icon = new ImageIcon("assets//robot.png");

        String[] options = { "They Will", "They Wont", "Im a nigga" };

        int y = JOptionPane.showOptionDialog(
                null,
                "AI gonna takeover the world!!",
                "Secret Message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                2,
                icon,
                options,
                null);
        System.out.println(y);
    }
}