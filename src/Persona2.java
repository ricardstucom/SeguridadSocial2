/**
 * Created by usu26 on 23/09/2016.
 */
public class Persona2 {
    private String dni;
    private String numss;
    private String nombre;
    private String apellidos;
    private Integer edad;
    private Double salario;

    @Override
    public String toString() {
        return "Persona2{" +
                "dni='" + dni + '\'' +
                ", numss='" + numss + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona2 persona2 = (Persona2) o;

        if (dni != null ? !dni.equals(persona2.dni) : persona2.dni != null) return false;
        if (numss != null ? !numss.equals(persona2.numss) : persona2.numss != null) return false;
        if (nombre != null ? !nombre.equals(persona2.nombre) : persona2.nombre != null) return false;
        if (apellidos != null ? !apellidos.equals(persona2.apellidos) : persona2.apellidos != null) return false;
        if (edad != null ? !edad.equals(persona2.edad) : persona2.edad != null) return false;
        return salario != null ? salario.equals(persona2.salario) : persona2.salario == null;

    }

    @Override
    public int hashCode() {
        int result = dni != null ? dni.hashCode() : 0;
        result = 31 * result + (numss != null ? numss.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellidos != null ? apellidos.hashCode() : 0);
        result = 31 * result + (edad != null ? edad.hashCode() : 0);
        result = 31 * result + (salario != null ? salario.hashCode() : 0);
        return result;
    }

    public String getDni() {

        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNumss() {
        return numss;
    }

    public void setNumss(String numss) {
        this.numss = numss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Persona2(String dni, String numss, String nombre, String apellidos, Integer edad, Double salario) {

        this.dni = dni;
        this.numss = numss;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario = salario;
    }
}
