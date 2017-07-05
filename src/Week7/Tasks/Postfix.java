package Week7.Tasks;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

import static Week7.Tasks.IsDigit.checkString;

public class Postfix  {

    public static double parse(String rpnString) throws RPNParserException  {

        double result = 0;
        Deque<String> deque = new LinkedList<>();
        double num1, num2;
        try {
            for (String s : rpnString.split(" ")) {
                if (checkString(s)) {
                    deque.push(s);
                } else {
                    if (s.equals("NaN"))
                        throw new ArithmeticException();
                    else if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                        num2 =  Double.parseDouble(deque.pop());
                        num1 =  Double.parseDouble(deque.pop());
                        switch (s) {
                            case "+":
                                result = num1 + num2;
                                break;
                            case "-":
                                result = num1 - num2;
                                break;
                            case "*":
                                result = num1 * num2;
                                break;
                            case "/":
                                if(num2 == 0)
                                    throw new ArithmeticException();
                                result = num1 / num2;
                                break;
                        }
                        deque.push(Double.toString(result));
                    } else {
                        throw new RPNParserException();

                    }
                }
            }
        }
        catch (NumberFormatException ex){
            throw new RPNParserException();
        }catch (NoSuchElementException ex)
        {
            throw new RPNParserException();
        }
        result = Double.parseDouble(deque.pop());
        return result;
    }

}
