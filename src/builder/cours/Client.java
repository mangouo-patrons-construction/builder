package builder.cours;

public class Client {
    public static void main(String[] args) {
        Directeur directeur = new Directeur();

        // construire pizza reine
        System.out.println("....................... Pizza Reine fabriquee .......................");
        directeur.construirePizzaReine().print();

        // construire pizza piquante
        System.out.println("....................... Pizza Piquante fabriquee .......................");
        directeur.construirePizzaPiquante().print();

    }
}
