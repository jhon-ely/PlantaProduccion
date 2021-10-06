package Clases;

public class Operativo extends Empleado{

private String cursosRealizados;
private String UbicacionZonaDeTrabajo;
private String oficio;
private String extencion;
private String descripcionLabor;


	
	public Operativo (String id, String nombre, String direccion,String celular, int salario,String fechaIngreso,String fechaCumpleAños,int liqNomina,int liqVacas) {
	
	super(id,nombre,direccion,celular,salario,fechaIngreso,fechaCumpleAños,liqNomina,liqVacas);
	
	this.cursosRealizados=cursosRealizados;
	this.UbicacionZonaDeTrabajo=UbicacionZonaDeTrabajo;
	this.oficio=oficio;
	this.extencion=extencion;
	this.descripcionLabor=descripcionLabor;
		
	}
	//---------------------------------------------
//	aqui se pondrian los metodos gets para cada variable
	//---------------------------------------------
	
	public void ActualizarDescripcionLabor() 
	{
	System.out.println("Estoy Actualizando la descripcion de labor");
	}
	
	
	
	
}	