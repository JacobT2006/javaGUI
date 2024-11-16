import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Create listener to get button clicked
public class ButtonClickListener implements ActionListener {

    public static JButton source;

    @Override
    public void actionPerformed(ActionEvent e) {
        source = (JButton) e.getSource();
    }
    public static double getPress() throws NumberFormatException{
        String input = source.getText();
//        if((Integer.parseInt(input) % 1) == 0) {
        try{
            return Double.parseDouble(input);
        }
        catch (NumberFormatException e) {
            throw new NumberFormatException("no work");
        }
    }
}