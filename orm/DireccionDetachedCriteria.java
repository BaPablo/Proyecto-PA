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

public class DireccionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idDireccion;
	public final StringExpression calle;
	public final StringExpression comuna;
	public final StringExpression ciudad;
	public final StringExpression region;
	public final StringExpression tipoDireccion;
	public final CollectionExpression alumno;
	
	public DireccionDetachedCriteria() {
		super(orm.Direccion.class, orm.DireccionCriteria.class);
		idDireccion = new IntegerExpression("idDireccion", this.getDetachedCriteria());
		calle = new StringExpression("calle", this.getDetachedCriteria());
		comuna = new StringExpression("comuna", this.getDetachedCriteria());
		ciudad = new StringExpression("ciudad", this.getDetachedCriteria());
		region = new StringExpression("region", this.getDetachedCriteria());
		tipoDireccion = new StringExpression("tipoDireccion", this.getDetachedCriteria());
		alumno = new CollectionExpression("ORM_Alumno", this.getDetachedCriteria());
	}
	
	public DireccionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.DireccionCriteria.class);
		idDireccion = new IntegerExpression("idDireccion", this.getDetachedCriteria());
		calle = new StringExpression("calle", this.getDetachedCriteria());
		comuna = new StringExpression("comuna", this.getDetachedCriteria());
		ciudad = new StringExpression("ciudad", this.getDetachedCriteria());
		region = new StringExpression("region", this.getDetachedCriteria());
		tipoDireccion = new StringExpression("tipoDireccion", this.getDetachedCriteria());
		alumno = new CollectionExpression("ORM_Alumno", this.getDetachedCriteria());
	}
	
	public orm.AlumnoDetachedCriteria createAlumnoCriteria() {
		return new orm.AlumnoDetachedCriteria(createCriteria("ORM_Alumno"));
	}
	
	public Direccion uniqueDireccion(PersistentSession session) {
		return (Direccion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Direccion[] listDireccion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Direccion[]) list.toArray(new Direccion[list.size()]);
	}
}

