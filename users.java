import java.io.Serializable;

public class users implements Serializable{
    private int customerId;
    private String customerPswd;
    private String customerName;
    private String customerAddres;
    private String customeLoanDetails;
    private  int customerAcountBalance;
    private String AcountStatuc;
    private String Histriy;
    users(){}
    public users(int customerId, String customerPswd, String customerName, String customerAddres,
            String customeLoanDetails, int customerAcountBalance, String acountStatuc, String histriy) {
        this.customerId = customerId;
        this.customerPswd = customerPswd;
        this.customerName = customerName;
        this.customerAddres = customerAddres;
        this.customeLoanDetails = customeLoanDetails;
        this.customerAcountBalance = customerAcountBalance;
        AcountStatuc = acountStatuc;
        Histriy = histriy;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getCustomerPswd() {
        return customerPswd;
    }
    public void setCustomerPswd(String customerPswd) {
        this.customerPswd = customerPswd;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerAddres() {
        return customerAddres;
    }
    public void setCustomerAddres(String customerAddres) {
        this.customerAddres = customerAddres;
    }
    public String getCustomeLoanDetails() {
        return customeLoanDetails;
    }
    public void setCustomeLoanDetails(String customeLoanDetails) {
        this.customeLoanDetails = customeLoanDetails;
    }
    public int getCustomerAcountBalance() {
        return customerAcountBalance;
    }
    public void setCustomerAcountBalance(int customerAcountBalance) {
        this.customerAcountBalance = customerAcountBalance;
    }
    public String getAcountStatuc() {
        return AcountStatuc;
    }
    public void setAcountStatuc(String acountStatuc) {
        AcountStatuc = acountStatuc;
    }
    public String getHistriy() {
        return Histriy;
    }
    public void setHistriy(String histriy) {
        Histriy = histriy;
    }


   
}

