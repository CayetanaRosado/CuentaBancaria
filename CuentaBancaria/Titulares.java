public class Titulares{
    
    private String documento;
    private String nombre;
    private String apellidos;
    private float movil;
    
    public void Titulares(String doc, String nombre, String apellidos,int movil){
         this.documento = documento;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.movil = movil;
    }
    public void Titulares(){
        this.documento = " ";
        this.nombre = " ";
        this.apellidos = " ";
        this.movil = 0;
    }
    public String getDocumento(){
        return documento;
    }
    public void setDocumento(String documento){
        this.documento = documento;
    }
        public String getNombre(){
        return nombre;
    }
    public void setNombre(String documento){
        this.nombre = nombre;
    }
    public String getapellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public float getMovil(){
        return movil;
    }
    public void setMovil(float movil){
        this.movil = movil;
    }
}


