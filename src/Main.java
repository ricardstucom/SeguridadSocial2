/**
 * Created by usu26 on 23/09/2016.
 */
public class Main {
    public static void main(String[] args) {
        SeguridadSocialHashMap seguridadSocial = new SeguridadSocialHashMap();

        Persona2 jose = new Persona2("39425364H", "111111111", "Jose", "Tomás", 35, 45000.00);
        Persona2 maria =  new Persona2("39425654W", "33333333", "Maria", "Gallego", 55, 61300.20);
        Persona2 carlos = new Persona2("39425355Q", "22222222", "Carlos", "Torres", 22, 23000.00);
        Persona2 anna = new Persona2("39425987J", "444444444", "Anna", "Pina", 26, 17654.88);


        seguridadSocial.altaPersona(jose);
        seguridadSocial.altaPersona(maria);
       seguridadSocial.altaPersona(carlos);
        seguridadSocial.altaPersona(anna);
        System.out.println("Altas a la seguridad social: " + seguridadSocial.obtenerTodas());


        System.out.println("Baja a la seguridad social: " + anna.toString());
        seguridadSocial.bajaPersona(anna.getDni());


      System.out.println("Lista de afiliados a la S.S.: " + seguridadSocial.obtenerTodas());

        System.out.println("obtenerPersonaPorDNI: " + seguridadSocial.obtenerPersonaPorDNI(jose.getDni()));
        System.out.println("obtenerPersonaPorNumSS: " + seguridadSocial.obtenerPersonaPorNumSS(maria.getNumss()));

        System.out.println("obtenerPersonasRangoSalarial: " +seguridadSocial.obtenerPersonasRangoSalarial(23000.00, 45000.00));

       System.out.println("obtenerPersonasMayoresQue: " + seguridadSocial.obtenerPersonasMayoresQue(25));



    }

}
