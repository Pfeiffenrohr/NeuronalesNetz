package neuronen;


public class Connection {
    
   private float weight ;
   private  Neuron before;
   private  Neuron next;
   
   public Connection() {
       float weight = (float) Math.random();
       this.weight=weight;
   }
   
public float getWeight() {
    return weight;
}

public void setWeight(float weight) {
    this.weight = weight;
}

public Neuron getBefore() {
    return before;
}

public void setBefore(Neuron before) {
    this.before = before;
}

public Neuron getNext() {
    return next;
}

public void setNext(Neuron next) {
    this.next = next;
}

        
}
