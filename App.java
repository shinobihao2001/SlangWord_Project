import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class App {
    static String fileURL="slang.txt";
    static HashMap<String,String> keyValue=new HashMap<String, String>();
    static HashMap<String,String> valueKey=new HashMap<String, String>();
    static spFunction sp=new spFunction();
    static Scanner input=new Scanner(System.in);
    static ArrayList<String> log=new ArrayList<String>();// lưu lại lịch sử

    public static void main(String[] args) {

        // đọc dữ liệu lên
        sp.readData(keyValue,valueKey,fileURL);

        MainFlow mainFlow=new MainFlow();
        // main function
        mainFlow.MainFunction(input, keyValue, valueKey,log);
        //ghi dữ liệu xuống lại
        sp.writeData(keyValue,"slang.txt");
    }
}