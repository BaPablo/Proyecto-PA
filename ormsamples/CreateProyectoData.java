/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProyectoData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.ProyectoPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Agrupacion oRMAgrupacion = orm.AgrupacionDAO.createAgrupacion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : alumno_idAlumno, fechaSalida, fechaIngreso, descripcion, nombre
			orm.AgrupacionDAO.save(oRMAgrupacion);
			orm.Alumno oRMAlumno = orm.AlumnoDAO.createAlumno();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : asistencia, ramaDeportiva_idRamaDeportiva, intereses_idIntereses, condicionSalud_idCondicionSalud, agrupacion_idAgrup, direccion_idDireccion, apoderado_idApoderado, utilizaBibliografiaRecomendada, planificaEstudio, estadoCivil, nacionalidad, email, telefonoMovil, telefonoFijo, sexo, fechaNacimiento, segundoApellido, primerApellido, segundoNombre, primerNombre, rutAlumno
			orm.AlumnoDAO.save(oRMAlumno);
			orm.Apoderado oRMApoderado = orm.ApoderadoDAO.createApoderado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : alumno, telefonoFijo, telefonoMovil, sexo, fechaNacimiento, email, segundoApellido, primerApellido, segundoNombre, primerNombre, rutApoderado
			orm.ApoderadoDAO.save(oRMApoderado);
			orm.Asignatura oRMAsignatura = orm.AsignaturaDAO.createAsignatura();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : clase, evaluacion, profesor_idProfesor, anio, semestre, librosRecomendados, aprendizajeEsperado, descripcion, creditos, duracion, horasExtraAula, horasIntraAula, nombre
			orm.AsignaturaDAO.save(oRMAsignatura);
			orm.Asistencia oRMAsistencia = orm.AsistenciaDAO.createAsistencia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : claseidClase, presente, idAsistencia
			orm.AsistenciaDAO.save(oRMAsistencia);
			orm.Condicionsalud oRMCondicionsalud = orm.CondicionsaludDAO.createCondicionsalud();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : alumno_idAlumno, fechaInicio, descripcion, nombre
			orm.CondicionsaludDAO.save(oRMCondicionsalud);
			orm.Departamento oRMDepartamento = orm.DepartamentoDAO.createDepartamento();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : profesor, facultad_idFacultad, nombre
			orm.DepartamentoDAO.save(oRMDepartamento);
			orm.Direccion oRMDireccion = orm.DireccionDAO.createDireccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : alumno, tipoDireccion, region, ciudad, comuna, calle
			orm.DireccionDAO.save(oRMDireccion);
			orm.Evaluacion oRMEvaluacion = orm.EvaluacionDAO.createEvaluacion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : lugar_idLugar, fechaEvaluacion_idFechaEvaluacion, asignatura_idAsignatura, calificacion, descripcion, tipoEvaluacion, nombre
			orm.EvaluacionDAO.save(oRMEvaluacion);
			orm.Facultad oRMFacultad = orm.FacultadDAO.createFacultad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : departamento, nombre
			orm.FacultadDAO.save(oRMFacultad);
			orm.Fechaevaluacion oRMFechaevaluacion = orm.FechaevaluacionDAO.createFechaevaluacion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : evaluacion, horaTermino, horaInicio, fechaTermino, fechaInicio
			orm.FechaevaluacionDAO.save(oRMFechaevaluacion);
			orm.Intereses oRMIntereses = orm.InteresesDAO.createIntereses();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : alumno_idAlumno, descripcion, nombre
			orm.InteresesDAO.save(oRMIntereses);
			orm.Lugar oRMLugar = orm.LugarDAO.createLugar();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : evaluacion, nombre
			orm.LugarDAO.save(oRMLugar);
			orm.Profesor oRMProfesor = orm.ProfesorDAO.createProfesor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : asignatura_idAsignatura, fechaTermino, departamento_idDepartamento, fechaIngreso, grado, telefonoMovil, email, sexo, fechaNacimiento, segundoApellido, primerApellido, segundoNombre, primerNombre, rutProfesor
			orm.ProfesorDAO.save(oRMProfesor);
			orm.Ramadeportiva oRMRamadeportiva = orm.RamadeportivaDAO.createRamadeportiva();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : alumno_idAlumno, fechaSaida, descripcion, profesorEncargado, fechaIngreso, nombre
			orm.RamadeportivaDAO.save(oRMRamadeportiva);
			orm.Clase oRMClase = orm.ClaseDAO.createClase();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : asistencia, asignaturaidAsignatura, fecha
			orm.ClaseDAO.save(oRMClase);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProyectoData createProyectoData = new CreateProyectoData();
			try {
				createProyectoData.createTestData();
			}
			finally {
				orm.ProyectoPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
