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

public class FacultadDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idFacultad;
	public final StringExpression nombre;
	public final CollectionExpression departamento;
	
	public FacultadDetachedCriteria() {
		super(orm.Facultad.class, orm.FacultadCriteria.class);
		idFacultad = new IntegerExpression("idFacultad", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		departamento = new CollectionExpression("ORM_Departamento", this.getDetachedCriteria());
	}
	
	public FacultadDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.FacultadCriteria.class);
		idFacultad = new IntegerExpression("idFacultad", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		departamento = new CollectionExpression("ORM_Departamento", this.getDetachedCriteria());
	}
	
	public orm.DepartamentoDetachedCriteria createDepartamentoCriteria() {
		return new orm.DepartamentoDetachedCriteria(createCriteria("ORM_Departamento"));
	}
	
	public Facultad uniqueFacultad(PersistentSession session) {
		return (Facultad) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Facultad[] listFacultad(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Facultad[]) list.toArray(new Facultad[list.size()]);
	}
}

