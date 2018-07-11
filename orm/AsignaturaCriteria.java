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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AsignaturaCriteria extends AbstractORMCriteria {
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
	
	public AsignaturaCriteria(Criteria criteria) {
		super(criteria);
		idAsignatura = new IntegerExpression("idAsignatura", this);
		nombre = new StringExpression("nombre", this);
		horasIntraAula = new IntegerExpression("horasIntraAula", this);
		horasExtraAula = new IntegerExpression("horasExtraAula", this);
		duracion = new IntegerExpression("duracion", this);
		creditos = new IntegerExpression("creditos", this);
		descripcion = new StringExpression("descripcion", this);
		aprendizajeEsperado = new StringExpression("aprendizajeEsperado", this);
		librosRecomendados = new StringExpression("librosRecomendados", this);
		semestre = new IntegerExpression("semestre", this);
		anio = new DateExpression("anio", this);
		profesor_idProfesor = new CollectionExpression("ORM_Profesor_idProfesor", this);
		evaluacion = new CollectionExpression("ORM_Evaluacion", this);
		clase = new CollectionExpression("ORM_Clase", this);
	}
	
	public AsignaturaCriteria(PersistentSession session) {
		this(session.createCriteria(Asignatura.class));
	}
	
	public AsignaturaCriteria() throws PersistentException {
		this(orm.ProyectoPersistentManager.instance().getSession());
	}
	
	public orm.ProfesorCriteria createProfesor_idProfesorCriteria() {
		return new orm.ProfesorCriteria(createCriteria("ORM_Profesor_idProfesor"));
	}
	
	public orm.EvaluacionCriteria createEvaluacionCriteria() {
		return new orm.EvaluacionCriteria(createCriteria("ORM_Evaluacion"));
	}
	
	public orm.ClaseCriteria createClaseCriteria() {
		return new orm.ClaseCriteria(createCriteria("ORM_Clase"));
	}
	
	public Asignatura uniqueAsignatura() {
		return (Asignatura) super.uniqueResult();
	}
	
	public Asignatura[] listAsignatura() {
		java.util.List list = super.list();
		return (Asignatura[]) list.toArray(new Asignatura[list.size()]);
	}
}

