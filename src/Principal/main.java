
package Principal;

/**
 * Desafío 2, Crear un branch con el nombre feature/desafio-java-2.
 * 
 * El objetivo es repasar ciclos, dobles con vectores, máximo, mínimo, promedio. 
 * 
 * -La escuela primaria xyz solicita el desarrollo de una aplicación para poder llevar el control de notas para cada alumno.
 * -El programa solicitará el ingreso y la cantidad de alumnos a procesar.
 * -Para cada alumno se deberá ingresar los siguientes datos:
 * 
 * - nombre (string) 
 * - apellido (string)
 * - número de examen 
 * - nota que obtuvo el alumno (numérico >=0 <=10)
 * 
 * 
 * Al finalizar la carga de datos, se procederá a listar la siguiente información: 
 * 1- alumno/s con la calificación más alta 
 * 2- alumno/s con la calificación más baja 
 * 3- alumnos que promocionan, aquellos que obtuvieron un promedio >= 7 
 * 4- alumnos que deben recursar la materia, aquellos que obtuvieron un promedio < 7"
 * 
 * 
 */


public class main {

	public static void main(String[] args) {
		 
		// Creamos un Arreglo de 20 Alumnos //
		
		Alumno[] alumnos = new Alumno[7];
		
		// Cargamos el arreglo con datos del alumno) //
		
		alumnos[0] = new Alumno("Juan ", "Breciaroli ", 101, 8.2);
		alumnos[1] = new Alumno("Rodrigo ", "Martinez ", 102, 9.3);
		alumnos[2] = new Alumno("Cirstian ", "Belagardi ", 103, 10.0);
		alumnos[3] = new Alumno("Victor ", "Swisinski ", 104, 8.5);
		alumnos[4] = new Alumno("Daniel ", "Mamani ", 105, 6.5);
		alumnos[5] = new Alumno("Martin ", "Borrajo ", 106, 2.3);
		alumnos[6] = new Alumno("Mario ", "Rosas ", 107, 4.0);
		
//		String mensaje = "Hola " + alumnos[6].getNombre() + "tu nota es " + alumnos[6].getNota();
//		System.out.println( mensaje);
		
		
		// Acceso a los datos del arreglo //
		
		
		
		for(int i = 0; i < alumnos.length; i++)
		{
			System.out.println(alumnos[i].getNombre() + alumnos[i].getApellido() + " - N° Examen: " + alumnos[i].getNroExamen() + " - Nota: " + alumnos[i].getNota());
			

		}
		
		
		
	// Alumnos con la calificacion mas alta //
		
		
		Alumno alumnoConMejorNota = alumnos[0];
		
		for(int i = 0; i < alumnos.length; i++)
		{
			if(alumnos[i].getNota() > alumnoConMejorNota.getNota())
			{
				alumnoConMejorNota = alumnos[i];
			}
		}
		
		System.out.println("\nEl alumno Con la mejor Nota es : " + alumnoConMejorNota.getNombre() + alumnoConMejorNota.getApellido() + ", con nota: " + alumnoConMejorNota.getNota());
		
		
	// Alumnos Con la calificacion mas baja
		
		Alumno alumnoConMasBajaNota = alumnos[0];
		
		for(int i = 0; i < alumnos.length; i++)
		{
		
			if(alumnos[i].getNota() < alumnoConMasBajaNota.getNota())
			{
				alumnoConMasBajaNota = alumnos[i];
			}
		}
		
		System.out.println("El alumno con la nota Mas Baja es: " + alumnoConMasBajaNota.getNombre() + alumnoConMasBajaNota.getApellido() + ", con nota: " + alumnoConMasBajaNota.getNota());
		
		System.out.println("\n");
		
		
		
		
		// Alumnos que promocionan con promedio >= 7  
		
		
		System.out.println("\n Los Alumnos que PROMOCIONAN son: ");
		
		for(int i = 0; i < alumnos.length; i++)
		{
			if(alumnos[i].getNota() >= 7)
			{
				System.out.println(alumnos[i].getNombre() + alumnos[i].getApellido());
			}
			
		}
		
		
		
		
		// los que deben recursar la materia con < 7 
		
		
		System.out.println("\n Los Alumnos que RECURSAN son: ");
		
		for(int i = 0; i < alumnos.length; i++)
		{
			if(alumnos[i].getNota() < 7)
			{
				System.out.println( alumnos[i].getNombre() + alumnos[i].getApellido());
			}
		}
		
		
		
		
		
			
	}

}
