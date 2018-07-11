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

public class LugarCriteria extends AbstractORMCriteria {
	public final IntegerExpression idLugar;
	public final StringExpression nombre;
	public final CollectionExpression evaluacion;
	
	public LugarCriteria(Criteria criteria) {
		super(criteria);
		idLugar = new IntegerExpression("idLugar", this);
		nombre = new StringExpression("nombre", this);
		evaluacion = new CollectionExpression("ORM_Evaluacion", this);
	}
	
	public LugarCriteria(PersistentSession session) {
		this(session.createCriteria(Lugar.class));
	}
	
	public LugarCriteria() throws PersistentException {
		this(orm.ProyectoPersistentManager.instance().getSession());
	}
	
	public orm.EvaluacionCriteria createEvaluacionCriteria() {
		return new orm.EvaluacionCriteria(createCriteria("ORM_Evaluacion"));
	}
	
	public Lugar uniqueLugar() {
		return (Lugar) super.uniqueResult();
	}
	
	public Lugar[] listLugar() {
		java.util.List list = super.list();
		return (Lugar[]) list.toArray(new Lugar[list.size()]);
	}
}

