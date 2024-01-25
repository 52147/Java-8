public class Transaction {
    private String id;
    private int value;

    public Transaction(String id, int value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Transaction{id='" + id + '\'' + ", value=" + value + '}';
    }
}
