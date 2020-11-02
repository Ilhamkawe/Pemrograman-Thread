public class TwoStrings{

    synchronized static void print(String str1, String str2){

        System.out.println(str1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            
        }
        System.out.println(str2);

    }

}