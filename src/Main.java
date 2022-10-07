// Java review

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "Hello"; // Strings are special in Java, so you don't need to say "new" to make one
        System.out.println(s);
        String t = new String("Huh"); // copies a String
        Object o = s; // Now o and s are aliases, and they contain the same memory address

        /* Java uses the type of the reference to figure out whether to allow
        a line of code.

        Java uses the type of the object when running **for instance methods**.
         */
        System.out.println(s.substring(3));
        // Casting pats Java on the head and says "I know what I'm doing".
        System.out.println(
                ((String) o).substring(3)
        );

        // Casting is dangerous — if you're wrong, it'll crash
        Object p = new Object();
        if (p instanceof String) {
            System.out.println(
                    ((String) p).substring(3)
            );
        }

        System.out.println("Hi".concat("world"));
        System.out.println("Hi" + 4);

        // Remember that o refers to a String, and o's type is Object.
        // Java doesn't remember that o refers to a String.
        // We need to type cast.
        String u = (String) o;

        Integer i = new Integer(4);
        int j = i;

        // ArrayLists are lists of memory addresses of objects
        ArrayList myWeirdList = new ArrayList();
        myWeirdList.add(i);
        myWeirdList.add(o);
        System.out.println(myWeirdList);
        Integer k = (int) myWeirdList.get(0); // the return type for get is Object
        System.out.println(k);

        String v = (String) myWeirdList.get(1);
        System.out.println();

        // Declare your variables to be as abstract as possible so that it's
        // easy to change your mind.
        List<String> myList = new LinkedList<>();
        myList.add((String) o);

        // Java only allows casting when it's plausible. This doesn't work:
//        myList.add(
//                (String) ((Object) i)
//        );

        System.out.println(
                String.valueOf(k)
        );

        Object q = "Hmm";
        System.out.println(
                (String) q
        );
    }
}
