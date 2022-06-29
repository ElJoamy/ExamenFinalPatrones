package Ejercicios.E5;

public class MemoriaExterna extends Decorator {
    public MemoriaExterna(IPhone phone) {
        super(phone);
    }
    
    public Integer add() {
        System.out.println("Memoria externa a $100");
        return super.add() * 100;
    }
}
