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

public class ClaseCriteria extends AbstractORMCriteria {
	public final DateExpression fecha;
	public final IntegerExpression idClase;
	public final IntegerExpression asignaturaidAsignaturaId;
	public final AssociationExpression asignaturaidAsignatura;
	public final CollectionExpression asistencia;
	
	public ClaseCriteria(Criteria criteria) {
		super(criteria);
		fecha = new DateExpression("fecha", this);
		idClase = new IntegerExpression("idClase", this);
		asignaturaidAsignaturaId = new IntegerExpression("asignaturaidAsignatura.idAsignatura", this);
		asignaturaidAsignatura = new AssociationExpression("asignaturaidAsignatura", this);
		asistencia = new CollectionExpression("ORM_Asistencia", this);
	}
	
	public ClaseCriteria(PersistentSession session) {
		this(session.createCriteria(Clase.class));
	}
	
	public ClaseCriteria() throws PersistentException {
		this(orm.ProyectoPersistentManager.instance().getSession());
	}
	
	public AsignaturaCriteria createAsignaturaidAsignaturaCriteria() {
		return new AsignaturaCriteria(createCriteria("asignaturaidAsignatura"));
	}
	
	public orm.AsistenciaCriteria createAsistenciaCriteria() {
		return new orm.AsistenciaCriteria(createCriteria("ORM_Asistencia"));
	}
	
	public Clase uniqueClase() {
		return (Clase) super.uniqueResult();
	}
	
	public Clase[] listClase() {
		java.util.List list = super.list();
		return (Clase[]) list.toArray(new Clase[list.size()]);
	}
}

