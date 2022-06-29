package Ejercicios.E5;

public class MemoriaAlmacenmiento extends Decorator {
    public MemoriaAlmacenmiento(IPhone phone) {
        super(phone);
    }
    
    public Integer add() {
        System.out.println("Memoria de almacenamiento a $100");
        return super.add() + 100;
    }
}

