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

public class EvaluacionDAO {
	public static Evaluacion loadEvaluacionByORMID(int idEvaluacion) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadEvaluacionByORMID(session, idEvaluacion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluacion getEvaluacionByORMID(int idEvaluacion) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getEvaluacionByORMID(session, idEvaluacion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluacion loadEvaluacionByORMID(int idEvaluacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadEvaluacionByORMID(session, idEvaluacion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluacion getEvaluacionByORMID(int idEvaluacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getEvaluacionByORMID(session, idEvaluacion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluacion loadEvaluacionByORMID(PersistentSession session, int idEvaluacion) throws PersistentException {
		try {
			return (Evaluacion) session.load(orm.Evaluacion.class, new Integer(idEvaluacion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluacion getEvaluacionByORMID(PersistentSession session, int idEvaluacion) throws PersistentException {
		try {
			return (Evaluacion) session.get(orm.Evaluacion.class, new Integer(idEvaluacion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluacion loadEvaluacionByORMID(PersistentSession session, int idEvaluacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Evaluacion) session.load(orm.Evaluacion.class, new Integer(idEvaluacion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluacion getEvaluacionByORMID(PersistentSession session, int idEvaluacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Evaluacion) session.get(orm.Evaluacion.class, new Integer(idEvaluacion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvaluacion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryEvaluacion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvaluacion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryEvaluacion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluacion[] listEvaluacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listEvaluacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluacion[] listEvaluacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listEvaluacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvaluacion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Evaluacion as Evaluacion");
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
	
	public static List queryEvaluacion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Evaluacion as Evaluacion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Evaluacion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluacion[] listEvaluacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEvaluacion(session, condition, orderBy);
			return (Evaluacion[]) list.toArray(new Evaluacion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluacion[] listEvaluacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEvaluacion(session, condition, orderBy, lockMode);
			return (Evaluacion[]) list.toArray(new Evaluacion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluacion loadEvaluacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadEvaluacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluacion loadEvaluacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadEvaluacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluacion loadEvaluacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Evaluacion[] evaluacions = listEvaluacionByQuery(session, condition, orderBy);
		if (evaluacions != null && evaluacions.length > 0)
			return evaluacions[0];
		else
			return null;
	}
	
	public static Evaluacion loadEvaluacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Evaluacion[] evaluacions = listEvaluacionByQuery(session, condition, orderBy, lockMode);
		if (evaluacions != null && evaluacions.length > 0)
			return evaluacions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEvaluacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateEvaluacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEvaluacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateEvaluacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEvaluacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Evaluacion as Evaluacion");
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
	
	public static java.util.Iterator iterateEvaluacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Evaluacion as Evaluacion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Evaluacion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluacion createEvaluacion() {
		return new orm.Evaluacion();
	}
	
	public static boolean save(orm.Evaluacion evaluacion) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().saveObject(evaluacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Evaluacion evaluacion) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().deleteObject(evaluacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Evaluacion evaluacion)throws PersistentException {
		try {
			if (evaluacion.getAsignatura_idAsignatura() != null) {
				evaluacion.getAsignatura_idAsignatura().evaluacion.remove(evaluacion);
			}
			
			if (evaluacion.getFechaEvaluacion_idFechaEvaluacion() != null) {
				evaluacion.getFechaEvaluacion_idFechaEvaluacion().evaluacion.remove(evaluacion);
			}
			
			if (evaluacion.getLugar_idLugar() != null) {
				evaluacion.getLugar_idLugar().evaluacion.remove(evaluacion);
			}
			
			return delete(evaluacion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Evaluacion evaluacion, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (evaluacion.getAsignatura_idAsignatura() != null) {
				evaluacion.getAsignatura_idAsignatura().evaluacion.remove(evaluacion);
			}
			
			if (evaluacion.getFechaEvaluacion_idFechaEvaluacion() != null) {
				evaluacion.getFechaEvaluacion_idFechaEvaluacion().evaluacion.remove(evaluacion);
			}
			
			if (evaluacion.getLugar_idLugar() != null) {
				evaluacion.getLugar_idLugar().evaluacion.remove(evaluacion);
			}
			
			try {
				session.delete(evaluacion);
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
	
	public static boolean refresh(orm.Evaluacion evaluacion) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().refresh(evaluacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Evaluacion evaluacion) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().evict(evaluacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluacion loadEvaluacionByCriteria(EvaluacionCriteria evaluacionCriteria) {
		Evaluacion[] evaluacions = listEvaluacionByCriteria(evaluacionCriteria);
		if(evaluacions == null || evaluacions.length == 0) {
			return null;
		}
		return evaluacions[0];
	}
	
	public static Evaluacion[] listEvaluacionByCriteria(EvaluacionCriteria evaluacionCriteria) {
		return evaluacionCriteria.listEvaluacion();
	}
}
