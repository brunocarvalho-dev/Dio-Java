package Apps;
/**
 * <h1>plicativo Messenger</h1>
 * Programa desenvolvido, para simular o <b>ENCAPSULAMENTO</b> e <b>ABSTRAÇÃO</b> para manter o sistema mais protegido;
 * <p>
 * <b>Private</b>: A única classe que tem acesso ao atributo é a própria classe
 * que o
 * define, ou seja, se uma classe Pessoa declara um atributo privado chamado
 * nome, somente a classe Pessoa terá acesso a ele.
 * <p>
 * <b>Default</b>: Tem acesso a um atributo default (identificado pela ausência
 * de
 * modificadores) todas as classes que estiverem no mesmo pacote que a classe
 * que possui o atributo.
 * <p>
 * <b>Protected</b>: Esse é o que pega mais gente, ele é praticamente igual ao
 * default,
 * com a diferença de que se uma classe (mesmo que esteja fora do pacote)
 * estende da classe com o atributo protected, ela terá acesso a ele. Então o
 * acesso é por pacote e por herança.
 * <p>
 * <b>Public</b>: Torna visível para todas as classes
 * <p>
 * @author BrunoCarvalho
 * @version 1.0
 * @since Codigo para aprendizado da utilização de <b>Modificadores de
 *        Acesso</b>, <b>Abstração</b> e <b>Encapsulamento</b>
 *        programa Dio - java
 */
public abstract class AplicativoMenssagem {

    //Métodos Abstratos
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //Somente os filhos conhecem este método
    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }


    /*
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem");
    }

        private void salvarHistoricoMensagem() {
        System.out.println("Salvando Histórico da mensagem");
    }
    public void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
    */
    

}
