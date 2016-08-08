/**
 * Created by Dale on 8/08/16.
 * a thing
 */
import javax.swing.JOptionPane;
public class QuartsToGallons {
    public static void main(String[] args) {
        int conversion=4,number=18,result,remainder;
        result = number / conversion;
        remainder = number % conversion;
        System.out.println("A job that needs " + number + " quarts requires "
                + result + " gallons plus " + remainder + " quarts.");
    }
}
