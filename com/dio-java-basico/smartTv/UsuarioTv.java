/**
 * <h1>UsuarioTv</h1>
 * <b>Classe desenvolvida para simular as funçoes de uma TV</b>
 * <p>
 * como a função de instanciar a classe <b>SmartTv</b> e representar a usubilidade de um <b>Usuario</b> ao utilizar uma Smart Tv
 * <p>
 * 
 * @author Bruno Carvalho
 * @version 1.0
 * @since 24/07/2024
 */
public class UsuarioTv {
    public static void main(String[] args) {

        SmartTv tv = new SmartTv();//Estanciando Tv
        System.out.println(tv.StatusTv());//Imprimido Valores

        tv.LigarTv();//Ligando Tv
        tv.TvVolumeUp();//Aumentando volume da tv
        tv.CanalUp();//Aumentando canal da tv
        System.out.println(tv.StatusTv());

        tv.CanalNumeral(25);//Adicionando canal da tv via numeral
        System.out.println(tv.StatusTv());

    }
}
