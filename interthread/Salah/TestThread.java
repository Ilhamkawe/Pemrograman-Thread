public class TestThread{

    public static void main(String[]args){

        SharedData sd = new SharedData();
        new Producer(sd);
        new Consumer(sd);

    }

}