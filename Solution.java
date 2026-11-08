public class Solution {

    public static int[] reverseArray(int[] numbers) {

        ArrayStack<Integer> stack = new ArrayStack<>(2);

        // Insert numbers into stack
        for (int number : numbers) {
            stack.push(number);
        }

        // Create reversed array
        int[] result = new int[numbers.length];

        // Remove numbers from stack
        int index = 0;

        while (!stack.isEmpty()) {
            result[index] = stack.pop();
            index++;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] studentMarks = {45, 60, 75, 80, 95};

        int[] reversedMarks = reverseArray(studentMarks);

        System.out.println("Original Student Marks:");

        for (int mark : studentMarks) {
            System.out.print(mark + " ");
        }

        System.out.println("\nReversed Student Marks:");

        for (int mark : reversedMarks) {
            System.out.print(mark + " ");
        }
    }
}
