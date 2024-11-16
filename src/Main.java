import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //System.err.close();

        new Gui();

        while(true){
            System.out.println(ButtonClickListener.getPress());
        }
    }
}