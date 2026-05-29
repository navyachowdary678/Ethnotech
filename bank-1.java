class Bank {
    void name() {
        System.out.println("Navya");
    }
}
class Balence extends Bank {
    int balence = 10000;
    void bal() {
        System.out.println("Balance: " + balence);
    }
}
class Withdraw extends Balence {
    void withdraw(int with) {
        balence = balence - with;
        System.out.println("Withdraw Amount: " + with);
        System.out.println("Current Balance: " + balence);
    }
}
class Demo {
    public static void main(String args[]) {
        Withdraw w = new Withdraw();
        w.withdraw(500);
        w.bal();
        w.name();
    }
}