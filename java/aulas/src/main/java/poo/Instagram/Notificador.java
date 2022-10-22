package poo.Instagram;

//INTERFACE
public interface Notificador {
    //METODO
   void Notificar(String msg);


}

//CLASSE
class EmailNotificador implements Notificador{
    //ATRIBUTO DA CLASSE
    private String email;

    //CONSTRUTOR DA CLASSE
    EmailNotificador(String emailDoUsuario){
        this.email = emailDoUsuario;
    }

    //SOBRESCRITA DO METODO DA INTERFACE
    @Override
    public void Notificar(String msg){
        System.out.println("O USUARIO RECEBEU A MENSAGEM:\n" + msg + "\nAtravés do email\n" + this.email);
    }

    //CRIACAO METODOS ESPECIAIS
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class TelefoneNotificador implements Notificador{
    private String numero;


    public TelefoneNotificador(String numeroDoUsuario) {
        this.numero = numeroDoUsuario;
    }
    @Override
    public void Notificar(String msg){
        System.out.println("O USUARIO RECEBEU A MENSAGEM:\n" + msg + "\nAtravés do número de telefone\n" + this.numero);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}

class InstagramNotificador implements Notificador{
    private String nomeUsuario;

   public InstagramNotificador(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }

    @Override
    public void Notificar(String msg){
       System.out.println("O USUARIO RECEBEU A MENSAGEM:\n" + msg + "\nAtravés do Instagram\n" + this.nomeUsuario);
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public static void main (String[] args){

       EmailNotificador ClienteNotificado1 = new EmailNotificador("fernando@gmail.com");
       ClienteNotificado1.Notificar("SEJA BEM-VINDO ");
        System.out.println("\n========================================================\n");

        TelefoneNotificador ClienteNotificado2 = new TelefoneNotificador("824546555");
        ClienteNotificado2.Notificar("POR FAVOR, INSIRA O CÓDIGO ABAIXO");
        System.out.println("\n========================================================\n");

        InstagramNotificador ClienteNotificado3 = new InstagramNotificador("mariiliasantos");
        ClienteNotificado3.Notificar("SEJA BEM VINDO A SUA CONTA DO INSTAGRAM ");


    }
}


