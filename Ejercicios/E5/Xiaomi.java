package Ejercicios.E5;

public class Xiaomi implements IPhone {
    private String ram;
    private int almacenamiento;
    private int cpu;
    private Double precio;

    public Xiaomi(String ram, int almacenamiento, int cpu, Double precio) {
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.cpu = cpu;
        this.precio = precio;
    }

    @Override
    public Double getMonto() {
        return precio;
    }

    @Override
    public void setMonto(Double precio) {
        this.precio = precio;
    }

    public void showInfo() {
        System.out.println("<=== INFO APPLE ===>");
        System.out.println("Apple");
        System.out.println("RAM: " + ram);
        System.out.println("Almacenamiento: " + almacenamiento);
        System.out.println("CPU: " + cpu);
        System.out.println("Precio: " + precio);
    }
}
