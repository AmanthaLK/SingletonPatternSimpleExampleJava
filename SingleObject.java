/**
 *
 * @author Amantha - https://www.linkedin.com/in/amanthaa/
 */
public class SingleObject {
     
    private static SingleObject object = null;
     
    private SingleObject(){ //Private Constructor will prevent the instantiation of this class directly.
        System.out.println("Constructor Method");
    }

    public static SingleObject objectCreate(){
        if(object==null)
            return new SingleObject();
        return object;    
    }
    
    public void display(){
        System.out.println("Singleton Example");
    }
    
    
    
}
