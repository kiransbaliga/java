

public class Cmdlinearg {
    public static void main(String[] args) {
        
        int sum=0,er=0;
        for(int i=0;i<args.length;i++){
        try{
            sum=sum+Integer.parseInt(args[i]);
        }
        catch(NumberFormatException e){
            er++;
        }
        }
        System.out.println("sum:"+sum+"\nerror:"+er);
    }
}
