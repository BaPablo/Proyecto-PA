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

public class ProfesorCriteria extends AbstractORMCriteria {
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
	
	public ProfesorCriteria(Criteria criteria) {
		super(criteria);
		idProfesor = new IntegerExpression("idProfesor", this);
		rutProfesor = new StringExpression("rutProfesor", this);
		primerNombre = new StringExpression("primerNombre", this);
		segundoNombre = new StringExpression("segundoNombre", this);
		primerApellido = new StringExpression("primerApellido", this);
		segundoApellido = new StringExpression("segundoApellido", this);
		fechaNacimiento = new DateExpression("fechaNacimiento", this);
		sexo = new StringExpression("sexo", this);
		email = new StringExpression("email", this);
		telefonoMovil = new StringExpression("telefonoMovil", this);
		grado = new StringExpression("grado", this);
		fechaIngreso = new DateExpression("fechaIngreso", this);
		departamento_idDepartamentoId = new IntegerExpression("departamento_idDepartamento.idDepartamento", this);
		departamento_idDepartamento = new AssociationExpression("departamento_idDepartamento", this);
		fechaTermino = new DateExpression("fechaTermino", this);
		asignatura_idAsignatura = new CollectionExpression("ORM_Asignatura_idAsignatura", this);
	}
	
	public ProfesorCriteria(PersistentSession session) {
		this(session.createCriteria(Profesor.class));
	}
	
	public ProfesorCriteria() throws PersistentException {
		this(orm.ProyectoPersistentManager.instance().getSession());
	}
	
	public DepartamentoCriteria createDepartamento_idDepartamentoCriteria() {
		return new DepartamentoCriteria(createCriteria("departamento_idDepartamento"));
	}
	
	public orm.AsignaturaCriteria createAsignatura_idAsignaturaCriteria() {
		return new orm.AsignaturaCriteria(createCriteria("ORM_Asignatura_idAsignatura"));
	}
	
	public Profesor uniqueProfesor() {
		return (Profesor) super.uniqueResult();
	}
	
	public Profesor[] listProfesor() {
		java.util.List list = super.list();
		return (Profesor[]) list.toArray(new Profesor[list.size()]);
	}
}

