import java.util.*;
import java.util.ArrayList;

public class SeguridadSocialHashMap {



    private  Map<String,Persona2> personaMapDni = new HashMap<>();
    private  Map<String,Persona2> personaMapss = new HashMap<>();
    private Map<Double,Persona2> personaMapSalario = new HashMap<>();

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
        List<Persona2> rango = new ArrayList<>();


        for (int i = 0; i < personaMapSalario.size(); i++) {
            if (personaMapSalario.get(i).getSalario() > min || personaMapSalario.get(i).getSalario() < max) {
                rango.add(personaMapSalario.get(i));
            }

        }
        return rango;
        }
    public List<Persona2> obtenerPersonasMayoresQue(int edad){

        List<Persona2> rango = new ArrayList<>();


        for (int i = 0; i < personaMapDni.size(); i++) {
            if (personaMapDni.get(i).getEdad() > edad ) {
                rango.add(personaMapDni.get(i));
            }

        }
        return rango;


    }
    public List<Persona2> obtenerTodas(){
        return new ArrayList<>(personaMapDni.values());
    }


    }
