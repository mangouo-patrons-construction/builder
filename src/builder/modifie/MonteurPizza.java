package builder.modifie;

public abstract class MonteurPizza {
    protected Pizza pizza = new Pizza();

    public Pizza getPizza() {
        // appel des methodes pour construire respectivement la pate, la sauce et la garniture
        monterPate();
        monterSauce();
        monterGarniture();
        monterCuisson();
        return pizza;
    }

    public abstract void monterPate();
    public abstract void monterSauce();
    public abstract void monterGarniture();
    public abstract void monterCuisson();
}
