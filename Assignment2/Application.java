package Assignment2;

public class Application {
    public static void main(String[] args) {

        BiFunction<String, String> greeting = (a) -> "Hello " + a +"!";
        System.out.println("Greeting message: " + greeting.apply("Mohammed Al-Zurqan"));
    }
}
