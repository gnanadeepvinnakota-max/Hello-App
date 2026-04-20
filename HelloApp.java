public class HelloApp {

    public static void main(String[] args) {

        // Check if a name is provided
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Default greeting if no argument is given
            System.out.println("Hello, World!");
        }
    }
}