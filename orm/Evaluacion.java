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

public class Evaluacion {
	public Evaluacion() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_EVALUACION_ASIGNATURA_IDASIGNATURA) {
			this.asignatura_idAsignatura = (orm.Asignatura) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_EVALUACION_FECHAEVALUACION_IDFECHAEVALUACION) {
			this.fechaEvaluacion_idFechaEvaluacion = (orm.Fechaevaluacion) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_EVALUACION_LUGAR_IDLUGAR) {
			this.lugar_idLugar = (orm.Lugar) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idEvaluacion;
	
	private String nombre;
	
	private String tipoEvaluacion;
	
	private String descripcion;
	
	private int calificacion;
	
	private orm.Asignatura asignatura_idAsignatura;
	
	private orm.Fechaevaluacion fechaEvaluacion_idFechaEvaluacion;
	
	private orm.Lugar lugar_idLugar;
	
	private void setIdEvaluacion(int value) {
		this.idEvaluacion = value;
	}
	
	public int getIdEvaluacion() {
		return idEvaluacion;
	}
	
	public int getORMID() {
		return getIdEvaluacion();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setTipoEvaluacion(String value) {
		this.tipoEvaluacion = value;
	}
	
	public String getTipoEvaluacion() {
		return tipoEvaluacion;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setCalificacion(int value) {
		this.calificacion = value;
	}
	
	public int getCalificacion() {
		return calificacion;
	}
	
	public void setAsignatura_idAsignatura(orm.Asignatura value) {
		if (asignatura_idAsignatura != null) {
			asignatura_idAsignatura.evaluacion.remove(this);
		}
		if (value != null) {
			value.evaluacion.add(this);
		}
	}
	
	public orm.Asignatura getAsignatura_idAsignatura() {
		return asignatura_idAsignatura;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Asignatura_idAsignatura(orm.Asignatura value) {
		this.asignatura_idAsignatura = value;
	}
	
	private orm.Asignatura getORM_Asignatura_idAsignatura() {
		return asignatura_idAsignatura;
	}
	
	public void setFechaEvaluacion_idFechaEvaluacion(orm.Fechaevaluacion value) {
		if (fechaEvaluacion_idFechaEvaluacion != null) {
			fechaEvaluacion_idFechaEvaluacion.evaluacion.remove(this);
		}
		if (value != null) {
			value.evaluacion.add(this);
		}
	}
	
	public orm.Fechaevaluacion getFechaEvaluacion_idFechaEvaluacion() {
		return fechaEvaluacion_idFechaEvaluacion;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_FechaEvaluacion_idFechaEvaluacion(orm.Fechaevaluacion value) {
		this.fechaEvaluacion_idFechaEvaluacion = value;
	}
	
	private orm.Fechaevaluacion getORM_FechaEvaluacion_idFechaEvaluacion() {
		return fechaEvaluacion_idFechaEvaluacion;
	}
	
	public void setLugar_idLugar(orm.Lugar value) {
		if (lugar_idLugar != null) {
			lugar_idLugar.evaluacion.remove(this);
		}
		if (value != null) {
			value.evaluacion.add(this);
		}
	}
	
	public orm.Lugar getLugar_idLugar() {
		return lugar_idLugar;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Lugar_idLugar(orm.Lugar value) {
		this.lugar_idLugar = value;
	}
	
	private orm.Lugar getORM_Lugar_idLugar() {
		return lugar_idLugar;
	}
	
	public String toString() {
		return String.valueOf(getIdEvaluacion());
	}
	
}
