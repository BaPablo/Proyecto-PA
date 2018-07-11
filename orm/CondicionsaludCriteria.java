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

public class CondicionsaludCriteria extends AbstractORMCriteria {
	public final IntegerExpression idCondicionSalud;
	public final StringExpression nombre;
	public final StringExpression descripcion;
	public final TimestampExpression fechaInicio;
	public final DateExpression fechaTermino;
	public final CollectionExpression alumno_idAlumno;
	
	public CondicionsaludCriteria(Criteria criteria) {
		super(criteria);
		idCondicionSalud = new IntegerExpression("idCondicionSalud", this);
		nombre = new StringExpression("nombre", this);
		descripcion = new StringExpression("descripcion", this);
		fechaInicio = new TimestampExpression("fechaInicio", this);
		fechaTermino = new DateExpression("fechaTermino", this);
		alumno_idAlumno = new CollectionExpression("ORM_Alumno_idAlumno", this);
	}
	
	public CondicionsaludCriteria(PersistentSession session) {
		this(session.createCriteria(Condicionsalud.class));
	}
	
	public CondicionsaludCriteria() throws PersistentException {
		this(orm.ProyectoPersistentManager.instance().getSession());
	}
	
	public orm.AlumnoCriteria createAlumno_idAlumnoCriteria() {
		return new orm.AlumnoCriteria(createCriteria("ORM_Alumno_idAlumno"));
	}
	
	public Condicionsalud uniqueCondicionsalud() {
		return (Condicionsalud) super.uniqueResult();
	}
	
	public Condicionsalud[] listCondicionsalud() {
		java.util.List list = super.list();
		return (Condicionsalud[]) list.toArray(new Condicionsalud[list.size()]);
	}
}

