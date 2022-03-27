import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class FindingFunction{

    public spFunction sp=new spFunction();

    public String findDefScreen(Scanner input){
        sp.clearScreen();
        System.out.println("Input the slang word: ");
        String reusult=input.nextLine();
        return reusult;
    }
    
    public void findDefFunction(Scanner input,HashMap<String,String> keyValue,ArrayList<String> log){
        String slangWord=findDefScreen(input);
        String Def=keyValue.get(slangWord);
        
        log.add("Find with slang: "+slangWord);

        if (Def!=null){
            System.out.println("Def: " + Def);
        }else System.out.println("Not found");

        sp.backFuction(input);
    }

    public String findSlangScreen(Scanner input){
        sp.clearScreen();
        System.out.println("Input the definition: ");
        String reusult=input.nextLine();
        return reusult;
    }

    public void findSlangFunction(Scanner input,HashMap<String,String> keyValue,ArrayList<String> log){
        String Def=findSlangScreen(input);

        log.add("Find with keyword:"+Def);
        //Duyệt qua toàn bổ hash
        int count=0;
        for (String word: keyValue.keySet()){
            if (keyValue.get(word).contains(Def)){
                System.out.println(word+ " : " +keyValue.get(word));
                count++;
            }
        }

        if (count==0){
            System.out.println("Not found");
        }

        sp.backFuction(input);
    }

    public void showHistoryFunction(Scanner input,ArrayList<String> log){
        sp.clearScreen();
        System.out.println("Finding history:");
        int count=0;
        for (String token : log) {
            count++;
            System.out.println(count+"=>"+token);
        }
        sp.backFuction(input);
    }
}