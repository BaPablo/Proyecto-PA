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

public class InteresesDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idIntereses;
	public final StringExpression nombre;
	public final StringExpression descripcion;
	public final CollectionExpression alumno_idAlumno;
	
	public InteresesDetachedCriteria() {
		super(orm.Intereses.class, orm.InteresesCriteria.class);
		idIntereses = new IntegerExpression("idIntereses", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		alumno_idAlumno = new CollectionExpression("ORM_Alumno_idAlumno", this.getDetachedCriteria());
	}
	
	public InteresesDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.InteresesCriteria.class);
		idIntereses = new IntegerExpression("idIntereses", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		alumno_idAlumno = new CollectionExpression("ORM_Alumno_idAlumno", this.getDetachedCriteria());
	}
	
	public orm.AlumnoDetachedCriteria createAlumno_idAlumnoCriteria() {
		return new orm.AlumnoDetachedCriteria(createCriteria("ORM_Alumno_idAlumno"));
	}
	
	public Intereses uniqueIntereses(PersistentSession session) {
		return (Intereses) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Intereses[] listIntereses(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Intereses[]) list.toArray(new Intereses[list.size()]);
	}
}

