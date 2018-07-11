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

public class AsistenciaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idAsistencia;
	public final IntegerExpression alumno_idAlumnoId;
	public final AssociationExpression alumno_idAlumno;
	public final ByteExpression presente;
	public final IntegerExpression claseidClaseId;
	public final AssociationExpression claseidClase;
	
	public AsistenciaDetachedCriteria() {
		super(orm.Asistencia.class, orm.AsistenciaCriteria.class);
		idAsistencia = new IntegerExpression("idAsistencia", this.getDetachedCriteria());
		alumno_idAlumnoId = new IntegerExpression("ORM_Alumno_idAlumno.idAlumno", this.getDetachedCriteria());
		alumno_idAlumno = new AssociationExpression("ORM_Alumno_idAlumno", this.getDetachedCriteria());
		presente = new ByteExpression("presente", this.getDetachedCriteria());
		claseidClaseId = new IntegerExpression("claseidClase.idClase", this.getDetachedCriteria());
		claseidClase = new AssociationExpression("claseidClase", this.getDetachedCriteria());
	}
	
	public AsistenciaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.AsistenciaCriteria.class);
		idAsistencia = new IntegerExpression("idAsistencia", this.getDetachedCriteria());
		alumno_idAlumnoId = new IntegerExpression("ORM_Alumno_idAlumno.idAlumno", this.getDetachedCriteria());
		alumno_idAlumno = new AssociationExpression("ORM_Alumno_idAlumno", this.getDetachedCriteria());
		presente = new ByteExpression("presente", this.getDetachedCriteria());
		claseidClaseId = new IntegerExpression("claseidClase.idClase", this.getDetachedCriteria());
		claseidClase = new AssociationExpression("claseidClase", this.getDetachedCriteria());
	}
	
	public AlumnoDetachedCriteria createAlumno_idAlumnoCriteria() {
		return new AlumnoDetachedCriteria(createCriteria("ORM_Alumno_idAlumno"));
	}
	
	public ClaseDetachedCriteria createClaseidClaseCriteria() {
		return new ClaseDetachedCriteria(createCriteria("claseidClase"));
	}
	
	public Asistencia uniqueAsistencia(PersistentSession session) {
		return (Asistencia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Asistencia[] listAsistencia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Asistencia[]) list.toArray(new Asistencia[list.size()]);
	}
}

