public class EvenAndOddNumbers {
    public static void main(String[] args) {
        System.out.println(isEvenNumber(11));
        System.out.println(isOddNumber(11));
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOddNumber(int number) {
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
