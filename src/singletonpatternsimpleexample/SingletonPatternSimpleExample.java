package singletonpatternsimpleexample;
/**
 *
 * @author Amantha - https://www.linkedin.com/in/amanthaa/
 */
public class SingletonPatternSimpleExample {
    
    public static void main(String[] args) {
        SingleObject obj = SingleObject.objectCreate();
        obj.display();
    }
}
