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

public class RamadeportivaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idRamaDeportiva;
	public final StringExpression nombre;
	public final DateExpression fechaIngreso;
	public final StringExpression profesorEncargado;
	public final StringExpression descripcion;
	public final DateExpression fechaSaida;
	public final CollectionExpression alumno_idAlumno;
	
	public RamadeportivaDetachedCriteria() {
		super(orm.Ramadeportiva.class, orm.RamadeportivaCriteria.class);
		idRamaDeportiva = new IntegerExpression("idRamaDeportiva", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		fechaIngreso = new DateExpression("fechaIngreso", this.getDetachedCriteria());
		profesorEncargado = new StringExpression("profesorEncargado", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		fechaSaida = new DateExpression("fechaSaida", this.getDetachedCriteria());
		alumno_idAlumno = new CollectionExpression("ORM_Alumno_idAlumno", this.getDetachedCriteria());
	}
	
	public RamadeportivaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.RamadeportivaCriteria.class);
		idRamaDeportiva = new IntegerExpression("idRamaDeportiva", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		fechaIngreso = new DateExpression("fechaIngreso", this.getDetachedCriteria());
		profesorEncargado = new StringExpression("profesorEncargado", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		fechaSaida = new DateExpression("fechaSaida", this.getDetachedCriteria());
		alumno_idAlumno = new CollectionExpression("ORM_Alumno_idAlumno", this.getDetachedCriteria());
	}
	
	public orm.AlumnoDetachedCriteria createAlumno_idAlumnoCriteria() {
		return new orm.AlumnoDetachedCriteria(createCriteria("ORM_Alumno_idAlumno"));
	}
	
	public Ramadeportiva uniqueRamadeportiva(PersistentSession session) {
		return (Ramadeportiva) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Ramadeportiva[] listRamadeportiva(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Ramadeportiva[]) list.toArray(new Ramadeportiva[list.size()]);
	}
}

