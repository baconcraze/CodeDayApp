package codedayapp;
import gnu.jel.Evaluator;
import gnu.jel.CompiledExpression;
import gnu.jel.Library;
import gnu.jel.CompilationException;
public class textToCalculator {
    //this class calls the Java Expression Library To easily Convert Input
    //this class takes text and converts it to calculator input then returns the output\
    private String[] chemNameArr = {"placeholder",""};
    private int[] chemChargeArr = {1,2};
    public int toCalc(String input){
        // this class will be case insensitive and will take in a string to convert to calc
        
        // Set up the library
        Class[] staticLib=new Class[1];
        try {
          staticLib[0]=Class.forName("java.lang.Math");
        } catch(ClassNotFoundException e) {
          // Can't be ;)) ...... in java ... ;)
        };
        Library lib=new Library(staticLib,null,null,null,null);
        try {
        lib.markStateDependent("random",null);
        } catch (CompilationException e) {
          // Can't be also
        };
        
        
        // Compile
        CompiledExpression expr_c=null;
        try {
          expr_c=Evaluator.compile(input,lib);
        } catch (CompilationException ce) {
            System.err.print("–––COMPILATION ERROR :");
            System.err.println(ce.getMessage());
            System.err.print("                       ");
            System.err.println(input);
            int column=ce.getColumn(); // Column, where error was found
            for(int i=0;i<column+23-1;i++) System.err.print(' ');
            System.err.println('^');
        };
        
        
        if (expr_c !=null) {
      
        // Evaluate (Can do it now any number of times FAST !!!)
        Number result;
        try {
          result=(Number)expr_c.evaluate(null);
        } catch (Throwable e) {
          System.err.println("Exception emerged from JEL compiled"+
                             " code (IT'S OK) :");
          System.err.print(e);
        };
          return result.intValue();
        }
        return -1;
    }
    public int findCharge(String chem){
        if(chem.contains(i))
        for(int i = 0; i < chemNameArr.length; i++){
            if(chemNameArr[i].equals(chem)){
                return chemChargeArr[i];
            }
        }
    }
    public double findMolecularMassOfElement(String molecule){
        if(Character.isDigit(molecule.charAt(molecule.length()))){
            if(Character.isDigit(molecule.charAt(molecule.length()))){
            
            }
        }
    }
    //if problem contains a decimal coefficent multiply the value so it is a whole number
    public double findMolecularMass(String molecule){
        double output;
        int position = 0;
        int start = -1;
        int end = -1;
        int multiplier = -1;
        while(position < molecule.length()){
            if(Character.isUpperCase(molecule.charAt(position))){
                start = position;
            }
            else if(Character.isDigit(molecule.charAt(position)) || Character.isUpperCase(molecule.charAt(position))){
                if(Character.isDigit(molecule.charAt(position+1))){
                    end = position+1;
                    position++;
                }
                else{
                    end = position;
                }
            }
            if(end > 0 && start > 0){
                molecule.substring(start, end);
            }
        }
    }
    
        
    }
}
            

