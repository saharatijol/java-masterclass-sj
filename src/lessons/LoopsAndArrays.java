package lessons;

public class LoopsAndArrays {
    public static void main(String[] args) {
        // Loops and Arrays
        String[] names = {"James", "Nadia", "Sophia", "Alex", "Sally", "Aisha"};
        for(int i = 0; i < names.length; i++) {
            String prev = names[i - 1];
            String current = names[i];
            String next = names[i + 1];
            System.out.println(names[i]);
        }

        // Enhanced For Loop
        System.out.println("Start of Enhance For Loop");
        for(String name : names) {
            System.out.println(name);
        }

        // While Loop

    }
}
