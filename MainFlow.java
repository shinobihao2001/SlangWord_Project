import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class MainFlow{



    public FindingFunction findingFunction=new FindingFunction();// các chức năng tìm kiếm

    public CURDFunction curdFunction=new CURDFunction();// cac chuc nang them xoa sua

    public RandomFunction randomFunction=new RandomFunction();

    public spFunction sp=new spFunction();

    public int mainScreen(Scanner input){
        sp.clearScreen();
        System.out.println(("Press 0 to out"));
        System.out.println(("Press 1 to find definition with input slang word"));
        System.out.println(("Press 2 to find slangdword with input keyword"));
        System.out.println(("Press 3 to see finding history"));
        System.out.println(("Press 4 to add new slangword"));
        System.out.println(("Press 5 to edit slangword"));
        System.out.println(("Press 6 to delete slangword"));
        System.out.println(("Press 8 to random a slangword"));
        System.out.println(("Press 9 to play finding definition"));
        System.out.println(("Press 10 to play finding slang"));
        int choice=Integer.parseInt(input.nextLine());
        
        return choice;
    }

    public void MainFunction(Scanner input,HashMap<String,String> keyValue,HashMap<String,String> valueKey,ArrayList<String> log){
        
        int choice=-1;

        while (choice!=0){
            choice=mainScreen(input);

            switch(choice){
                case 0:
                    break;
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
                case 6:
                    curdFunction.delSlangFunction(input, keyValue, valueKey);
                    break;
                case 8:
                    randomFunction.slangToDay(input, keyValue, valueKey);
                    break;
                case 9:
                    randomFunction.slangGame(input, keyValue, valueKey);
                    break;
                case 10:
                    randomFunction.defGame(input, keyValue, valueKey);
                    break;
                default:
                break;
            }
        }
    }
}