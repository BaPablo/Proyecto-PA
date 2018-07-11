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

public class LugarDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idLugar;
	public final StringExpression nombre;
	public final CollectionExpression evaluacion;
	
	public LugarDetachedCriteria() {
		super(orm.Lugar.class, orm.LugarCriteria.class);
		idLugar = new IntegerExpression("idLugar", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		evaluacion = new CollectionExpression("ORM_Evaluacion", this.getDetachedCriteria());
	}
	
	public LugarDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.LugarCriteria.class);
		idLugar = new IntegerExpression("idLugar", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		evaluacion = new CollectionExpression("ORM_Evaluacion", this.getDetachedCriteria());
	}
	
	public orm.EvaluacionDetachedCriteria createEvaluacionCriteria() {
		return new orm.EvaluacionDetachedCriteria(createCriteria("ORM_Evaluacion"));
	}
	
	public Lugar uniqueLugar(PersistentSession session) {
		return (Lugar) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Lugar[] listLugar(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Lugar[]) list.toArray(new Lugar[list.size()]);
	}
}

