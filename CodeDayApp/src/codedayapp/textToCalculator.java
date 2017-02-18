package codedayapp;
import gnu.jel.Evaluator;
import gnu.jel.CompiledExpression;
import gnu.jel.Library;
import gnu.jel.CompilationException;
public class textToCalculator {
    //this class calls the Java Expression Library To easily Convert Input
    //this class takes text and converts it to calculator input then returns the output\
    public double toCalc(String input){
        // this class will be case insensitive and will take in a string to convert to calc
        int segCount = 0;
        int finalAns;
        char charToCheck;
        for(int x = 0; x < input.length(); x++){
            charToCheck = input.charAt(x);
            switch (charToCheck){
                case ' ': 
                case '1':
            }
        }
            return 1.0;
    }

}
