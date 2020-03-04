package neoflex.bank.jms;

public class Audit {
    private int id;
    private int action_id;
    private String action_date;
    private String object_type;

    public Audit() {
    }

    public Audit(int id, int action_id, String action_date, String object_type) {
        this.id = id;
        this.action_id = action_id;
        this.action_date = action_date;
        this.object_type = object_type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAction_id() {
        return action_id;
    }

    public void setAction_id(int action_id) {
        this.action_id = action_id;
    }

    public String getAction_date() {
        return action_date;
    }

    public void setAction_date(String action_date) {
        this.action_date = action_date;
    }

    public String getObject_type() {
        return object_type;
    }

    public void setObject_type(String object_type) {
        this.object_type = object_type;
    }

    @Override
    public String toString() {
        return "Audit{" +
                "id=" + id +
                ", action_id=" + action_id +
                ", action_date='" + action_date + '\'' +
                ", object_type='" + object_type + '\'' +
                '}';
    }
}
