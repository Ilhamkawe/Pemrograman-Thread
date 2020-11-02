public class test{

    public static void main(String[]args){
        PrintThreadName tn1 = new PrintThreadName("Thread1");
        PrintThreadName tn2 = new PrintThreadName("Thread2");
        PrintThreadName tn3 = new PrintThreadName("Thread3");
        PrintThreadName tn4 = new PrintThreadName("Thread4");

        System.out.println("Threads Dijalankan");
        try {
            tn3.thread.join();
            tn4.thread.join();
        } catch (InterruptedException e) {
            //TODO: handle exception
        }
        System.out.println("Threads Berakhir");
    }

}