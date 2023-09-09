import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class FileInput{
  public static void main(String[] args) {
     try{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter customerId id");
    int customerId=sc.nextInt();
    System.out.println("Enter customer psw");
    String customerPswd =sc.nextLine();
    System.out.println("Enter coustomer name ");    
    String customerName=sc.nextLine();
    System.out.println("Enter customerAddres ");
    String customerAddres=sc.nextLine();
    System.out.println("Enter customeLoanDetails ");
    String customeLoanDetails=sc.nextLine();
    System.out.println("Enter customerAcountBalance ");
    int customerAcountBalance=sc.nextInt();
    System.out.println("Enter AcountStatuc ");
    String AcountStatuc=sc.nextLine();
    System.out.println("Enter Histriy ");
    String Histriy=sc.nextLine();
   




         File f = new File("C:\\BankAplication\\data.txt");

         if(!f.exists())
             f.createNewFile();

         FileOutputStream fos = new FileOutputStream(f);

         ObjectOutputStream oos = new ObjectOutputStream(fos);

         users c=new users(customerId,customerPswd,customerName,customerAddres,customeLoanDetails,customerAcountBalance,AcountStatuc,Histriy);
       
         oos.writeObject(c);

         System.out.println("Operation success...");

     }
     catch(IOException e){
         e.printStackTrace();
     }
  }

}