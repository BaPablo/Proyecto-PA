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

public class EvaluacionCriteria extends AbstractORMCriteria {
	public final IntegerExpression idEvaluacion;
	public final StringExpression nombre;
	public final StringExpression tipoEvaluacion;
	public final StringExpression descripcion;
	public final IntegerExpression calificacion;
	public final IntegerExpression asignatura_idAsignaturaId;
	public final AssociationExpression asignatura_idAsignatura;
	public final IntegerExpression fechaEvaluacion_idFechaEvaluacionId;
	public final AssociationExpression fechaEvaluacion_idFechaEvaluacion;
	public final IntegerExpression lugar_idLugarId;
	public final AssociationExpression lugar_idLugar;
	
	public EvaluacionCriteria(Criteria criteria) {
		super(criteria);
		idEvaluacion = new IntegerExpression("idEvaluacion", this);
		nombre = new StringExpression("nombre", this);
		tipoEvaluacion = new StringExpression("tipoEvaluacion", this);
		descripcion = new StringExpression("descripcion", this);
		calificacion = new IntegerExpression("calificacion", this);
		asignatura_idAsignaturaId = new IntegerExpression("asignatura_idAsignatura.idAsignatura", this);
		asignatura_idAsignatura = new AssociationExpression("asignatura_idAsignatura", this);
		fechaEvaluacion_idFechaEvaluacionId = new IntegerExpression("fechaEvaluacion_idFechaEvaluacion.idFechaEvaluacion", this);
		fechaEvaluacion_idFechaEvaluacion = new AssociationExpression("fechaEvaluacion_idFechaEvaluacion", this);
		lugar_idLugarId = new IntegerExpression("lugar_idLugar.idLugar", this);
		lugar_idLugar = new AssociationExpression("lugar_idLugar", this);
	}
	
	public EvaluacionCriteria(PersistentSession session) {
		this(session.createCriteria(Evaluacion.class));
	}
	
	public EvaluacionCriteria() throws PersistentException {
		this(orm.ProyectoPersistentManager.instance().getSession());
	}
	
	public AsignaturaCriteria createAsignatura_idAsignaturaCriteria() {
		return new AsignaturaCriteria(createCriteria("asignatura_idAsignatura"));
	}
	
	public FechaevaluacionCriteria createFechaEvaluacion_idFechaEvaluacionCriteria() {
		return new FechaevaluacionCriteria(createCriteria("fechaEvaluacion_idFechaEvaluacion"));
	}
	
	public LugarCriteria createLugar_idLugarCriteria() {
		return new LugarCriteria(createCriteria("lugar_idLugar"));
	}
	
	public Evaluacion uniqueEvaluacion() {
		return (Evaluacion) super.uniqueResult();
	}
	
	public Evaluacion[] listEvaluacion() {
		java.util.List list = super.list();
		return (Evaluacion[]) list.toArray(new Evaluacion[list.size()]);
	}
}

