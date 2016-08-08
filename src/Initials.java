/**
 * Created by jc321258 on 8/08/16.
 */
import javax.swing.JOptionPane;
public class Initials {
    public static void main(String[] args) {
        String first, second, third;
        first = JOptionPane.showInputDialog(null, "First initial:");
        second = JOptionPane.showInputDialog(null, "Second initial:");
        third = JOptionPane.showInputDialog(null, "Third initial:");
        System.out.println(first + "." + second + "." + third);

    }
}
