public class SmartTv {
    private boolean tvOnOff = false;
    private int canalTv = 1;
    private int volumeTv = 25;

    //ligar e desligar tv
    public boolean LigarTv() {
        boolean onOff;
        onOff = (tvOnOff == false) ? true : false;
        tvOnOff = onOff;

        return tvOnOff;
    }

    public int TvVolumeUp() {

        if ((tvOnOff == true) && (volumeTv < 50)) {
            volumeTv++;
        } else {
            System.out.println("O volme atual é" + volumeTv);
        }
        return volumeTv;
    }

    public int TvVolumeDown() {

        if ((tvOnOff == true) && (volumeTv > 1)) {
            volumeTv--;
        } else {
            System.out.println("O volme atual é" + volumeTv);
        }
        return volumeTv;
    }

    public int CanalNumeral(int num) {

        if ((tvOnOff == true) && ((num >= 1) && (num <= 100))) {
            canalTv = num;
        } else {
            System.out.println("O canal atual é" + canalTv);
        }
        return canalTv;
    }

    public int CanalUp() {

        if ((tvOnOff == true) && (canalTv < 100)) {
            canalTv++;
        } else {
            System.out.println("O canal atual é" + canalTv);
        }
        return canalTv;
    }

    public int CanalDown() {

        if ((tvOnOff == true) && (canalTv > 1)) {
            canalTv--;
        } else {
            System.out.println("O canal atual é" + canalTv);
        }
        return canalTv;
    }

    public String StatusTv (){

        String status = ("\nA tv está ligada? - " + tvOnOff + "\nA tv no canal ? - " + canalTv  +"\nA tv está no volume? - " + volumeTv);

        return status;
    }
}
