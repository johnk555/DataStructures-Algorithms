public class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("John Karelas","123-565-4589",100,4);
        b.print();
        System.out.println();

        b.setFullName("Marios Karelas");
        b.print();
        System.out.println();

        b.setActiveYears(5);
        b.print();
        System.out.println();



    }
}
