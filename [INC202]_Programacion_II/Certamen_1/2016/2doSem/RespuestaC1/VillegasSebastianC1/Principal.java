public class Principal
{
    public static void main(String[] args)
    {
        Liga l = new Liga();
        l.ligaGen();
        System.out.println("---Octavos de final---\n");
        l.playLiga();
        System.out.println("\n---Cuartos de final---\n");
        l.playLiga();
        System.out.println("\n---Semifinal---\n");
        l.playLiga();
        System.out.println("\n---Final---\n");
        l.playLiga();
    }
}
