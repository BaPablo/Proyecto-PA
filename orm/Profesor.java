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

public class Profesor {
	public Profesor() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_PROFESOR_ASIGNATURA_IDASIGNATURA) {
			return ORM_asignatura_idAsignatura;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_PROFESOR_DEPARTAMENTO_IDDEPARTAMENTO) {
			this.departamento_idDepartamento = (orm.Departamento) owner;
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
	
	private int idProfesor;
	
	private String rutProfesor;
	
	private String primerNombre;
	
	private String segundoNombre;
	
	private String primerApellido;
	
	private String segundoApellido;
	
	private java.util.Date fechaNacimiento;
	
	private String sexo;
	
	private String email;
	
	private String telefonoMovil;
	
	private String grado;
	
	private java.util.Date fechaIngreso;
	
	private orm.Departamento departamento_idDepartamento;
	
	private java.util.Date fechaTermino;
	
	private java.util.Set ORM_asignatura_idAsignatura = new java.util.HashSet();
	
	private void setIdProfesor(int value) {
		this.idProfesor = value;
	}
	
	public int getIdProfesor() {
		return idProfesor;
	}
	
	public int getORMID() {
		return getIdProfesor();
	}
	
	public void setRutProfesor(String value) {
		this.rutProfesor = value;
	}
	
	public String getRutProfesor() {
		return rutProfesor;
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
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setTelefonoMovil(String value) {
		this.telefonoMovil = value;
	}
	
	public String getTelefonoMovil() {
		return telefonoMovil;
	}
	
	public void setGrado(String value) {
		this.grado = value;
	}
	
	public String getGrado() {
		return grado;
	}
	
	public void setFechaIngreso(java.util.Date value) {
		this.fechaIngreso = value;
	}
	
	public java.util.Date getFechaIngreso() {
		return fechaIngreso;
	}
	
	public void setFechaTermino(java.util.Date value) {
		this.fechaTermino = value;
	}
	
	public java.util.Date getFechaTermino() {
		return fechaTermino;
	}
	
	private void setORM_Asignatura_idAsignatura(java.util.Set value) {
		this.ORM_asignatura_idAsignatura = value;
	}
	
	private java.util.Set getORM_Asignatura_idAsignatura() {
		return ORM_asignatura_idAsignatura;
	}
	
	public final orm.AsignaturaSetCollection asignatura_idAsignatura = new orm.AsignaturaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PROFESOR_ASIGNATURA_IDASIGNATURA, orm.ORMConstants.KEY_ASIGNATURA_PROFESOR_IDPROFESOR, orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setDepartamento_idDepartamento(orm.Departamento value) {
		if (departamento_idDepartamento != null) {
			departamento_idDepartamento.profesor.remove(this);
		}
		if (value != null) {
			value.profesor.add(this);
		}
	}
	
	public orm.Departamento getDepartamento_idDepartamento() {
		return departamento_idDepartamento;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Departamento_idDepartamento(orm.Departamento value) {
		this.departamento_idDepartamento = value;
	}
	
	private orm.Departamento getORM_Departamento_idDepartamento() {
		return departamento_idDepartamento;
	}
	
	public String toString() {
		return String.valueOf(getIdProfesor());
	}
	
}
