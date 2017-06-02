import javax.swing.*;

/**
 * Created by patrick on 5/30/2017.
 */
public class ShowInputDialog {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "enter input", "input dialog demo", JOptionPane.QUESTION_MESSAGE);
        System.out.println(input);
    }
}
