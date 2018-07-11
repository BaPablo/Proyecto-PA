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

public class DepartamentoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idDepartamento;
	public final StringExpression nombre;
	public final IntegerExpression facultad_idFacultadId;
	public final AssociationExpression facultad_idFacultad;
	public final CollectionExpression profesor;
	
	public DepartamentoDetachedCriteria() {
		super(orm.Departamento.class, orm.DepartamentoCriteria.class);
		idDepartamento = new IntegerExpression("idDepartamento", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		facultad_idFacultadId = new IntegerExpression("facultad_idFacultad.idFacultad", this.getDetachedCriteria());
		facultad_idFacultad = new AssociationExpression("facultad_idFacultad", this.getDetachedCriteria());
		profesor = new CollectionExpression("ORM_Profesor", this.getDetachedCriteria());
	}
	
	public DepartamentoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.DepartamentoCriteria.class);
		idDepartamento = new IntegerExpression("idDepartamento", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		facultad_idFacultadId = new IntegerExpression("facultad_idFacultad.idFacultad", this.getDetachedCriteria());
		facultad_idFacultad = new AssociationExpression("facultad_idFacultad", this.getDetachedCriteria());
		profesor = new CollectionExpression("ORM_Profesor", this.getDetachedCriteria());
	}
	
	public FacultadDetachedCriteria createFacultad_idFacultadCriteria() {
		return new FacultadDetachedCriteria(createCriteria("facultad_idFacultad"));
	}
	
	public orm.ProfesorDetachedCriteria createProfesorCriteria() {
		return new orm.ProfesorDetachedCriteria(createCriteria("ORM_Profesor"));
	}
	
	public Departamento uniqueDepartamento(PersistentSession session) {
		return (Departamento) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Departamento[] listDepartamento(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Departamento[]) list.toArray(new Departamento[list.size()]);
	}
}

