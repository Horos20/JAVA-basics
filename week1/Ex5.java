package week1;

public class Ex5 {
    public static void main(String[] args) {
        Integer days = 365;
        Integer hours = 24;
        Integer minutes = 60;
        Integer seconds = 60;

        Integer secondsInYear = days * hours * minutes * seconds;

        System.out.println("There are " + secondsInYear + " seconds in a year.");
    }
}
