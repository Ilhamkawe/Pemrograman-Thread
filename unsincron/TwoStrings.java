public class TwoStrings{

    static void print(String str1, String str2){

        System.out.println(str1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            //TODO: handle exception
        }
        System.out.println(str2);

    }

}