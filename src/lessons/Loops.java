package lessons;

public class Loops {
    public static void main(String[] args) {
        // Loops
        System.out.println("start of for loop");
        for(int i = 0; i <= 10; i++) {
            System.out.println("hello " + i);
        }
        System.out.println("out of for loop");

        System.out.println("reverse for loop");
        for(int i = 10; i >= 0; i--) {
            System.out.println("hello " + i);
        }
    }
}
