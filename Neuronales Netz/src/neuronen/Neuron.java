package neuronen;

import activateFunctions.ActivateFunction;
import activateFunctions.Identity;


public abstract class Neuron {
    
    float activate(float x)
    {
        Identity id = new Identity();
        return id.activateFunction(x);
    }
    
    

}
