public class PrintStringThread implements Runnable{

    Thread thread;
    String str1, str2;
    
    public PrintStringThread(String str1, String str2){
        this.str1 = str1;
        this.str2 = str2;
        thread = new Thread(this);
        thread.start();
    }

    public void run(){
        TwoStrings.print(str1, str2);
    }

}