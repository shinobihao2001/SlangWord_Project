import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class MainFlow{

    public FindingFunction findingFunction=new FindingFunction();// các chức năng tìm kiếm

    public CURDFunction curdFunction=new CURDFunction();// cac chuc nang them xoa sua

    public spFunction sp=new spFunction();

    public int mainScreen(Scanner input){
        sp.clearScreen();

        System.out.println(("Press 1 to find definition with input slang word"));
        System.out.println(("Press 2 to find slangdword with input keyword"));
        System.out.println(("Press 3 to see finding history"));
        System.out.println(("Press 4 to add new slangword"));
        System.out.println(("Press 5 to edit slangword"));
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
                case 3:
                    findingFunction.showHistoryFunction(input, log);
                    break;
                case 4:
                    curdFunction.addSlangFunction(input, keyValue, valueKey);
                    break;
                case 5:
                    curdFunction.editSlangFunction(input, keyValue, valueKey);
                    break;
                default:
                break;
            }
        }
    }
}