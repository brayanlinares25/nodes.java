public class clase {
    private String idclase;
    private String titulo;
    private String descripcion;
    private int fecha_inicio; 
    private int fecha_finalizacion;
    private String usuario_idusuario;
    private int lista_idlista;
    private int tipo_idtipo;
    private int nivel_idnivel;

    public clase(String idclase, String titulo, String descripcion, int fecha_inicio, int fecha_finalizacion, String usuario_idusuario, int lista_idlista, int tipo_idtipo, int nivel_idnivel){
        this.idclase=idclase;
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.fecha_inicio=fecha_inicio;
        this.fecha_finalizacion=fecha_finalizacion;
        this.usuario_idusuario=usuario_idusuario;
        this.lista_idlista=lista_idlista;
        this.tipo_idtipo=tipo_idtipo;
        this.nivel_idnivel=nivel_idnivel;
    }

    public String getIdclase(){
        return this.idclase;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getDescrpcion(){
        return this.descripcion;
    }
    public int getFecha_inicio(){
        return this.fecha_inicio;
    }
    public int getFecha_finalicacion(){
        return this.fecha_finalizacion;
    }
    public String getUsuario_idusuario(){
        return this.usuario_idusuario;
    }
    public int getLista_idlista(){
        return this.lista_idlista;
    }
    public int getTipo_idtipo(){
        return this.tipo_idtipo;
    }
    public int getNivel_idnivel(){
        return this.nivel_idnivel;
    }
    
    
    public void setIdclase(String idclase){
        this.idclase= idclase;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public void setFecha_inicio(int fecha_inicio){
        this.fecha_inicio=fecha_inicio;
    }
    public void setFecha_finalicacion(int fecha_finalizacion){
        this.fecha_finalizacion=fecha_finalizacion;
    }
    public void setUsuario_idusuario(String usuario_idusuario){
        this.usuario_idusuario=usuario_idusuario;
    }
    public void  setLista_idlista(int lista_idlista){
        this.lista_idlista=lista_idlista;
    }
    public void setTipo_idtipo(int tipo_idtipo){
        this.tipo_idtipo= tipo_idtipo;
    }
    public void setNivel_idnivel(int nivel_idnivel){
        this.nivel_idnivel= nivel_idnivel;
    }


}
