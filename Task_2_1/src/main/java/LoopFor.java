public class LoopFor {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 111, 999};
        int total = 0;

        System.out.println("Numbers are");

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);

            total += numbers[i];
        }

        double average = total / numbers.length;
        System.out.println("Totality: " + total);
        System.out.println("Average: " + average);
    }
}
