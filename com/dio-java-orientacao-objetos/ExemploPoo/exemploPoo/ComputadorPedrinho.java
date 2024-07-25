/**
 * <h1>Computador Pedrinho</h1>
 * Programa desenvolvido, para utilização dos metódos de <b>ABSTRAÇÃO</b>, onde um metodo
 * utilizando o <b>EXTENDS</b> para poder fazer uso dos metodos que se repentem
 * por todo o código, assim, evitando a criação de códigos repitidos, tornando o
 * programa mais eficiente e mantendo boas práticas no código, facilitando
 * futuras <b>Manutenções</b>;
 * <p>
 * <b>Abstração</b> - A abstração na POO é a capacidade de ocultar detalhes
 * irrelevantes ou complexos de um problema e focar nos aspectos essenciais. Ela
 * é implementada por meio de classes, que são modelos que descrevem os
 * atributos e comportamentos comuns de um grupo de objetos.
 * <p>
 * Com a instanciação do método filho, podemos utilizar os metodos da classe pai, neste casop <b>AplcativoMessenge</b> - (Pai), <b>Extends</b> - (filhas) <b>"FacebookMessenger", "InstagramMessenger" e "MSNMessenger"</b>;
 * 
 * @author BrunoCarvalho
 * @version 1.0
 * @since Codigo para aprendizado da utilização de <b>Modificadores de
 *        Acesso</b>,
 *        programa Dio - java
 */
public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        System.out.println("MSN Messenger\n");
        
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger faceMsg = new FacebookMessenger();
        System.out.println("\nFacebook Messenger\n");

        faceMsg.enviarMensagem();
        faceMsg.receberMensagem();

        InstagramMessenger instaMsg = new InstagramMessenger();
        System.out.println("\nInstagram Messenger\n");

        instaMsg.enviarMensagem();
        instaMsg.receberMensagem();
    }
}
