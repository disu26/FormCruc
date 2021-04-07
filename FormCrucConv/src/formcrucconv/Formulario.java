
package formcrucconv;

public class Formulario {
    String nombre;
    String apellido;
    String correo;
    String telefono;

    public Formulario(String nombre, String apellido, String correo, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método para mostrar posteriormente los datos de la lista
    @Override
    public String toString() {
        return "Nombre: "+getCorreo()+"\nApellido: "+getApellido()+
                "\nCorreo: "+getCorreo()+"\nTelefono: "+getTelefono()+"\n"; 
    }
}
