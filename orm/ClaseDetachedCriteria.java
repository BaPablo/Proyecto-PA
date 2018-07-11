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

public class ClaseDetachedCriteria extends AbstractORMDetachedCriteria {
	public final DateExpression fecha;
	public final IntegerExpression idClase;
	public final IntegerExpression asignaturaidAsignaturaId;
	public final AssociationExpression asignaturaidAsignatura;
	public final CollectionExpression asistencia;
	
	public ClaseDetachedCriteria() {
		super(orm.Clase.class, orm.ClaseCriteria.class);
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		idClase = new IntegerExpression("idClase", this.getDetachedCriteria());
		asignaturaidAsignaturaId = new IntegerExpression("asignaturaidAsignatura.idAsignatura", this.getDetachedCriteria());
		asignaturaidAsignatura = new AssociationExpression("asignaturaidAsignatura", this.getDetachedCriteria());
		asistencia = new CollectionExpression("ORM_Asistencia", this.getDetachedCriteria());
	}
	
	public ClaseDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ClaseCriteria.class);
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		idClase = new IntegerExpression("idClase", this.getDetachedCriteria());
		asignaturaidAsignaturaId = new IntegerExpression("asignaturaidAsignatura.idAsignatura", this.getDetachedCriteria());
		asignaturaidAsignatura = new AssociationExpression("asignaturaidAsignatura", this.getDetachedCriteria());
		asistencia = new CollectionExpression("ORM_Asistencia", this.getDetachedCriteria());
	}
	
	public AsignaturaDetachedCriteria createAsignaturaidAsignaturaCriteria() {
		return new AsignaturaDetachedCriteria(createCriteria("asignaturaidAsignatura"));
	}
	
	public orm.AsistenciaDetachedCriteria createAsistenciaCriteria() {
		return new orm.AsistenciaDetachedCriteria(createCriteria("ORM_Asistencia"));
	}
	
	public Clase uniqueClase(PersistentSession session) {
		return (Clase) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Clase[] listClase(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Clase[]) list.toArray(new Clase[list.size()]);
	}
}

