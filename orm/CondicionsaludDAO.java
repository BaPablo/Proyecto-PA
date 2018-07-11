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

public class CondicionsaludDAO {
	public static Condicionsalud loadCondicionsaludByORMID(int idCondicionSalud) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadCondicionsaludByORMID(session, idCondicionSalud);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Condicionsalud getCondicionsaludByORMID(int idCondicionSalud) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getCondicionsaludByORMID(session, idCondicionSalud);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Condicionsalud loadCondicionsaludByORMID(int idCondicionSalud, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadCondicionsaludByORMID(session, idCondicionSalud, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Condicionsalud getCondicionsaludByORMID(int idCondicionSalud, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getCondicionsaludByORMID(session, idCondicionSalud, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Condicionsalud loadCondicionsaludByORMID(PersistentSession session, int idCondicionSalud) throws PersistentException {
		try {
			return (Condicionsalud) session.load(orm.Condicionsalud.class, new Integer(idCondicionSalud));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Condicionsalud getCondicionsaludByORMID(PersistentSession session, int idCondicionSalud) throws PersistentException {
		try {
			return (Condicionsalud) session.get(orm.Condicionsalud.class, new Integer(idCondicionSalud));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Condicionsalud loadCondicionsaludByORMID(PersistentSession session, int idCondicionSalud, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Condicionsalud) session.load(orm.Condicionsalud.class, new Integer(idCondicionSalud), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Condicionsalud getCondicionsaludByORMID(PersistentSession session, int idCondicionSalud, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Condicionsalud) session.get(orm.Condicionsalud.class, new Integer(idCondicionSalud), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCondicionsalud(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryCondicionsalud(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCondicionsalud(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryCondicionsalud(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Condicionsalud[] listCondicionsaludByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listCondicionsaludByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Condicionsalud[] listCondicionsaludByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listCondicionsaludByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCondicionsalud(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Condicionsalud as Condicionsalud");
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
	
	public static List queryCondicionsalud(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Condicionsalud as Condicionsalud");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Condicionsalud", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Condicionsalud[] listCondicionsaludByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCondicionsalud(session, condition, orderBy);
			return (Condicionsalud[]) list.toArray(new Condicionsalud[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Condicionsalud[] listCondicionsaludByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCondicionsalud(session, condition, orderBy, lockMode);
			return (Condicionsalud[]) list.toArray(new Condicionsalud[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Condicionsalud loadCondicionsaludByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadCondicionsaludByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Condicionsalud loadCondicionsaludByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadCondicionsaludByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Condicionsalud loadCondicionsaludByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Condicionsalud[] condicionsaluds = listCondicionsaludByQuery(session, condition, orderBy);
		if (condicionsaluds != null && condicionsaluds.length > 0)
			return condicionsaluds[0];
		else
			return null;
	}
	
	public static Condicionsalud loadCondicionsaludByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Condicionsalud[] condicionsaluds = listCondicionsaludByQuery(session, condition, orderBy, lockMode);
		if (condicionsaluds != null && condicionsaluds.length > 0)
			return condicionsaluds[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCondicionsaludByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateCondicionsaludByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCondicionsaludByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateCondicionsaludByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCondicionsaludByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Condicionsalud as Condicionsalud");
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
	
	public static java.util.Iterator iterateCondicionsaludByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Condicionsalud as Condicionsalud");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Condicionsalud", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Condicionsalud createCondicionsalud() {
		return new orm.Condicionsalud();
	}
	
	public static boolean save(orm.Condicionsalud condicionsalud) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().saveObject(condicionsalud);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Condicionsalud condicionsalud) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().deleteObject(condicionsalud);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Condicionsalud condicionsalud)throws PersistentException {
		try {
			orm.Alumno[] lAlumno_idAlumnos = condicionsalud.alumno_idAlumno.toArray();
			for(int i = 0; i < lAlumno_idAlumnos.length; i++) {
				lAlumno_idAlumnos[i].condicionSalud_idCondicionSalud.remove(condicionsalud);
			}
			return delete(condicionsalud);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Condicionsalud condicionsalud, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Alumno[] lAlumno_idAlumnos = condicionsalud.alumno_idAlumno.toArray();
			for(int i = 0; i < lAlumno_idAlumnos.length; i++) {
				lAlumno_idAlumnos[i].condicionSalud_idCondicionSalud.remove(condicionsalud);
			}
			try {
				session.delete(condicionsalud);
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
	
	public static boolean refresh(orm.Condicionsalud condicionsalud) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().refresh(condicionsalud);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Condicionsalud condicionsalud) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().evict(condicionsalud);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Condicionsalud loadCondicionsaludByCriteria(CondicionsaludCriteria condicionsaludCriteria) {
		Condicionsalud[] condicionsaluds = listCondicionsaludByCriteria(condicionsaludCriteria);
		if(condicionsaluds == null || condicionsaluds.length == 0) {
			return null;
		}
		return condicionsaluds[0];
	}
	
	public static Condicionsalud[] listCondicionsaludByCriteria(CondicionsaludCriteria condicionsaludCriteria) {
		return condicionsaludCriteria.listCondicionsalud();
	}
}
