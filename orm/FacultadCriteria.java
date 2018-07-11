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

public class FacultadCriteria extends AbstractORMCriteria {
	public final IntegerExpression idFacultad;
	public final StringExpression nombre;
	public final CollectionExpression departamento;
	
	public FacultadCriteria(Criteria criteria) {
		super(criteria);
		idFacultad = new IntegerExpression("idFacultad", this);
		nombre = new StringExpression("nombre", this);
		departamento = new CollectionExpression("ORM_Departamento", this);
	}
	
	public FacultadCriteria(PersistentSession session) {
		this(session.createCriteria(Facultad.class));
	}
	
	public FacultadCriteria() throws PersistentException {
		this(orm.ProyectoPersistentManager.instance().getSession());
	}
	
	public orm.DepartamentoCriteria createDepartamentoCriteria() {
		return new orm.DepartamentoCriteria(createCriteria("ORM_Departamento"));
	}
	
	public Facultad uniqueFacultad() {
		return (Facultad) super.uniqueResult();
	}
	
	public Facultad[] listFacultad() {
		java.util.List list = super.list();
		return (Facultad[]) list.toArray(new Facultad[list.size()]);
	}
}

