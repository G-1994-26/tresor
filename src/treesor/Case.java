package treesor;

import java.util.ArrayList;

public class Case {

	private TypeCase type;
	
	public TypeCase getTypeCase() {
		return this.type;
	}
	
	public Case(TypeCase t) {
		this.type=t;
	}
	
	static public void main(String[] args)
	{
		ArrayList<Case> arr = new ArrayList<Case>();
//		ajout de cases à l'arr
		
//		parcour de l'arr et affichage de l'id de la case + son type
		
		arr.add(new Case (TypeCase.Eau));
		arr.add(new Case (TypeCase.Foret));
		arr.add(new Case (TypeCase.Terre));
		
		
		 System.out.println("les type de casse");
		
		 int i=1;
		 for(Case c : arr) {
			 System.out.println("Case n°"+i+" est de type "+c.getTypeCase());
			 i++;
		 }
		 
	}

}
