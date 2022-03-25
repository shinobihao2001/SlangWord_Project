import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

public class spFunction {
    
    void readData(Hashtable<String,String> keyValue,Hashtable<String,String> valueKey){
        String fileURL="slang.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileURL))) {
            String row=reader.readLine();
        while ((row=reader.readLine())!=null){
            String[] tokens=row.split("`");
            keyValue.put(tokens[0], tokens[1]);
            valueKey.put(tokens[1], tokens[0]);
        }
        reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    void clearScreen(){
        for (int i=0;i<100;i++){
            System.out.println();
        }
    }
}
