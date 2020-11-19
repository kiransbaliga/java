package syllabus;
/* ValuOf() method converts different types of values into a string.
    we can convert int to string,long, boolean,float etc.. to string*/
public class Valueof_method {
 public static void main(String[] args){
    int value=30;  
    String s22=String.valueOf(value);  
    System.out.println(s22+10);//concatenating string with 10  
    boolean b1=true;  
    byte b2=11;    
    short sh = 12;  
    int i = 13;  
    long l = 14L;  
    float f = 15.5f;  
    double d = 16.5d;  
    char chr[]={'j','a','v','a'};  
    Valueof_method obj=new Valueof_method(); 
    String s1 = String.valueOf(b1);    
    String s2 = String.valueOf(b2);    
    String s3 = String.valueOf(sh);    
    String s4 = String.valueOf(i);    
    String s5 = String.valueOf(l);    
    String s6 = String.valueOf(f);    
    String s7 = String.valueOf(d);    
    String s8 = String.valueOf(chr);    
    String s9 = String.valueOf(obj);    
    System.out.println(s1);  
    System.out.println(s2);  
    System.out.println(s3);  
    System.out.println(s4);  
    System.out.println(s5);  
    System.out.println(s6);  
    System.out.println(s7);  
    System.out.println(s8);  
    System.out.println(s9);  
 }   
}
