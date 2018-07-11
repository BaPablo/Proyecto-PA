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

public class Fechaevaluacion {
	public Fechaevaluacion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_FECHAEVALUACION_EVALUACION) {
			return ORM_evaluacion;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idFechaEvaluacion;
	
	private java.util.Date fechaInicio;
	
	private java.util.Date fechaTermino;
	
	private java.sql.Time horaInicio;
	
	private java.sql.Time horaTermino;
	
	private java.util.Set ORM_evaluacion = new java.util.HashSet();
	
	private void setIdFechaEvaluacion(int value) {
		this.idFechaEvaluacion = value;
	}
	
	public int getIdFechaEvaluacion() {
		return idFechaEvaluacion;
	}
	
	public int getORMID() {
		return getIdFechaEvaluacion();
	}
	
	public void setFechaInicio(java.util.Date value) {
		this.fechaInicio = value;
	}
	
	public java.util.Date getFechaInicio() {
		return fechaInicio;
	}
	
	public void setFechaTermino(java.util.Date value) {
		this.fechaTermino = value;
	}
	
	public java.util.Date getFechaTermino() {
		return fechaTermino;
	}
	
	public void setHoraInicio(java.sql.Time value) {
		this.horaInicio = value;
	}
	
	public java.sql.Time getHoraInicio() {
		return horaInicio;
	}
	
	public void setHoraTermino(java.sql.Time value) {
		this.horaTermino = value;
	}
	
	public java.sql.Time getHoraTermino() {
		return horaTermino;
	}
	
	private void setORM_Evaluacion(java.util.Set value) {
		this.ORM_evaluacion = value;
	}
	
	private java.util.Set getORM_Evaluacion() {
		return ORM_evaluacion;
	}
	
	public final orm.EvaluacionSetCollection evaluacion = new orm.EvaluacionSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_FECHAEVALUACION_EVALUACION, orm.ORMConstants.KEY_EVALUACION_FECHAEVALUACION_IDFECHAEVALUACION, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdFechaEvaluacion());
	}
	
}
