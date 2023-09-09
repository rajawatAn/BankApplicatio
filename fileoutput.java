//

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class Test{
  public static void main(String[] args) {
    try{
               
        FileInputStream fis = new FileInputStream("C:\\\\BankAplication\\\\data.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        users obj = (users)ois.readObject();
        System.out.println(obj.getCustomerName()+"  "+obj.getCustomerId()+" "+obj.getCustomerPswd()+" "+obj.getCustomerAddres()+" "+obj.getCustomerAcountBalance()+" "+obj.getCustomeLoanDetails()+" "+obj.getHistriy()+" "+obj.getHistriy());

    } 
    catch(Exception e){
        e.printStackTrace();
    }
  }

}