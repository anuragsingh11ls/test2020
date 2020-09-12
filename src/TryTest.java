
public class TryTest {
    
    
    
    @SuppressWarnings("finally")
    public static int myMethod()
    {

        
try {
            
            
            return 1;
            
        }catch (Exception e) {
            // TODO: handle exception
            return 2;
        }
        finally {
            return 4;
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
     
        System.out.println(TryTest.myMethod());

    

}
}