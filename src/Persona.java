public class Persona {
    private int id;
    private String nombre;
    private String telefono;
    private String email;
    private static int numeroPersona = 0;

    //Constructor Vacio
    public Persona(String nombre, String telefono, String email){
        this.id = ++Persona.numeroPersona;
    }

    //Constructor
    public Persona(int id, String nombre, String telefono, String email) {
        this(nombre, telefono, email);//Se llama el constructor vacio
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    //Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = name;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getNumeroPersona() {
        return numeroPersona;
    }

    public static void setNumeroPersona(int numeroPersona) {
        Persona.numeroPersona = numeroPersona;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Persona persona = new Persona("","","");
        System.out.println(persona);
    }
}

