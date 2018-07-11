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

public class ApoderadoCriteria extends AbstractORMCriteria {
	public final IntegerExpression idApoderado;
	public final StringExpression rutApoderado;
	public final StringExpression primerNombre;
	public final StringExpression segundoNombre;
	public final StringExpression primerApellido;
	public final StringExpression segundoApellido;
	public final StringExpression email;
	public final DateExpression fechaNacimiento;
	public final StringExpression sexo;
	public final StringExpression telefonoMovil;
	public final StringExpression telefonoFijo;
	public final CollectionExpression alumno;
	
	public ApoderadoCriteria(Criteria criteria) {
		super(criteria);
		idApoderado = new IntegerExpression("idApoderado", this);
		rutApoderado = new StringExpression("rutApoderado", this);
		primerNombre = new StringExpression("primerNombre", this);
		segundoNombre = new StringExpression("segundoNombre", this);
		primerApellido = new StringExpression("primerApellido", this);
		segundoApellido = new StringExpression("segundoApellido", this);
		email = new StringExpression("email", this);
		fechaNacimiento = new DateExpression("fechaNacimiento", this);
		sexo = new StringExpression("sexo", this);
		telefonoMovil = new StringExpression("telefonoMovil", this);
		telefonoFijo = new StringExpression("telefonoFijo", this);
		alumno = new CollectionExpression("ORM_Alumno", this);
	}
	
	public ApoderadoCriteria(PersistentSession session) {
		this(session.createCriteria(Apoderado.class));
	}
	
	public ApoderadoCriteria() throws PersistentException {
		this(orm.ProyectoPersistentManager.instance().getSession());
	}
	
	public orm.AlumnoCriteria createAlumnoCriteria() {
		return new orm.AlumnoCriteria(createCriteria("ORM_Alumno"));
	}
	
	public Apoderado uniqueApoderado() {
		return (Apoderado) super.uniqueResult();
	}
	
	public Apoderado[] listApoderado() {
		java.util.List list = super.list();
		return (Apoderado[]) list.toArray(new Apoderado[list.size()]);
	}
}

