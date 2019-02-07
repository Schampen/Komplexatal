public class test {
    public static void main(String[] args) {
        Komplexa z1 = new Komplexa(3,5);
        Komplexa z2 = new Komplexa(3, 5);

        System.out.println("z1 = " + z1 + "\n" + "z2 = " + z2);

        Komplexa z3 = z1.add(z2);
        System.out.println(z3);

        Komplexa z4 = z1.multiply(z2);
        System.out.println("Produkten blir av dem två blir " + z4);

        Double zv = z1.arg();
        System.out.println("Vinkel för z1 är " + zv);

        if (z1.equals(z2)) {
            System.out.println("z1 och z2 är lika");
        } else{
            System.out.println("z1 och z2 är olika");
        }
    }
}
