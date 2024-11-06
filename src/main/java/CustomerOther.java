
public class CustomerOther {

    private String idCustomer;
    private String nameCustomer;
    private String emailCustomer;
    private String numberCustomer;

    public CustomerOther() {
        idCustomer = "";
        nameCustomer = "";
        emailCustomer = "";
        numberCustomer = "";
    }

    public CustomerOther(String idCustomer) {
        this.idCustomer = idCustomer;
        nameCustomer = "";
        emailCustomer = "";
        numberCustomer = "";

    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getNumberCustomer() {
        return numberCustomer;
    }

    public void setNumberCustomer(String numberCustomer) {
        this.numberCustomer = numberCustomer;
    }
}
