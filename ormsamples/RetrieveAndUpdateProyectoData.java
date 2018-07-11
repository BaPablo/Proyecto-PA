/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProyectoData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.ProyectoPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Agrupacion oRMAgrupacion = orm.AgrupacionDAO.loadAgrupacionByQuery(null, null);
			// Update the properties of the persistent object
			orm.AgrupacionDAO.save(oRMAgrupacion);
			orm.Alumno oRMAlumno = orm.AlumnoDAO.loadAlumnoByQuery(null, null);
			// Update the properties of the persistent object
			orm.AlumnoDAO.save(oRMAlumno);
			orm.Apoderado oRMApoderado = orm.ApoderadoDAO.loadApoderadoByQuery(null, null);
			// Update the properties of the persistent object
			orm.ApoderadoDAO.save(oRMApoderado);
			orm.Asignatura oRMAsignatura = orm.AsignaturaDAO.loadAsignaturaByQuery(null, null);
			// Update the properties of the persistent object
			orm.AsignaturaDAO.save(oRMAsignatura);
			orm.Asistencia oRMAsistencia = orm.AsistenciaDAO.loadAsistenciaByQuery(null, null);
			// Update the properties of the persistent object
			orm.AsistenciaDAO.save(oRMAsistencia);
			orm.Condicionsalud oRMCondicionsalud = orm.CondicionsaludDAO.loadCondicionsaludByQuery(null, null);
			// Update the properties of the persistent object
			orm.CondicionsaludDAO.save(oRMCondicionsalud);
			orm.Departamento oRMDepartamento = orm.DepartamentoDAO.loadDepartamentoByQuery(null, null);
			// Update the properties of the persistent object
			orm.DepartamentoDAO.save(oRMDepartamento);
			orm.Direccion oRMDireccion = orm.DireccionDAO.loadDireccionByQuery(null, null);
			// Update the properties of the persistent object
			orm.DireccionDAO.save(oRMDireccion);
			orm.Evaluacion oRMEvaluacion = orm.EvaluacionDAO.loadEvaluacionByQuery(null, null);
			// Update the properties of the persistent object
			orm.EvaluacionDAO.save(oRMEvaluacion);
			orm.Facultad oRMFacultad = orm.FacultadDAO.loadFacultadByQuery(null, null);
			// Update the properties of the persistent object
			orm.FacultadDAO.save(oRMFacultad);
			orm.Fechaevaluacion oRMFechaevaluacion = orm.FechaevaluacionDAO.loadFechaevaluacionByQuery(null, null);
			// Update the properties of the persistent object
			orm.FechaevaluacionDAO.save(oRMFechaevaluacion);
			orm.Intereses oRMIntereses = orm.InteresesDAO.loadInteresesByQuery(null, null);
			// Update the properties of the persistent object
			orm.InteresesDAO.save(oRMIntereses);
			orm.Lugar oRMLugar = orm.LugarDAO.loadLugarByQuery(null, null);
			// Update the properties of the persistent object
			orm.LugarDAO.save(oRMLugar);
			orm.Profesor oRMProfesor = orm.ProfesorDAO.loadProfesorByQuery(null, null);
			// Update the properties of the persistent object
			orm.ProfesorDAO.save(oRMProfesor);
			orm.Ramadeportiva oRMRamadeportiva = orm.RamadeportivaDAO.loadRamadeportivaByQuery(null, null);
			// Update the properties of the persistent object
			orm.RamadeportivaDAO.save(oRMRamadeportiva);
			orm.Clase oRMClase = orm.ClaseDAO.loadClaseByQuery(null, null);
			// Update the properties of the persistent object
			orm.ClaseDAO.save(oRMClase);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Agrupacion by AgrupacionCriteria");
		orm.AgrupacionCriteria oRMAgrupacionCriteria = new orm.AgrupacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMAgrupacionCriteria.idAgrup.eq();
		System.out.println(oRMAgrupacionCriteria.uniqueAgrupacion());
		
		System.out.println("Retrieving Alumno by AlumnoCriteria");
		orm.AlumnoCriteria oRMAlumnoCriteria = new orm.AlumnoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMAlumnoCriteria.idAlumno.eq();
		System.out.println(oRMAlumnoCriteria.uniqueAlumno());
		
		System.out.println("Retrieving Apoderado by ApoderadoCriteria");
		orm.ApoderadoCriteria oRMApoderadoCriteria = new orm.ApoderadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMApoderadoCriteria.idApoderado.eq();
		System.out.println(oRMApoderadoCriteria.uniqueApoderado());
		
		System.out.println("Retrieving Asignatura by AsignaturaCriteria");
		orm.AsignaturaCriteria oRMAsignaturaCriteria = new orm.AsignaturaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMAsignaturaCriteria.idAsignatura.eq();
		System.out.println(oRMAsignaturaCriteria.uniqueAsignatura());
		
		System.out.println("Retrieving Asistencia by AsistenciaCriteria");
		orm.AsistenciaCriteria oRMAsistenciaCriteria = new orm.AsistenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMAsistenciaCriteria.idAsistencia.eq();
		//oRMAsistenciaCriteria.alumno_idAlumno.eq();
		System.out.println(oRMAsistenciaCriteria.uniqueAsistencia());
		
		System.out.println("Retrieving Condicionsalud by CondicionsaludCriteria");
		orm.CondicionsaludCriteria oRMCondicionsaludCriteria = new orm.CondicionsaludCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMCondicionsaludCriteria.idCondicionSalud.eq();
		System.out.println(oRMCondicionsaludCriteria.uniqueCondicionsalud());
		
		System.out.println("Retrieving Departamento by DepartamentoCriteria");
		orm.DepartamentoCriteria oRMDepartamentoCriteria = new orm.DepartamentoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMDepartamentoCriteria.idDepartamento.eq();
		System.out.println(oRMDepartamentoCriteria.uniqueDepartamento());
		
		System.out.println("Retrieving Direccion by DireccionCriteria");
		orm.DireccionCriteria oRMDireccionCriteria = new orm.DireccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMDireccionCriteria.idDireccion.eq();
		System.out.println(oRMDireccionCriteria.uniqueDireccion());
		
		System.out.println("Retrieving Evaluacion by EvaluacionCriteria");
		orm.EvaluacionCriteria oRMEvaluacionCriteria = new orm.EvaluacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMEvaluacionCriteria.idEvaluacion.eq();
		System.out.println(oRMEvaluacionCriteria.uniqueEvaluacion());
		
		System.out.println("Retrieving Facultad by FacultadCriteria");
		orm.FacultadCriteria oRMFacultadCriteria = new orm.FacultadCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMFacultadCriteria.idFacultad.eq();
		System.out.println(oRMFacultadCriteria.uniqueFacultad());
		
		System.out.println("Retrieving Fechaevaluacion by FechaevaluacionCriteria");
		orm.FechaevaluacionCriteria oRMFechaevaluacionCriteria = new orm.FechaevaluacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMFechaevaluacionCriteria.idFechaEvaluacion.eq();
		System.out.println(oRMFechaevaluacionCriteria.uniqueFechaevaluacion());
		
		System.out.println("Retrieving Intereses by InteresesCriteria");
		orm.InteresesCriteria oRMInteresesCriteria = new orm.InteresesCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMInteresesCriteria.idIntereses.eq();
		System.out.println(oRMInteresesCriteria.uniqueIntereses());
		
		System.out.println("Retrieving Lugar by LugarCriteria");
		orm.LugarCriteria oRMLugarCriteria = new orm.LugarCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMLugarCriteria.idLugar.eq();
		System.out.println(oRMLugarCriteria.uniqueLugar());
		
		System.out.println("Retrieving Profesor by ProfesorCriteria");
		orm.ProfesorCriteria oRMProfesorCriteria = new orm.ProfesorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMProfesorCriteria.idProfesor.eq();
		System.out.println(oRMProfesorCriteria.uniqueProfesor());
		
		System.out.println("Retrieving Ramadeportiva by RamadeportivaCriteria");
		orm.RamadeportivaCriteria oRMRamadeportivaCriteria = new orm.RamadeportivaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMRamadeportivaCriteria.idRamaDeportiva.eq();
		System.out.println(oRMRamadeportivaCriteria.uniqueRamadeportiva());
		
		System.out.println("Retrieving Clase by ClaseCriteria");
		orm.ClaseCriteria oRMClaseCriteria = new orm.ClaseCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMClaseCriteria.idClase.eq();
		System.out.println(oRMClaseCriteria.uniqueClase());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProyectoData retrieveAndUpdateProyectoData = new RetrieveAndUpdateProyectoData();
			try {
				retrieveAndUpdateProyectoData.retrieveAndUpdateTestData();
				//retrieveAndUpdateProyectoData.retrieveByCriteria();
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
