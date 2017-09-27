
import javax.swing.JButton;
/*
 * @author andreszapata
 */
public class Boton extends JButton{
    int id;
    
    public Boton(String x,int id){
        super(x);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
