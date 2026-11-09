package builder.cours;

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

}
