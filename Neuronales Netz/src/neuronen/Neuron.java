package neuronen;

import activateFunctions.ActivateFunction;
import activateFunctions.Identity;



public abstract class Neuron {
    
    private float value;
    
    
    public float getValue() {
        return value;
    }

    
    public void setValue(float value) {
        this.value = value;
    }

    float activate(float x)
    {
        Identity id = new Identity();
        return id.activateFunction(x);
    }
    
    

}
