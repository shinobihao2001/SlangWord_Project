import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class MainFlow{

    public FindingFunction findingFunction=new FindingFunction();// các chức năng tìm kiếm

    public spFunction sp=new spFunction();


    

    public int mainScreen(Scanner input){
        sp.clearScreen();

        System.out.println(("Press 1 to find definition with input slang word"));
        System.out.println(("Press 2 to find slangdword with input keyword"));
        int choice=Integer.parseInt(input.nextLine());
        
        return choice;
    }

    public void MainFunction(Scanner input,HashMap<String,String> keyValue,HashMap<String,String> valueKey,ArrayList<String> log){
        
        int choice=-1;

        while (choice!=0){
            choice=mainScreen(input);

            switch(choice){
                case 1:
                    findingFunction.findDefFunction(input, keyValue,log);
                    break;
                case 2:
                    findingFunction.findSlangFunction(input, keyValue,log);
                    break;
                default:
                break;
            }
        }
    }
}