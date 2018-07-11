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

public class Lugar {
	public Lugar() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_LUGAR_EVALUACION) {
			return ORM_evaluacion;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idLugar;
	
	private String nombre;
	
	private java.util.Set ORM_evaluacion = new java.util.HashSet();
	
	private void setIdLugar(int value) {
		this.idLugar = value;
	}
	
	public int getIdLugar() {
		return idLugar;
	}
	
	public int getORMID() {
		return getIdLugar();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_Evaluacion(java.util.Set value) {
		this.ORM_evaluacion = value;
	}
	
	private java.util.Set getORM_Evaluacion() {
		return ORM_evaluacion;
	}
	
	public final orm.EvaluacionSetCollection evaluacion = new orm.EvaluacionSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_LUGAR_EVALUACION, orm.ORMConstants.KEY_EVALUACION_LUGAR_IDLUGAR, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdLugar());
	}
	
}
