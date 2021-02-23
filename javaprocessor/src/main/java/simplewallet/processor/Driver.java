class Driver {
    private String balance;
    private String name;

    public Driver(String balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public String getBalance(){
        return this.balance;
    }

    public String getName() {
        return this.name;
    }
}