public class RankingMain {
    
    
    
    public static void main(String args[]){
        RankingImp R=new RankingImp();
        R.cantidadTorneos();
        R.representanteVregion();
        R.jugadorMenor();
        R.jugadorSub();
        R.jugadorInfo();


        System.out.println(R.jugadorInfo());
        System.out.println(R.jugadorSub());
        System.out.println(R.jugadorMenor());
        System.out.println(R.cantidadTorneos());
        System.out.println(R.representanteVregion());
    }
}