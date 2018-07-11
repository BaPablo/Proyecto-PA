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

public class FechaevaluacionDAO {
	public static Fechaevaluacion loadFechaevaluacionByORMID(int idFechaEvaluacion) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadFechaevaluacionByORMID(session, idFechaEvaluacion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fechaevaluacion getFechaevaluacionByORMID(int idFechaEvaluacion) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getFechaevaluacionByORMID(session, idFechaEvaluacion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fechaevaluacion loadFechaevaluacionByORMID(int idFechaEvaluacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadFechaevaluacionByORMID(session, idFechaEvaluacion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fechaevaluacion getFechaevaluacionByORMID(int idFechaEvaluacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getFechaevaluacionByORMID(session, idFechaEvaluacion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fechaevaluacion loadFechaevaluacionByORMID(PersistentSession session, int idFechaEvaluacion) throws PersistentException {
		try {
			return (Fechaevaluacion) session.load(orm.Fechaevaluacion.class, new Integer(idFechaEvaluacion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fechaevaluacion getFechaevaluacionByORMID(PersistentSession session, int idFechaEvaluacion) throws PersistentException {
		try {
			return (Fechaevaluacion) session.get(orm.Fechaevaluacion.class, new Integer(idFechaEvaluacion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fechaevaluacion loadFechaevaluacionByORMID(PersistentSession session, int idFechaEvaluacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Fechaevaluacion) session.load(orm.Fechaevaluacion.class, new Integer(idFechaEvaluacion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fechaevaluacion getFechaevaluacionByORMID(PersistentSession session, int idFechaEvaluacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Fechaevaluacion) session.get(orm.Fechaevaluacion.class, new Integer(idFechaEvaluacion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFechaevaluacion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryFechaevaluacion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFechaevaluacion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryFechaevaluacion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fechaevaluacion[] listFechaevaluacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listFechaevaluacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fechaevaluacion[] listFechaevaluacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listFechaevaluacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFechaevaluacion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Fechaevaluacion as Fechaevaluacion");
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
	
	public static List queryFechaevaluacion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Fechaevaluacion as Fechaevaluacion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Fechaevaluacion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fechaevaluacion[] listFechaevaluacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryFechaevaluacion(session, condition, orderBy);
			return (Fechaevaluacion[]) list.toArray(new Fechaevaluacion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fechaevaluacion[] listFechaevaluacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryFechaevaluacion(session, condition, orderBy, lockMode);
			return (Fechaevaluacion[]) list.toArray(new Fechaevaluacion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fechaevaluacion loadFechaevaluacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadFechaevaluacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fechaevaluacion loadFechaevaluacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadFechaevaluacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fechaevaluacion loadFechaevaluacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Fechaevaluacion[] fechaevaluacions = listFechaevaluacionByQuery(session, condition, orderBy);
		if (fechaevaluacions != null && fechaevaluacions.length > 0)
			return fechaevaluacions[0];
		else
			return null;
	}
	
	public static Fechaevaluacion loadFechaevaluacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Fechaevaluacion[] fechaevaluacions = listFechaevaluacionByQuery(session, condition, orderBy, lockMode);
		if (fechaevaluacions != null && fechaevaluacions.length > 0)
			return fechaevaluacions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFechaevaluacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateFechaevaluacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFechaevaluacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateFechaevaluacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFechaevaluacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Fechaevaluacion as Fechaevaluacion");
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
	
	public static java.util.Iterator iterateFechaevaluacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Fechaevaluacion as Fechaevaluacion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Fechaevaluacion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fechaevaluacion createFechaevaluacion() {
		return new orm.Fechaevaluacion();
	}
	
	public static boolean save(orm.Fechaevaluacion fechaevaluacion) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().saveObject(fechaevaluacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Fechaevaluacion fechaevaluacion) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().deleteObject(fechaevaluacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Fechaevaluacion fechaevaluacion)throws PersistentException {
		try {
			orm.Evaluacion[] lEvaluacions = fechaevaluacion.evaluacion.toArray();
			for(int i = 0; i < lEvaluacions.length; i++) {
				lEvaluacions[i].setFechaEvaluacion_idFechaEvaluacion(null);
			}
			return delete(fechaevaluacion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Fechaevaluacion fechaevaluacion, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Evaluacion[] lEvaluacions = fechaevaluacion.evaluacion.toArray();
			for(int i = 0; i < lEvaluacions.length; i++) {
				lEvaluacions[i].setFechaEvaluacion_idFechaEvaluacion(null);
			}
			try {
				session.delete(fechaevaluacion);
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
	
	public static boolean refresh(orm.Fechaevaluacion fechaevaluacion) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().refresh(fechaevaluacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Fechaevaluacion fechaevaluacion) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().evict(fechaevaluacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fechaevaluacion loadFechaevaluacionByCriteria(FechaevaluacionCriteria fechaevaluacionCriteria) {
		Fechaevaluacion[] fechaevaluacions = listFechaevaluacionByCriteria(fechaevaluacionCriteria);
		if(fechaevaluacions == null || fechaevaluacions.length == 0) {
			return null;
		}
		return fechaevaluacions[0];
	}
	
	public static Fechaevaluacion[] listFechaevaluacionByCriteria(FechaevaluacionCriteria fechaevaluacionCriteria) {
		return fechaevaluacionCriteria.listFechaevaluacion();
	}
}
