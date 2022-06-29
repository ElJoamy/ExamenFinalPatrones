package Ejercicios.E1;

public class Client {
    public static void main(String[] args) {
        LaPaz laPaz = new LaPaz("La Paz", 200, 35, "Frio", 100);
        Cochabamba cochabamba = new Cochabamba("Cochabamba", 35, 35, "Templado", 100);
        SantaCruz santaCruz = new SantaCruz("Santa Cruz", 200, 35, "Frio", 100);

        Tursta tursta = new Tursta("Tursta", 100, "123456789", "123456789");

        laPaz.accept(tursta);
        cochabamba.accept(tursta);
        santaCruz.accept(tursta);
        
    }
}
