package org.saurav.patterns.behavioural;
/**
 * Example class to show the template method pattern.
 * Construction of a flat according to different types like 1BHK, 2BHK , 3BHK, 3BHK premium
 * can be done in a template method pattern
 * @author Saurav Sarkar
 *
 */
public class TemplateMethodPattern {
	
	public static void main(String[] args){
		Flat dbf = new DoubleBedroomFlat();
		Flat tbf = new TripleBedroomFlat();
		dbf.makeFlat();
		tbf.makeFlat();
	}

}


abstract class Flat{
	
	public void makeFlat(){
		//initialize the flat
		intializeLayout();
		extraFinishings();
	}
	
	//Template method
	abstract void intializeLayout();
	//Template method
	abstract void extraFinishings();
	
}

class DoubleBedroomFlat extends Flat{

	@Override
	void intializeLayout() {
		
		System.out.println("Intializing layout for double bedroom flat \n");
		
	}

	@Override
	void extraFinishings() {
		
		System.out.println("Adding extra finishing for double bedroom flat \n");
	}
	
}


class TripleBedroomFlat extends Flat{

	@Override
	void intializeLayout() {

		System.out.println("Intializing layout for triple bedroom flat \n");
		
	}

	@Override
	void extraFinishings() {
		
		System.out.println("Adding extra finishing for triple bedroom flat \n");
	}
	
}

 