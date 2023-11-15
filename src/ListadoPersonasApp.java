import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        //Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        //Empezamos con el menu
        var salir = false;
        while (!salir){
            mostrarMenu();
            try {
                salir = ejecutarOperacion(consola, personas);
            }catch (Exception e){
             System.out.println("Ocurrio un error: " + e.getMessage());
            }
            System.out.println();
        }
    }

    private static void mostrarMenu(){
        //Mostrar Opciones
        System.out.print("""
                *** Listado Personas APP ***   
                1. Agregar
                2. Listar
                3. Salir
             
                """);
        System.out.println("Proporciona la Opcion");
    }

    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        //Revisamos la opcion apropiada
        switch (opcion){
            case 1 -> {//Agregar persona a la lista
                System.out.print("Proporciona el Nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Proporciona el Telefono: ");
                var telefono = consola.nextLine();
                System.out.print("Proporciona el email: ");
                var email = consola.nextLine();
                //Crear el objeto persona
                var persona = new Persona(nombre, telefono, email);
                // Lo agregamos a la lista de personas
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size()+ " Elementos");
            }//Fin del caso uno
            case 2 -> {//Listar las personas
                System.out.println("Listado de personas: ");
                //Mejora usando lambda y metodo de referencia
                //personas.forEach((persona -> System.out.println(persona)));
                personas.forEach(System.out::println);
            }
            case 3 -> {//Salir
                System.out.println("Hasta Pronto...");
                salir = true;
            }
            default -> System.out.println("Opcion erronea: " + opcion);
        }//fin Switch
        return salir;
    }

}