package syllabus;

/* this means that progrram contailns 2 parts
    each thread procecced by each cpu
    exception in one thread doesnt affect other thraead

    ------------------------------
    A thread can be in 5 states
    - new    =>  before starting just created instance
    - runnable => it is ready to run
    - Running   => working now
    - non runnable=> thread is alive but not runnable
    - terminated => thread is terminated
    run by JVM
    •Sleeping:TheThreadsleepsforthespecifiedamount oftime.
    •Blocked for I/O: The Thread waits for a blocking operation to complete. 
    •Blocked for join completion: The Thread waits for completion of anotherThread. 
    •Waiting for notification: TheThread waitsfornotification another Thread. 
    •Blocked for lock acquisition: The Thread waits to acquire the lock ofanobject.



*/
class Threadder extends Thread {
    public void run() {
        System.out.print(Thread.currentThread().getName());
    }
}

/*
 * publicvoidrun()             :isused toperformactionforathread. 
 * public void start()         :starts the execution of the thread. JVM calls the run()method onthethread.
 * publicvoidsleep(long miliseconds): Causes the currentlyexecuting thread to
 * sleep (temporarily cease execution) for the specified numberof milliseconds.
 * publicvoidjoin()            :waitsforathreadtodie.
 * publicintgetPriority()      :returnsthepriorityofthethread. •public int
 * setPriority(int priority)   : changes the priority of the thread. •public
 * String getName()            : returns the name of the thread. •public Thread
 * currentThread()             : returns the reference of currently executing thread.
 * public int getId()          : returns the id of the thread. •public
 * Thread.StategetState()      : returns the state of the thread. •public
 * booleanisAlive()            : tests if the thread is alive. •public void suspend() : is
 * used to suspend the thread(depricated). • 
 * public void resume() : is used to resume the suspended thread 
 * public void stop()           : is used to stop the thread 
 * •public booleanisDaemon() : tests if the thread is a
 * daemon thread
 * 
 */
class multi_threading {
    public static void main(String[] args) {
        Threadder t = new Threadder();
        t.start();// starts the thread
    }
}
// every java program has main method.
/*
 * •The main thread is created automatically when our program is started.
 * •Tocontrol it we must obtain a reference to it. • This can be done by calling the
 * method currentThread( ) which is presentinThreadclass. • Thismethod
 * returnsareferencetothethreadonwhichitiscalled. •The default priority of Main
 * thread is 5 and for all remaining user threads
 * prioritywillbeinheritedfromparenttochild.
 * 
 * •When we start two or more threads within a program, there may be a situation
 * when multiple threads try to access the same resource and finally they can
 * produce unforeseen result due to concurrency issues. 
 * synchronized(object identifier){ //Accesssharedvariablesandothershared resources }
 ------------------------------------------
 Which is more preferred - Synchronized method or Synchronized block? 
 •InJava,synchronizedkeyword causesaperformance cost. 
 •A synchronized method in Java is very slow and can degrade performance. 
 •So we must use synchronization keyword in java when it is necessary else, 
  we should use Java synchronized block that is used forsynchronizingcriticalsectiononly.

 
 
 
 */