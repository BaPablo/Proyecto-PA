/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package orm;

public class Ramadeportiva {
	public Ramadeportiva() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_RAMADEPORTIVA_ALUMNO_IDALUMNO) {
			return ORM_alumno_idAlumno;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idRamaDeportiva;
	
	private String nombre;
	
	private java.util.Date fechaIngreso;
	
	private String profesorEncargado;
	
	private String descripcion;
	
	private java.util.Date fechaSaida;
	
	private java.util.Set ORM_alumno_idAlumno = new java.util.HashSet();
	
	private void setIdRamaDeportiva(int value) {
		this.idRamaDeportiva = value;
	}
	
	public int getIdRamaDeportiva() {
		return idRamaDeportiva;
	}
	
	public int getORMID() {
		return getIdRamaDeportiva();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setFechaIngreso(java.util.Date value) {
		this.fechaIngreso = value;
	}
	
	public java.util.Date getFechaIngreso() {
		return fechaIngreso;
	}
	
	public void setProfesorEncargado(String value) {
		this.profesorEncargado = value;
	}
	
	public String getProfesorEncargado() {
		return profesorEncargado;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setFechaSaida(java.util.Date value) {
		this.fechaSaida = value;
	}
	
	public java.util.Date getFechaSaida() {
		return fechaSaida;
	}
	
	private void setORM_Alumno_idAlumno(java.util.Set value) {
		this.ORM_alumno_idAlumno = value;
	}
	
	private java.util.Set getORM_Alumno_idAlumno() {
		return ORM_alumno_idAlumno;
	}
	
	public final orm.AlumnoSetCollection alumno_idAlumno = new orm.AlumnoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_RAMADEPORTIVA_ALUMNO_IDALUMNO, orm.ORMConstants.KEY_ALUMNO_RAMADEPORTIVA_IDRAMADEPORTIVA, orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdRamaDeportiva());
	}
	
}
