package neoflex.bank.account.daoAccount;

public class Account {
    private int id;
    private int balance;
    private int userid;


    public Account() {
    }

    public Account(int id, int balance, int userid) {
        this.id = id;
        this.balance = balance;
        this.userid = userid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", userid=" + userid +
                '}';
    }
}
