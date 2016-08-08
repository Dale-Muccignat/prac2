/**
 * Created by jc321258 on 8/08/16.
 * stuff
 */
import javax.swing.JOptionPane;
public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        int conversion=4,result,remainder;
        String number;
        number = JOptionPane.showInputDialog(null, "Input no. of quarts");
        int intNumber = Integer.parseInt(number);
        result = intNumber / conversion;
        remainder = intNumber % conversion;
        System.out.println("A job that needs " + number + " quarts requires "
                + result + " gallons plus " + remainder + " quarts.");
    }
}
