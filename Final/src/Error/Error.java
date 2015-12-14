package Error;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Karen
 */
public class Error {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean keepGoing = true;
        int firstNum = 0, secondNum = 0;
        String tempNum;

        do {
            try {

                System.out.println("Please enter your first number");

                do {
                    tempNum = read.nextLine();
                } while (!Pattern.matches("[\\p{Digit}*]", tempNum));

                System.out.println("Please enter your second number");
                secondNum = Integer.parseInt(read.nextLine());
                //result = firstNum / secondNum;
                System.out.println(firstNum + " /" + secondNum + " =" + (firstNum / secondNum));
                keepGoing = true;

            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Error:" + e.toString());
                
                //getMessage
                System.err.println("Message: " + e.getMessage());
                
                //print stack trace
                e.printStackTrace();
                
                StackTraceElement[] traceElements = e.getStackTrace();
                
                for (StackTraceElement element: traceElements)
                {
                    System.err.printf("%s\t", element.getClassName());
                    System.err.printf("%s\t", element.getFileName());
                    System.err.printf("%s\t", element.getLineNumber());
                    System.err.printf("%s\t", element.getMethodName());
                }
                
                keepGoing = false;
                
                
                
                
            } catch (Exception e) {

            }
            finally 
            {
                
            }

        } while (!keepGoing);
    }
  
}
