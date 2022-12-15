public class Main {
    public static void main(String[] args) {

        String s = "are you able to climb, are you able to swim or are you able to fly?";

        System.out.println(s.replaceAll("\\sare","_XYZ"));
    }
}