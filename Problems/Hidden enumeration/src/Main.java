public class Main {

    public static void main(String[] args) {
    // write your program here
        int counter = 0;
        for (Secret status: Secret.values()) {
            if (status.toString().startsWith("STAR")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
