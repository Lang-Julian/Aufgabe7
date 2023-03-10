public class Account {
    private final String iban;
    private final int blz;
    private final String bankName;


    //Konstruktor
    public Account(String iban, int blz, String bankName) {
        this.iban = iban;
        this.blz = blz;
        this.bankName = bankName;
    }
    //

    public String getIban(){
        return iban;
    }

    public int getBlz(){
        return blz;
    }
    public String getBankName(){
        return bankName;
    }

}
