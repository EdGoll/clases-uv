public class PalindromeImp {

    public static void main(String[] args) {
        Palindrome p = new Palindrome("anita lava la tina");

        if (p.isPalindrome()) {
            System.out.println("Es");
        } else {
            System.out.println("No");
        }
    }
}
