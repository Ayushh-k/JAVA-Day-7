public class StringRotation {
    public static void main(String[] args) {
        // Input strings
        String S1 = "coding";
        String S2 = "ingcod";
        
        // Check if S2 is a rotation of S1
        boolean isRotation = isRotation(S1, S2);
        
        // Output the result
        System.out.println(S2 + " is a rotation of " + S1 + ": " + isRotation);
    }

    public static boolean isRotation(String S1, String S2) {
        // Check if lengths are different
        if (S1.length() != S2.length()) {
            return false;
        }
        
        // Concatenate S1 with itself
        String concatenated = S1 + S1;
        
        // Check if S2 is a substring of the concatenated string
        return concatenated.contains(S2);
    }
}
