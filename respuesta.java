public class respuesta {
    private String idrespuesta;
    private String opcion;
    private String respuesta;
    private int calificacion;
    private String quiz_idquiz;
    private int pregunta_idpregunta;
    private String usuario_idusuario;
    private String clase_idclase;
    
    public respuesta(String idrespuesta, String opcion, String respuesta, int calificacion, String quiz_idquiz, int pregunta_idpregunta, String usuario_idusuario, String clase_idclase){
    }


    public String getIdrespuesta(){
        return this.idrespuesta;
    }
    public String getOpcion(){
        return this.opcion;
    }
    public String getRespuesta(){
        return this.respuesta;
    }
    public int getCalificacion(){
        return this.calificacion;
    }
    public String getQuiz_idquiz(){
        return this.quiz_idquiz;
    }
    public int getPregunta_idpregunta(){
        return this.pregunta_idpregunta;
    }
    public String getUsuario_idusuario(){
        return this.usuario_idusuario;
    }
    public String getClase_idclase(){
        return this.clase_idclase;
    }
   

    public void setIdrespuesta(String idrespuesta ){
        this.idrespuesta=idrespuesta;
    }
    public void setOpcion(String opcion){
        this.opcion=opcion;
    }
    public void setRespuesta(String respuesta){
        this.respuesta=respuesta ;
    }
    public void setCalificacion(int calificacion){
        this.calificacion=calificacion;
    }
    public void setQuiz_idquiz(String quiz_idquiz){
        this.quiz_idquiz=quiz_idquiz;
    }
    public void setPregunta_idpregunta(int pregunta_idpregunta){
        this.pregunta_idpregunta=pregunta_idpregunta;
    }
    public void setUsuario_idusuario(String usuario_idusuario){
        this. usuario_idusuario= usuario_idusuario;
    }
    public void setClase_idclase(String clase_idclase){
        this.clase_idclase=clase_idclase;
    }
    
}
