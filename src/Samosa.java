public class Samosa {
    private static Samosa samosa;

    private Samosa(){
        //private constructor
    }

    //lazy way of creating singleton object
    public static Samosa getSamosa(){
        //object of this class
        if(samosa==null){
            //sync. block for multiple thread environment
            synchronized (Samosa.class){
                if(samosa==null){
                    samosa=new Samosa();
                }
            }
        }

        return samosa;
    }
}
