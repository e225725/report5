public class step2 {
    

    public static void main(String[] args) {

        String test= null;

        try{
            System.out.println(test.length());
        }catch(java.lang.NullPointerException exception){
            System.out.println(exception.getMessage()+"が発生しています");
        }
    }
}