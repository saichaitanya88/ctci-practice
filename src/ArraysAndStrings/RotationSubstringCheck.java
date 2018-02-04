package ArraysAndStrings;

public class RotationSubstringCheck {
    public static void main(String[] args){
        RotationSubstringCheck rs = new RotationSubstringCheck();
        String a = "bottlewater";
        String b = "erbottlewat";
        rs.loopedCheck("bottlewater","erbottlewat");
        // optimal
        rs.quickCheck("bottlewater","erbottlewat");

        rs.loopedCheck("apple","ppale");
        rs.quickCheck("apple","ppale");

        rs.loopedCheck("apple","pleap");
        rs.quickCheck("apple","pleap");

        rs.loopedCheck("apple","");
        rs.quickCheck("apple","");

        rs.loopedCheck("","apple");
        rs.quickCheck("","apple");
    }

    public void loopedCheck(String a, String b){
        System.out.println("loopedCheck: checking " + a + " & " + b);
        if (a.length() != b.length() || a.length() == 0) {
            System.out.println("isSubstring: " + false);
            return;
        }

        for(int i = 0; i < a.toCharArray().length; i++){
            String c = b.substring(i) + b.substring(0, i);
            if(isSubstring(a,c)) {
                System.out.println("isSubstring : true");
                return;
            }
        }
        System.out.println("isSubstring : false");
    }
    public void quickCheck(String a, String b){
        System.out.println("quickCheck: checking " + a + " & " + b);
        if (a.length() != b.length() || a.length() == 0)
            System.out.println("isSubstring: " + false);
        else
            System.out.println("isSubstring: " + isSubstring(a+a, b));
    }
    public boolean isSubstring(String a, String b){
        return a.contains(b);
    }
}
