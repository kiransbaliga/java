class Test extends Exception{
    String a;
    Test(String b){
        a=b;
    }
    public String toString(){
        return("Exception occured:"+a);
    }
}
public class Tryc {
    public static void main(String[] args){
        try{
            System.out.println("Try block started");
            throw new Test("TEST EXCEPTION HERE");
        }
        catch(Test exp){
            System.out.println("Catch Block STARTED!");
            System.out.println(exp);
        }
        finally{
           System.out.println("THIS IS FINALLY BLOCK");
        }

    }
    
}