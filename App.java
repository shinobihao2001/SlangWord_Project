import java.util.Hashtable;
import java.util.Scanner;

class App {

    static Hashtable<String,String> keyValue=new Hashtable<String, String>();
    static Hashtable<String,String> valueKey=new Hashtable<String, String>();
    static spFunction sp=new spFunction();
    static Scanner input=new Scanner(System.in);


    public static void main(String[] args) {

        // đọc dữ liệu lên
        sp.readData(keyValue,valueKey);

        MainFlow mainFlow=new MainFlow();
        // main function
        mainFlow.MainFunction(input, keyValue, valueKey);
        //ghi dữ liệu xuống lại
    }
}