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

public class FechaevaluacionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idFechaEvaluacion;
	public final DateExpression fechaInicio;
	public final DateExpression fechaTermino;
	public final TimeExpression horaInicio;
	public final TimeExpression horaTermino;
	public final CollectionExpression evaluacion;
	
	public FechaevaluacionDetachedCriteria() {
		super(orm.Fechaevaluacion.class, orm.FechaevaluacionCriteria.class);
		idFechaEvaluacion = new IntegerExpression("idFechaEvaluacion", this.getDetachedCriteria());
		fechaInicio = new DateExpression("fechaInicio", this.getDetachedCriteria());
		fechaTermino = new DateExpression("fechaTermino", this.getDetachedCriteria());
		horaInicio = new TimeExpression("horaInicio", this.getDetachedCriteria());
		horaTermino = new TimeExpression("horaTermino", this.getDetachedCriteria());
		evaluacion = new CollectionExpression("ORM_Evaluacion", this.getDetachedCriteria());
	}
	
	public FechaevaluacionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.FechaevaluacionCriteria.class);
		idFechaEvaluacion = new IntegerExpression("idFechaEvaluacion", this.getDetachedCriteria());
		fechaInicio = new DateExpression("fechaInicio", this.getDetachedCriteria());
		fechaTermino = new DateExpression("fechaTermino", this.getDetachedCriteria());
		horaInicio = new TimeExpression("horaInicio", this.getDetachedCriteria());
		horaTermino = new TimeExpression("horaTermino", this.getDetachedCriteria());
		evaluacion = new CollectionExpression("ORM_Evaluacion", this.getDetachedCriteria());
	}
	
	public orm.EvaluacionDetachedCriteria createEvaluacionCriteria() {
		return new orm.EvaluacionDetachedCriteria(createCriteria("ORM_Evaluacion"));
	}
	
	public Fechaevaluacion uniqueFechaevaluacion(PersistentSession session) {
		return (Fechaevaluacion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Fechaevaluacion[] listFechaevaluacion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Fechaevaluacion[]) list.toArray(new Fechaevaluacion[list.size()]);
	}
}

