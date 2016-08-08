/**
 * Created by jc321258 on 8/08/16.
 */
import javax.swing.JOptionPane;
public class InchesToFeetInteractive {
    public static void main(String[] args) {
        int feet,feetRemainder;
        String inch;
        inch = JOptionPane.showInputDialog(null, "Input inches:");
        int inchInt = Integer.parseInt(inch);
        feet = inchInt / 12;
        feetRemainder = inchInt % 12;
        System.out.println(inch + " inches becomes " + feet + "'" + feetRemainder + "\"");
    }
}
