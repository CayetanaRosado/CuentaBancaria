public class Direccion{
    private String calle;
    private String ciudad;
    private String provincia;
    private String codigoPostal;
    
    public Direccion(String calle,String ciudad,String provincia,String codigoPostal){
        this.calle = calle;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
    }
    public Direccion(){
        
        this.calle = " ";
        this.ciudad = " ";
        this.provincia = " ";
        this.codigoPostal = " ";
    }
    public String getCalle(){
        return calle;
    }
    public String setCalle(String calle){
        this.calle = calle;
        return calle;
    }
    public String getCiudad(){
        return ciudad;
    }
    public String setCiudad(String ciudad){
        this.ciudad = ciudad;
        return ciudad;
    }
    public String getProvincia(){
        return provincia;
    }
    public String setProvincia(String provincia){
        this.provincia = provincia;
        return provincia;
    }
    public String getCodigoPostal(){
        return codigoPostal;
    }
    public String setCodigoPostal(String provincia){
        this.codigoPostal = codigoPostal;
        return codigoPostal;
    }
    
}
