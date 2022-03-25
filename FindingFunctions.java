import java.util.Hashtable;
import java.util.Scanner;

class FindingFunction{

    public spFunction sp=new spFunction();

    public String findDefScreen(Scanner input){
        sp.clearScreen();
        System.out.println("Input the slang word: ");
        String reusult=input.nextLine();
        return reusult;
    }
    
    public void findDefFunction(Scanner input,Hashtable<String,String> keyValue,Hashtable<String,String> valueKey){
        String slangWord=findDefScreen(input);
        String Def=keyValue.get(slangWord);

        if (Def!=null){
            System.out.println("Def: " + Def);
        }else System.out.println("Not found");
    }
}