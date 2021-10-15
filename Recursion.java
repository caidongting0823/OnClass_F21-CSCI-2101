import java.util.ArrayList;
import java.util.Collection;

public class Recursion {
    public static int count(ArrayList data) {
        if (!data.isEmpty()) {
            data.remove(0);
            return 1 + count(data);
        } else {
            return 0;
        }
    }

    public static String downUp(String data) {
        if (data.length()!=0) {
            System.out.println(data);
            downUp(data.substring(0, data.length()-1));
            System.out.println(data);
            return "";
        } else {
            return "";
        }
    }

    public static String down(String data) {
        if (data.length()!=0) {
            System.out.println(data);
            return down(data.substring(0, data.length()-1));
        } else {
            return "";
        }
    }

    public static boolean isPal(String thingToCheck) {
        if (thingToCheck.length() == 0) {
            return true;
        }
        if (thingToCheck.length() == 1) {
            return true;
        }
        if (thingToCheck.endsWith(thingToCheck.substring(0, 1))) {
            return true && isPal(thingToCheck.substring(1, thingToCheck.length()-1));
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(21);
        numbers.add(32);
        numbers.add(43);
        numbers.add(54);
        int theCount = Recursion.count(numbers);
        System.out.println("There are " + theCount + " items in the colection.");

        String data = "Computer";
        Recursion.down(data);

        Recursion.downUp(data);
        System.out.println(Recursion.isPal("mom"));
        System.out.println(Recursion.isPal("mod"));
    }
}
