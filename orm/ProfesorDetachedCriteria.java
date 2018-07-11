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

public class ProfesorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idProfesor;
	public final StringExpression rutProfesor;
	public final StringExpression primerNombre;
	public final StringExpression segundoNombre;
	public final StringExpression primerApellido;
	public final StringExpression segundoApellido;
	public final DateExpression fechaNacimiento;
	public final StringExpression sexo;
	public final StringExpression email;
	public final StringExpression telefonoMovil;
	public final StringExpression grado;
	public final DateExpression fechaIngreso;
	public final IntegerExpression departamento_idDepartamentoId;
	public final AssociationExpression departamento_idDepartamento;
	public final DateExpression fechaTermino;
	public final CollectionExpression asignatura_idAsignatura;
	
	public ProfesorDetachedCriteria() {
		super(orm.Profesor.class, orm.ProfesorCriteria.class);
		idProfesor = new IntegerExpression("idProfesor", this.getDetachedCriteria());
		rutProfesor = new StringExpression("rutProfesor", this.getDetachedCriteria());
		primerNombre = new StringExpression("primerNombre", this.getDetachedCriteria());
		segundoNombre = new StringExpression("segundoNombre", this.getDetachedCriteria());
		primerApellido = new StringExpression("primerApellido", this.getDetachedCriteria());
		segundoApellido = new StringExpression("segundoApellido", this.getDetachedCriteria());
		fechaNacimiento = new DateExpression("fechaNacimiento", this.getDetachedCriteria());
		sexo = new StringExpression("sexo", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		telefonoMovil = new StringExpression("telefonoMovil", this.getDetachedCriteria());
		grado = new StringExpression("grado", this.getDetachedCriteria());
		fechaIngreso = new DateExpression("fechaIngreso", this.getDetachedCriteria());
		departamento_idDepartamentoId = new IntegerExpression("departamento_idDepartamento.idDepartamento", this.getDetachedCriteria());
		departamento_idDepartamento = new AssociationExpression("departamento_idDepartamento", this.getDetachedCriteria());
		fechaTermino = new DateExpression("fechaTermino", this.getDetachedCriteria());
		asignatura_idAsignatura = new CollectionExpression("ORM_Asignatura_idAsignatura", this.getDetachedCriteria());
	}
	
	public ProfesorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ProfesorCriteria.class);
		idProfesor = new IntegerExpression("idProfesor", this.getDetachedCriteria());
		rutProfesor = new StringExpression("rutProfesor", this.getDetachedCriteria());
		primerNombre = new StringExpression("primerNombre", this.getDetachedCriteria());
		segundoNombre = new StringExpression("segundoNombre", this.getDetachedCriteria());
		primerApellido = new StringExpression("primerApellido", this.getDetachedCriteria());
		segundoApellido = new StringExpression("segundoApellido", this.getDetachedCriteria());
		fechaNacimiento = new DateExpression("fechaNacimiento", this.getDetachedCriteria());
		sexo = new StringExpression("sexo", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		telefonoMovil = new StringExpression("telefonoMovil", this.getDetachedCriteria());
		grado = new StringExpression("grado", this.getDetachedCriteria());
		fechaIngreso = new DateExpression("fechaIngreso", this.getDetachedCriteria());
		departamento_idDepartamentoId = new IntegerExpression("departamento_idDepartamento.idDepartamento", this.getDetachedCriteria());
		departamento_idDepartamento = new AssociationExpression("departamento_idDepartamento", this.getDetachedCriteria());
		fechaTermino = new DateExpression("fechaTermino", this.getDetachedCriteria());
		asignatura_idAsignatura = new CollectionExpression("ORM_Asignatura_idAsignatura", this.getDetachedCriteria());
	}
	
	public DepartamentoDetachedCriteria createDepartamento_idDepartamentoCriteria() {
		return new DepartamentoDetachedCriteria(createCriteria("departamento_idDepartamento"));
	}
	
	public orm.AsignaturaDetachedCriteria createAsignatura_idAsignaturaCriteria() {
		return new orm.AsignaturaDetachedCriteria(createCriteria("ORM_Asignatura_idAsignatura"));
	}
	
	public Profesor uniqueProfesor(PersistentSession session) {
		return (Profesor) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Profesor[] listProfesor(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Profesor[]) list.toArray(new Profesor[list.size()]);
	}
}

