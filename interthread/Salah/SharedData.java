public class SharedData{
    int data;
    synchronized void set(int value){
        System.out.println("Generate " + value);
        this.data = value;
    }
    synchronized int get(){
        System.out.println("Get " + this.data);
        return this.data;
    }
}