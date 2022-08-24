package Unidad_8;

public enum Libro {

	JHTP	  ("Java How to Program" 						  ,"2015"),
	CHTP	  ("C How to Program"							  ,"2013"),
	IW3HTP	  ("Internet & World Wide Web How to Program"     ,"2012"),
	CPPHTP	  ("C++ How to Program"					          ,"2014"),
	VBHTP	  ("Visual Basic How to Program"				  ,"2014"),
	CSHARPHTP ("Visual C# How to Program"			  	      ,"2014");
	
	private final String titulo;
	private final String anioCopyRight;
	
	Libro(String titulo, String anioCopyright){
		this.titulo = titulo;
		this.anioCopyRight=anioCopyright;
	}
	
	//solo metodos getters.
	public String getTitulo() {
		return titulo;
	}
	
	public String getAnioCopyRight() {
		return anioCopyRight;
	}
	
	
}
