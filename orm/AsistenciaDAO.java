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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class AsistenciaDAO {
	public static Asistencia loadAsistenciaByORMID(int idAsistencia, orm.Alumno alumno_idAlumno) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadAsistenciaByORMID(session, idAsistencia, alumno_idAlumno);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asistencia getAsistenciaByORMID(int idAsistencia, orm.Alumno alumno_idAlumno) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getAsistenciaByORMID(session, idAsistencia, alumno_idAlumno);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asistencia loadAsistenciaByORMID(int idAsistencia, orm.Alumno alumno_idAlumno, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadAsistenciaByORMID(session, idAsistencia, alumno_idAlumno, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asistencia getAsistenciaByORMID(int idAsistencia, orm.Alumno alumno_idAlumno, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getAsistenciaByORMID(session, idAsistencia, alumno_idAlumno, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asistencia loadAsistenciaByORMID(PersistentSession session, int idAsistencia, orm.Alumno alumno_idAlumno) throws PersistentException {
		try {
			Asistencia asistencia = new orm.Asistencia();
			asistencia.setIdAsistencia(idAsistencia);
			asistencia.setORM_Alumno_idAlumno(alumno_idAlumno);
			
			return (Asistencia) session.load(orm.Asistencia.class, asistencia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asistencia getAsistenciaByORMID(PersistentSession session, int idAsistencia, orm.Alumno alumno_idAlumno) throws PersistentException {
		try {
			Asistencia asistencia = new orm.Asistencia();
			asistencia.setIdAsistencia(idAsistencia);
			asistencia.setORM_Alumno_idAlumno(alumno_idAlumno);
			
			return (Asistencia) session.get(orm.Asistencia.class, asistencia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asistencia loadAsistenciaByORMID(PersistentSession session, int idAsistencia, orm.Alumno alumno_idAlumno, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Asistencia asistencia = new orm.Asistencia();
			asistencia.setIdAsistencia(idAsistencia);
			asistencia.setORM_Alumno_idAlumno(alumno_idAlumno);
			
			return (Asistencia) session.load(orm.Asistencia.class, asistencia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asistencia getAsistenciaByORMID(PersistentSession session, int idAsistencia, orm.Alumno alumno_idAlumno, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Asistencia asistencia = new orm.Asistencia();
			asistencia.setIdAsistencia(idAsistencia);
			asistencia.setORM_Alumno_idAlumno(alumno_idAlumno);
			
			return (Asistencia) session.get(orm.Asistencia.class, asistencia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAsistencia(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryAsistencia(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAsistencia(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryAsistencia(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asistencia[] listAsistenciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listAsistenciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asistencia[] listAsistenciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listAsistenciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAsistencia(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Asistencia as Asistencia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAsistencia(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Asistencia as Asistencia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Asistencia", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asistencia[] listAsistenciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAsistencia(session, condition, orderBy);
			return (Asistencia[]) list.toArray(new Asistencia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asistencia[] listAsistenciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAsistencia(session, condition, orderBy, lockMode);
			return (Asistencia[]) list.toArray(new Asistencia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asistencia loadAsistenciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadAsistenciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asistencia loadAsistenciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadAsistenciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asistencia loadAsistenciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Asistencia[] asistencias = listAsistenciaByQuery(session, condition, orderBy);
		if (asistencias != null && asistencias.length > 0)
			return asistencias[0];
		else
			return null;
	}
	
	public static Asistencia loadAsistenciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Asistencia[] asistencias = listAsistenciaByQuery(session, condition, orderBy, lockMode);
		if (asistencias != null && asistencias.length > 0)
			return asistencias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAsistenciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateAsistenciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAsistenciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateAsistenciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAsistenciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Asistencia as Asistencia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAsistenciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Asistencia as Asistencia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Asistencia", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asistencia createAsistencia() {
		return new orm.Asistencia();
	}
	
	public static boolean save(orm.Asistencia asistencia) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().saveObject(asistencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Asistencia asistencia) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().deleteObject(asistencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Asistencia asistencia)throws PersistentException {
		try {
			orm.Alumno alumno_idAlumno = asistencia.getAlumno_idAlumno();
			if (asistencia.getAlumno_idAlumno() != null) {
				asistencia.getAlumno_idAlumno().asistencia.remove(asistencia);
			}
			asistencia.setORM_Alumno_idAlumno(alumno_idAlumno);
			
			if (asistencia.getClaseidClase() != null) {
				asistencia.getClaseidClase().asistencia.remove(asistencia);
			}
			
			return delete(asistencia);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Asistencia asistencia, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Alumno alumno_idAlumno = asistencia.getAlumno_idAlumno();
			if (asistencia.getAlumno_idAlumno() != null) {
				asistencia.getAlumno_idAlumno().asistencia.remove(asistencia);
			}
			asistencia.setORM_Alumno_idAlumno(alumno_idAlumno);
			
			if (asistencia.getClaseidClase() != null) {
				asistencia.getClaseidClase().asistencia.remove(asistencia);
			}
			
			try {
				session.delete(asistencia);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Asistencia asistencia) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().refresh(asistencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Asistencia asistencia) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().evict(asistencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asistencia loadAsistenciaByCriteria(AsistenciaCriteria asistenciaCriteria) {
		Asistencia[] asistencias = listAsistenciaByCriteria(asistenciaCriteria);
		if(asistencias == null || asistencias.length == 0) {
			return null;
		}
		return asistencias[0];
	}
	
	public static Asistencia[] listAsistenciaByCriteria(AsistenciaCriteria asistenciaCriteria) {
		return asistenciaCriteria.listAsistencia();
	}
}
