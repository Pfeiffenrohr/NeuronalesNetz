package neuronen;

import java.util.ArrayList;
import java.util.List;

public class Netz {
    
    private List  <InputNeuron> inputs = new ArrayList <InputNeuron>();
    private List <OutputNeuron> outputs = new ArrayList < OutputNeuron>();
    private List <Connection> connections = new ArrayList < Connection>();
    
    
    public List<InputNeuron> getInputs() {
        return inputs;
    }

    
    public void setInputs(List<InputNeuron> inputs) {
        this.inputs = inputs;
    }

    
    public List<OutputNeuron> getOutputs() {
        return outputs;
    }

    
    public void setOutputs(List<OutputNeuron> outputs) {
        this.outputs = outputs;
    }

  
    
    public void createInputNeurons(int anz ) {
        
        System.out.println("Create Input Neurons ..");
        for (int i= 0; i< anz; i++)
        {
            Neuron neu= new InputNeuron();
            inputs.add((InputNeuron) neu);
        }
        System.out.println(anz + " Inputs Created");
    }
    
 public void setInputValues(float ...values ) {
        
           //System.out.println("Set inputValues ..");
           for (int i=0; i<inputs.size(); i++)
           {            
               ((InputNeuron)inputs.get(i)).setValue(values[i]);
           }
        
 }
    
    public void createOutputNeurons(int anz ) {
        
        System.out.println("Create  Output Neurons ..");
        for (int i= 0; i< anz; i++)
        {
            Neuron neu= new OutputNeuron();
            outputs.add((OutputNeuron) neu);
        }
        System.out.println(anz + " Outputs Created");
    }
    
    public void createFullMesh() {
         
        //Alle Verbindungen zwischen allen inouts und allen Outputs
        System.out.println("Create all connections ..");
        for ( int i=0; i< inputs.size(); i++ ) {
            for (int j=0;j< outputs.size(); j++) {
                Connection con = new Connection();
                con.setBefore((Neuron)inputs.get(i));
                con.setNext((Neuron)outputs.get(j));
                ((OutputNeuron)outputs.get(j)).addConnection(con);             
                connections.add(con);
            }

        }
        System.out.println("Created " + connections.size() + " connections");
    }
    
    public void computeOutputs()
    {
        for (int i=0; i<outputs.size();i++)
        {
            ((OutputNeuron)outputs.get(i)).coputeOutput();
        }
    }
    
    
    public void writeOutputs()
    {
        //System.out.println("Output von Neuron ");
        for (int i=0; i<outputs.size();i++)
        {
           System.out.print(" "+((OutputNeuron)outputs.get(i)).getValue());
        }
        System.out.println();
    }
    
    public void changeWeights( float ... soll)
    {
        for (int i=0; i<outputs.size();i++)
        {
            ((OutputNeuron)outputs.get(i)).changeWeights(soll[i]);
        }
    }
    
}
