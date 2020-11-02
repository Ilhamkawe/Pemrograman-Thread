public class PrintStringThread implements Runnable{

    Thread thread;
    String str1, str2;
    TwoStrings ts;

    public PrintStringThread(String str1, String str2, TwoStrings ts){
        this.str1 = str1;
        this.str2 = str2;
        this.ts = ts;
        thread = new Thread(this);
        thread.start();
    }

    public void run(){
        synchronized(ts){
            ts.print(str1, str2);
        }
    }
}