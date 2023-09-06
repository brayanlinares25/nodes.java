public class comentario {
    private int idcomentario;
    private String comentario;
    private String clase_idclase;
    private String usuario_idusuario;

    public comentario(int idcomentario, String comentario, String clase_idclase, String usuario_idusuario){
        this.idcomentario= idcomentario;
        this. comentario= comentario;
        this.clase_idclase= clase_idclase;
        this.usuario_idusuario= usuario_idusuario;

    }
    public int getIdcomentario(){
        return this.idcomentario;
    }
    public String getComentario(){
        return this.comentario;
    }
    public String getClase_idclase(){
        return this.clase_idclase;
    }
    public String getUsuario_idusuario(){
        return this.usuario_idusuario;
    }
    

    public void setIdcomentario(int idcomentario){
        this.idcomentario= idcomentario;
    }
    public void setComentario(String comentario){
        this.comentario= comentario;
    }
    public void setClase_idclase(String clase_idclase){
        this.clase_idclase= clase_idclase;
    }
    public void setUsuario_idusuario(String usuario_idusuario){
        this.usuario_idusuario= usuario_idusuario;
    }


    }

    

