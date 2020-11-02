public class threads extends Thread {

    public threads(String name){
        super(name);
        start();
    }

    public void run(){
        String name = getName();
        for(int a = 0; a < 100; a++){
            System.out.print(name);
        }
    }

}