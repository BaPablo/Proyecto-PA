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

public class Direccion {
	public Direccion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_DIRECCION_ALUMNO) {
			return ORM_alumno;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idDireccion;
	
	private String calle;
	
	private String comuna;
	
	private String ciudad;
	
	private String region;
	
	private String tipoDireccion;
	
	private java.util.Set ORM_alumno = new java.util.HashSet();
	
	private void setIdDireccion(int value) {
		this.idDireccion = value;
	}
	
	public int getIdDireccion() {
		return idDireccion;
	}
	
	public int getORMID() {
		return getIdDireccion();
	}
	
	public void setCalle(String value) {
		this.calle = value;
	}
	
	public String getCalle() {
		return calle;
	}
	
	public void setComuna(String value) {
		this.comuna = value;
	}
	
	public String getComuna() {
		return comuna;
	}
	
	public void setCiudad(String value) {
		this.ciudad = value;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void setRegion(String value) {
		this.region = value;
	}
	
	public String getRegion() {
		return region;
	}
	
	public void setTipoDireccion(String value) {
		this.tipoDireccion = value;
	}
	
	public String getTipoDireccion() {
		return tipoDireccion;
	}
	
	private void setORM_Alumno(java.util.Set value) {
		this.ORM_alumno = value;
	}
	
	private java.util.Set getORM_Alumno() {
		return ORM_alumno;
	}
	
	public final orm.AlumnoSetCollection alumno = new orm.AlumnoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_DIRECCION_ALUMNO, orm.ORMConstants.KEY_ALUMNO_DIRECCION_IDDIRECCION, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdDireccion());
	}
	
}
