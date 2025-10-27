public class Boucle {
    public static void main(String[] args) {
        boucleFor();
        System.out.println();
        boucleWhile();
        System.out.println();
        compteRebours();
        System.out.println();
        nombresPairs();
        System.out.println();
        somme1a100();
    }

    static void boucleFor() {
        System.out.println("== Boucle for 1 - 10 ==");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }


    static void boucleWhile() {
        System.out.println("== Boucle while 1 - 10 ==");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    static void compteRebours() {
        System.out.println("== Compte à rebours 10 - 0 ==");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }

    static void nombresPairs() {
        System.out.println("== Nombres pairs jusqu'à 20 ==");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    static void somme1a100() {
        int somme = 0;
        for (int i = 1; i <= 100; i++) {
            somme += i;
        }
        System.out.println("La somme des nombres de 1 à 100 est : " + somme);
    }
}
