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

public class ApoderadoDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public ApoderadoDetachedCriteria() {
		super(orm.Apoderado.class, orm.ApoderadoCriteria.class);
		idApoderado = new IntegerExpression("idApoderado", this.getDetachedCriteria());
		rutApoderado = new StringExpression("rutApoderado", this.getDetachedCriteria());
		primerNombre = new StringExpression("primerNombre", this.getDetachedCriteria());
		segundoNombre = new StringExpression("segundoNombre", this.getDetachedCriteria());
		primerApellido = new StringExpression("primerApellido", this.getDetachedCriteria());
		segundoApellido = new StringExpression("segundoApellido", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		fechaNacimiento = new DateExpression("fechaNacimiento", this.getDetachedCriteria());
		sexo = new StringExpression("sexo", this.getDetachedCriteria());
		telefonoMovil = new StringExpression("telefonoMovil", this.getDetachedCriteria());
		telefonoFijo = new StringExpression("telefonoFijo", this.getDetachedCriteria());
		alumno = new CollectionExpression("ORM_Alumno", this.getDetachedCriteria());
	}
	
	public ApoderadoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ApoderadoCriteria.class);
		idApoderado = new IntegerExpression("idApoderado", this.getDetachedCriteria());
		rutApoderado = new StringExpression("rutApoderado", this.getDetachedCriteria());
		primerNombre = new StringExpression("primerNombre", this.getDetachedCriteria());
		segundoNombre = new StringExpression("segundoNombre", this.getDetachedCriteria());
		primerApellido = new StringExpression("primerApellido", this.getDetachedCriteria());
		segundoApellido = new StringExpression("segundoApellido", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		fechaNacimiento = new DateExpression("fechaNacimiento", this.getDetachedCriteria());
		sexo = new StringExpression("sexo", this.getDetachedCriteria());
		telefonoMovil = new StringExpression("telefonoMovil", this.getDetachedCriteria());
		telefonoFijo = new StringExpression("telefonoFijo", this.getDetachedCriteria());
		alumno = new CollectionExpression("ORM_Alumno", this.getDetachedCriteria());
	}
	
	public orm.AlumnoDetachedCriteria createAlumnoCriteria() {
		return new orm.AlumnoDetachedCriteria(createCriteria("ORM_Alumno"));
	}
	
	public Apoderado uniqueApoderado(PersistentSession session) {
		return (Apoderado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Apoderado[] listApoderado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Apoderado[]) list.toArray(new Apoderado[list.size()]);
	}
}

