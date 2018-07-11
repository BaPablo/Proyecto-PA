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

public class EvaluacionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idEvaluacion;
	public final StringExpression nombre;
	public final StringExpression tipoEvaluacion;
	public final StringExpression descripcion;
	public final IntegerExpression calificacion;
	public final IntegerExpression asignatura_idAsignaturaId;
	public final AssociationExpression asignatura_idAsignatura;
	public final IntegerExpression fechaEvaluacion_idFechaEvaluacionId;
	public final AssociationExpression fechaEvaluacion_idFechaEvaluacion;
	public final IntegerExpression lugar_idLugarId;
	public final AssociationExpression lugar_idLugar;
	
	public EvaluacionDetachedCriteria() {
		super(orm.Evaluacion.class, orm.EvaluacionCriteria.class);
		idEvaluacion = new IntegerExpression("idEvaluacion", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		tipoEvaluacion = new StringExpression("tipoEvaluacion", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		calificacion = new IntegerExpression("calificacion", this.getDetachedCriteria());
		asignatura_idAsignaturaId = new IntegerExpression("asignatura_idAsignatura.idAsignatura", this.getDetachedCriteria());
		asignatura_idAsignatura = new AssociationExpression("asignatura_idAsignatura", this.getDetachedCriteria());
		fechaEvaluacion_idFechaEvaluacionId = new IntegerExpression("fechaEvaluacion_idFechaEvaluacion.idFechaEvaluacion", this.getDetachedCriteria());
		fechaEvaluacion_idFechaEvaluacion = new AssociationExpression("fechaEvaluacion_idFechaEvaluacion", this.getDetachedCriteria());
		lugar_idLugarId = new IntegerExpression("lugar_idLugar.idLugar", this.getDetachedCriteria());
		lugar_idLugar = new AssociationExpression("lugar_idLugar", this.getDetachedCriteria());
	}
	
	public EvaluacionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.EvaluacionCriteria.class);
		idEvaluacion = new IntegerExpression("idEvaluacion", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		tipoEvaluacion = new StringExpression("tipoEvaluacion", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		calificacion = new IntegerExpression("calificacion", this.getDetachedCriteria());
		asignatura_idAsignaturaId = new IntegerExpression("asignatura_idAsignatura.idAsignatura", this.getDetachedCriteria());
		asignatura_idAsignatura = new AssociationExpression("asignatura_idAsignatura", this.getDetachedCriteria());
		fechaEvaluacion_idFechaEvaluacionId = new IntegerExpression("fechaEvaluacion_idFechaEvaluacion.idFechaEvaluacion", this.getDetachedCriteria());
		fechaEvaluacion_idFechaEvaluacion = new AssociationExpression("fechaEvaluacion_idFechaEvaluacion", this.getDetachedCriteria());
		lugar_idLugarId = new IntegerExpression("lugar_idLugar.idLugar", this.getDetachedCriteria());
		lugar_idLugar = new AssociationExpression("lugar_idLugar", this.getDetachedCriteria());
	}
	
	public AsignaturaDetachedCriteria createAsignatura_idAsignaturaCriteria() {
		return new AsignaturaDetachedCriteria(createCriteria("asignatura_idAsignatura"));
	}
	
	public FechaevaluacionDetachedCriteria createFechaEvaluacion_idFechaEvaluacionCriteria() {
		return new FechaevaluacionDetachedCriteria(createCriteria("fechaEvaluacion_idFechaEvaluacion"));
	}
	
	public LugarDetachedCriteria createLugar_idLugarCriteria() {
		return new LugarDetachedCriteria(createCriteria("lugar_idLugar"));
	}
	
	public Evaluacion uniqueEvaluacion(PersistentSession session) {
		return (Evaluacion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Evaluacion[] listEvaluacion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Evaluacion[]) list.toArray(new Evaluacion[list.size()]);
	}
}

