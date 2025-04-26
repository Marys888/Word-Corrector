package app;

public class Main {
    public static void main(String[] args) {
        DataProvider dataProvider = new DataProvider();
        Correcter correcter = new Correcter();
        
        String[] data = dataProvider.getData();
        String correctedData = correcter.handleData(data);

        getOutput(correctedData);
    }
    public static void getOutput(String output) {
        System.out.println(output);
    }
}
