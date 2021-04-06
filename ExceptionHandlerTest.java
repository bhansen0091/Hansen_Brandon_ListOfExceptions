import java.util.ArrayList;

/**
 * ExceptionHandlerTest
 */
public class ExceptionHandlerTest {

    public static void main(String[] args) {
        ExceptionHandlerExample eH = new ExceptionHandlerExample();

        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        
        eH.tryInt(myList);
    }
}