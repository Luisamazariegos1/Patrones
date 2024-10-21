public abstract class Beverage {
    String description = "Unknown Beverage";

    // para obtener la descripción de la bebida
    public String getDescription() {
        return description;
    }

    // Este Método abstracto será implementado por las subclases
    public abstract double cost();
}
