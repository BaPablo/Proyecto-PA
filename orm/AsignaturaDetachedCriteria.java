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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AsignaturaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idAsignatura;
	public final StringExpression nombre;
	public final IntegerExpression horasIntraAula;
	public final IntegerExpression horasExtraAula;
	public final IntegerExpression duracion;
	public final IntegerExpression creditos;
	public final StringExpression descripcion;
	public final StringExpression aprendizajeEsperado;
	public final StringExpression librosRecomendados;
	public final IntegerExpression semestre;
	public final DateExpression anio;
	public final CollectionExpression profesor_idProfesor;
	public final CollectionExpression evaluacion;
	public final CollectionExpression clase;
	
	public AsignaturaDetachedCriteria() {
		super(orm.Asignatura.class, orm.AsignaturaCriteria.class);
		idAsignatura = new IntegerExpression("idAsignatura", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		horasIntraAula = new IntegerExpression("horasIntraAula", this.getDetachedCriteria());
		horasExtraAula = new IntegerExpression("horasExtraAula", this.getDetachedCriteria());
		duracion = new IntegerExpression("duracion", this.getDetachedCriteria());
		creditos = new IntegerExpression("creditos", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		aprendizajeEsperado = new StringExpression("aprendizajeEsperado", this.getDetachedCriteria());
		librosRecomendados = new StringExpression("librosRecomendados", this.getDetachedCriteria());
		semestre = new IntegerExpression("semestre", this.getDetachedCriteria());
		anio = new DateExpression("anio", this.getDetachedCriteria());
		profesor_idProfesor = new CollectionExpression("ORM_Profesor_idProfesor", this.getDetachedCriteria());
		evaluacion = new CollectionExpression("ORM_Evaluacion", this.getDetachedCriteria());
		clase = new CollectionExpression("ORM_Clase", this.getDetachedCriteria());
	}
	
	public AsignaturaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.AsignaturaCriteria.class);
		idAsignatura = new IntegerExpression("idAsignatura", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		horasIntraAula = new IntegerExpression("horasIntraAula", this.getDetachedCriteria());
		horasExtraAula = new IntegerExpression("horasExtraAula", this.getDetachedCriteria());
		duracion = new IntegerExpression("duracion", this.getDetachedCriteria());
		creditos = new IntegerExpression("creditos", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		aprendizajeEsperado = new StringExpression("aprendizajeEsperado", this.getDetachedCriteria());
		librosRecomendados = new StringExpression("librosRecomendados", this.getDetachedCriteria());
		semestre = new IntegerExpression("semestre", this.getDetachedCriteria());
		anio = new DateExpression("anio", this.getDetachedCriteria());
		profesor_idProfesor = new CollectionExpression("ORM_Profesor_idProfesor", this.getDetachedCriteria());
		evaluacion = new CollectionExpression("ORM_Evaluacion", this.getDetachedCriteria());
		clase = new CollectionExpression("ORM_Clase", this.getDetachedCriteria());
	}
	
	public orm.ProfesorDetachedCriteria createProfesor_idProfesorCriteria() {
		return new orm.ProfesorDetachedCriteria(createCriteria("ORM_Profesor_idProfesor"));
	}
	
	public orm.EvaluacionDetachedCriteria createEvaluacionCriteria() {
		return new orm.EvaluacionDetachedCriteria(createCriteria("ORM_Evaluacion"));
	}
	
	public orm.ClaseDetachedCriteria createClaseCriteria() {
		return new orm.ClaseDetachedCriteria(createCriteria("ORM_Clase"));
	}
	
	public Asignatura uniqueAsignatura(PersistentSession session) {
		return (Asignatura) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Asignatura[] listAsignatura(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Asignatura[]) list.toArray(new Asignatura[list.size()]);
	}
}

