import java.util.HashMap;
import java.util.Scanner;

public class CURDFunction {
    public spFunction sp=new spFunction();


    public void resetFunction(Scanner input,HashMap<String,String> keyValue,HashMap<String,String> valueKey){
        sp.clearScreen();
        keyValue.clear();
        valueKey.clear();
        sp.readData(keyValue, valueKey,"slangOriginal.txt");
        System.out.println("Reset done");
        sp.backFuction(input);
    }

    public void addSlangFunction(Scanner input,HashMap<String,String> keyValue,HashMap<String,String> valueKey){
        String newSlang;
        String newDef;

        sp.clearScreen();

        System.out.println("Input new slang: ");
        newSlang=input.nextLine();
        System.out.println("Inout new definition: ");
        newDef=input.nextLine();

        keyValue.put(newSlang, newDef);
        valueKey.put(newDef, newSlang);

        System.out.println("Add succes");

        sp.backFuction(input);
    }

    public void editSlangFunction(Scanner input,HashMap<String,String> keyValue,HashMap<String,String> valueKey){
        sp.clearScreen();
        System.out.println("Input the slang word to edit: ");
        String slang=input.nextLine();

        String def=keyValue.get((slang));

        if (def==null){
            System.out.println("Not found ");
        }
        else{
            System.out.println("Input the new slang word: ");
            String newSlang=input.nextLine();
            System.out.println("Input the new definition");
            String newDef=input.nextLine();

            // xoa di key value cu ra khoi hash map va the cap moi vao
           keyValue.remove(slang);
           keyValue.put(newSlang, newDef);

           valueKey.remove(def);
           valueKey.put(newDef, newSlang);

           System.out.println("Replace Success");
        }

        sp.backFuction(input);
    }

    public void delSlangFunction(Scanner input,HashMap<String,String> keyValue,HashMap<String,String> valueKey){
        sp.clearScreen();
        System.out.println("Input the slang word to delete: ");
        String slang=input.nextLine();

        String def=keyValue.get((slang));

        if (def==null){
            System.out.println("Not found ");
        }
        else{
            int choice=sp.confirmFuction(input);
            if (choice==1){
                keyValue.remove(slang);
                valueKey.remove(def);
                System.out.println("Delete Success");
            }
        }

        sp.backFuction(input);
    }
}
