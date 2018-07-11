/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListProyectoData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Agrupacion...");
		orm.Agrupacion[] oRMAgrupacions = orm.AgrupacionDAO.listAgrupacionByQuery(null, null);
		int length = Math.min(oRMAgrupacions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMAgrupacions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Alumno...");
		orm.Alumno[] oRMAlumnos = orm.AlumnoDAO.listAlumnoByQuery(null, null);
		length = Math.min(oRMAlumnos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMAlumnos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Apoderado...");
		orm.Apoderado[] oRMApoderados = orm.ApoderadoDAO.listApoderadoByQuery(null, null);
		length = Math.min(oRMApoderados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMApoderados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Asignatura...");
		orm.Asignatura[] oRMAsignaturas = orm.AsignaturaDAO.listAsignaturaByQuery(null, null);
		length = Math.min(oRMAsignaturas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMAsignaturas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Asistencia...");
		orm.Asistencia[] oRMAsistencias = orm.AsistenciaDAO.listAsistenciaByQuery(null, null);
		length = Math.min(oRMAsistencias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMAsistencias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Condicionsalud...");
		orm.Condicionsalud[] oRMCondicionsaluds = orm.CondicionsaludDAO.listCondicionsaludByQuery(null, null);
		length = Math.min(oRMCondicionsaluds.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMCondicionsaluds[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Departamento...");
		orm.Departamento[] oRMDepartamentos = orm.DepartamentoDAO.listDepartamentoByQuery(null, null);
		length = Math.min(oRMDepartamentos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMDepartamentos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Direccion...");
		orm.Direccion[] oRMDireccions = orm.DireccionDAO.listDireccionByQuery(null, null);
		length = Math.min(oRMDireccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMDireccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Evaluacion...");
		orm.Evaluacion[] oRMEvaluacions = orm.EvaluacionDAO.listEvaluacionByQuery(null, null);
		length = Math.min(oRMEvaluacions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMEvaluacions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Facultad...");
		orm.Facultad[] oRMFacultads = orm.FacultadDAO.listFacultadByQuery(null, null);
		length = Math.min(oRMFacultads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMFacultads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Fechaevaluacion...");
		orm.Fechaevaluacion[] oRMFechaevaluacions = orm.FechaevaluacionDAO.listFechaevaluacionByQuery(null, null);
		length = Math.min(oRMFechaevaluacions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMFechaevaluacions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Intereses...");
		orm.Intereses[] oRMIntereseses = orm.InteresesDAO.listInteresesByQuery(null, null);
		length = Math.min(oRMIntereseses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMIntereseses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Lugar...");
		orm.Lugar[] oRMLugars = orm.LugarDAO.listLugarByQuery(null, null);
		length = Math.min(oRMLugars.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMLugars[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Profesor...");
		orm.Profesor[] oRMProfesors = orm.ProfesorDAO.listProfesorByQuery(null, null);
		length = Math.min(oRMProfesors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMProfesors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Ramadeportiva...");
		orm.Ramadeportiva[] oRMRamadeportivas = orm.RamadeportivaDAO.listRamadeportivaByQuery(null, null);
		length = Math.min(oRMRamadeportivas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMRamadeportivas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Clase...");
		orm.Clase[] oRMClases = orm.ClaseDAO.listClaseByQuery(null, null);
		length = Math.min(oRMClases.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMClases[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Agrupacion by Criteria...");
		orm.AgrupacionCriteria oRMAgrupacionCriteria = new orm.AgrupacionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMAgrupacionCriteria.idAgrup.eq();
		oRMAgrupacionCriteria.setMaxResults(ROW_COUNT);
		orm.Agrupacion[] oRMAgrupacions = oRMAgrupacionCriteria.listAgrupacion();
		int length =oRMAgrupacions== null ? 0 : Math.min(oRMAgrupacions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMAgrupacions[i]);
		}
		System.out.println(length + " Agrupacion record(s) retrieved."); 
		
		System.out.println("Listing Alumno by Criteria...");
		orm.AlumnoCriteria oRMAlumnoCriteria = new orm.AlumnoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMAlumnoCriteria.idAlumno.eq();
		oRMAlumnoCriteria.setMaxResults(ROW_COUNT);
		orm.Alumno[] oRMAlumnos = oRMAlumnoCriteria.listAlumno();
		length =oRMAlumnos== null ? 0 : Math.min(oRMAlumnos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMAlumnos[i]);
		}
		System.out.println(length + " Alumno record(s) retrieved."); 
		
		System.out.println("Listing Apoderado by Criteria...");
		orm.ApoderadoCriteria oRMApoderadoCriteria = new orm.ApoderadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMApoderadoCriteria.idApoderado.eq();
		oRMApoderadoCriteria.setMaxResults(ROW_COUNT);
		orm.Apoderado[] oRMApoderados = oRMApoderadoCriteria.listApoderado();
		length =oRMApoderados== null ? 0 : Math.min(oRMApoderados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMApoderados[i]);
		}
		System.out.println(length + " Apoderado record(s) retrieved."); 
		
		System.out.println("Listing Asignatura by Criteria...");
		orm.AsignaturaCriteria oRMAsignaturaCriteria = new orm.AsignaturaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMAsignaturaCriteria.idAsignatura.eq();
		oRMAsignaturaCriteria.setMaxResults(ROW_COUNT);
		orm.Asignatura[] oRMAsignaturas = oRMAsignaturaCriteria.listAsignatura();
		length =oRMAsignaturas== null ? 0 : Math.min(oRMAsignaturas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMAsignaturas[i]);
		}
		System.out.println(length + " Asignatura record(s) retrieved."); 
		
		System.out.println("Listing Asistencia by Criteria...");
		orm.AsistenciaCriteria oRMAsistenciaCriteria = new orm.AsistenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMAsistenciaCriteria.idAsistencia.eq();
		oRMAsistenciaCriteria.setMaxResults(ROW_COUNT);
		orm.Asistencia[] oRMAsistencias = oRMAsistenciaCriteria.listAsistencia();
		length =oRMAsistencias== null ? 0 : Math.min(oRMAsistencias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMAsistencias[i]);
		}
		System.out.println(length + " Asistencia record(s) retrieved."); 
		
		System.out.println("Listing Condicionsalud by Criteria...");
		orm.CondicionsaludCriteria oRMCondicionsaludCriteria = new orm.CondicionsaludCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMCondicionsaludCriteria.idCondicionSalud.eq();
		oRMCondicionsaludCriteria.setMaxResults(ROW_COUNT);
		orm.Condicionsalud[] oRMCondicionsaluds = oRMCondicionsaludCriteria.listCondicionsalud();
		length =oRMCondicionsaluds== null ? 0 : Math.min(oRMCondicionsaluds.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMCondicionsaluds[i]);
		}
		System.out.println(length + " Condicionsalud record(s) retrieved."); 
		
		System.out.println("Listing Departamento by Criteria...");
		orm.DepartamentoCriteria oRMDepartamentoCriteria = new orm.DepartamentoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMDepartamentoCriteria.idDepartamento.eq();
		oRMDepartamentoCriteria.setMaxResults(ROW_COUNT);
		orm.Departamento[] oRMDepartamentos = oRMDepartamentoCriteria.listDepartamento();
		length =oRMDepartamentos== null ? 0 : Math.min(oRMDepartamentos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMDepartamentos[i]);
		}
		System.out.println(length + " Departamento record(s) retrieved."); 
		
		System.out.println("Listing Direccion by Criteria...");
		orm.DireccionCriteria oRMDireccionCriteria = new orm.DireccionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMDireccionCriteria.idDireccion.eq();
		oRMDireccionCriteria.setMaxResults(ROW_COUNT);
		orm.Direccion[] oRMDireccions = oRMDireccionCriteria.listDireccion();
		length =oRMDireccions== null ? 0 : Math.min(oRMDireccions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMDireccions[i]);
		}
		System.out.println(length + " Direccion record(s) retrieved."); 
		
		System.out.println("Listing Evaluacion by Criteria...");
		orm.EvaluacionCriteria oRMEvaluacionCriteria = new orm.EvaluacionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMEvaluacionCriteria.idEvaluacion.eq();
		oRMEvaluacionCriteria.setMaxResults(ROW_COUNT);
		orm.Evaluacion[] oRMEvaluacions = oRMEvaluacionCriteria.listEvaluacion();
		length =oRMEvaluacions== null ? 0 : Math.min(oRMEvaluacions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMEvaluacions[i]);
		}
		System.out.println(length + " Evaluacion record(s) retrieved."); 
		
		System.out.println("Listing Facultad by Criteria...");
		orm.FacultadCriteria oRMFacultadCriteria = new orm.FacultadCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMFacultadCriteria.idFacultad.eq();
		oRMFacultadCriteria.setMaxResults(ROW_COUNT);
		orm.Facultad[] oRMFacultads = oRMFacultadCriteria.listFacultad();
		length =oRMFacultads== null ? 0 : Math.min(oRMFacultads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMFacultads[i]);
		}
		System.out.println(length + " Facultad record(s) retrieved."); 
		
		System.out.println("Listing Fechaevaluacion by Criteria...");
		orm.FechaevaluacionCriteria oRMFechaevaluacionCriteria = new orm.FechaevaluacionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMFechaevaluacionCriteria.idFechaEvaluacion.eq();
		oRMFechaevaluacionCriteria.setMaxResults(ROW_COUNT);
		orm.Fechaevaluacion[] oRMFechaevaluacions = oRMFechaevaluacionCriteria.listFechaevaluacion();
		length =oRMFechaevaluacions== null ? 0 : Math.min(oRMFechaevaluacions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMFechaevaluacions[i]);
		}
		System.out.println(length + " Fechaevaluacion record(s) retrieved."); 
		
		System.out.println("Listing Intereses by Criteria...");
		orm.InteresesCriteria oRMInteresesCriteria = new orm.InteresesCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMInteresesCriteria.idIntereses.eq();
		oRMInteresesCriteria.setMaxResults(ROW_COUNT);
		orm.Intereses[] oRMIntereseses = oRMInteresesCriteria.listIntereses();
		length =oRMIntereseses== null ? 0 : Math.min(oRMIntereseses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMIntereseses[i]);
		}
		System.out.println(length + " Intereses record(s) retrieved."); 
		
		System.out.println("Listing Lugar by Criteria...");
		orm.LugarCriteria oRMLugarCriteria = new orm.LugarCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMLugarCriteria.idLugar.eq();
		oRMLugarCriteria.setMaxResults(ROW_COUNT);
		orm.Lugar[] oRMLugars = oRMLugarCriteria.listLugar();
		length =oRMLugars== null ? 0 : Math.min(oRMLugars.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMLugars[i]);
		}
		System.out.println(length + " Lugar record(s) retrieved."); 
		
		System.out.println("Listing Profesor by Criteria...");
		orm.ProfesorCriteria oRMProfesorCriteria = new orm.ProfesorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMProfesorCriteria.idProfesor.eq();
		oRMProfesorCriteria.setMaxResults(ROW_COUNT);
		orm.Profesor[] oRMProfesors = oRMProfesorCriteria.listProfesor();
		length =oRMProfesors== null ? 0 : Math.min(oRMProfesors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMProfesors[i]);
		}
		System.out.println(length + " Profesor record(s) retrieved."); 
		
		System.out.println("Listing Ramadeportiva by Criteria...");
		orm.RamadeportivaCriteria oRMRamadeportivaCriteria = new orm.RamadeportivaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMRamadeportivaCriteria.idRamaDeportiva.eq();
		oRMRamadeportivaCriteria.setMaxResults(ROW_COUNT);
		orm.Ramadeportiva[] oRMRamadeportivas = oRMRamadeportivaCriteria.listRamadeportiva();
		length =oRMRamadeportivas== null ? 0 : Math.min(oRMRamadeportivas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMRamadeportivas[i]);
		}
		System.out.println(length + " Ramadeportiva record(s) retrieved."); 
		
		System.out.println("Listing Clase by Criteria...");
		orm.ClaseCriteria oRMClaseCriteria = new orm.ClaseCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMClaseCriteria.idClase.eq();
		oRMClaseCriteria.setMaxResults(ROW_COUNT);
		orm.Clase[] oRMClases = oRMClaseCriteria.listClase();
		length =oRMClases== null ? 0 : Math.min(oRMClases.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMClases[i]);
		}
		System.out.println(length + " Clase record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProyectoData listProyectoData = new ListProyectoData();
			try {
				listProyectoData.listTestData();
				//listProyectoData.listByCriteria();
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
