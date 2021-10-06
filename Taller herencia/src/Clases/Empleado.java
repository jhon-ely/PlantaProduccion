package Clases;

public class Empleado {
	//atributos
private String id;
private String nombre; 
private String direccion;
private String celular;
private String correo;
private int salario;
private String fechaIngreso;
private String fechaCumpleAños;
private int liqNomina;
private int liqVacas;


private int edad;

	//metodo constructor
	public Empleado (String id, String nombre, String direccion,String celular, int salario,String fechaIngreso,String fechaCumpleAños,int liqNomina,int liqVacas ) 
	{
	this.id=id;
	this.nombre=nombre;
	this.direccion=direccion;
	this.celular=celular;
	this.salario=salario;
	this.fechaIngreso=fechaIngreso;
	this.fechaCumpleAños=fechaCumpleAños;
	this.liqNomina=liqNomina;
	this.liqVacas=liqVacas;
	}
	//-----------------------------------------------
//	aqui se pondrian los metodos gets para cada variable
	//-----------------------------------------------
	
	public void consultarliqNomina() 
	{
	System.out.println("Estoy consultando liquidacion de nomina");
	}
	
	public void consultarliqVacas() 
	{
	System.out.println("Estoy consultando liquidacion de Vacaciones");
	}
	
	//------------------------------------------
	public void consultarDatosPersonales() 
	{
	System.out.println("Estoy consultando datos personales");
	}
	
	public void ActualizarDatosPersonales() 
	{
	System.out.println("Estoy Actualizando datos personales");
	}
	
	
}

