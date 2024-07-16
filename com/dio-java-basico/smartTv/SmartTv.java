/**
 * <h1>Smart Tv</h1>
 * <b>Classe desenvolvida para simular as funçoes de uma TV</b>
 * <p>
 * como a função de <b>Ligar</b> e <b>Desligar</b>
 * <p>
 * as funçoes de <b>Inserir o numero do canal desejado</b>
 * <p>
 * <b>Aumentar</b> e <b>Diminur</b> o <b>Volume o canal</b>
 * 
 * @author Bruno Carvalho
 * @version 1.0
 * @since 14/07/2024
 */
public class SmartTv {
    private boolean tvOnOff = false;
    private int canalTv = 1;
    private int volumeTv = 25;

    /**
     * Este método é utilizado para ligar e desligar tv
     * <p>
     * Achamada do método consiste em <b>Ligar</b> a Tv caso esteja
     * <b>desligada</b>,
     * E <b>Desligar</b> caso esteja <b>ligada</b>;
     * 
     * @return tvOnOff Retornado <b>true</b> para ligada e <b>false</b> para
     *         desligada
     **/
    public boolean LigarTv() {
        boolean onOff;
        onOff = (tvOnOff == false) ? true : false;
        tvOnOff = onOff;

        return tvOnOff;
    }

    /**
     * Este método é utilizado para acressentar 1 (hum) nível o volume da Tv;
     * <p>
     * O método faz a leitura do valor da vairavél <b>volumeTv</b>, e acressenta
     * mais <b>1</b> (um)
     * a o seu valor, <b>desde que</b> o valor da variavél <b>volumeTv</b> seja <b><
     * (menor)</b> que <b>50 (cinquenta)</b>, retorna o novo valor atualizado da
     * variavél <b>volumeTv</b>;
     * 
     * @param volumeTv Volume atual da tv;
     * 
     * @return Retorna o valor atualizado da variavél <b>volumeTv</b>
     *
     */
    public int TvVolumeUp() {

        if ((tvOnOff == true) && (volumeTv < 50)) {
            volumeTv++;
        } else {
            System.out.println("O volme atual é" + volumeTv);
        }
        return volumeTv;
    }

    /**
     * Este método é utilizado para subtrair 1 (hum) nível ao volume da Tv;
     * <p>
     * O método faz a leitura do valor da vairavél <b>volumeTv</b>, e subtrair
     * <b>1 (um)</b> ao seu valor, <b>desde que</b> o valor da variavél
     * <b>canalTv</b> seja <b> >=
     * (maior ou igual)</b> a <b>1 (um)</b>, <b>e</b> o valor da variavel tvOnOff
     * seja
     * <b>true</b>, retorna o novo valor atualizado da variavél <b>volumeTv</b>;
     * 
     * @param volumeTv Volume atual da tv;
     *
     * @param tvOnOff  Valor da TV <b>Ligada</b> ou <b>Desligada</b>
     * 
     * @return Retorna o valor atualizado da variavél <b>volumeTv</b>
     *
     */
    public int TvVolumeDown() {

        if ((tvOnOff == true) && (volumeTv > 1)) {
            volumeTv--;
        } else {
            System.out.println("O volme atual é" + volumeTv);
        }
        return volumeTv;
    }

    /**
     * Este método é utilizado para selecionar o canal de acordo com o valor
     * digitado para a Tv;
     * <p>
     * O método faz a leitura do valor informado na instanciação do método, e adiona
     * a variavél canalTv, <b>desde que</b> o valor da variavél <b>canalTv</b>
     * esteja entre 1 (um) e 100 (cem), ou seja, <b> > (maior) qu 1 (um) </b> e <b><
     * (menor)</b> que <b>100 (cem)</b>, retorna o novo valor atualizado da
     * variavél <b>canalTvTv</b>;
     * 
     * @param num     Recebe o valor inteiro do canal desejado;
     * 
     * @param canalTv Volume atual da tv;
     * 
     * @return Retorna o valor atualizado da variavél <b>volumeTv</b>
     *
     */
    public int CanalNumeral(int num) {

        if ((tvOnOff == true) && ((num >= 1) && (num <= 100))) {
            canalTv = num;
        } else {
            System.out.println("O canal atual é" + canalTv);
        }
        return canalTv;
    }

    /**
     * Este método é utilizado para acressentar 1 (hum) nível ao canal da Tv;
     * <p>
     * O método faz a leitura do valor da vairavél <b>canalTv</b>, e acressenta
     * mais <b>1 (um)</b> ao seu valor, <b>desde que</b> o valor da variavél
     * <b>canalTv</b> seja <b><
     * (menor)</b> que <b>100 (cem)</b>, <b>e</b> o valor da variavel tvOnOff seja
     * <b>true</b>, retorna o novo valor atualizado da variavél <b>canalTv</b>;
     * 
     * @param canalTv canal atual da tv;
     *
     * @param tvOnOff Valor da TV <b>Ligada</b> ou <b>Desligada</b>
     * 
     * @return Retorna o valor atualizado da variavél <b>canalTv</b>
     *
     */
    public int CanalUp() {

        if ((tvOnOff == true) && (canalTv < 100)) {
            canalTv++;
        } else {
            System.out.println("O canal atual é" + canalTv);
        }
        return canalTv;
    }

    /**
     * Este método é utilizado para subtrair 1 (hum) nível ao canal da Tv;
     * <p>
     * O método faz a leitura do valor da vairavél <b>canalTv</b>, e subtrair
     * mais <b>1 (um)</b> ao seu valor, <b>desde que</b> o valor da variavél
     * <b>canalTv</b> seja <b>>
     * (maior)</b> que <b>1 (um)</b>, <b>e</b> o valor da variavel tvOnOff seja
     * <b>true</b>, retorna o novo valor atualizado da variavél <b>canalTv</b>;
     * 
     * @param canalTv Canal atual da tv;
     *
     * @param tvOnOff Valor da TV <b>Ligada</b> ou <b>Desligada</b>
     * 
     * @return Retorna o valor atualizado da variavél <b>canalTv</b>
     *
     */
    public int CanalDown() {

        if ((tvOnOff == true) && (canalTv > 1)) {
            canalTv--;
        } else {
            System.out.println("O canal atual é" + canalTv);
        }
        return canalTv;
    }

    /**
     * Este método é utilizado para imprimir o <b>Status</b> atuallizado da <b>Smart
     * Tv</b>
     * 
     * @param status   Recebe uma string com uma frase contendo os valores
     *                 <b>tvOnOff</b>, <b>canalTv</b> e <b>volumeTv</b>;
     * @param tvOnOff  Valor da TV <b>Ligada</b> ou <b>Desligada</b>;
     * 
     * @param canalTv  Canal atual da tv;
     * 
     * @param volumeTv Volume atual da tv;
     * 
     * @return Retorna o Status que se encontra a Smart Tv
     */
    public String StatusTv() {

        String status = ("\nA tv está ligada? - " + tvOnOff + "\nA tv no canal ? - " + canalTv
                + "\nA tv está no volume? - " + volumeTv);

        return status;
    }
}
