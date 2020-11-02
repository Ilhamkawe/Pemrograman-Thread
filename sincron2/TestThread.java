public class TestThread{
    public static void main(String[]args){
        TwoStrings ts = new TwoStrings();
        new PrintStringThread("Halo", "Saya Kawe",ts);
        new PrintStringThread("Apa", " Kabar ? ",ts);
        new PrintStringThread("Sedang ", " apa ?",ts);
    }
}