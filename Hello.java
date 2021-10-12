import java.util.Scanner;

class Hello { 
    public static void main(String args[]) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the character: ");  
        char c = sc.next().charAt(0);
        sc.close();
        int asciivalue1 = c;
        int i=1;
        for(;;) {
            if (i <= asciivalue1-64) {
                
                System.out.println("Hello Nunu");
                i++;  
            } else {
                break;
            }
          
        }
        
        
    }  
}  
 