package builder.modifie;

public class Client {
    public static void main(String[] args) {
        Directeur directeur = new Directeur();

        // construire pizza reine
        System.out.println("....................... Pizza Reine fabriquee .......................");
        directeur.construirePizzaReine().print();

        // construire pizza piquante
        System.out.println("....................... Pizza Piquante fabriquee .......................");
        directeur.construirePizzaPiquante().print();

        // construire pizza vegetarienne
        System.out.println("....................... Pizza Vegetarienne fabriquee .......................");
        directeur.construirePizzaVegetarienne().print();

        // construire une pizza avec la methode generique du Directeur
        System.out.println("....................... Pizza Reine via construire(monteur) .......................");
        directeur.construire(new MonteurPizzaReine()).print();
    }
}
