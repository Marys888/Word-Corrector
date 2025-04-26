package app;

public class Main {
    public static void main(String[] args) {
        DataProvider dataProvider = new DataProvider();
        Corrector corrector = new Corrector();

        String[] data = dataProvider.getData();
        String correctedData = corrector.handleData(data);

        getOutput(correctedData);
    }
    public static void getOutput(String output) {
        System.out.println(output);
    }
}
