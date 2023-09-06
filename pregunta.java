
public class pregunta {
    private int idpregunta;
    private String pregunta;
    private String quiz_idquiz;
    

    public pregunta (int idpregunta, String pregunta, String quiz_idquiz){     
    }

    public int getIdpregunta(){
        return this.idpregunta;
    }
    public String getPregunta(){
        return this.pregunta;
    }
    public String getQuiz_idquiz(){
        return this.quiz_idquiz;
    }

    public void setIdpregunta(int idpregunta){
        this.idpregunta=idpregunta;
    }
    public void setPregunta(String pregunta){
        this.pregunta=pregunta;
    }
    public void setQuiz_idquiz(String quiz_idquiz){
        this.quiz_idquiz=quiz_idquiz;
    }
}
