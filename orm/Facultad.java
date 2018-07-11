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

public class Facultad {
	public Facultad() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_FACULTAD_DEPARTAMENTO) {
			return ORM_departamento;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idFacultad;
	
	private String nombre;
	
	private java.util.Set ORM_departamento = new java.util.HashSet();
	
	private void setIdFacultad(int value) {
		this.idFacultad = value;
	}
	
	public int getIdFacultad() {
		return idFacultad;
	}
	
	public int getORMID() {
		return getIdFacultad();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_Departamento(java.util.Set value) {
		this.ORM_departamento = value;
	}
	
	private java.util.Set getORM_Departamento() {
		return ORM_departamento;
	}
	
	public final orm.DepartamentoSetCollection departamento = new orm.DepartamentoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_FACULTAD_DEPARTAMENTO, orm.ORMConstants.KEY_DEPARTAMENTO_FACULTAD_IDFACULTAD, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdFacultad());
	}
	
}
