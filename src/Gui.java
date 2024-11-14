import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

    final int x = 750;
    final int y = 1000;
    public Gui(){

        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(x, y));

        JPanel panel = new JPanel();

        panel.add(createButtons());


        this.add(panel);


        this.setVisible(true);
    }

    // Create buttons
    public Component createButtons(){
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 3));

        String[] buttonLabels = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", ".", "="};
        for(String labels : buttonLabels){
            JButton btn = new JButton(labels);
            btn.setPreferredSize(new Dimension(120, 80));
            btn.addActionListener(new ButtonClickListener());
            buttonPanel.add(btn);
        }
        return buttonPanel;
    }


}


// use numericformat exception for calculations