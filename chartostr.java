public class chartostr {
    public static void main(String[] args) {
        char ch = 'A';

        String str1 = String.valueOf(ch);
        System.out.println("Using String.valueOf(): " + str1);

        String str2 = Character.toString(ch);
        System.out.println("Using Character.toString(): " + str2);

        String str3 = ch + "";
        System.out.println("Using concatenation: " + str3);

        String str4 = new String(new char[] { ch });
        System.out.println("Using character array: " + str4);
    }
}
