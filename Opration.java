import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Scanner;

public class Opration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customerId id");
        int customerId=sc.nextInt();
        System.out.println("Enter customer psw");
        String customerPswd =sc.nextLine();
        sc.nextLine();

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
         sc.nextLine();

        System.out.println("Enter Histriy ");
        String Histriy=sc.nextLine();
       
    


      
    users ob=new users(customerId, customerPswd, customerName,
     customerAddres,customeLoanDetails , customerAcountBalance
    , AcountStatuc, Histriy);
     //int s=sc.nextInt();
   
   
     Properties pro = new Properties();
     pro.setProperty("A",String.valueOf(ob.getCustomerId()));
     pro.setProperty("B",String.valueOf(ob.getCustomerName()));
     pro.setProperty("C",String.valueOf(ob.getCustomerPswd()));
     pro.setProperty("d",String.valueOf(ob.getCustomerAddres()));
     pro.setProperty("f",String.valueOf(ob.getAcountStatuc()));
     try(FileOutputStream fos =new FileOutputStream("newFile.text", false)){
          pro.store(fos, "my data");
       System.out.println("data sev");
     }
     
   catch( Exception e){}
  
   try(FileInputStream fin = new FileInputStream("newFile.text")) {
       pro.load(fin);
   }  
     
     
     catch(Exception e){
        e.printStackTrace();
     }
     String a =pro.getProperty("B");
     System.out.println(a);
   
    //  int b=Integer.parseInt(pro.getProperty("A"));
    //  System.out.println(b);
     
    String b =pro.getProperty("C");
     System.out.println(b);


      System.out.println("Enter coustomer name ");    
      String cusName=sc.nextLine();
      System.out.println("Enter psw id");
      String psw=sc.next();
        

     if(cusName.equals(a) && psw.equals(b)){
        System.out.println("valid user");

     }
     else{
        System.out.println("Envalid ");
     }

    //  if((ob.getCustomerName()).equals(b) && (ob.getCustomerPswd()).equals(a)){
    //       System.out.println("valid user");

    //  }
    //  else{
    //      System.out.println("Envalid ");
    //   }

    }

}
