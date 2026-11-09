package builder.modifie;

public class Directeur {
    // construire pizza reine
    public Pizza construirePizzaReine() {
        MonteurPizza monteur = new MonteurPizzaReine();
        return monteur.getPizza();
    }

    // construire pizza piquante
    public Pizza construirePizzaPiquante() {
        MonteurPizza monteur = new MonteurPizzaPiquante();
        return monteur.getPizza();
    }

    // construire pizza vegetarienne
    public Pizza construirePizzaVegetarienne() {
        MonteurPizza monteur = new MonteurPizzaVegetarienne();
        return monteur.getPizza();
    }

    // methode generique : le Directeur ne connait que le MonteurPizza abstrait
    public Pizza construire(MonteurPizza monteur) {
        return monteur.getPizza();
    }
}
