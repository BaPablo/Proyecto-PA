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

public class InteresesDAO {
	public static Intereses loadInteresesByORMID(int idIntereses) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadInteresesByORMID(session, idIntereses);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Intereses getInteresesByORMID(int idIntereses) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getInteresesByORMID(session, idIntereses);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Intereses loadInteresesByORMID(int idIntereses, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadInteresesByORMID(session, idIntereses, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Intereses getInteresesByORMID(int idIntereses, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getInteresesByORMID(session, idIntereses, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Intereses loadInteresesByORMID(PersistentSession session, int idIntereses) throws PersistentException {
		try {
			return (Intereses) session.load(orm.Intereses.class, new Integer(idIntereses));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Intereses getInteresesByORMID(PersistentSession session, int idIntereses) throws PersistentException {
		try {
			return (Intereses) session.get(orm.Intereses.class, new Integer(idIntereses));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Intereses loadInteresesByORMID(PersistentSession session, int idIntereses, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Intereses) session.load(orm.Intereses.class, new Integer(idIntereses), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Intereses getInteresesByORMID(PersistentSession session, int idIntereses, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Intereses) session.get(orm.Intereses.class, new Integer(idIntereses), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryIntereses(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryIntereses(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryIntereses(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryIntereses(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Intereses[] listInteresesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listInteresesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Intereses[] listInteresesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listInteresesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryIntereses(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Intereses as Intereses");
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
	
	public static List queryIntereses(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Intereses as Intereses");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Intereses", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Intereses[] listInteresesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryIntereses(session, condition, orderBy);
			return (Intereses[]) list.toArray(new Intereses[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Intereses[] listInteresesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryIntereses(session, condition, orderBy, lockMode);
			return (Intereses[]) list.toArray(new Intereses[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Intereses loadInteresesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadInteresesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Intereses loadInteresesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadInteresesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Intereses loadInteresesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Intereses[] intereseses = listInteresesByQuery(session, condition, orderBy);
		if (intereseses != null && intereseses.length > 0)
			return intereseses[0];
		else
			return null;
	}
	
	public static Intereses loadInteresesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Intereses[] intereseses = listInteresesByQuery(session, condition, orderBy, lockMode);
		if (intereseses != null && intereseses.length > 0)
			return intereseses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateInteresesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateInteresesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateInteresesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateInteresesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateInteresesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Intereses as Intereses");
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
	
	public static java.util.Iterator iterateInteresesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Intereses as Intereses");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Intereses", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Intereses createIntereses() {
		return new orm.Intereses();
	}
	
	public static boolean save(orm.Intereses intereses) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().saveObject(intereses);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Intereses intereses) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().deleteObject(intereses);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Intereses intereses)throws PersistentException {
		try {
			orm.Alumno[] lAlumno_idAlumnos = intereses.alumno_idAlumno.toArray();
			for(int i = 0; i < lAlumno_idAlumnos.length; i++) {
				lAlumno_idAlumnos[i].intereses_idIntereses.remove(intereses);
			}
			return delete(intereses);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Intereses intereses, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Alumno[] lAlumno_idAlumnos = intereses.alumno_idAlumno.toArray();
			for(int i = 0; i < lAlumno_idAlumnos.length; i++) {
				lAlumno_idAlumnos[i].intereses_idIntereses.remove(intereses);
			}
			try {
				session.delete(intereses);
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
	
	public static boolean refresh(orm.Intereses intereses) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().refresh(intereses);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Intereses intereses) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().evict(intereses);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Intereses loadInteresesByCriteria(InteresesCriteria interesesCriteria) {
		Intereses[] intereseses = listInteresesByCriteria(interesesCriteria);
		if(intereseses == null || intereseses.length == 0) {
			return null;
		}
		return intereseses[0];
	}
	
	public static Intereses[] listInteresesByCriteria(InteresesCriteria interesesCriteria) {
		return interesesCriteria.listIntereses();
	}
}
