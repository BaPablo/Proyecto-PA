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

public class AlumnoDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public AlumnoDetachedCriteria() {
		super(orm.Alumno.class, orm.AlumnoCriteria.class);
		idAlumno = new IntegerExpression("idAlumno", this.getDetachedCriteria());
		rutAlumno = new StringExpression("rutAlumno", this.getDetachedCriteria());
		primerNombre = new StringExpression("primerNombre", this.getDetachedCriteria());
		segundoNombre = new StringExpression("segundoNombre", this.getDetachedCriteria());
		primerApellido = new StringExpression("primerApellido", this.getDetachedCriteria());
		segundoApellido = new StringExpression("segundoApellido", this.getDetachedCriteria());
		fechaNacimiento = new DateExpression("fechaNacimiento", this.getDetachedCriteria());
		sexo = new StringExpression("sexo", this.getDetachedCriteria());
		telefonoFijo = new StringExpression("telefonoFijo", this.getDetachedCriteria());
		telefonoMovil = new StringExpression("telefonoMovil", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		nacionalidad = new StringExpression("nacionalidad", this.getDetachedCriteria());
		estadoCivil = new StringExpression("estadoCivil", this.getDetachedCriteria());
		planificaEstudio = new ByteExpression("planificaEstudio", this.getDetachedCriteria());
		utilizaBibliografiaRecomendada = new ByteExpression("utilizaBibliografiaRecomendada", this.getDetachedCriteria());
		apoderado_idApoderadoId = new IntegerExpression("apoderado_idApoderado.idApoderado", this.getDetachedCriteria());
		apoderado_idApoderado = new AssociationExpression("apoderado_idApoderado", this.getDetachedCriteria());
		direccion_idDireccionId = new IntegerExpression("direccion_idDireccion.idDireccion", this.getDetachedCriteria());
		direccion_idDireccion = new AssociationExpression("direccion_idDireccion", this.getDetachedCriteria());
		agrupacion_idAgrup = new CollectionExpression("ORM_Agrupacion_idAgrup", this.getDetachedCriteria());
		condicionSalud_idCondicionSalud = new CollectionExpression("ORM_CondicionSalud_idCondicionSalud", this.getDetachedCriteria());
		intereses_idIntereses = new CollectionExpression("ORM_Intereses_idIntereses", this.getDetachedCriteria());
		ramaDeportiva_idRamaDeportiva = new CollectionExpression("ORM_RamaDeportiva_idRamaDeportiva", this.getDetachedCriteria());
		asistencia = new CollectionExpression("ORM_Asistencia", this.getDetachedCriteria());
	}
	
	public AlumnoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.AlumnoCriteria.class);
		idAlumno = new IntegerExpression("idAlumno", this.getDetachedCriteria());
		rutAlumno = new StringExpression("rutAlumno", this.getDetachedCriteria());
		primerNombre = new StringExpression("primerNombre", this.getDetachedCriteria());
		segundoNombre = new StringExpression("segundoNombre", this.getDetachedCriteria());
		primerApellido = new StringExpression("primerApellido", this.getDetachedCriteria());
		segundoApellido = new StringExpression("segundoApellido", this.getDetachedCriteria());
		fechaNacimiento = new DateExpression("fechaNacimiento", this.getDetachedCriteria());
		sexo = new StringExpression("sexo", this.getDetachedCriteria());
		telefonoFijo = new StringExpression("telefonoFijo", this.getDetachedCriteria());
		telefonoMovil = new StringExpression("telefonoMovil", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		nacionalidad = new StringExpression("nacionalidad", this.getDetachedCriteria());
		estadoCivil = new StringExpression("estadoCivil", this.getDetachedCriteria());
		planificaEstudio = new ByteExpression("planificaEstudio", this.getDetachedCriteria());
		utilizaBibliografiaRecomendada = new ByteExpression("utilizaBibliografiaRecomendada", this.getDetachedCriteria());
		apoderado_idApoderadoId = new IntegerExpression("apoderado_idApoderado.idApoderado", this.getDetachedCriteria());
		apoderado_idApoderado = new AssociationExpression("apoderado_idApoderado", this.getDetachedCriteria());
		direccion_idDireccionId = new IntegerExpression("direccion_idDireccion.idDireccion", this.getDetachedCriteria());
		direccion_idDireccion = new AssociationExpression("direccion_idDireccion", this.getDetachedCriteria());
		agrupacion_idAgrup = new CollectionExpression("ORM_Agrupacion_idAgrup", this.getDetachedCriteria());
		condicionSalud_idCondicionSalud = new CollectionExpression("ORM_CondicionSalud_idCondicionSalud", this.getDetachedCriteria());
		intereses_idIntereses = new CollectionExpression("ORM_Intereses_idIntereses", this.getDetachedCriteria());
		ramaDeportiva_idRamaDeportiva = new CollectionExpression("ORM_RamaDeportiva_idRamaDeportiva", this.getDetachedCriteria());
		asistencia = new CollectionExpression("ORM_Asistencia", this.getDetachedCriteria());
	}
	
	public ApoderadoDetachedCriteria createApoderado_idApoderadoCriteria() {
		return new ApoderadoDetachedCriteria(createCriteria("apoderado_idApoderado"));
	}
	
	public DireccionDetachedCriteria createDireccion_idDireccionCriteria() {
		return new DireccionDetachedCriteria(createCriteria("direccion_idDireccion"));
	}
	
	public orm.AgrupacionDetachedCriteria createAgrupacion_idAgrupCriteria() {
		return new orm.AgrupacionDetachedCriteria(createCriteria("ORM_Agrupacion_idAgrup"));
	}
	
	public orm.CondicionsaludDetachedCriteria createCondicionSalud_idCondicionSaludCriteria() {
		return new orm.CondicionsaludDetachedCriteria(createCriteria("ORM_CondicionSalud_idCondicionSalud"));
	}
	
	public orm.InteresesDetachedCriteria createIntereses_idInteresesCriteria() {
		return new orm.InteresesDetachedCriteria(createCriteria("ORM_Intereses_idIntereses"));
	}
	
	public orm.RamadeportivaDetachedCriteria createRamaDeportiva_idRamaDeportivaCriteria() {
		return new orm.RamadeportivaDetachedCriteria(createCriteria("ORM_RamaDeportiva_idRamaDeportiva"));
	}
	
	public orm.AsistenciaDetachedCriteria createAsistenciaCriteria() {
		return new orm.AsistenciaDetachedCriteria(createCriteria("ORM_Asistencia"));
	}
	
	public Alumno uniqueAlumno(PersistentSession session) {
		return (Alumno) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Alumno[] listAlumno(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Alumno[]) list.toArray(new Alumno[list.size()]);
	}
}

