package syllabus;

/*  There are several ways by which characters can be extracted from String class object. 
    String is treated as an object in Java so we can’t directly access the characters 
    that comprise a string.
    For doing this String class provides various predefined methods. */

public class Char_Extraction {
    public static void main(String [] args){
        String str="Hello";
		char ch=str.charAt(2);
        System.out.println(ch);
        //while charAt() give char at a an index
        // getChars() gives more than in character
        char c[]=new char[4];
        str.getChars(1,5,c,0); // int StringStart,int stringend, array name, start of array
        System.out.println(c);
        //getBytes() to extract char from String and then convert in a byte array
        byte b[]=str.getBytes();
        System.out.print(b);
        char cha[]=str.toCharArray();//toCharArray() converts string to char array
        System.out.println(cha);

    }
}
