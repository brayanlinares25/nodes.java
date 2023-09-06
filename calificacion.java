public class calificacion {
    private String idcalificacion;
    private int preguntas;
    private int respuestas;
    private String calificion;
    private String quiz_idquiz;
    private String usuario_idusuario;
    private String clase_idclase;

    public calificacion(String idcalificacion, int preguntas, int respuestas, String calificacion, String quiz_idquiz, String usuario_idusuario, String clase_idclase){
        this.idcalificacion= idcalificacion;
        this.preguntas= preguntas;
        this.respuestas= respuestas;
        this.calificion=calificacion;
        this.quiz_idquiz=quiz_idquiz;
        this.usuario_idusuario=usuario_idusuario;
        this.clase_idclase=clase_idclase;

    }

    public String getIdcalificacion(){
        return this.idcalificacion;
    }
    public int getPreguntas(){
        return this.preguntas;
    }
    public int getRespuestas(){
        return this.respuestas;
    }
    public String getCalificion(){
        return this.calificion;

    }
    public String getQuiz_idquiz(){
        return this.quiz_idquiz;

    }
    public String getusuario_idusuario(){
        return this.usuario_idusuario;

    }
    public String getclase_idclase(){
        return this.clase_idclase;
    }

    public void setIdCalificacion(String calificacion){
        this. calificion=calificacion;
    }
    public void setPreguntas(int preguntas){
        this. preguntas=preguntas;
    }
    public void setRespuestas(int respuestas){
        this. respuestas=respuestas;
    }
    public void SetCalificaion(String calificacion){
        this.calificion= calificacion;
    }
    public void setQuiz_idquiz(String quiz_idquiz){
        this.quiz_idquiz= quiz_idquiz;
    }
    public void setUsuario_idusuario(String usuario_idusuario){
        this. usuario_idusuario= usuario_idusuario;
    }
    public void setClase_idclase(String clase_idclase){
        this. clase_idclase= clase_idclase;
    }

}
