public class Grabage {
    public void finalize(){
        System.out.println("Garbage collected"+this);
    }
    public static void main (String[] args){
        Grabage n1=new Grabage();
        Grabage n2=new Grabage();
        n1=null;
        n2=null;
        System.gc();

    }
}
