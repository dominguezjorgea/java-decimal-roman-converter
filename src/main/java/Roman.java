import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Roman {

    public static String convertDecimalToRoman(int input){

        String romanString = "";
        HashMap<Integer, String> romanDictionary = new HashMap<>();
        List<Integer> romanIndex = new ArrayList<>();

        romanIndex.add(1);
        romanIndex.add(5);
        romanIndex.add(10);
        romanIndex.add(50);
        romanIndex.add(100);
        romanIndex.add(500);
        romanIndex.add(1000);

        romanDictionary.put(1, "I");
        romanDictionary.put(5, "V");
        romanDictionary.put(10, "X");
        romanDictionary.put(50, "L");
        romanDictionary.put(100, "C");
        romanDictionary.put(500, "D");
        romanDictionary.put(1000, "M");

        if(!initialValues(input, romanDictionary, romanIndex).equals("")){
            return initialValues(input, romanDictionary, romanIndex);
        }else{
            int romanDeduction = input;
            for (int i = romanIndex.size()-1; i >= 0; i--) {
                //System.out.println(romanDictionary.get(romanIndex.get(i)));
                while(romanDeduction >= romanIndex.get(i)){
                    romanString = romanString + romanDictionary.get(romanIndex.get(i));
                    romanDeduction = romanDeduction - romanIndex.get(i);
                }
            }
        }
        return romanString;
    }

    private static String initialValues(int input, HashMap<Integer, String> map, List<Integer> romanIndex){

        //System.out.println(map.get(input));
        String roman = "";

        if(map.get(input)!= null){
            roman = roman + map.get(input);
        }else if(map.get(input+1)!= null){
            roman= roman + "I"+ map.get(input+1);
        }
        //System.out.println(roman);
        return  roman;
    }

    public static void main(String[] args) {
        System.out.println("4 in roman is: " + Roman.convertDecimalToRoman(4));
        System.out.println("5 in roman is: " + Roman.convertDecimalToRoman(5));
        System.out.println("9 in roman is: " + Roman.convertDecimalToRoman(9));
        System.out.println("99 in roman is: " + Roman.convertDecimalToRoman(99));
        System.out.println("1541 in roman is: " + Roman.convertDecimalToRoman(1541));
        System.out.println("89 in roman is: " + Roman.convertDecimalToRoman(89));
    }
}
