package Ejercicios.E3;

public class Twitter implements IRs{
    private int usuarios;
    private int uActivos;

    public Twitter(int usuarios, int uActivos) {
        this.usuarios = usuarios;
        this.uActivos = uActivos;
    }

    @Override
    public void showInfo(ISistema sistema) {
        System.out.println("<=== Twitter ===>");
        System.out.println("Usuarios: " + usuarios);
        System.out.println("Usuarios Activos: " + uActivos);
        System.out.println("<=== Twitter ===>");
        System.out.println();
    }
}
