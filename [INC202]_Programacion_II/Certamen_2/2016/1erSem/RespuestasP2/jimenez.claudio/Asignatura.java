
public class Asignatura {
    public double promuno,promdos,pc,pt,p,pq,nq,nt,nc;
    
    
    public double pcpromedio(){
        pc=((nc+nc+nc)/2)*(nc+nc+nc+1);
        return pc;
    }
    public double ptpromedio(){
        pt=((nt+nt+nt)/2)*(nt+nt+nt+1);
        return pt;
    }
    public double pqpromedio(){
        pq=((nq+nq+nq)/2)*(nq+nq+nq+1);
        return pq;
    }
    
    
    public double promedios(){
        if(pc>=4.0){
            double val=pc*0.7+nq+0.15+nt*0.15;
            return val;
        }
        else if(pc>=3.5){
            double val = pc*0.8+nq*0.10+nt*0.10;
            return val;
        }
        else if(pc>=3.0){
            double val = pc*0.9+nq*0.10+nt*0.10;
            return val;
        }
        return 0;
    }
    
}
