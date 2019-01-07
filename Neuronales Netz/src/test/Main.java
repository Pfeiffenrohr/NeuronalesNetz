package test;

import neuronen.Netz;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		float inputs [][] = {{1.0f,30,20},{1.0f,40,30},{1.0f,50,60}}; 
		
		Netz netz = new Netz();
		netz.createInputNeurons(3);
		netz.createOutputNeurons(2);
		netz.createFullMesh();
		
		for (int i=0;i<20;i++) {
			for (int j=0;j<2;j++) {
		    netz.setInputValues(inputs[j]);
		    netz.computeOutputs();
		    netz.changeWeights(10.0f,5.0f);
		    netz.writeOutputs();
			}
		}

	}

}
