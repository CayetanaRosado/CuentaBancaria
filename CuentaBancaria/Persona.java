public class Persona{
    
    private String nombre;
    private int edad;
    private String email;
    private Direccion direccion;
    
    public void Personas(String nombre,int edad,String email,Direccion direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.direccion = direccion;
    }
    public void Personas(){
        this.nombre = " ";
        this.edad = 0;
        this.email = " ";
    }
    public String getNombre(){
        return nombre;
    }
    public String setNombre(String nombre){
        this.nombre = nombre;
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public int setEdad(int edad){
        this.edad = edad;
        return edad;
    }
    public String getEmail(){
        return email;
    }
    public String setEmail(String email){
        this.email = email;
        return email;
    }
}
