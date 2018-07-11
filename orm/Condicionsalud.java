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

public class Condicionsalud {
	public Condicionsalud() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_CONDICIONSALUD_ALUMNO_IDALUMNO) {
			return ORM_alumno_idAlumno;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idCondicionSalud;
	
	private String nombre;
	
	private String descripcion;
	
	private java.sql.Timestamp fechaInicio;
	
	private java.util.Date fechaTermino;
	
	private java.util.Set ORM_alumno_idAlumno = new java.util.HashSet();
	
	private void setIdCondicionSalud(int value) {
		this.idCondicionSalud = value;
	}
	
	public int getIdCondicionSalud() {
		return idCondicionSalud;
	}
	
	public int getORMID() {
		return getIdCondicionSalud();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setFechaInicio(java.sql.Timestamp value) {
		this.fechaInicio = value;
	}
	
	public java.sql.Timestamp getFechaInicio() {
		return fechaInicio;
	}
	
	public void setFechaTermino(java.util.Date value) {
		this.fechaTermino = value;
	}
	
	public java.util.Date getFechaTermino() {
		return fechaTermino;
	}
	
	private void setORM_Alumno_idAlumno(java.util.Set value) {
		this.ORM_alumno_idAlumno = value;
	}
	
	private java.util.Set getORM_Alumno_idAlumno() {
		return ORM_alumno_idAlumno;
	}
	
	public final orm.AlumnoSetCollection alumno_idAlumno = new orm.AlumnoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CONDICIONSALUD_ALUMNO_IDALUMNO, orm.ORMConstants.KEY_ALUMNO_CONDICIONSALUD_IDCONDICIONSALUD, orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdCondicionSalud());
	}
	
}
