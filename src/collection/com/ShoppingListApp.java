package collection.com;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {

	  public static void main(String[] args) {
	        List<String> shoppingList = new ArrayList<>();
	        
	        shoppingList.add("Pommes");
	        shoppingList.add("Lait");
	        shoppingList.add("Pain");
	        
	        System.out.println("Articles de la liste :");
	        for (String item : shoppingList) {
	            System.out.println("- " + item);
	        }
	    //remove un article
	  
	  shoppingList.remove("Pain");
	  System.out.println("article apres la supression");
	  for (String item : shoppingList) {
          System.out.println("- " + item);
      }
	  
	  //verification d exestence d un article
  
	  boolean hasApples = shoppingList.contains("Pommes");
	  System.out.println("Contient des pommes ? " + hasApples);
	  
	  boolean hasPains = shoppingList.contains("Pain");
	  System.out.println("Contient le pain ? " + hasPains);

	  System.out.println("Taille finale de la liste : " + shoppingList.size());
	
}
}
