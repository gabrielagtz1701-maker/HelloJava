package c08_oop.AccessModifiersE;

public class Temperature {

    // Atributos
    private double celsius;

    // Constructores
    public Temperature(double celsius) {
        if (celsius >= -100 && celsius <= 100) {
            this.celsius = celsius;
            System.out.println("Temperatura inicial " + celsius + "°C");
        } else {
            System.out.println("Temperatura fuera de rango. Se asigna valor 0°C");
            this.celsius = 0;
        }
    }

    // Métodos
    public void setCelsius(double celsius) {
        if (celsius >= -100 && celsius <= 100) {
            this.celsius = celsius;
            System.out.println("Temperatura actualizada a: " + celsius + "°C");
        } else {
            System.out.println("Temperatura inválida. Debe estar entre -100 y 100 °C");
        }
    }

    public double getCelsius() {
        return celsius;
    }
}
