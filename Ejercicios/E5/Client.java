package Ejercicios.E5;

public class Client {
    public static void main(String[] args) {
        IPhone apple = new Apple();
        apple = new MemoriaExterna(apple);
        apple = new MemoriaAlmacenmiento(apple);

        IPhone samsung = new Samsung();
        samsung = new MemoriaExterna(samsung);
        samsung = new MemoriaAlmacenmiento(samsung);
        samsung = new VidrioTemplado(samsung);

        IPhone xiaomi = new Xomi();
        xiaomi = new MemoriaExterna(xiaomi);
        xiaomi = new MemoriaAlmacenmiento(xiaomi);
        xiaomi = new VidrioTemplado(xiaomi);
        xiaomi = new Carcasa(xiaomi);

        System.out.println(samsung.add());
        System.out.println(apple.add());
        System.out.println(xiaomi.add());

    }
}
