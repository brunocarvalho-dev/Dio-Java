public class ParametrosInvalidosException extends Exception {
    private int num1;
    private int num2;
    private String menssagm;

    public ParametrosInvalidosException(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setMenssagm() {
        if (this.num1 > this.num2) {
            this.menssagm = "O segundo número (" + this.num2 + ") não pode ser menor que o primeiro (" + this.num1 + ") !!!";
        } else {
            this.menssagm = "Error!!!!!\nParametro desconhecido, contactar o desemvolvedor!";
        }
    }

    public String Menssagem() {
        setMenssagm();
        return menssagm;
    }
}
