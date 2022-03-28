import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class spFunction {
    

    public void readData(HashMap<String,String> keyValue,HashMap<String,String> valueKey,String fileURL){
        try (BufferedReader reader = new BufferedReader(new FileReader(fileURL))) {
        String row;
        while ((row=reader.readLine())!=null){
            String[] tokens=row.split("`");
            //System.out.println(row);
            //if (keyValue.get(tokens[0])!=null){
          //      System.out.println("Trung");
         //   } code kiểm tra dữ liệu đã bị trùng

            keyValue.put(tokens[0], tokens[1]);
            valueKey.put(tokens[1], tokens[0]);
        }
        reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeData(HashMap<String,String> keyValue,String fileURL){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileURL))) {
            for (String slang:keyValue.keySet()){
                String def=keyValue.get((slang));
                String builder=slang+"`"+def+"\n";
                writer.append(builder);
            }
            writer.close();
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

    public int confirmFuction(Scanner input){

        int choice=1;

        while (choice!=0){
            System.out.println("Press 1 to confirm the action");
            System.out.println("Press 0 to cancel");
            choice=Integer.parseInt(input.nextLine());
        }
      
        return choice;
    }
}
