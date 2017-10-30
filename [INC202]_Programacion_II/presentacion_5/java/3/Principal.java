public class Principal {

    public static void main(String[] args) {

        CuentaCorriente cc = new CuentaCorriente();

        ThreadCuentaCorrienteDepositar tccd = new ThreadCuentaCorrienteDepositar(cc);
        ThreadCuentaCorrienteGirar tccg = new ThreadCuentaCorrienteGirar(cc);

        tccd.start();
        tccg.start();


    }
}
