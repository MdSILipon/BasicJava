
package basicjava;


public class BreakContinue {
    
    public static void main(String[] args) {
        
        int i;
        
        for(i=1; i<=100; i++){
            
            if(i==10)
                continue;
            
            if(i==20)
                break;
            
            System.out.println(i);
                
        }
    }
    
}
