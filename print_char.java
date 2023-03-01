import java.util.Scanner;
public class print_character_using_ascii_value {
    
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number:\n");
    int num=sc.nextInt();
    System.out.println("Equivalent character for "+num+" is "+(char)num);
    sc.close();
  } 
    
    
}
    

