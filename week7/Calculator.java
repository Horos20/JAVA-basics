package week7;

public class Calculator {

    private int calculations = 0;
    Reader reader = new Reader();

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                calculations++;
            } else if (command.equals("difference")) {
                difference();
                calculations++;
            } else if (command.equals("product")) {
                product();
                calculations++;
            }
        }

        statistics();
    }

    private void sum() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        System.out.println("Sum of the values: " + (value1 + value2));
    }

    private void difference() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        System.out.println("Sum of the values: " + (value1 - value2));
    }

    private void product() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        System.out.println("Sum of the values: " + (value1 * value2));
    }

    private void statistics() {
        System.out.println("Calculations done: " + calculations);
    }

}
