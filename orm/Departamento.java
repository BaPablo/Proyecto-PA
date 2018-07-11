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

public class Departamento {
	public Departamento() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_DEPARTAMENTO_PROFESOR) {
			return ORM_profesor;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_DEPARTAMENTO_FACULTAD_IDFACULTAD) {
			this.facultad_idFacultad = (orm.Facultad) owner;
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
	
	private int idDepartamento;
	
	private String nombre;
	
	private orm.Facultad facultad_idFacultad;
	
	private java.util.Set ORM_profesor = new java.util.HashSet();
	
	private void setIdDepartamento(int value) {
		this.idDepartamento = value;
	}
	
	public int getIdDepartamento() {
		return idDepartamento;
	}
	
	public int getORMID() {
		return getIdDepartamento();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setFacultad_idFacultad(orm.Facultad value) {
		if (facultad_idFacultad != null) {
			facultad_idFacultad.departamento.remove(this);
		}
		if (value != null) {
			value.departamento.add(this);
		}
	}
	
	public orm.Facultad getFacultad_idFacultad() {
		return facultad_idFacultad;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Facultad_idFacultad(orm.Facultad value) {
		this.facultad_idFacultad = value;
	}
	
	private orm.Facultad getORM_Facultad_idFacultad() {
		return facultad_idFacultad;
	}
	
	private void setORM_Profesor(java.util.Set value) {
		this.ORM_profesor = value;
	}
	
	private java.util.Set getORM_Profesor() {
		return ORM_profesor;
	}
	
	public final orm.ProfesorSetCollection profesor = new orm.ProfesorSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_DEPARTAMENTO_PROFESOR, orm.ORMConstants.KEY_PROFESOR_DEPARTAMENTO_IDDEPARTAMENTO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdDepartamento());
	}
	
}
