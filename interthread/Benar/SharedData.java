public class SharedData{

    int data;
    boolean valueSet = false;

    synchronized void set(int value){

        if(valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                //TODO: handle exception
            }
        }
        System.out.println("Generate " + value);
        this.data = value;
        valueSet = true;
        notify();

    }

    synchronized int get(){
        
        if(!valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                //TODO: handle exception
            }
        }

        System.out.println("Get " + this.data);
        valueSet = false;
        notify();
        return this.data;

    }

}