import java.util.*;

/*Output each of its elements in the loop. Each element must be in a new line.*/
public class Main {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i));
        }

    }
}