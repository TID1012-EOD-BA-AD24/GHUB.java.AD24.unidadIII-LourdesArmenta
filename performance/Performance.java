package performance;

public class Performance {
    private long ti; //tiempo inicial
    private long tf; //tiempo final
    private boolean stoped = false;

    public Performance() {
        start();
    }
    public void start(){
        //tomamos la fecha y hora actual, expresada en milisegundos
        ti = System.currentTimeMillis();
        stoped = false;
    }

    public void stop(){
          //tomamos la fecha y hora actual, expresada en milisegundos
          tf = System.currentTimeMillis();
          stoped = true;
    }

    public long getMillis(){
        //retorna el tiempo en milisegundos transcurridos entre
        //las dos invocaciones a los métodos start y stop
        return tf-ti;
    }

    @Override
    public String toString() {
       if (!stoped){
        stop();
       }
       long diff = tf-ti;
       long min = diff/1000/60;
       long sec = (diff/1000) % 60;
       return diff +" milisegundos ("+min+" minutos, "+sec +" segundos)";

    }

    public long getTi() {
        return ti;
    }

    public void setTi(long ti) {
        this.ti = ti;
    }

    public long getTf() {
        return tf;
    }

    public void setTf(long tf) {
        this.tf = tf;
    }

    public boolean isStoped() {
        return stoped;
    }

    public void setStoped(boolean stoped) {
        this.stoped = stoped;
    }
    
    

    
}
