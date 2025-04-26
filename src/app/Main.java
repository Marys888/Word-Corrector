package app;

public class Main {
    public static void main(String[] args) {

        String[] data = new DataProvider().getData();
        String correctedData = new Corrector().handleData(data);

        getOutput(correctedData);
    }
    public static void getOutput(String output) {
        System.out.println(output);
    }
}
