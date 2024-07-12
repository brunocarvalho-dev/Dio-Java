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
