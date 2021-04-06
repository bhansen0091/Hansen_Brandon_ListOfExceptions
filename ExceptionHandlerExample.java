import java.util.ArrayList;
/**
 * ExceptionHandlerExample
 */

class CannotCastToIntException extends Exception{};

public class ExceptionHandlerExample {

    public void tryInt(ArrayList<Object> arrList) {
        for (var i = 0; i < arrList.size(); i++) {
            try {
                Integer castValue = (Integer) arrList.get(i);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Index: %s | Value: %s".formatted(
                    arrList.indexOf(arrList.get(i)), 
                    arrList.get(i)));
            }
        }
    }
}