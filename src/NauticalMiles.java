/**
 * Created by jc321258 on 8/08/16.
 */
public class NauticalMiles {
    public static void main(String[] args) {
        double kmConv=1.852, miConv=1.150779, nmi=10, km, mi;
        km = kmConv * nmi;
        mi = miConv * nmi;
        System.out.println(nmi + " nautical miles in kilometers is " + km
                + " and " + mi + " in miles");
    }
}
