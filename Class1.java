import java.util.ArrayList;

public class Class1 {

    int HowOld (ArrayList<Integer> num, int index){

        int result = 2024 - num.get(index);

        num.set(index,result);

        return num.get(index);

    }






}
