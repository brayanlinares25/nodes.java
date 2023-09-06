public class correo{
    private String idcorreo;
    private String correo;
    private String usuario_idusuario;

    public correo(String idcorreo, String correo, String usuario_idusuario){
        this.idcorreo = idcorreo;
        this.correo = correo;
        this.usuario_idusuario= usuario_idusuario;
    }

        public String getIdcorreo(){
            return this.idcorreo;
        }
        public String getCorreo(){
            return this.correo;
        }
        public String getUsuario_idusuario(){
            return this.usuario_idusuario;
        }

        
        public void setIdcorreo(String idcorreo){
            this.idcorreo= idcorreo;
        }
        public void setCorreo(String correo){
            this.correo= correo;
        }
        public void setUsurio_idusuario(String usuario_idusuario){
            this.usuario_idusuario= usuario_idusuario;
        }
        
    }


