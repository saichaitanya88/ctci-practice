package BitManipulation;

public class DecimalStringToBinary {
    public static void main(String[] args){
        String n = "3.72";
        System.out.println(n + " in binary is: " + printBinary(n));

    }
    public static String printBinary(String n){
        int intPart = Integer.parseInt(n.substring(0, n.indexOf('.')));
        double decPart = Double.parseDouble(n.substring(n.indexOf('.'), n.length()));

        String intString = "";
        while(intPart > 0){
            int r = intPart % 2;
            intPart >>= 1;
            intString = r + intString;
        }
        StringBuffer decString = new StringBuffer();
        while(decPart > 0){
            // decString.length() > 32 will always eventually be true due to double precision issues.
            // break after 32 bits of precision
            if (decString.length() > 32)
                break; // return "ERROR";
            if (decPart == 1){
                decString.append((int) + decPart);
                break;
            }
            double r = decPart * 2;
            if (r >= 1){
                decString.append(1);
                decPart = r - 1;
            }
            else{
                decString.append(0);
                decPart = r;
            }
        }
        return intString + "." + decString.toString();
    }
}
