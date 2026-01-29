package Small_coding;

public class Reverse_String {

    public static void main(String[] args) {
        String str = "apple";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed String is: " + reverse);
    }
}
