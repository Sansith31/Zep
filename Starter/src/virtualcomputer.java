import javax.swing.JOptionPane;

public class virtualcomputer {
    String cpu;
    String gpu;
    int ram;
    int storage;

    virtualcomputer(String cpu, String gpu, int ram, int storage) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.storage = storage;
    }

    virtualcomputer(String cpu, int ram, int storage) { // overloaded cnstructor becuz no need gpu sometimes
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    void inputs() {
        String Storage = "" + this.storage;
        String Ram = "" + this.ram;
        String[] components = { this.cpu, this.gpu, Ram, Storage };
        JOptionPane.showMessageDialog(null, components, "Specs of the Virtual Machine", 1);
    }

    void turn_on() {
        System.out.println("Computer is turned on");
    }

    void turn_off() {
        System.out.println("Computer is turned off");
    }

    void self_destruct() {
        System.out.println("self destructing...");
        System.out.println("self destructed lmao");
    }
}