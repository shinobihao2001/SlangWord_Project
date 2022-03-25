import java.util.Hashtable;
import java.util.Scanner;

class MainFlow{

    public FindingFunction findingFunction=new FindingFunction();// các chức năng tìm kiếm

    public spFunction sp=new spFunction();


    

    public int mainScreen(Scanner input){
        sp.clearScreen();

        System.out.println(("Press 1 to find dertemined with input slang word"));
        int choice=Integer.parseInt(input.nextLine());
        
        return choice;
    }

    public void MainFunction(Scanner input,Hashtable<String,String> keyValue,Hashtable<String,String> valueKey){
        
        int choice=-1;

        while (choice!=0){
            choice=mainScreen(input);

            switch(choice){
                case 1:
                    findingFunction.findDefFunction(input, keyValue, valueKey);
                    break;

                default:
                break;
            }
        }
    }
}