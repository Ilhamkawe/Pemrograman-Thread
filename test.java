public class test{

    public static void main(String[]args){
        new threads("a");
        new threads("b");

        System.out.println("====================================================================");
        
        new runnable("r1");
        new runnable("r2");

    }

}