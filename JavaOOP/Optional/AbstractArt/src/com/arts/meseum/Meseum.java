package com.arts.meseum;

import java.util.ArrayList;
import java.util.Collections;

public class Meseum {

	public static void main(String[] args) {
		ArrayList<Art> museum = new ArrayList<Art> ();

		Painting p1=new Painting("title1","ayuthor1", "description1", "Oil");
		museum.add(p1);
		Painting p2=new Painting("title2","ayuthor2", "description3","Watercolor");
		museum.add(p2);
		Painting p3=new Painting("title3","ayuthor3", "description3","Acrylic");
		museum.add(p3);
		Sculpture s1=new Sculpture("title4","ayuthor4", "description4","Marble");
		museum.add(s1);
		Sculpture s2=new Sculpture("title5","ayuthor5", "description5"," Bronze");
		museum.add(s2);
    System.out.printf("PaintType of p1 is:%s,PaintType of p2 is:%s , PaintType of p3 is: %s \n",p1.getPaintType() ,p2.getPaintType() ,p3.getPaintType());
    System.out.printf("Material Type of s1 is %s ,Material Type of s2 is %s \n",s1.getMaterial() ,s2.getMaterial());
    //for(int i=0;i<museum.size();i++) {
    	
  // Art word=museum.get(i);
  // String convertedToString = String.valueOf(word);
  // if (convertedToString.indexOf("Painting")>0) {
	   
	//   System.out.println(museum.get(i));
   //}else
   // System.out.println(museum.get(i).getMaterial());
	//}
    Collections.shuffle(museum);
   for(Art museumItem : museum ) {
    	
    		
		museumItem.viewArt();
    	
    }
    

}
}