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

public class FechaevaluacionCriteria extends AbstractORMCriteria {
	public final IntegerExpression idFechaEvaluacion;
	public final DateExpression fechaInicio;
	public final DateExpression fechaTermino;
	public final TimeExpression horaInicio;
	public final TimeExpression horaTermino;
	public final CollectionExpression evaluacion;
	
	public FechaevaluacionCriteria(Criteria criteria) {
		super(criteria);
		idFechaEvaluacion = new IntegerExpression("idFechaEvaluacion", this);
		fechaInicio = new DateExpression("fechaInicio", this);
		fechaTermino = new DateExpression("fechaTermino", this);
		horaInicio = new TimeExpression("horaInicio", this);
		horaTermino = new TimeExpression("horaTermino", this);
		evaluacion = new CollectionExpression("ORM_Evaluacion", this);
	}
	
	public FechaevaluacionCriteria(PersistentSession session) {
		this(session.createCriteria(Fechaevaluacion.class));
	}
	
	public FechaevaluacionCriteria() throws PersistentException {
		this(orm.ProyectoPersistentManager.instance().getSession());
	}
	
	public orm.EvaluacionCriteria createEvaluacionCriteria() {
		return new orm.EvaluacionCriteria(createCriteria("ORM_Evaluacion"));
	}
	
	public Fechaevaluacion uniqueFechaevaluacion() {
		return (Fechaevaluacion) super.uniqueResult();
	}
	
	public Fechaevaluacion[] listFechaevaluacion() {
		java.util.List list = super.list();
		return (Fechaevaluacion[]) list.toArray(new Fechaevaluacion[list.size()]);
	}
}

