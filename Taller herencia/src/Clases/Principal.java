package Clases;
import java.util.Scanner;

public class Principal {
	static int OpcionUsuario = -1;                                     
    static Scanner scanner = new Scanner(System.in); 

	public static void main(String[] args) {
	    
		Administrativo administrativo = new Administrativo (null, null, null, null, 0, null, null, 0, 0);
        Operativo operativo=new Operativo(null, null, null, null, 0, null, null, 0, 0);
        Tecnico tecnico=new Tecnico(null, null, null, null, 0, null, null, 0, 0);
        NoTecnico noTecnico = new NoTecnico(null, null, null, null, 0, null, null, 0, 0);
        //------------------------------------------------------------------------------------
        while (OpcionUsuario != 0)
        {
            try{
                System.out.println("***   PLANTA DE PRODUCCION ***\n");
                System.out.println("     .:: MENU PRINCIPAL ::.   \n");
                System.out.println("1. Operativos.                      ");
                System.out.println("2. Administrativos.              ");            
                System.out.println("3. Tecnicos.                     ");
                System.out.println("4. No Tecnicos.                      ");
                System.out.println("0. Salir                      \n");
                System.out.print("Señor usuario, elige opción: _    ");
                OpcionUsuario = Integer.parseInt(scanner.nextLine()); 
                
                switch(OpcionUsuario)
                {
                    case 1: 
                        
                    	//funciones heredadas de Empleado a Operativo
                    	operativo.consultarliqNomina();
                    	operativo.consultarliqVacas();
                    	operativo.consultarDatosPersonales();
                    	operativo.ActualizarDatosPersonales();
                    	//funciones propias de operativo
                    	operativo.ActualizarDescripcionLabor();              	
                        break;
                    case 2: 
                        //funciones heredadas de Empleado a Administrativo
                    	 administrativo.consultarliqNomina();
                    	 administrativo.consultarliqVacas();
                    	 administrativo.consultarDatosPersonales();
                    	 administrativo.ActualizarDatosPersonales();                	
                    	//Funciones propias de administrativo
                    	 administrativo.consultarTitulos();
                    	 administrativo.ModificarTitulos();
                    	 administrativo.GenerarInformeDePlanta();
                        break;
                    case 3: 
                        //Funciones heredadas de Operativo a Tecnico
                    	tecnico.ActualizarDescripcionLabor();
                    	 //Funciones propias de Tecnico
                    	//no  posee funciones propias
                        break;
                    case 4: 
                    	//Funciones heredadas de Operativo a NoTecnico
                    	noTecnico.ActualizarDescripcionLabor();
                    	 //Funciones propias de NoTecnico
                    	//no  posee funciones propias
                        break;
                    case 0: 
                        System.out.println("Adios!");
                        break;
                    default:
                        System.out.println("Opción no reconocida");break;
                }
                System.out.println("\n"); 
            }
            catch(Exception e){
                System.out.println("Uoop! Error!");
            }
        }
    } 
        
        
        
        
        
        
        
        
        
        //------------------------------------------------------------------------------------
	}


