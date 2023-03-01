import java.util.Scanner;

public class table {
    public static void main(String args[]){
        System.out.println("Enter the number\n");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(num+"X"+i+"="+num*i);
            sc.close();
        }
        sc.close();

    }
    
}


//comment is added in this file
