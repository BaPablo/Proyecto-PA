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

public class DireccionCriteria extends AbstractORMCriteria {
	public final IntegerExpression idDireccion;
	public final StringExpression calle;
	public final StringExpression comuna;
	public final StringExpression ciudad;
	public final StringExpression region;
	public final StringExpression tipoDireccion;
	public final CollectionExpression alumno;
	
	public DireccionCriteria(Criteria criteria) {
		super(criteria);
		idDireccion = new IntegerExpression("idDireccion", this);
		calle = new StringExpression("calle", this);
		comuna = new StringExpression("comuna", this);
		ciudad = new StringExpression("ciudad", this);
		region = new StringExpression("region", this);
		tipoDireccion = new StringExpression("tipoDireccion", this);
		alumno = new CollectionExpression("ORM_Alumno", this);
	}
	
	public DireccionCriteria(PersistentSession session) {
		this(session.createCriteria(Direccion.class));
	}
	
	public DireccionCriteria() throws PersistentException {
		this(orm.ProyectoPersistentManager.instance().getSession());
	}
	
	public orm.AlumnoCriteria createAlumnoCriteria() {
		return new orm.AlumnoCriteria(createCriteria("ORM_Alumno"));
	}
	
	public Direccion uniqueDireccion() {
		return (Direccion) super.uniqueResult();
	}
	
	public Direccion[] listDireccion() {
		java.util.List list = super.list();
		return (Direccion[]) list.toArray(new Direccion[list.size()]);
	}
}

