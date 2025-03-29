
package week8;
public class w8p2  {
    public static void handleNullPointer() {
        try {
            String str = null;
            System.out.println(str.length()); 
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
    public static void preventNullPointer() {
        String str = null;
        if (str != null) {
            System.out.println(str.length());
        } else {
            System.out.println("String is null, avoiding NullPointerException.");
        }
    }
    public static void useOptional() {
        java.util.Optional<String> optionalStr = java.util.Optional.ofNullable(null);
        System.out.println("String length: " + optionalStr.map(String::length).orElse(0));
    }
    
    public static void main(String[] args) {
        System.out.println("Handling NullPointerException:");
        handleNullPointer();
        
        System.out.println("\nPreventing NullPointerException:");
        preventNullPointer();
        
        System.out.println("\nUsing Optional to Handle Null Values:");
        useOptional();
    }
}
    

