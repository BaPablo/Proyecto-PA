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

public class Apoderado {
	public Apoderado() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_APODERADO_ALUMNO) {
			return ORM_alumno;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idApoderado;
	
	private String rutApoderado;
	
	private String primerNombre;
	
	private String segundoNombre;
	
	private String primerApellido;
	
	private String segundoApellido;
	
	private String email;
	
	private java.util.Date fechaNacimiento;
	
	private String sexo;
	
	private String telefonoMovil;
	
	private String telefonoFijo;
	
	private java.util.Set ORM_alumno = new java.util.HashSet();
	
	private void setIdApoderado(int value) {
		this.idApoderado = value;
	}
	
	public int getIdApoderado() {
		return idApoderado;
	}
	
	public int getORMID() {
		return getIdApoderado();
	}
	
	public void setRutApoderado(String value) {
		this.rutApoderado = value;
	}
	
	public String getRutApoderado() {
		return rutApoderado;
	}
	
	public void setPrimerNombre(String value) {
		this.primerNombre = value;
	}
	
	public String getPrimerNombre() {
		return primerNombre;
	}
	
	public void setSegundoNombre(String value) {
		this.segundoNombre = value;
	}
	
	public String getSegundoNombre() {
		return segundoNombre;
	}
	
	public void setPrimerApellido(String value) {
		this.primerApellido = value;
	}
	
	public String getPrimerApellido() {
		return primerApellido;
	}
	
	public void setSegundoApellido(String value) {
		this.segundoApellido = value;
	}
	
	public String getSegundoApellido() {
		return segundoApellido;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setFechaNacimiento(java.util.Date value) {
		this.fechaNacimiento = value;
	}
	
	public java.util.Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setSexo(String value) {
		this.sexo = value;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setTelefonoMovil(String value) {
		this.telefonoMovil = value;
	}
	
	public String getTelefonoMovil() {
		return telefonoMovil;
	}
	
	public void setTelefonoFijo(String value) {
		this.telefonoFijo = value;
	}
	
	public String getTelefonoFijo() {
		return telefonoFijo;
	}
	
	private void setORM_Alumno(java.util.Set value) {
		this.ORM_alumno = value;
	}
	
	private java.util.Set getORM_Alumno() {
		return ORM_alumno;
	}
	
	public final orm.AlumnoSetCollection alumno = new orm.AlumnoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_APODERADO_ALUMNO, orm.ORMConstants.KEY_ALUMNO_APODERADO_IDAPODERADO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdApoderado());
	}
	
}
