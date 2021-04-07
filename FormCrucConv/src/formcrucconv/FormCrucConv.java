
package formcrucconv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FormCrucConv {

    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        String nombre;
        String apellido;
        String correo;
        String telefono;
        int opcion;
        List<Formulario> lForm = new ArrayList<Formulario>();
        // Menú de selección.
        do {
            System.out.println("Seleccione una opción");
            System.out.println("1.Ingresar registro");
            System.out.println("2.Mostrar Registros");
            System.out.println("0.Salir");
            opcion=lectura.nextInt();
            switch (opcion) {
                case 1:
                    // Llenado de formulario.
                    System.out.print("Nombre: ");
                    nombre=lectura.next();
                    System.out.print("Apellido: ");
                    apellido=lectura.next();
                    System.out.print("Correo: ");
                    correo=lectura.next();
                    System.out.print("Telefono: ");
                    telefono=lectura.next();
                    Formulario form = new Formulario(nombre,apellido,correo,telefono);
                    lForm.add(form);
                    break;
                case 2:
                    // Visualización de registros.
                    System.out.println(lForm);
                    break;
            }
            
        } while (opcion!=0);
    }
    
}
