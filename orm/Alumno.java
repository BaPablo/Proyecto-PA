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

public class Alumno {
	public Alumno() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_ALUMNO_AGRUPACION_IDAGRUP) {
			return ORM_agrupacion_idAgrup;
		}
		else if (key == orm.ORMConstants.KEY_ALUMNO_CONDICIONSALUD_IDCONDICIONSALUD) {
			return ORM_condicionSalud_idCondicionSalud;
		}
		else if (key == orm.ORMConstants.KEY_ALUMNO_INTERESES_IDINTERESES) {
			return ORM_intereses_idIntereses;
		}
		else if (key == orm.ORMConstants.KEY_ALUMNO_RAMADEPORTIVA_IDRAMADEPORTIVA) {
			return ORM_ramaDeportiva_idRamaDeportiva;
		}
		else if (key == orm.ORMConstants.KEY_ALUMNO_ASISTENCIA) {
			return ORM_asistencia;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_ALUMNO_APODERADO_IDAPODERADO) {
			this.apoderado_idApoderado = (orm.Apoderado) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_ALUMNO_DIRECCION_IDDIRECCION) {
			this.direccion_idDireccion = (orm.Direccion) owner;
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
	
	private int idAlumno;
	
	private String rutAlumno;
	
	private String primerNombre;
	
	private String segundoNombre;
	
	private String primerApellido;
	
	private String segundoApellido;
	
	private java.util.Date fechaNacimiento;
	
	private String sexo;
	
	private String telefonoFijo;
	
	private String telefonoMovil;
	
	private String email;
	
	private String nacionalidad;
	
	private String estadoCivil;
	
	private byte planificaEstudio;
	
	private byte utilizaBibliografiaRecomendada;
	
	private orm.Apoderado apoderado_idApoderado;
	
	private orm.Direccion direccion_idDireccion;
	
	private java.util.Set ORM_agrupacion_idAgrup = new java.util.HashSet();
	
	private java.util.Set ORM_condicionSalud_idCondicionSalud = new java.util.HashSet();
	
	private java.util.Set ORM_intereses_idIntereses = new java.util.HashSet();
	
	private java.util.Set ORM_ramaDeportiva_idRamaDeportiva = new java.util.HashSet();
	
	private java.util.Set ORM_asistencia = new java.util.HashSet();
	
	private void setIdAlumno(int value) {
		this.idAlumno = value;
	}
	
	public int getIdAlumno() {
		return idAlumno;
	}
	
	public int getORMID() {
		return getIdAlumno();
	}
	
	public void setRutAlumno(String value) {
		this.rutAlumno = value;
	}
	
	public String getRutAlumno() {
		return rutAlumno;
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
	
	public void setTelefonoFijo(String value) {
		this.telefonoFijo = value;
	}
	
	public String getTelefonoFijo() {
		return telefonoFijo;
	}
	
	public void setTelefonoMovil(String value) {
		this.telefonoMovil = value;
	}
	
	public String getTelefonoMovil() {
		return telefonoMovil;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setNacionalidad(String value) {
		this.nacionalidad = value;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}
	
	public void setEstadoCivil(String value) {
		this.estadoCivil = value;
	}
	
	public String getEstadoCivil() {
		return estadoCivil;
	}
	
	public void setPlanificaEstudio(byte value) {
		this.planificaEstudio = value;
	}
	
	public byte getPlanificaEstudio() {
		return planificaEstudio;
	}
	
	public void setUtilizaBibliografiaRecomendada(byte value) {
		this.utilizaBibliografiaRecomendada = value;
	}
	
	public byte getUtilizaBibliografiaRecomendada() {
		return utilizaBibliografiaRecomendada;
	}
	
	public void setApoderado_idApoderado(orm.Apoderado value) {
		if (apoderado_idApoderado != null) {
			apoderado_idApoderado.alumno.remove(this);
		}
		if (value != null) {
			value.alumno.add(this);
		}
	}
	
	public orm.Apoderado getApoderado_idApoderado() {
		return apoderado_idApoderado;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Apoderado_idApoderado(orm.Apoderado value) {
		this.apoderado_idApoderado = value;
	}
	
	private orm.Apoderado getORM_Apoderado_idApoderado() {
		return apoderado_idApoderado;
	}
	
	public void setDireccion_idDireccion(orm.Direccion value) {
		if (direccion_idDireccion != null) {
			direccion_idDireccion.alumno.remove(this);
		}
		if (value != null) {
			value.alumno.add(this);
		}
	}
	
	public orm.Direccion getDireccion_idDireccion() {
		return direccion_idDireccion;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Direccion_idDireccion(orm.Direccion value) {
		this.direccion_idDireccion = value;
	}
	
	private orm.Direccion getORM_Direccion_idDireccion() {
		return direccion_idDireccion;
	}
	
	private void setORM_Agrupacion_idAgrup(java.util.Set value) {
		this.ORM_agrupacion_idAgrup = value;
	}
	
	private java.util.Set getORM_Agrupacion_idAgrup() {
		return ORM_agrupacion_idAgrup;
	}
	
	public final orm.AgrupacionSetCollection agrupacion_idAgrup = new orm.AgrupacionSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_ALUMNO_AGRUPACION_IDAGRUP, orm.ORMConstants.KEY_AGRUPACION_ALUMNO_IDALUMNO, orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_CondicionSalud_idCondicionSalud(java.util.Set value) {
		this.ORM_condicionSalud_idCondicionSalud = value;
	}
	
	private java.util.Set getORM_CondicionSalud_idCondicionSalud() {
		return ORM_condicionSalud_idCondicionSalud;
	}
	
	public final orm.CondicionsaludSetCollection condicionSalud_idCondicionSalud = new orm.CondicionsaludSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_ALUMNO_CONDICIONSALUD_IDCONDICIONSALUD, orm.ORMConstants.KEY_CONDICIONSALUD_ALUMNO_IDALUMNO, orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Intereses_idIntereses(java.util.Set value) {
		this.ORM_intereses_idIntereses = value;
	}
	
	private java.util.Set getORM_Intereses_idIntereses() {
		return ORM_intereses_idIntereses;
	}
	
	public final orm.InteresesSetCollection intereses_idIntereses = new orm.InteresesSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_ALUMNO_INTERESES_IDINTERESES, orm.ORMConstants.KEY_INTERESES_ALUMNO_IDALUMNO, orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_RamaDeportiva_idRamaDeportiva(java.util.Set value) {
		this.ORM_ramaDeportiva_idRamaDeportiva = value;
	}
	
	private java.util.Set getORM_RamaDeportiva_idRamaDeportiva() {
		return ORM_ramaDeportiva_idRamaDeportiva;
	}
	
	public final orm.RamadeportivaSetCollection ramaDeportiva_idRamaDeportiva = new orm.RamadeportivaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_ALUMNO_RAMADEPORTIVA_IDRAMADEPORTIVA, orm.ORMConstants.KEY_RAMADEPORTIVA_ALUMNO_IDALUMNO, orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Asistencia(java.util.Set value) {
		this.ORM_asistencia = value;
	}
	
	private java.util.Set getORM_Asistencia() {
		return ORM_asistencia;
	}
	
	public final orm.AsistenciaSetCollection asistencia = new orm.AsistenciaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_ALUMNO_ASISTENCIA, orm.ORMConstants.KEY_ASISTENCIA_ALUMNO_IDALUMNO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdAlumno());
	}
	
}
