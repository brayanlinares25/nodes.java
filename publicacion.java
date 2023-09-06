public class publicacion {
    private int idpublicacion;
    private String texto;
    private String imagen;
    private String clase_idclase;
    private String usuario_idusuario;
    
    public publicacion(int idpublicacion, String texto, String imagen, String clase_idclase, String usuario_idusuario){
        this.idpublicacion= idpublicacion;
        this.texto= texto;
        this.imagen= imagen;
        this.clase_idclase=clase_idclase;
        this.usuario_idusuario=usuario_idusuario;

    }

    public int getIdpublicacion(){
        return this.idpublicacion;
    }
    public String getTexto(){
        return this.texto;
    }  
    public String getImagen(){
        return this.imagen;
    }  
    public String getClase_idclase(){
        return this.clase_idclase;
    }
    public String getUsuario_idusuario(){
        return this.usuario_idusuario;
    }

    public void setIdpublicacion(int idpublicacion){
        this.idpublicacion= idpublicacion;
    }
    public void setTexto(String texto){
        this.texto=texto;
    }
    public void setImagen(String imagen){
        this.imagen= imagen;
    }
    public void setClase_idclase(String claseo_idclase){
        this. clase_idclase=claseo_idclase;
    }
    public void setUsuario_usuario(String usuario_idusuario){
        this.usuario_idusuario= usuario_idusuario;
    }
}