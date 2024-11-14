import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Create listener to get button clicked
public class ButtonClickListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
    }
    public double getPress(JButton source){
        double value;
        return value = Double.parseDouble(source.getText());
    }
}