public class lista_has_usuario {
    private int lista_idlista;
    private String usuario_idusuario;

    public lista_has_usuario( int lista_idlista, String usuario_idusuario){
        this.lista_idlista= lista_idlista;
        this.usuario_idusuario= usuario_idusuario;
    }


    public int getLista_idlista(){
        return this.lista_idlista;
    }
    public String getUsuario_idusuario(){
        return this.usuario_idusuario;
    }
    

    public void setLista_idlista(int lista_idlista){
        this. lista_idlista= lista_idlista;
    }
    public void setUsurio_idusuario(String usuario_idusuario){
        this. usuario_idusuario= usuario_idusuario;
    }

    
}
