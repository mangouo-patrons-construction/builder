package builder.modifie;

public class MonteurPizzaVegetarienne extends MonteurPizza {
    @Override
    public void monterPate() {
        pizza.setPate("fine");
    }

    @Override
    public void monterSauce() {
        pizza.setSauce("tomate");
    }

    @Override
    public void monterGarniture() {
        pizza.setGarniture("legumes grilles");
    }

    @Override
    public void monterCuisson() {
        pizza.setCuisson("220 degres");
    }
}
