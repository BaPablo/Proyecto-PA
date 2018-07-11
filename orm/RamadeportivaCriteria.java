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

public class RamadeportivaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idRamaDeportiva;
	public final StringExpression nombre;
	public final DateExpression fechaIngreso;
	public final StringExpression profesorEncargado;
	public final StringExpression descripcion;
	public final DateExpression fechaSaida;
	public final CollectionExpression alumno_idAlumno;
	
	public RamadeportivaCriteria(Criteria criteria) {
		super(criteria);
		idRamaDeportiva = new IntegerExpression("idRamaDeportiva", this);
		nombre = new StringExpression("nombre", this);
		fechaIngreso = new DateExpression("fechaIngreso", this);
		profesorEncargado = new StringExpression("profesorEncargado", this);
		descripcion = new StringExpression("descripcion", this);
		fechaSaida = new DateExpression("fechaSaida", this);
		alumno_idAlumno = new CollectionExpression("ORM_Alumno_idAlumno", this);
	}
	
	public RamadeportivaCriteria(PersistentSession session) {
		this(session.createCriteria(Ramadeportiva.class));
	}
	
	public RamadeportivaCriteria() throws PersistentException {
		this(orm.ProyectoPersistentManager.instance().getSession());
	}
	
	public orm.AlumnoCriteria createAlumno_idAlumnoCriteria() {
		return new orm.AlumnoCriteria(createCriteria("ORM_Alumno_idAlumno"));
	}
	
	public Ramadeportiva uniqueRamadeportiva() {
		return (Ramadeportiva) super.uniqueResult();
	}
	
	public Ramadeportiva[] listRamadeportiva() {
		java.util.List list = super.list();
		return (Ramadeportiva[]) list.toArray(new Ramadeportiva[list.size()]);
	}
}

