package Clases;



public class Administrativo extends Empleado{

private String titulosProfecionales;
private int a�osExperiencia;
private int nPersonasACargo;
private String extencion;
private int nExtencion;


	
	public Administrativo (String id, String nombre, String direccion,String celular, int salario,String fechaIngreso,String fechaCumpleA�os,int liqNomina,int liqVacas) {
	
	super(id,nombre,direccion,celular,salario,fechaIngreso,fechaCumpleA�os,liqNomina,liqVacas);
	
	this.titulosProfecionales=titulosProfecionales;
	this.a�osExperiencia=a�osExperiencia;
	this.nPersonasACargo=nPersonasACargo;
	this.extencion=extencion;
	this.nExtencion=nExtencion;
		
	}
	//---------------------------------------------
//	aqui se pondrian los metodos gets para cada variable
	//---------------------------------------------
	
	public void consultarTitulos() 
	{
	System.out.println("Estoy consultando titulos");
	}
	
	public void ModificarTitulos() 
	{
	System.out.println("Estoy modificando titulos");
	}
	
	public void GenerarInformeDePlanta() 
	{
	System.out.println("Estoy generando informe de planta");
	}
	
	
}	