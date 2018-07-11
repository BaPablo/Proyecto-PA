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

public class Clase {
	public Clase() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_CLASE_ASISTENCIA) {
			return ORM_asistencia;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_CLASE_ASIGNATURAIDASIGNATURA) {
			this.asignaturaidAsignatura = (orm.Asignatura) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private java.util.Date fecha;
	
	private int idClase;
	
	private orm.Asignatura asignaturaidAsignatura;
	
	private java.util.Set ORM_asistencia = new java.util.HashSet();
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	private void setIdClase(int value) {
		this.idClase = value;
	}
	
	public int getIdClase() {
		return idClase;
	}
	
	public int getORMID() {
		return getIdClase();
	}
	
	public void setAsignaturaidAsignatura(orm.Asignatura value) {
		if (asignaturaidAsignatura != null) {
			asignaturaidAsignatura.clase.remove(this);
		}
		if (value != null) {
			value.clase.add(this);
		}
	}
	
	public orm.Asignatura getAsignaturaidAsignatura() {
		return asignaturaidAsignatura;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_AsignaturaidAsignatura(orm.Asignatura value) {
		this.asignaturaidAsignatura = value;
	}
	
	private orm.Asignatura getORM_AsignaturaidAsignatura() {
		return asignaturaidAsignatura;
	}
	
	private void setORM_Asistencia(java.util.Set value) {
		this.ORM_asistencia = value;
	}
	
	private java.util.Set getORM_Asistencia() {
		return ORM_asistencia;
	}
	
	public final orm.AsistenciaSetCollection asistencia = new orm.AsistenciaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CLASE_ASISTENCIA, orm.ORMConstants.KEY_ASISTENCIA_CLASEIDCLASE, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdClase());
	}
	
}
