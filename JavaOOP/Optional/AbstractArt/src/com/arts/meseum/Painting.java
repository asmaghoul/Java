package com.arts.meseum;

public class Painting extends Art {
	//member variable
		private String paintType;
	//constructor
		public Painting( String title, String author, String description,String paintType) {
			super(title, author, description);
			this.paintType=paintType;
		}
    // Getter and Setter
	public String getPaintType() {
			return paintType;
		}

	public void setPaintType(String paintType) {
			this.paintType = paintType;
		}

	@Override
	public void viewArt() {
		System.out.println("Painting Art has painting type : "+paintType+",title "+getTitle()+", author "+getAuthor()+", description "+getDescription());
		
	}

}
