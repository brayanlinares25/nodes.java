public class telefono {
    private String idtelefono;
    private String telefono;
    private String usuario_idusuario;

    public telefono(String idtelefono, String telefono, String usuario_idusuario){
        this.idtelefono= idtelefono;
        this.telefono= telefono;
        this.usuario_idusuario=usuario_idusuario;
    }
    public String getIdtelefono(){
        return this. idtelefono;
    }
    public String getTelefono(){
        return this. telefono;
    }
    public String getUsuario_idusuario(){
        return this.usuario_idusuario;
    }

    public void setIdtelefono(String idtelefono){
        this.idtelefono= idtelefono;
    }
    public void setTelefono(String telefono){
        this.telefono= telefono;
    }
    public void setUsurio_idusuario(String usuerio_idusurio){
        this.usuario_idusuario= usuerio_idusurio;
    }
    
    
}
