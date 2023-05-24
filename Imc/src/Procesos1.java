import java.awt.JobAttributes;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos1 {
	ArrayList<String>nombres;
	ArrayList<String>telefono;
	ArrayList<Double>imc;
	ArrayList<String>resultado;
	double peso;
	double talla;
	double imci;
	 
	
	
public Procesos1() {
		

		
		nombres=new ArrayList<String>();
		telefono=new ArrayList<String>();	
		resultado=new ArrayList<String>();
		imc=new ArrayList<Double>();
		iniciar();
		
	}
	
	
private void iniciar() {
	 
		int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas"));
		for(int i=0; i<cant;i++) {
			ingresardatos();
		}
		
	
		int cod=0;
		
		do {
			
			validaropc(cod);
			
		}while(cod !=6);
		
	}
	
	
	
	
private void validaropc(int cod) {

		String menu="MENU\n";
	menu+="1. Registar otra persona\n";
	menu+="2. Buscar persona\n";
	menu+="3. Imprimir lista\n";
	menu+="4. Actualizar persona\n";
	menu+="5. Eliminar persona\n";
	menu+="6. Salir\n";
		
		cod=Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		switch (cod) {
	case 1: 
			ingresardatos();
		break;
		
	case 2: buscarpersona();
		break;
		
	case 3: imprimmirlista();
		break;
		
	case 4: actualizarPersona();
		break;
		
	case 5: ElimiarPersona();
		break;
		
	case 6:	JOptionPane.showMessageDialog(null, "gracias por usar este programa");
		break;
		default:
			System.out.println("No existe el código!");
			break;
	}
}
	
	
	
	
private void ElimiarPersona() {
	String resp="";
	do {
		
	String nom=JOptionPane.showInputDialog("ingrese el nombre a eliminar");
	if(nombres.contains(nom)) {
		int pos=nombres.indexOf(nom);
		string msj="";
		for(int i=0;i<nombres.size();i++) {
if(nombre.get(i).equalsIgnoreCase(nom)) {
			msj+="el nombre "+nom+ " se encontro en la poscicion: "+ pos
					+ "  ingrese una de las posiciones que desea eliminar";
			
}

		nombres.remove (pos);
		telefono.remove(pos);
		imc.remove(pos);
		resultado.remove(pos);
		System.out.println("la persona : "+ nom + " se ha eliminado " );
		}
		}
	else {
		System.out.println("el nombre "+nom+" no se encontro");
	}
	
	
	resp=JOptionPane.showInputDialog("si desea eliminar otra persoan ig si");
	}while(resp.equalsIgnoreCase("si"));
		
}



private void actualizarPersona() {
	String resp="";
	do{
		
		String nom=JOptionPane.showInputDialog("ingrese el nombre a actualizar");
		
		if (nombres.contains(nom)) {
			for(int i=0;i<nombres.size();i++) {
			int pos=nombres.indexOf(nom);
			String nomb=JOptionPane.showInputDialog("ingrese el nuevo nombre ");
			nombres.set(pos, nomb);
			
			System.out.println("la persona : "+ nom + " se ha actualizado   " );
			
			
		}}
		else {
			System.out.println("el nombre "+nom+" no se encontro");
		}
		
		
		resp=JOptionPane.showInputDialog("si desea actualizar otra persoan ig si");

    }while(resp.equalsIgnoreCase("si"));
    		
    		
    		
    		
	}
	



public void ingresardatos(){
		
		   nombres.add( JOptionPane.showInputDialog("Ingrese el nombre  "));
           telefono.add(  JOptionPane.showInputDialog("Ingrese el telefono  "));
           do {
           peso=Double.parseDouble(JOptionPane.showInputDialog("ingrese el peso"));
           }while(peso<0 || peso>300);
           do {
           talla=Double.parseDouble(JOptionPane.showInputDialog("ingrese la talla"));
           }while(talla<0 || talla>2.00);
           
           calcularesultadoIMC();
           
	}
	
	
	
private void imprimmirlista() {
		  for(int i=0;i< nombres.size();i++) {
		   System.out.println("telefono: "
		  +telefono.get(i)
		  +" \n nombre: "+nombres.get(i)
		  +" \n imc: "+imc.get(i)
		  + "\n su resultado es: "
		  + resultado.get(i));
		
	}
}
	
	
	
	
private void calcularesultadoIMC() {
		  imci=peso/(talla*talla);
          imc.add(imci);
          String result = "";
         
          if(imci<18) {
      	   result=("anorexia");
         }
         
         else if(imci>=18 && imci<20) {
      	   result=("Delgadez");
         }
         
         else if(imci>=20 && imci<27) {
      	   result=("Normalidad");
         }
         
         else if(imci>=27 && imci<30) {
      	   result=("Obesidad (grado 1)");
         }
         
         else if(imci>=30 && imci<35) {
      	   result=("Obesidad (grado 2)");
         }
         
         else if(imci>=35 && imci<40) {
      	   result=("Obesidad (grado 3)");
         }
         
         else if(imci>=40 ) {
      	   result=("Obesidad morbida");
         }
         resultado.add(result);
         
		}

	
	
	
private void buscarpersona() {
		
		
		String resp="";
	do{
		
		String nom=JOptionPane.showInputDialog("ingrese el nombre a buscar");
		
		if (nombres.contains(nom)) {
			for(int i=0;i<nombres.size();i++) {
			int pos=nombres.indexOf(nom);
			System.out.println("la persona : "+ nom + " tiene: "+ resultado.get(i) );}
		}
		else {
			System.out.println("el nombre "+nom+" no se encontro");
		}
		
		
		resp=JOptionPane.showInputDialog("si desea consultar otra persoan ig si");

    }while(resp.equalsIgnoreCase("si"));
    		
    		
    		
    		
	}
}