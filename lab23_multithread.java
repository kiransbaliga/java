class thread1 extends Thread{
    void call(){
       for (int i = 1; i <= 100; i++) {
          if (i % 2!= 0) 
             System.out.print(i + " ");
             try{ 
                Thread.sleep(10);
             } catch(InterruptedException ex) { 
                System.out.println("Exception has " + "been caught" + ex); 
             }
       }
    }
    synchronized public void run(){
       call();
       
    }
 }
 
 class thread2 extends Thread{
    public void call(){
       for (int i = 1; i <= 100; i++) {
          if (i % 2 == 0) 
             System.out.print(i + " ");
             try{ 
                Thread.sleep(10);
             } catch(InterruptedException ex) { 
                System.out.println("Exception has " + "been caught" + ex); 
             }
       }
    }
   synchronized public void run(){
       call();
       
    }
 }
 
 public class lab23_multithread {
    public static void main(String args[]){
       thread1 t1= new thread1();
       thread2 t2 =new thread2();
       t1.setPriority(10);  
       t2.setPriority(1);  
       
       t1.start();
       
       t2.start();
    
    }
 }