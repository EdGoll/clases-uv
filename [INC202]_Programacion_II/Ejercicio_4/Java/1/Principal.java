public class Principal {

    public static void main(String[] args) {
        System.out.println("****************");

        Guerrero g1 = new Guerrero("Gannicus", 50, "Doble Espada");
        System.out.println(g1.toString());
        System.out.println(g1.combatir(2));
        System.out.println(g1.combatir(10));
        System.out.println(g1.toString());
        g1.alimentarse(15);
        System.out.println("Alimentarse en " + 15);
        System.out.println(g1.toString());
        System.out.println(g1.combatir(20));
        System.out.println(g1.toString());
        g1.alimentarse(1);
        System.out.println("Alimentarse en " + 1);
        System.out.println("Alimentarse en " + 7);
        System.out.println(g1.toString());
        System.out.println(g1.combatir(12));
        System.out.println(g1.combatir(5));
        System.out.println(g1.combatir(7));
        System.out.println(g1.combatir(5));
        System.out.println(g1.combatir(2));
        System.out.println(g1.toString());

        System.out.println("****************");

        Mago m1 = new Mago("Tom Riddle", "Avada Kedavra");
        System.out.println(m1.toString());
        System.out.println(m1.encantar());
        System.out.println(m1.encantar());
        System.out.println(m1.encantar());
        System.out.println(m1.encantar());
        System.out.println(m1.toString());
        m1.alimentarse(5);
        System.out.println("Alimentarse en " + 5);
        System.out.println(m1.toString());
        System.out.println(m1.encantar());
        System.out.println(m1.encantar());
        System.out.println(m1.toString());
        m1.alimentarse(1);
        System.out.println("Alimentarse en " + 1);
        System.out.println(m1.toString());
        System.out.println(m1.encantar());
        System.out.println(m1.encantar());
        System.out.println(m1.encantar());
        System.out.println(m1.encantar());
        System.out.println(m1.toString());

        System.out.println("****************");
    }    
}
