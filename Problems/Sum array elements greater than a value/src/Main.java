import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int num = scanner.nextInt();

        for (int i : array) {
            answer = i > num ? answer + i : answer;
        }
        System.out.println(answer);
    }
}