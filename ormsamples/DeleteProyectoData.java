/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteProyectoData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.ProyectoPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Agrupacion oRMAgrupacion = orm.AgrupacionDAO.loadAgrupacionByQuery(null, null);
			// Delete the persistent object
			orm.AgrupacionDAO.delete(oRMAgrupacion);
			orm.Alumno oRMAlumno = orm.AlumnoDAO.loadAlumnoByQuery(null, null);
			// Delete the persistent object
			orm.AlumnoDAO.delete(oRMAlumno);
			orm.Apoderado oRMApoderado = orm.ApoderadoDAO.loadApoderadoByQuery(null, null);
			// Delete the persistent object
			orm.ApoderadoDAO.delete(oRMApoderado);
			orm.Asignatura oRMAsignatura = orm.AsignaturaDAO.loadAsignaturaByQuery(null, null);
			// Delete the persistent object
			orm.AsignaturaDAO.delete(oRMAsignatura);
			orm.Asistencia oRMAsistencia = orm.AsistenciaDAO.loadAsistenciaByQuery(null, null);
			// Delete the persistent object
			orm.AsistenciaDAO.delete(oRMAsistencia);
			orm.Condicionsalud oRMCondicionsalud = orm.CondicionsaludDAO.loadCondicionsaludByQuery(null, null);
			// Delete the persistent object
			orm.CondicionsaludDAO.delete(oRMCondicionsalud);
			orm.Departamento oRMDepartamento = orm.DepartamentoDAO.loadDepartamentoByQuery(null, null);
			// Delete the persistent object
			orm.DepartamentoDAO.delete(oRMDepartamento);
			orm.Direccion oRMDireccion = orm.DireccionDAO.loadDireccionByQuery(null, null);
			// Delete the persistent object
			orm.DireccionDAO.delete(oRMDireccion);
			orm.Evaluacion oRMEvaluacion = orm.EvaluacionDAO.loadEvaluacionByQuery(null, null);
			// Delete the persistent object
			orm.EvaluacionDAO.delete(oRMEvaluacion);
			orm.Facultad oRMFacultad = orm.FacultadDAO.loadFacultadByQuery(null, null);
			// Delete the persistent object
			orm.FacultadDAO.delete(oRMFacultad);
			orm.Fechaevaluacion oRMFechaevaluacion = orm.FechaevaluacionDAO.loadFechaevaluacionByQuery(null, null);
			// Delete the persistent object
			orm.FechaevaluacionDAO.delete(oRMFechaevaluacion);
			orm.Intereses oRMIntereses = orm.InteresesDAO.loadInteresesByQuery(null, null);
			// Delete the persistent object
			orm.InteresesDAO.delete(oRMIntereses);
			orm.Lugar oRMLugar = orm.LugarDAO.loadLugarByQuery(null, null);
			// Delete the persistent object
			orm.LugarDAO.delete(oRMLugar);
			orm.Profesor oRMProfesor = orm.ProfesorDAO.loadProfesorByQuery(null, null);
			// Delete the persistent object
			orm.ProfesorDAO.delete(oRMProfesor);
			orm.Ramadeportiva oRMRamadeportiva = orm.RamadeportivaDAO.loadRamadeportivaByQuery(null, null);
			// Delete the persistent object
			orm.RamadeportivaDAO.delete(oRMRamadeportiva);
			orm.Clase oRMClase = orm.ClaseDAO.loadClaseByQuery(null, null);
			// Delete the persistent object
			orm.ClaseDAO.delete(oRMClase);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProyectoData deleteProyectoData = new DeleteProyectoData();
			try {
				deleteProyectoData.deleteTestData();
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
