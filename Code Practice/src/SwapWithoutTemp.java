
public class SwapWithoutTemp {  
    public static void main(String args[]) {  
        String a = "Selenium";  
        String b = "WebDriver";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b; 
        System.out.println("a: "+ a);
        b = a.substring(0, a.length() - b.length()); 
        System.out.println("b: " + b);
        a = a.substring(b.length()); 
        System.out.println("a: "+ a);
        System.out.println("After : " + a + " " + b);  
    }  
}  
