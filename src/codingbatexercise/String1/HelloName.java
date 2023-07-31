package codingbatexercise.String1;

public class HelloName {

    public static void main(String[] args) {
        /* Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
            helloName("Bob") → "Hello Bob!"
            helloName("Alice") → "Hello Alice!"
            helloName("X") → "Hello X!"
        * */
        System.out.println(helloName("Bob"));
        System.out.println(helloName("Alice"));
        System.out.println(helloName("X"));
    }

    private static String helloName(String name) {
        return "Hello " + name + "!";
    }
}
