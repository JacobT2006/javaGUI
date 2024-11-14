import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.err.close();
        SwingUtilities.invokeLater(Gui::new);

    }
}