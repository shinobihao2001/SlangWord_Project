import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class spFunction {
    
    void readData(HashMap<String,String> keyValue,HashMap<String,String> valueKey){
        String fileURL="slang.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileURL))) {
        String row;
        while ((row=reader.readLine())!=null){
            String[] tokens=row.split("`");
            //System.out.println(row);
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

      
    public void backFuction(Scanner input){

        int choice=1;

        while (choice!=0){
            System.out.println("Press 0 to continue");
            choice=Integer.parseInt(input.nextLine());
        }
      
    }
}
