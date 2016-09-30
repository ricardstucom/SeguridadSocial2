import java.util.*;

/**
 * Created by 46989075y on 30/09/2016.
 */
public class SeguridadSocialTreeMap {

    private Map<String,Persona2> personaMapDni = new TreeMap<>();
    private  Map<String,Persona2> personaMapss = new TreeMap<>();
    private Map<Double,Persona2> personaMapSalario = new TreeMap<>();
    public void altaPersona(Persona2 persona){

        if(!personaMapDni.containsKey(persona.getDni())&& !personaMapss.containsKey(persona.getNumss())){
            personaMapDni.put(persona.getDni(),persona);
            personaMapss.put(persona.getNumss(),persona);
            personaMapSalario.put(persona.getSalario(),persona);
        }


    }
    public void bajaPersona(String dni) {

        /*if(personaMapDni.containsKey(persona.getDni())&& personaMapss.containsKey(persona.getNumss())&& personaMapSalario.containsKey(persona.getSalario())){
            personaMapDni.remove(persona.getDni(),persona);
            personaMapss.remove(persona.getNumss(),persona);
           // personaMapSalario.remove(persona.getSalario(),persona);
        }*/
        personaMapDni.remove(dni);

    }

    public Persona2 obtenerPersonaPorDNI(String dni) {
        //  personaMapDni.keySet(); Coger todas las keys
        // personaMapDni.values(); Coger todos los values
        // personaMapDni.remove(dni);
        return personaMapDni.get(dni);
    }
    public Persona2 obtenerPersonaPorNumSS(String numss) {

        return personaMapss.get(numss);
    }

    public List<Persona2> obtenerPersonasRangoSalarial(double min, double max) {
        List<Persona2> aux = new ArrayList<>();

        for (Persona2 persona: personaMapDni.values()
                ) {
            if(persona.getSalario()>= min && persona.getSalario()<=max){
                aux.add(persona);
            }
        }
        return aux;
    }
    public List<Persona2> obtenerPersonasMayoresQue(int edad){

        List<Persona2> aux = new ArrayList<>();

        for (Persona2 persona: personaMapDni.values()
                ) {
            if(persona.getSalario()>= edad){
                aux.add(persona);
            }
        }
        return aux;


    }
    public List<Persona2> obtenerTodas(){
        return new ArrayList<>(personaMapDni.values());
    }

}
