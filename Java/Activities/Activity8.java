package activities;
class CustomerException extends Exception{
    private String err= null;
    public CustomerException(String err){
        this.err=err;
    }
    @Override
    public String getErr(){
        return err;
    }
}
public class Activity8 {
    public static void main(String[] args) {
        try{
        Activity8.exceptionTest("print to console");
        Activity8.exceptionTest("null");
            Activity8.exceptionTest("dont execute");
    }catch (CustomerException ex1){
            System.out.println("Inside catch block:" +ex1.getErr());
        }
}
static void exceptionTest(String str) throws CustomerException{
    if (str==null) {
        throw new CustomerException("Sting null");
    }else{
            System.out.println(str);
        }
    }
    }

