package Principal;

public class Alumno {

	// ATRIBUTOS //
	
		private String nombre;
		private String apellido;
		private Integer nroExamen;
		private Double nota;
		
		
		//METODOS//
		
		public Alumno(String nombre, String apellido, Integer nroExamen, Double nota)
		{
			this.nombre = nombre;
			this.apellido = apellido;
			this.nroExamen = nroExamen;
			this.nota = nota;
		}
		
		// getter y setter//
		
		// GET //
		
		
		public String getNombre()
		{
			return nombre;
		}
		
		public String getApellido()
		{
			return apellido;
		}
		
		public Integer getNroExamen() 
		{
			return nroExamen;
		}
		
		public Double getNota() 
		{
			return nota;
		}
		
		
		// SET //
		
		public void setNombre(String nombre) 
		{	
			this.nombre = nombre;
		}
		
		public void setApellido(String apellido)
		{
			this.apellido = apellido;
		}
		
		public void setNroExamen(Integer nroExamen)
		{
			this.nroExamen = nroExamen;
		}
		
		public void setNota(Double nota)
		{
			this.nota = nota;
		}
	

}
