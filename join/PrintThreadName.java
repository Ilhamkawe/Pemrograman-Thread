public class PrintThreadName implements Runnable{
    Thread thread;
    public PrintThreadName(String name){
        thread = new Thread(this, name);
        thread.start();
    }

    public void run(){
        String name = thread.getName();
        for(int i = 0 ; i < 100; i++){
            System.out.print(name);
        }
    }

}