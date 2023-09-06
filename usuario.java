public class usuario {
    private String idusuario;
    private String nombre;
    private String apellido;
    private String contraseña;
    private String biografia;
    private String foto ;
    private String banner;
    private int rol_idrol;


    public usuario(String idusuario, String nombre, String apellido, String contraseña, String biografia, String foto, String banner, int rol_idrol ){
        this.idusuario=idusuario;
        this.nombre= nombre;
        this.apellido= apellido;
        this.contraseña= contraseña;
        this.biografia= biografia;
        this.foto=foto;
        this.banner=banner;
        this.rol_idrol=rol_idrol;
    }


    public String getIdusuario(){
        return this.idusuario;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String gerApellido(){
        return this.apellido;
    }
    public String getContraseña(){
        return this. contraseña;
    }
    public String getBiografia(){
        return this.biografia;
    }
    public String getFoto(){
        return this.foto;
    }
    public String getBanner(){
        return this.banner;
    }
    public int getRol_idrol(){
        return this.rol_idrol;
    }

    public void setUsurio_idusuario(String idusuario){
        this.idusuario = idusuario;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void setApellido(String apellido){
        this.apellido= apellido;
    }
    public void setContraseña(String contraseña){
        this.contraseña= contraseña;
    }
    public void setBiografia(String biografia){
        this.biografia= biografia;
    }
    public void setFoto(String foto){
        this.foto= foto;
    }
    public void setBanner(String banner){
        this.banner= banner;
    }
    public void setRol_idrol(int rol_idrol){
        this. rol_idrol= rol_idrol;
    }


    
}
