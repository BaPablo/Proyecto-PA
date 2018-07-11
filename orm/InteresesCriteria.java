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

public class InteresesCriteria extends AbstractORMCriteria {
	public final IntegerExpression idIntereses;
	public final StringExpression nombre;
	public final StringExpression descripcion;
	public final CollectionExpression alumno_idAlumno;
	
	public InteresesCriteria(Criteria criteria) {
		super(criteria);
		idIntereses = new IntegerExpression("idIntereses", this);
		nombre = new StringExpression("nombre", this);
		descripcion = new StringExpression("descripcion", this);
		alumno_idAlumno = new CollectionExpression("ORM_Alumno_idAlumno", this);
	}
	
	public InteresesCriteria(PersistentSession session) {
		this(session.createCriteria(Intereses.class));
	}
	
	public InteresesCriteria() throws PersistentException {
		this(orm.ProyectoPersistentManager.instance().getSession());
	}
	
	public orm.AlumnoCriteria createAlumno_idAlumnoCriteria() {
		return new orm.AlumnoCriteria(createCriteria("ORM_Alumno_idAlumno"));
	}
	
	public Intereses uniqueIntereses() {
		return (Intereses) super.uniqueResult();
	}
	
	public Intereses[] listIntereses() {
		java.util.List list = super.list();
		return (Intereses[]) list.toArray(new Intereses[list.size()]);
	}
}

