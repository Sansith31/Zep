import javax.swing.border.Border;
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.sound.sampled.*;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        // Intro(); // calling the intro function
        // inputandshi(); // taking input
        // operators();
        // gui();
        // random();
        // ifs();
        // switches();
        // logical();
        // Forloop();
        // nestedloops();
        // arrays();
        // twoDarrays();
        // wrappers(); // Does nothing :)
        // arraylist();
        // twoDarraylist();
        // forEach();
        // String brand = "Asus"; // for methods function
        // int nice = 69; // for methods function
        // methods(brand, nice);
        // overloadedMethods(); // Does nothing :)
        // printF();
        // finalkeyword();
        // virtualmachineone(); // object of a class **Need virtualcomputer class
        // virtualmachinetwo(); // object of a class **Need virtualcomputer class
        // writfiletxt();
        // readfiletxt();
        // playsound();
        // guiforeal();
        // guipanels();
        // new Guibuttons();
        // new Guijoptionpane();
        // new Jtextfield();
        // new Checkbx();
        // new Combobox();
        // new Jslider();
        // new Colorchooser();
        // new Keylistener();
        // new Mouselistener();
        new Keybindings();
    }

    public static void Intro() {

        System.out.print("\"huh niggas\" \nniggas again\n"); // Print in new line using \n(Using escape character)
        System.out.println("chiggas");// Print in new line using println

        // Use a backslash to use weird character

        /*
         * -this
         * -is
         * -also
         * -a
         * -comment
         */

        String FName; // declaration
        FName = "Mahinda"; // assignment
        System.out.println(FName);

        String LName = "Rajapaksa"; // declaration + assignment = initialization
        System.out.println(LName);

        int LegalAge = 14; // integers
        System.out.println("I can consent at the age of " + LegalAge);

        long num = 4577642897984659345L; // long ints use L for some reason
        System.out.println(num);

        float gender = 0.1f; // floats use f again for some reason
        System.out.println("my gender is " + gender + " Lmao");

        boolean life = false; // boolean
        System.out.println(life);

        int x = 5;
        int y = 10;
        int temp = 0;
        System.out.println("BEFORE \nX is " + x + "\nY is " + y);

        temp = x;
        x = y;
        y = temp;
        System.out.println("AFTER \nX is " + x + "\nY is " + y);
    }

    public static String inputandshi() { // Another Function

        System.out.println("inputandshi function running");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a racial slur:");
        String slur = scanner.nextLine();
        System.out.println("Yes we do hate " + slur);

        System.out.println("Enter your tender age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("You just consented to sex at " + age + " years old");

        scanner.close(); // close or memory leak
        return null;
    }

    public static String operators() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

        num = num + 10;

        System.out.println(num);

        return null;
    }

    public static String gui() {

        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        JOptionPane.showMessageDialog(null, "You are getting touched at " + age + " years old");

        String gender = JOptionPane.showInputDialog("What is your gender?");
        JOptionPane.showMessageDialog(null, "You are " + gender);

        return null;
    }

    public static String random() {

        Random random = new Random();

        int x = random.nextInt(6) + 1; // 6 generates num from 1 to 5 so add one
        JOptionPane.showMessageDialog(null, x);

        boolean y = random.nextBoolean();
        JOptionPane.showMessageDialog(null, y);
        return null;
    }

    public static String ifs() {

        int count = 0;
        boolean looping = true;
        while (looping == true) {

            int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));

            if (age < 18 && age >= 14) {
                JOptionPane.showMessageDialog(null, "You are getting touched!");
            } else if (age < 14) {
                JOptionPane.showMessageDialog(null, "Grow up soon!");
            } else {
                JOptionPane.showMessageDialog(null, "Expired Go Kill Yourself!");
            }
            count = count + 1;
            if (count == 5) {
                looping = false;
            }
        }

        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening."; // *Short Hand if else
        System.out.println(result);
        return null;
    }

    public static String switches() {

        String day = JOptionPane.showInputDialog("Enter a day you like: ");

        switch (day) {
            case "Monday":
                System.out.println("Who likes mondays?");
                break;
            case "Tuesday":
                System.out.println("bruh");
                break;
            case "Wednesday":
                System.out.println("Most Exhausted day of the week");
                break;
            case "Thursday":
                System.out.println("Yippy friday is close");
                break;
            case "Friday":
                System.out.println("Half ded but happy");
                break;
            case "Saturday":
                System.out.println("Zzzzzzzz");
                break;
            case "Sunday":
                System.out.println("Monday again :o");
                break;
            default:
                System.out.println("Not a day retard");
                break;
        }
        return null;
    }

    public static String logical() {

        // logical operators = used to connect two or more expressions
        // / && = (AND) both conditions must be true
        // / || = (OR) either condition must be true
        // / ! = (NOT) reverses boolean value of the expression
        Random random = new Random();

        int som = random.nextInt(6) + 1;

        int scanned = Integer.parseInt(JOptionPane.showInputDialog("Enter a number from 1 to 6: "));

        if (som == scanned) {
            System.out.println("Wow u guessed it right");
            System.out.println("Deleting System32 files anyway...");
        } else {
            System.out.println("U guessed it wrong");
            System.out.println("Deleting System32 files...");
            System.out.println("Deleting System32 files..");
            System.out.println("Deleting System32 files.");
        }
        return null;
    }

    public static String Forloop() {

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        for (int y = 9; y >= 0; y--) {
            System.out.println(y);
        }
        return null;
    }

    public static int nestedloops() {

        boolean ranonetime = false;
        String symbol = "*";
        int rows = Integer.parseInt(JOptionPane.showInputDialog("Enter # of rows: "));
        int columns = Integer.parseInt(JOptionPane.showInputDialog("Enter # of columns: "));

        String array = "";
        for (int i = 1; i <= rows; i++) {
            if (ranonetime == false) {
                ranonetime = true;
            } else {
                System.out.println();
                array = array + ("\n");
            }
            for (int j = 1; j <= columns; j++) {
                array = array + symbol;
                System.out.print(symbol);
            }
        }
        JOptionPane.showMessageDialog(null, array);
        return 0;

    }

    public static boolean arrays() {

        String[] cars = { "Camaro", "Mustang", "Corvette", "Lamborghini" };

        JOptionPane.showMessageDialog(null, cars, "Cars bro", 1);

        boolean huh = true;

        return huh;
    }

    public static boolean twoDarrays() {

        String y = "";
        String[][] languages = new String[3][3];
        languages[0][0] = "Machine Learning";
        languages[0][1] = "x86 Assembly";
        languages[0][2] = "ARM Assembly";
        languages[1][0] = "C";
        languages[1][1] = "C++";
        languages[1][2] = "Rust";
        languages[2][0] = "Java";
        languages[2][1] = "Python";
        languages[2][2] = "JavaScript";

        for (int i = 0; i < languages.length; i++) {
            for (int j = 0; j < languages[i].length; j++) {
                switch (i) {
                    case 0:
                        y = "Low Level ";
                        break;
                    case 1:
                        y = "Middle Level ";
                        break;
                    case 2:
                        y = "High Level ";
                        break;
                }
                JOptionPane.showMessageDialog(null, languages[i][j], y + "Programming Language", 2);
            }
        }
        return true;
    }

    public static boolean wrappers() {
        /**
         * wrapper class = provides a way to use primitive data types as reference data
         * types
         * reference data types contain useful methods
         * can be used with collections (ex.ArrayList)
         * 
         * primitive wrapper
         * --------- -------
         * boolean Boolean
         * char Character
         * int Integer
         * double Double
         * 
         * autoboxing = the automatic conversion that the Java compiler makes between
         * the primitive types and their corresponding object wrapper classes
         * unboxing = the reverse of autoboxing. Automatic conversion of wrapper class
         * to primitive
         **/
        return true;
    }

    public static boolean arraylist() {

        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hotdog");
        food.add("goth girls");
        food.set(2, "Chicken"); // for legal reasons hav to remove
        food.remove("hotdog");
        for (int i = 0; i < food.size(); i++) {
            JOptionPane.showMessageDialog(null, food.get(i));
        }
        food.clear(); // clean up before opps

        return true;
    }

    public static boolean twoDarraylist() {

        ArrayList<String> cpu = new ArrayList<String>();
        cpu.add("CPU List");
        cpu.add("Intel i7");
        cpu.add("Intel i5");
        cpu.add("Ryzen 7");
        cpu.add("Ryzen 5");
        cpu.add("Threadripper");
        cpu.add("Intel Xeon");
        cpu.add("Snapdragon X elite");
        // JOptionPane.showMessageDialog(null, cpu, "Central Processing Unit", 2);

        ArrayList<String> gpu = new ArrayList<String>();
        cpu.add("GPU List");
        gpu.add("RTX 4090");
        gpu.add("RTX 4080");
        gpu.add("RTX 4070");
        gpu.add("RTX 4060");
        gpu.add("RX 7900 XTX");
        gpu.add("RX 7800 XT");
        gpu.add("RX 7700 XT");
        gpu.add("RX 7600 XT");
        // JOptionPane.showMessageDialog(null, gpu, "Graphics Processing Unit", 2);

        ArrayList<ArrayList<String>> PCparts = new ArrayList<ArrayList<String>>();
        PCparts.add(cpu);
        PCparts.add(gpu);

        String[][] pcpartsvariable = new String[2][10];

        for (int i = 0; i < PCparts.size(); i++) {
            pcpartsvariable[0][0] = "CPU";
            for (int j = 0; j < PCparts.get(i).size(); j++) {
                pcpartsvariable[i][j] = PCparts.get(i).get(j);
            }
        }

        JOptionPane.showMessageDialog(null, pcpartsvariable, "all them pc parts", 1);

        return true;
    }

    public static boolean forEach() {
        /*
         * for-each = traversing technique to iterate through the elements in an
         * array/collection
         * less steps, more readable
         * but also less flexible
         */
        String[] somepcparts = { "CPU", "GPU", "Motherboard", "Storage", "Power Supply", "Case", "RAM" };
        String Somepcparts = "";

        for (String i : somepcparts) {
            Somepcparts = Somepcparts + i + "\n";
        }
        JOptionPane.showMessageDialog(null, Somepcparts, "Some PC Parts", 1);

        ArrayList<String> otherpcparts = new ArrayList<String>();
        otherpcparts.add("CPU Cooler");
        otherpcparts.add("Additional Storage Drives");
        otherpcparts.add("Cooling Fans");
        String Otherpcparts = "";

        for (String i : otherpcparts) {
            Otherpcparts = Otherpcparts + i + "\n";
        }
        JOptionPane.showMessageDialog(null, Otherpcparts, "Other PC Parts", 1);
        return true;
    }

    public static boolean methods(String brand, int nice) {

        JOptionPane.showMessageDialog(null, "Noice: " + nice + "\n" + brand + ": bruh", "Method Arguments", 1);
        return true;
    }

    public static boolean overloadedMethods() {
        /*
         * overloaded methods = methods that share the same name but have different
         * parameters
         * method name + parameters = method signature
         * 
         * When calling methods no.of parameters will decide which method will be called
         */

        // Example
        // static int add(int a, int b) {
        // System.out.println("This is overloaded method #1");
        // return a + b;
        // }
        // static int add(int a, int b, int c) {
        // System.out.println("This is overloaded method #2");
        // return a + b + c;
        // }
        // static int add(int a, int b, int c, int d) {
        // System.out.println("This is overloaded method #3");
        // return a + b + c + d;
        // }
        return true;
    }

    public static boolean printF() {
        /*
         * printf() = an optional method to control, format, and display text to the
         * console window
         * two arguments = format string + (object/variable/value)
         * % [flags] [precision] [width] [conversion-character]
         */

        boolean alive = false;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        // * [conversion-character]
        System.out.printf("%b", alive);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);

        // * [width]
        // minimum number of characters to be written as output
        // System.out.printf("Hello %10s",myString);

        // * [precision]
        // sets number of digits of precision when outputting floating-point values
        // System.out.printf("You have this much money %.1f",myDouble);

        // * [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        System.out.printf("You have this much money %,f", myDouble);
        return true;
    }

    public static boolean finalkeyword() {

        final String facts = "Niggas be robbing"; // * final value assigned cant change later
        JOptionPane.showMessageDialog(null, facts, "Just Facts", 1);
        return false;
    }

    public static boolean virtualmachineone() {

        String cpu = JOptionPane.showInputDialog("Enter CPU: ");
        String gpu = JOptionPane.showInputDialog("Enter GPU(Skip if not needed): ");
        int ram = Integer.parseInt(JOptionPane.showInputDialog("Enter RAM capacity(in GB): "));
        int storage = Integer.parseInt(JOptionPane.showInputDialog("Enter Storage capacity(in GB): "));
        Virtualcomputer vmOne = new Virtualcomputer(cpu, gpu, ram, storage);
        vmOne.inputs();
        String func = JOptionPane.showInputDialog("Enter to do some with computer:  ");
        switch (func) {
            case "turn on":
                vmOne.turn_on();
                break;
            case "turn off":
                vmOne.turn_off();
                break;
            case "self destruct":
                vmOne.self_destruct();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid input", "Error", 0);
        }
        return true;
    }

    public static boolean virtualmachinetwo() {

        String cpu = JOptionPane.showInputDialog("Enter CPU: ");
        String gpu = JOptionPane.showInputDialog("Enter GPU(Skip if not needed): ");
        int ram = Integer.parseInt(JOptionPane.showInputDialog("Enter RAM capacity(in GB): "));
        int storage = Integer.parseInt(JOptionPane.showInputDialog("Enter Storage capacity(in GB): "));
        Virtualcomputer vmTwo = new Virtualcomputer(cpu, gpu, ram, storage);
        vmTwo.inputs();
        String func = JOptionPane.showInputDialog("Enter to do some with computer:  ");
        switch (func) {
            case "turn on":
                vmTwo.turn_on();
                break;
            case "turn off":
                vmTwo.turn_off();
                break;
            case "self destruct":
                vmTwo.self_destruct();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid input", "Error", 0);
        }
        return true;
    }

    public static boolean writfiletxt() {

        // FileReader = read the contents of a file as a stream of characters. One by
        // one
        // read() returns an int value which contains the byte value
        // when read() returns -1, there is no more data to be read
        try {
            FileWriter write = new FileWriter("assests//nuclearcodes.txt");
            write.write("Hello ");
            write.append("niggas be robbing");
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static boolean readfiletxt() {

        try {
            FileReader reader = new FileReader("assets//nuclearcodes.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;

    }

    public static boolean playsound() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        File file = new File("assets//music.wav");
        AudioInputStream audio = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audio);

        String x = JOptionPane.showInputDialog("Enter Somthing (Function Bugged:o!");

        while (!x.equals("Q")) {
            System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
            System.out.print("Enter your choice: ");

            x = x.toUpperCase();

            switch (x) {
                case ("P"):
                    clip.start();
                    break;
                case ("S"):
                    clip.stop();
                    break;
                case ("R"):
                    clip.setMicrosecondPosition(0);
                    break;
                case ("Q"):
                    clip.close();
                    break;
                default:
                    System.out.println("Not a valid x");
            }
        }
        System.out.println("Byeeee!");
        return true;
    }

    public static boolean guiforeal() {

        new Guiframe();

        Border border = BorderFactory.createLineBorder(new Color(170, 255, 0), 2);
        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");
        label.setFont(new Font("MV Boli", Font.PLAIN, 18));
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);

        label.setForeground(new Color(170, 255, 0));
        label.setBackground(Color.black);
        label.setOpaque(true);

        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        ImageIcon img = new ImageIcon("assets//clown revised.png");
        label.setIcon(img);

        JFrame frame = new JFrame();
        frame.add(label);
        frame.setTitle("Chiggas ");
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.pack(); // Automatically adjusts the size of the frame
        return true;
    }

    public static void guipanels() {

        averageframe frame = new averageframe();

        JPanel black = new JPanel();
        black.setBackground(Color.black);
        black.setBounds(0, 0, 200, 200);

        JPanel blue = new JPanel();
        blue.setBackground(Color.blue);
        blue.setBounds(200, 0, 200, 200);

        JPanel red = new JPanel();
        red.setBackground(Color.red);
        red.setBounds(0, 200, 400, 200);

        JPanel yellow = new JPanel();
        yellow.setBackground(Color.yellow);
        yellow.setBounds(400, 0, 200, 400);
        yellow.setLayout(new BorderLayout());

        JPanel green = new JPanel();
        green.setBackground(Color.green);
        green.setBounds(200, 400, 200, 200);

        ImageIcon icon = new ImageIcon("assets//babz.png");
        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setIcon(icon);

        label.setText("Hyoon");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setForeground(new Color(0, 0, 0));
        label.setVerticalTextPosition(JLabel.TOP);
        label.setFont(new Font("MV Boli", Font.PLAIN, 16));

        yellow.add(label);
        frame.add(black);
        frame.add(blue);
        frame.add(red);
        frame.add(yellow);
        frame.add(green);
        frame.setSize(600, 640);
        frame.setLayout(null);
    }
}