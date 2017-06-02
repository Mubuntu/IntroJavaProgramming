import javax.swing.*;

/**
 * Created by patrick on 5/30/2017.
 *  a program that displays two Chinese characters and three Greek letters
 */
public class DisplayUnicode {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "\u6B22\u8FCE \u03b1 \u03b2 \u03b3",
                "\u6B22\u8FCE Welcome", JOptionPane.INFORMATION_MESSAGE);
    }
}
