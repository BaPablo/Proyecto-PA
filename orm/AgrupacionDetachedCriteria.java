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

public class AgrupacionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idAgrup;
	public final StringExpression nombre;
	public final StringExpression descripcion;
	public final DateExpression fechaIngreso;
	public final DateExpression fechaSalida;
	public final CollectionExpression alumno_idAlumno;
	
	public AgrupacionDetachedCriteria() {
		super(orm.Agrupacion.class, orm.AgrupacionCriteria.class);
		idAgrup = new IntegerExpression("idAgrup", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		fechaIngreso = new DateExpression("fechaIngreso", this.getDetachedCriteria());
		fechaSalida = new DateExpression("fechaSalida", this.getDetachedCriteria());
		alumno_idAlumno = new CollectionExpression("ORM_Alumno_idAlumno", this.getDetachedCriteria());
	}
	
	public AgrupacionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.AgrupacionCriteria.class);
		idAgrup = new IntegerExpression("idAgrup", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		fechaIngreso = new DateExpression("fechaIngreso", this.getDetachedCriteria());
		fechaSalida = new DateExpression("fechaSalida", this.getDetachedCriteria());
		alumno_idAlumno = new CollectionExpression("ORM_Alumno_idAlumno", this.getDetachedCriteria());
	}
	
	public orm.AlumnoDetachedCriteria createAlumno_idAlumnoCriteria() {
		return new orm.AlumnoDetachedCriteria(createCriteria("ORM_Alumno_idAlumno"));
	}
	
	public Agrupacion uniqueAgrupacion(PersistentSession session) {
		return (Agrupacion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Agrupacion[] listAgrupacion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Agrupacion[]) list.toArray(new Agrupacion[list.size()]);
	}
}

