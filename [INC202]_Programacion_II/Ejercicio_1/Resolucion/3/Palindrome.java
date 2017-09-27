public class Palindrome {

    private String frase;

    public Palindrome() {}

    public Palindrome(String frase) {
        this.frase = frase;
    }

    private String reverse() {
        if (frase == null)
            return "";
        
        String reverse = "";
        frase = frase.replaceAll(" ", "");

        for (int i = frase.length() - 1; i >= 0; i--) {
            reverse += frase.charAt(i);
        }
        return reverse;
    }

    public boolean isPalindrome() {
        return (reverse().equalsIgnoreCase(frase));
    }
}
