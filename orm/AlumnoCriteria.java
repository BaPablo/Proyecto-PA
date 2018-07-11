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

public class AlumnoCriteria extends AbstractORMCriteria {
	public final IntegerExpression idAlumno;
	public final StringExpression rutAlumno;
	public final StringExpression primerNombre;
	public final StringExpression segundoNombre;
	public final StringExpression primerApellido;
	public final StringExpression segundoApellido;
	public final DateExpression fechaNacimiento;
	public final StringExpression sexo;
	public final StringExpression telefonoFijo;
	public final StringExpression telefonoMovil;
	public final StringExpression email;
	public final StringExpression nacionalidad;
	public final StringExpression estadoCivil;
	public final ByteExpression planificaEstudio;
	public final ByteExpression utilizaBibliografiaRecomendada;
	public final IntegerExpression apoderado_idApoderadoId;
	public final AssociationExpression apoderado_idApoderado;
	public final IntegerExpression direccion_idDireccionId;
	public final AssociationExpression direccion_idDireccion;
	public final CollectionExpression agrupacion_idAgrup;
	public final CollectionExpression condicionSalud_idCondicionSalud;
	public final CollectionExpression intereses_idIntereses;
	public final CollectionExpression ramaDeportiva_idRamaDeportiva;
	public final CollectionExpression asistencia;
	
	public AlumnoCriteria(Criteria criteria) {
		super(criteria);
		idAlumno = new IntegerExpression("idAlumno", this);
		rutAlumno = new StringExpression("rutAlumno", this);
		primerNombre = new StringExpression("primerNombre", this);
		segundoNombre = new StringExpression("segundoNombre", this);
		primerApellido = new StringExpression("primerApellido", this);
		segundoApellido = new StringExpression("segundoApellido", this);
		fechaNacimiento = new DateExpression("fechaNacimiento", this);
		sexo = new StringExpression("sexo", this);
		telefonoFijo = new StringExpression("telefonoFijo", this);
		telefonoMovil = new StringExpression("telefonoMovil", this);
		email = new StringExpression("email", this);
		nacionalidad = new StringExpression("nacionalidad", this);
		estadoCivil = new StringExpression("estadoCivil", this);
		planificaEstudio = new ByteExpression("planificaEstudio", this);
		utilizaBibliografiaRecomendada = new ByteExpression("utilizaBibliografiaRecomendada", this);
		apoderado_idApoderadoId = new IntegerExpression("apoderado_idApoderado.idApoderado", this);
		apoderado_idApoderado = new AssociationExpression("apoderado_idApoderado", this);
		direccion_idDireccionId = new IntegerExpression("direccion_idDireccion.idDireccion", this);
		direccion_idDireccion = new AssociationExpression("direccion_idDireccion", this);
		agrupacion_idAgrup = new CollectionExpression("ORM_Agrupacion_idAgrup", this);
		condicionSalud_idCondicionSalud = new CollectionExpression("ORM_CondicionSalud_idCondicionSalud", this);
		intereses_idIntereses = new CollectionExpression("ORM_Intereses_idIntereses", this);
		ramaDeportiva_idRamaDeportiva = new CollectionExpression("ORM_RamaDeportiva_idRamaDeportiva", this);
		asistencia = new CollectionExpression("ORM_Asistencia", this);
	}
	
	public AlumnoCriteria(PersistentSession session) {
		this(session.createCriteria(Alumno.class));
	}
	
	public AlumnoCriteria() throws PersistentException {
		this(orm.ProyectoPersistentManager.instance().getSession());
	}
	
	public ApoderadoCriteria createApoderado_idApoderadoCriteria() {
		return new ApoderadoCriteria(createCriteria("apoderado_idApoderado"));
	}
	
	public DireccionCriteria createDireccion_idDireccionCriteria() {
		return new DireccionCriteria(createCriteria("direccion_idDireccion"));
	}
	
	public orm.AgrupacionCriteria createAgrupacion_idAgrupCriteria() {
		return new orm.AgrupacionCriteria(createCriteria("ORM_Agrupacion_idAgrup"));
	}
	
	public orm.CondicionsaludCriteria createCondicionSalud_idCondicionSaludCriteria() {
		return new orm.CondicionsaludCriteria(createCriteria("ORM_CondicionSalud_idCondicionSalud"));
	}
	
	public orm.InteresesCriteria createIntereses_idInteresesCriteria() {
		return new orm.InteresesCriteria(createCriteria("ORM_Intereses_idIntereses"));
	}
	
	public orm.RamadeportivaCriteria createRamaDeportiva_idRamaDeportivaCriteria() {
		return new orm.RamadeportivaCriteria(createCriteria("ORM_RamaDeportiva_idRamaDeportiva"));
	}
	
	public orm.AsistenciaCriteria createAsistenciaCriteria() {
		return new orm.AsistenciaCriteria(createCriteria("ORM_Asistencia"));
	}
	
	public Alumno uniqueAlumno() {
		return (Alumno) super.uniqueResult();
	}
	
	public Alumno[] listAlumno() {
		java.util.List list = super.list();
		return (Alumno[]) list.toArray(new Alumno[list.size()]);
	}
}

