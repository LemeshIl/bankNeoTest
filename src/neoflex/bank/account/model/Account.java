package neoflex.bank.account.model;

public class Account {
    private int id;
    private int client_id;
    private int balance;
    private String open_date;
    private String close_date;
    private String status;

    public Account() {
    }

    public Account(int id, int client_id, int balance, String open_date, String close_date, String status) {
        this.id = id;
        this.client_id = client_id;
        this.balance = balance;
        this.open_date = open_date;
        this.close_date = close_date;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getOpen_date() {
        return open_date;
    }

    public void setOpen_date(String open_date) {
        this.open_date = open_date;
    }

    public String getClose_date() {
        return close_date;
    }

    public void setClose_date(String close_date) {
        this.close_date = close_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", client_id=" + client_id +
                ", balance=" + balance +
                ", open_date='" + open_date + '\'' +
                ", close_date='" + close_date + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}