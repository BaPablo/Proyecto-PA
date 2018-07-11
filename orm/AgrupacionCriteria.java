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

public class AgrupacionCriteria extends AbstractORMCriteria {
	public final IntegerExpression idAgrup;
	public final StringExpression nombre;
	public final StringExpression descripcion;
	public final DateExpression fechaIngreso;
	public final DateExpression fechaSalida;
	public final CollectionExpression alumno_idAlumno;
	
	public AgrupacionCriteria(Criteria criteria) {
		super(criteria);
		idAgrup = new IntegerExpression("idAgrup", this);
		nombre = new StringExpression("nombre", this);
		descripcion = new StringExpression("descripcion", this);
		fechaIngreso = new DateExpression("fechaIngreso", this);
		fechaSalida = new DateExpression("fechaSalida", this);
		alumno_idAlumno = new CollectionExpression("ORM_Alumno_idAlumno", this);
	}
	
	public AgrupacionCriteria(PersistentSession session) {
		this(session.createCriteria(Agrupacion.class));
	}
	
	public AgrupacionCriteria() throws PersistentException {
		this(orm.ProyectoPersistentManager.instance().getSession());
	}
	
	public orm.AlumnoCriteria createAlumno_idAlumnoCriteria() {
		return new orm.AlumnoCriteria(createCriteria("ORM_Alumno_idAlumno"));
	}
	
	public Agrupacion uniqueAgrupacion() {
		return (Agrupacion) super.uniqueResult();
	}
	
	public Agrupacion[] listAgrupacion() {
		java.util.List list = super.list();
		return (Agrupacion[]) list.toArray(new Agrupacion[list.size()]);
	}
}

