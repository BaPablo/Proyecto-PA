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

public class ClaseDAO {
	public static Clase loadClaseByORMID(int idClase) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadClaseByORMID(session, idClase);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Clase getClaseByORMID(int idClase) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getClaseByORMID(session, idClase);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Clase loadClaseByORMID(int idClase, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadClaseByORMID(session, idClase, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Clase getClaseByORMID(int idClase, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getClaseByORMID(session, idClase, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Clase loadClaseByORMID(PersistentSession session, int idClase) throws PersistentException {
		try {
			return (Clase) session.load(orm.Clase.class, new Integer(idClase));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Clase getClaseByORMID(PersistentSession session, int idClase) throws PersistentException {
		try {
			return (Clase) session.get(orm.Clase.class, new Integer(idClase));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Clase loadClaseByORMID(PersistentSession session, int idClase, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Clase) session.load(orm.Clase.class, new Integer(idClase), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Clase getClaseByORMID(PersistentSession session, int idClase, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Clase) session.get(orm.Clase.class, new Integer(idClase), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryClase(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryClase(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryClase(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryClase(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Clase[] listClaseByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listClaseByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Clase[] listClaseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listClaseByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryClase(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Clase as Clase");
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
	
	public static List queryClase(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Clase as Clase");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Clase", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Clase[] listClaseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryClase(session, condition, orderBy);
			return (Clase[]) list.toArray(new Clase[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Clase[] listClaseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryClase(session, condition, orderBy, lockMode);
			return (Clase[]) list.toArray(new Clase[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Clase loadClaseByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadClaseByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Clase loadClaseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadClaseByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Clase loadClaseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Clase[] clases = listClaseByQuery(session, condition, orderBy);
		if (clases != null && clases.length > 0)
			return clases[0];
		else
			return null;
	}
	
	public static Clase loadClaseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Clase[] clases = listClaseByQuery(session, condition, orderBy, lockMode);
		if (clases != null && clases.length > 0)
			return clases[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateClaseByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateClaseByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateClaseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateClaseByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateClaseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Clase as Clase");
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
	
	public static java.util.Iterator iterateClaseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Clase as Clase");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Clase", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Clase createClase() {
		return new orm.Clase();
	}
	
	public static boolean save(orm.Clase clase) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().saveObject(clase);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Clase clase) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().deleteObject(clase);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Clase clase)throws PersistentException {
		try {
			if (clase.getAsignaturaidAsignatura() != null) {
				clase.getAsignaturaidAsignatura().clase.remove(clase);
			}
			
			orm.Asistencia[] lAsistencias = clase.asistencia.toArray();
			for(int i = 0; i < lAsistencias.length; i++) {
				lAsistencias[i].setClaseidClase(null);
			}
			return delete(clase);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Clase clase, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (clase.getAsignaturaidAsignatura() != null) {
				clase.getAsignaturaidAsignatura().clase.remove(clase);
			}
			
			orm.Asistencia[] lAsistencias = clase.asistencia.toArray();
			for(int i = 0; i < lAsistencias.length; i++) {
				lAsistencias[i].setClaseidClase(null);
			}
			try {
				session.delete(clase);
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
	
	public static boolean refresh(orm.Clase clase) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().refresh(clase);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Clase clase) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().evict(clase);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Clase loadClaseByCriteria(ClaseCriteria claseCriteria) {
		Clase[] clases = listClaseByCriteria(claseCriteria);
		if(clases == null || clases.length == 0) {
			return null;
		}
		return clases[0];
	}
	
	public static Clase[] listClaseByCriteria(ClaseCriteria claseCriteria) {
		return claseCriteria.listClase();
	}
}
