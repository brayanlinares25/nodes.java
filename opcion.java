public class opcion {
    private int idopcion;
    private String opcion;
    private String respuesta;
    private int calificacion;
    private int pregunta_idpregunta;

    public opcion(int idopcion, String opcion, String respuesta, int calificacion, int pregunta_idpregunta ){
    }
    

    public int getIdopcion(){
        return this.idopcion;
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
    public int getPregunta_idpregunta(){
        return this.pregunta_idpregunta;
    }


    public void setIdopcion(int idopcion){
        this.idopcion=idopcion;
    }
    public void setOpcion(String opcion){
        this.opcion=opcion;
    }
    public void setRespuesta(String respuesta){
        this.respuesta=respuesta;
    }
    public void setCalificacion(int calificacion){
        this.calificacion=calificacion;
    }
    public void setPregunta_idpregunta(int pregunta_idpregunta){
        this.pregunta_idpregunta= pregunta_idpregunta;
    }
}