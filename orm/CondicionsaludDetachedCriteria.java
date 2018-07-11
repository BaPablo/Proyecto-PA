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

public class CondicionsaludDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idCondicionSalud;
	public final StringExpression nombre;
	public final StringExpression descripcion;
	public final TimestampExpression fechaInicio;
	public final DateExpression fechaTermino;
	public final CollectionExpression alumno_idAlumno;
	
	public CondicionsaludDetachedCriteria() {
		super(orm.Condicionsalud.class, orm.CondicionsaludCriteria.class);
		idCondicionSalud = new IntegerExpression("idCondicionSalud", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		fechaInicio = new TimestampExpression("fechaInicio", this.getDetachedCriteria());
		fechaTermino = new DateExpression("fechaTermino", this.getDetachedCriteria());
		alumno_idAlumno = new CollectionExpression("ORM_Alumno_idAlumno", this.getDetachedCriteria());
	}
	
	public CondicionsaludDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.CondicionsaludCriteria.class);
		idCondicionSalud = new IntegerExpression("idCondicionSalud", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		fechaInicio = new TimestampExpression("fechaInicio", this.getDetachedCriteria());
		fechaTermino = new DateExpression("fechaTermino", this.getDetachedCriteria());
		alumno_idAlumno = new CollectionExpression("ORM_Alumno_idAlumno", this.getDetachedCriteria());
	}
	
	public orm.AlumnoDetachedCriteria createAlumno_idAlumnoCriteria() {
		return new orm.AlumnoDetachedCriteria(createCriteria("ORM_Alumno_idAlumno"));
	}
	
	public Condicionsalud uniqueCondicionsalud(PersistentSession session) {
		return (Condicionsalud) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Condicionsalud[] listCondicionsalud(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Condicionsalud[]) list.toArray(new Condicionsalud[list.size()]);
	}
}

