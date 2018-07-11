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

import java.io.Serializable;
public class Asistencia implements Serializable {
	public Asistencia() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Asistencia))
			return false;
		Asistencia asistencia = (Asistencia)aObj;
		if (getIdAsistencia() != asistencia.getIdAsistencia())
			return false;
		if (getAlumno_idAlumno() == null) {
			if (asistencia.getAlumno_idAlumno() != null)
				return false;
		}
		else if (!getAlumno_idAlumno().equals(asistencia.getAlumno_idAlumno()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getIdAsistencia();
		if (getAlumno_idAlumno() != null) {
			hashcode = hashcode + (int) getAlumno_idAlumno().getORMID();
		}
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_ASISTENCIA_ALUMNO_IDALUMNO) {
			this.alumno_idAlumno = (orm.Alumno) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_ASISTENCIA_CLASEIDCLASE) {
			this.claseidClase = (orm.Clase) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idAsistencia;
	
	private orm.Alumno alumno_idAlumno;
	
	private int alumno_idAlumnoId;
	
	private void setAlumno_idAlumnoId(int value) {
		this.alumno_idAlumnoId = value;
	}
	
	public int getAlumno_idAlumnoId() {
		return alumno_idAlumnoId;
	}
	
	private byte presente;
	
	private orm.Clase claseidClase;
	
	public void setIdAsistencia(int value) {
		this.idAsistencia = value;
	}
	
	public int getIdAsistencia() {
		return idAsistencia;
	}
	
	public void setPresente(byte value) {
		this.presente = value;
	}
	
	public byte getPresente() {
		return presente;
	}
	
	public void setAlumno_idAlumno(orm.Alumno value) {
		if (alumno_idAlumno != null) {
			alumno_idAlumno.asistencia.remove(this);
		}
		if (value != null) {
			value.asistencia.add(this);
		}
	}
	
	public orm.Alumno getAlumno_idAlumno() {
		return alumno_idAlumno;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Alumno_idAlumno(orm.Alumno value) {
		this.alumno_idAlumno = value;
	}
	
	private orm.Alumno getORM_Alumno_idAlumno() {
		return alumno_idAlumno;
	}
	
	public void setClaseidClase(orm.Clase value) {
		if (claseidClase != null) {
			claseidClase.asistencia.remove(this);
		}
		if (value != null) {
			value.asistencia.add(this);
		}
	}
	
	public orm.Clase getClaseidClase() {
		return claseidClase;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_ClaseidClase(orm.Clase value) {
		this.claseidClase = value;
	}
	
	private orm.Clase getORM_ClaseidClase() {
		return claseidClase;
	}
	
	public String toString() {
		return String.valueOf(getIdAsistencia() + " " + ((getAlumno_idAlumno() == null) ? "" : String.valueOf(getAlumno_idAlumno().getORMID())));
	}
	
}
