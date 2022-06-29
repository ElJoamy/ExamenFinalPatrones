package Ejercicios.E5;

public class Samsung implements IPhone {
    @Override
    public Integer add() {
        System.out.println("Accesorio Samsung a $150");
        return 150;
    }
}