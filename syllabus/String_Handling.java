package syllabus;

// java string handling introduction
/*  located in java.lang package   
    create object of type string-> they are generally IMMUTABLE(Once a string is created then its non changeable)

    SERIALIZABLE            COMPARABLE                       CHARSEQUENCE
            \                   |                                /
             \                 |                               /
              ----------{IMPLEMENTS}-----------------------------                      
                           STRING

        Charsequence Interface is used for representing sequence of Chars
        Tring,String Buffer,String Builder classs implements Charsequence interface
        String s1="hello";
        String s2= new String("Hello");
        
            
*/

public class String_Handling {
    public static void main(String[] args){
            String s="hello";
            String s2=s.concat("world");  //Concat method to concate 2 strings ---- '+'  can also be use to concate
            System.out.println(s2+"!!!");
            boolean b= s.equals("hello");  //to compare 2 strings equals() 
            System.out.println(b);
            if (s=="hello"){                      //  comparison
                    System.out.println("True");
            }
            if (s.compareTo("hello")==0){                  // returns 0 if string is same
                    System.out.println("true");
            }
    }
}
