package neuronen;

import java.util.ArrayList;
import java.util.List;

public class OutputNeuron extends Neuron {
    
    private List  <Connection> connections = new ArrayList <Connection>();
    
  public void addConnection (Connection con)
{
      connections.add(con);
}

public void coputeOutput() {
     float sum=(float) 0.0;
     for (int i=0; i< connections.size(); i++) {
         float input = ((Neuron)((Connection)connections.get(i)).getBefore()).getValue(); 
         sum +=((Connection)connections.get(i)).getWeight() * input;
     }
     setValue(activate(sum));        
 }

public void changeWeights( float soll )
{
    float delta = soll - getValue();
    //System.out.println("Delta = " + delta);
    for (int i=0; i< connections.size(); i++) {
        float oldweight=((Connection)connections.get(i)).getWeight();
        ((Connection)connections.get(i)).setWeight(oldweight + ( 0.001f* delta ));
        //System.out.println("Anpassung = "+ (( 0.01f* delta )));
    }
}


}
