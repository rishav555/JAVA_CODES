import java.util.Scanner;
class CBSE {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks of subject 1 of the Student : ");
        int a = sc.nextInt();
        System.out.println("Enter Marks of subject 2 of the Student : ");
        int b = sc.nextInt();
        System.out.println("Enter Marks of subject 3 of the Student : ");
        int c = sc.nextInt();
        System.out.println("Enter Marks of subject 4 of the Student : ");
        int d = sc.nextInt();
        System.out.println("Enter Marks of subject 5 of the Student : ");
        int e = sc.nextInt();
        float sum = a + b + c + d + e;
        float percentage = (sum * 100) / 500;
        System.out.println("Percentage :  " + percentage);
        String result;
    result = (percentage<40)? "fail":"pass";
    System.out.println(result);

    boolean stop = false;
    while(!stop) {
        //do whatever
        System.out.println("Would you like to continue? (yes or no)");
        String s = sc.nextLine();
        if(s.equals("no")) {
            stop = true;
        }
        else {
            stop = false;
        }
    }
}
}
