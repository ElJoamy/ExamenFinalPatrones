package Ejercicios.E3;

public class Client {
    public static void main(String[] args) {
        IRs Faceebook = new Facebook(100000, 100);
        IRs Twitter = new Twitter(100000, 100);
        IRs Whatsapp = new Whatsapp(100000, 50);

        Estudiante estudiante1 = new Estudiante("Juan", "123456789");
        Estudiante estudiante2 = new Estudiante("Pedro", "123456789");
        Estudiante estudiante3 = new Estudiante("Maria", "123456789");

        ISistema colegio = new SistemaColegio("Bancario", 500, new Estudiante[]{estudiante1, estudiante2, estudiante3}, "CI, Fotocopuia de carnet y certfcado de nacimiento");

        Estudiante estudiante4 = new Estudiante("Juan", "123456789");
        Estudiante estudiante5 = new Estudiante("Pedro", "123456789");

        ISistema escuela = new SistemaEscuela("Robles", 250, new Estudiante[]{estudiante4, estudiante5}, "CI, Fotocopuia de carnet y certfcado de nacimiento");
    
        Estudiante estudiante6 = new Estudiante("Juan", "123456789");
        Estudiante estudiante7 = new Estudiante("Pedro", "123456789");

        ISistema Unversdd = new SistemaUnversidad("UPB", 250, new Estudiante[]{estudiante6, estudiante7}, "CI, Fotocopuia de carnet y certfcado de nacimiento");
    
        Faceebook.showInfo(escuela);
        Twitter.showInfo(colegio);
        Whatsapp.showInfo(Unversdd);
    }
}
