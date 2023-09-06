public class quiz {
    private String idquiz; 
    private String titulo;
    private String descripcion;
    private String clase_idclase;
    private String usuario_idusuario;

    public quiz(String idquiz, String titulo, String descripcion, String clase_idclase, String usuario_idusuario){

    }


    public String getIdquiz(){
        return this.idquiz;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public String getClase_idclase(){
        return this.clase_idclase;
    }
    public String getUsuario_idusuario(){
        return this.usuario_idusuario;
    }


    public void setIdquiz(String idquiz ){
        this.idquiz= idquiz;
    }
    public void setTitulo(String titulo ){
        this.titulo=titulo;
    }
    public void setDescripcion(String descripcion ){
        this.descripcion= descripcion;
    }
    public void setClase_idclase(String clase_idclase ){
        this.clase_idclase= clase_idclase;
    }
    public void setUsuario_idusuario(String usuario_idusuario ){
        this.usuario_idusuario= usuario_idusuario;
    }
    
    


}
