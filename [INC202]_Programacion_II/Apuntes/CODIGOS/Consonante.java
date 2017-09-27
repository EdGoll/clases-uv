public class Consonante{
    public static void main(String[] args){
        for(int i = 0; i< 20; i++){
            char c = (char)((Math.random()*26) + 97);
            System.out.print(c+ ": ");
            switch(c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                        System.out.println("vocal");
                        break;
                default: 
                        System.out.println("consonante");
            }
        }
    }
}