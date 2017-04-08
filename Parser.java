import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Parser<T> extends Actor
{
    private String parsedData;	
	private String datosDeJuego;
	
	public Parser(DoubleLinkedList<T> list) 
	{
		parsedData = parser(list);
	}
	
	private String parser(DoubleLinkedList<T> list){
		datosDeJuego = list.toString();
		return datosDeJuego;
	}
	
	public String getParsedData(){
		return parsedData;
	}
}
