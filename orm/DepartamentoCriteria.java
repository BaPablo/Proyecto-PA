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

public class DepartamentoCriteria extends AbstractORMCriteria {
	public final IntegerExpression idDepartamento;
	public final StringExpression nombre;
	public final IntegerExpression facultad_idFacultadId;
	public final AssociationExpression facultad_idFacultad;
	public final CollectionExpression profesor;
	
	public DepartamentoCriteria(Criteria criteria) {
		super(criteria);
		idDepartamento = new IntegerExpression("idDepartamento", this);
		nombre = new StringExpression("nombre", this);
		facultad_idFacultadId = new IntegerExpression("facultad_idFacultad.idFacultad", this);
		facultad_idFacultad = new AssociationExpression("facultad_idFacultad", this);
		profesor = new CollectionExpression("ORM_Profesor", this);
	}
	
	public DepartamentoCriteria(PersistentSession session) {
		this(session.createCriteria(Departamento.class));
	}
	
	public DepartamentoCriteria() throws PersistentException {
		this(orm.ProyectoPersistentManager.instance().getSession());
	}
	
	public FacultadCriteria createFacultad_idFacultadCriteria() {
		return new FacultadCriteria(createCriteria("facultad_idFacultad"));
	}
	
	public orm.ProfesorCriteria createProfesorCriteria() {
		return new orm.ProfesorCriteria(createCriteria("ORM_Profesor"));
	}
	
	public Departamento uniqueDepartamento() {
		return (Departamento) super.uniqueResult();
	}
	
	public Departamento[] listDepartamento() {
		java.util.List list = super.list();
		return (Departamento[]) list.toArray(new Departamento[list.size()]);
	}
}

