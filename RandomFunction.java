
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class RandomFunction {
    public spFunction sp=new spFunction();
    public Random rng=new Random();
    
    public void slangToDay(Scanner input,HashMap<String,String> keyValue,HashMap<String,String> valueKey){
        sp.clearScreen();
        
        int index=rng.nextInt(valueKey.size());
        Object[] keys=valueKey.values().toArray();
        String slang=(String)keys[index];
        String def=keyValue.get(slang);

        System.out.println("Slang word for today: ");
        System.out.println(slang+ " : "+def);
        sp.backFuction(input);
    }

    public void slangGame(Scanner input,HashMap<String,String> keyValue,HashMap<String,String> valueKey){
        sp.clearScreen();
        
        // Lấy ra 1 cặp slang-def
        int index=rng.nextInt(valueKey.size());
        Object[] keys=valueKey.values().toArray();
        String slang=(String)keys[index];
        String def=keyValue.get(slang);

        //Tạo mảng các def
        Object[] values=keyValue.values().toArray();
        // Mảng khi in ra màn hình
        String[] answers= new String[4];
        for (int i=0;i<4;i++){
            index=rng.nextInt(5000);// set cố định cho khỏi sai :))
            answers[i]=((String)values[index]);
        }

        //Chèn đáp án vào
        index=rng.nextInt(3);
        answers[index]=def;

        //In đáp án ra màn hình
        System.out.println("Find definition of slang word: "+slang);
        for (int i=0;i<4;i++){
            System.out.println(i+": "+answers[i]);
        }
        System.out.printf("Choose :");
        int choice=Integer.parseInt(input.nextLine());

        if (def==answers[choice]){
            System.out.println("Correct");
        }else System.out.println("Wrong");

        sp.backFuction(input);
    }

    public void defGame(Scanner input,HashMap<String,String> keyValue,HashMap<String,String> valueKey){
        sp.clearScreen();
        
        // Lấy ra 1 cặp def-slang
        int index=rng.nextInt(keyValue.size());
        Object[] values=keyValue.values().toArray();
        String def=(String)values[index];
        String slang=valueKey.get(def);

        //Tạo mảng các slang word
        Object[] keys=valueKey.values().toArray();
        // Mảng khi in ra màn hình
        String[] answers= new String[4];
        for (int i=0;i<4;i++){
            index=rng.nextInt(5000);// set cố định cho khỏi sai :))
            answers[i]=((String)keys[index]);
        }

        //Chèn đáp án vào
        index=rng.nextInt(3);
        answers[index]=slang;

        //In đáp án ra màn hình
        System.out.println("Find slang of definition: "+def);
        for (int i=0;i<4;i++){
            System.out.println(i+": "+answers[i]);
        }
        System.out.printf("Choose :");
        int choice=Integer.parseInt(input.nextLine());

        if (slang==answers[choice]){
            System.out.println("Correct");
        }else System.out.println("Wrong");

        sp.backFuction(input);
    }
}
