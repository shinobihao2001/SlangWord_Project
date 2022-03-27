import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class RandomFunction {
    public spFunction sp=new spFunction();
    public Random rng=new Random();
    
    public void slangToDay(Scanner input,HashMap<String,String> keyValue,HashMap<String,String> valueKey){
        int index=rng.nextInt(valueKey.size());
        Object[] keys=valueKey.values().toArray();
        String slang=(String)keys[index];
        String def=keyValue.get(slang);

        System.out.println("Slang word for today: ");
        System.out.println(slang+ " : "+def);
        sp.backFuction(input);
    }
}
