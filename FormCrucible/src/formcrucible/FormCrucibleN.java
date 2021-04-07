
package formcrucible;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FormCrucible {

    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
//Se debe declarar una variable por linea
        String nombre,apellido,correo,telefono;
        int opcion;
        List<Formulario> lForm = new ArrayList<Formulario>();
        do {
            System.out.println("Seleccione una opción");
            System.out.println("1.Ingresar registro");
            System.out.println("2.Mostrar Registros");
            System.out.println("0.Salir");
            opcion=lectura.nextInt();
            switch (opcion) {
                case 1:
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
                    System.out.println(lForm);
                    break;
            }
            
        } while (opcion!=0);
    }
    
}
