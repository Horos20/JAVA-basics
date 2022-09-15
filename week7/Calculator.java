package week7;

public class Calculator {

    Reader reader = new Reader();

    public Calculator(Reader reader) {
        this.reader = reader;
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void sum() {

    }

    private void difference() {

    }

    private void product() {

    }

    private void statistics() {

    }

}
