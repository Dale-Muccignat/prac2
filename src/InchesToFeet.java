/**
 * Created by jc321258 on 8/08/16.
 */

public class InchesToFeet {
    public static void main(String[] args) {
        int inch=10,feet,feetRemainder;
        feet = inch / 12;
        feetRemainder = inch % 12;
        System.out.println(inch + " inches becomes " + feet + "'" + feetRemainder + "\"");
    }
}
