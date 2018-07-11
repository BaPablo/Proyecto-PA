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

public class AsistenciaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idAsistencia;
	public final IntegerExpression alumno_idAlumnoId;
	public final AssociationExpression alumno_idAlumno;
	public final ByteExpression presente;
	public final IntegerExpression claseidClaseId;
	public final AssociationExpression claseidClase;
	
	public AsistenciaCriteria(Criteria criteria) {
		super(criteria);
		idAsistencia = new IntegerExpression("idAsistencia", this);
		alumno_idAlumnoId = new IntegerExpression("ORM_Alumno_idAlumno.idAlumno", this);
		alumno_idAlumno = new AssociationExpression("ORM_Alumno_idAlumno", this);
		presente = new ByteExpression("presente", this);
		claseidClaseId = new IntegerExpression("claseidClase.idClase", this);
		claseidClase = new AssociationExpression("claseidClase", this);
	}
	
	public AsistenciaCriteria(PersistentSession session) {
		this(session.createCriteria(Asistencia.class));
	}
	
	public AsistenciaCriteria() throws PersistentException {
		this(orm.ProyectoPersistentManager.instance().getSession());
	}
	
	public AlumnoCriteria createAlumno_idAlumnoCriteria() {
		return new AlumnoCriteria(createCriteria("ORM_Alumno_idAlumno"));
	}
	
	public ClaseCriteria createClaseidClaseCriteria() {
		return new ClaseCriteria(createCriteria("claseidClase"));
	}
	
	public Asistencia uniqueAsistencia() {
		return (Asistencia) super.uniqueResult();
	}
	
	public Asistencia[] listAsistencia() {
		java.util.List list = super.list();
		return (Asistencia[]) list.toArray(new Asistencia[list.size()]);
	}
}

