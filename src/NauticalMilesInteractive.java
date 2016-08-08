/**
 * Created by jc321258 on 8/08/16.
 */
import javax.swing.JOptionPane;
public class NauticalMilesInteractive {
    public static void main(String[] args) {
        double kmConv=1.852, miConv=1.150779, km, mi;
        String nmi;
        nmi = JOptionPane.showInputDialog(null, "Input no. of nautical miles:");
        double nmiDouble = Double.parseDouble(nmi);
        km = kmConv * nmiDouble;
        mi = miConv * nmiDouble;
        System.out.println(nmi + " nautical miles in kilometers is " + km
                + " and " + mi + " in miles");
    }
}
