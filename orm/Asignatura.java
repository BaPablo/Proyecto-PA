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

public class Asignatura {
	public Asignatura() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_ASIGNATURA_PROFESOR_IDPROFESOR) {
			return ORM_profesor_idProfesor;
		}
		else if (key == orm.ORMConstants.KEY_ASIGNATURA_EVALUACION) {
			return ORM_evaluacion;
		}
		else if (key == orm.ORMConstants.KEY_ASIGNATURA_CLASE) {
			return ORM_clase;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idAsignatura;
	
	private String nombre;
	
	private int horasIntraAula;
	
	private int horasExtraAula;
	
	private int duracion;
	
	private int creditos;
	
	private String descripcion;
	
	private String aprendizajeEsperado;
	
	private String librosRecomendados;
	
	private int semestre;
	
	private java.util.Date anio;
	
	private java.util.Set ORM_profesor_idProfesor = new java.util.HashSet();
	
	private java.util.Set ORM_evaluacion = new java.util.HashSet();
	
	private java.util.Set ORM_clase = new java.util.HashSet();
	
	private void setIdAsignatura(int value) {
		this.idAsignatura = value;
	}
	
	public int getIdAsignatura() {
		return idAsignatura;
	}
	
	public int getORMID() {
		return getIdAsignatura();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setHorasIntraAula(int value) {
		this.horasIntraAula = value;
	}
	
	public int getHorasIntraAula() {
		return horasIntraAula;
	}
	
	public void setHorasExtraAula(int value) {
		this.horasExtraAula = value;
	}
	
	public int getHorasExtraAula() {
		return horasExtraAula;
	}
	
	public void setDuracion(int value) {
		this.duracion = value;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public void setCreditos(int value) {
		this.creditos = value;
	}
	
	public int getCreditos() {
		return creditos;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setAprendizajeEsperado(String value) {
		this.aprendizajeEsperado = value;
	}
	
	public String getAprendizajeEsperado() {
		return aprendizajeEsperado;
	}
	
	public void setLibrosRecomendados(String value) {
		this.librosRecomendados = value;
	}
	
	public String getLibrosRecomendados() {
		return librosRecomendados;
	}
	
	public void setSemestre(int value) {
		this.semestre = value;
	}
	
	public int getSemestre() {
		return semestre;
	}
	
	public void setAnio(java.util.Date value) {
		this.anio = value;
	}
	
	public java.util.Date getAnio() {
		return anio;
	}
	
	private void setORM_Profesor_idProfesor(java.util.Set value) {
		this.ORM_profesor_idProfesor = value;
	}
	
	private java.util.Set getORM_Profesor_idProfesor() {
		return ORM_profesor_idProfesor;
	}
	
	public final orm.ProfesorSetCollection profesor_idProfesor = new orm.ProfesorSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_ASIGNATURA_PROFESOR_IDPROFESOR, orm.ORMConstants.KEY_PROFESOR_ASIGNATURA_IDASIGNATURA, orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Evaluacion(java.util.Set value) {
		this.ORM_evaluacion = value;
	}
	
	private java.util.Set getORM_Evaluacion() {
		return ORM_evaluacion;
	}
	
	public final orm.EvaluacionSetCollection evaluacion = new orm.EvaluacionSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_ASIGNATURA_EVALUACION, orm.ORMConstants.KEY_EVALUACION_ASIGNATURA_IDASIGNATURA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Clase(java.util.Set value) {
		this.ORM_clase = value;
	}
	
	private java.util.Set getORM_Clase() {
		return ORM_clase;
	}
	
	public final orm.ClaseSetCollection clase = new orm.ClaseSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_ASIGNATURA_CLASE, orm.ORMConstants.KEY_CLASE_ASIGNATURAIDASIGNATURA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdAsignatura());
	}
	
}
