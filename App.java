import java.util.Hashtable;

class App {

    static Hashtable<String,String> keyValue;
    static Hashtable<String,String> valueKey;
    static spFunction sp=new spFunction();
    public static void main(String[] args) {
        sp.readData(keyValue,valueKey);
        
    }
}