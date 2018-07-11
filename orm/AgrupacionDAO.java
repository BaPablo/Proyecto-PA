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

public class AgrupacionDAO {
	public static Agrupacion loadAgrupacionByORMID(int idAgrup) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadAgrupacionByORMID(session, idAgrup);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Agrupacion getAgrupacionByORMID(int idAgrup) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getAgrupacionByORMID(session, idAgrup);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Agrupacion loadAgrupacionByORMID(int idAgrup, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadAgrupacionByORMID(session, idAgrup, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Agrupacion getAgrupacionByORMID(int idAgrup, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getAgrupacionByORMID(session, idAgrup, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Agrupacion loadAgrupacionByORMID(PersistentSession session, int idAgrup) throws PersistentException {
		try {
			return (Agrupacion) session.load(orm.Agrupacion.class, new Integer(idAgrup));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Agrupacion getAgrupacionByORMID(PersistentSession session, int idAgrup) throws PersistentException {
		try {
			return (Agrupacion) session.get(orm.Agrupacion.class, new Integer(idAgrup));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Agrupacion loadAgrupacionByORMID(PersistentSession session, int idAgrup, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Agrupacion) session.load(orm.Agrupacion.class, new Integer(idAgrup), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Agrupacion getAgrupacionByORMID(PersistentSession session, int idAgrup, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Agrupacion) session.get(orm.Agrupacion.class, new Integer(idAgrup), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAgrupacion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryAgrupacion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAgrupacion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryAgrupacion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Agrupacion[] listAgrupacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listAgrupacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Agrupacion[] listAgrupacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listAgrupacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAgrupacion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Agrupacion as Agrupacion");
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
	
	public static List queryAgrupacion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Agrupacion as Agrupacion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Agrupacion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Agrupacion[] listAgrupacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAgrupacion(session, condition, orderBy);
			return (Agrupacion[]) list.toArray(new Agrupacion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Agrupacion[] listAgrupacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAgrupacion(session, condition, orderBy, lockMode);
			return (Agrupacion[]) list.toArray(new Agrupacion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Agrupacion loadAgrupacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadAgrupacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Agrupacion loadAgrupacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadAgrupacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Agrupacion loadAgrupacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Agrupacion[] agrupacions = listAgrupacionByQuery(session, condition, orderBy);
		if (agrupacions != null && agrupacions.length > 0)
			return agrupacions[0];
		else
			return null;
	}
	
	public static Agrupacion loadAgrupacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Agrupacion[] agrupacions = listAgrupacionByQuery(session, condition, orderBy, lockMode);
		if (agrupacions != null && agrupacions.length > 0)
			return agrupacions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAgrupacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateAgrupacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAgrupacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateAgrupacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAgrupacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Agrupacion as Agrupacion");
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
	
	public static java.util.Iterator iterateAgrupacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Agrupacion as Agrupacion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Agrupacion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Agrupacion createAgrupacion() {
		return new orm.Agrupacion();
	}
	
	public static boolean save(orm.Agrupacion agrupacion) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().saveObject(agrupacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Agrupacion agrupacion) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().deleteObject(agrupacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Agrupacion agrupacion)throws PersistentException {
		try {
			orm.Alumno[] lAlumno_idAlumnos = agrupacion.alumno_idAlumno.toArray();
			for(int i = 0; i < lAlumno_idAlumnos.length; i++) {
				lAlumno_idAlumnos[i].agrupacion_idAgrup.remove(agrupacion);
			}
			return delete(agrupacion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Agrupacion agrupacion, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Alumno[] lAlumno_idAlumnos = agrupacion.alumno_idAlumno.toArray();
			for(int i = 0; i < lAlumno_idAlumnos.length; i++) {
				lAlumno_idAlumnos[i].agrupacion_idAgrup.remove(agrupacion);
			}
			try {
				session.delete(agrupacion);
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
	
	public static boolean refresh(orm.Agrupacion agrupacion) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().refresh(agrupacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Agrupacion agrupacion) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().evict(agrupacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Agrupacion loadAgrupacionByCriteria(AgrupacionCriteria agrupacionCriteria) {
		Agrupacion[] agrupacions = listAgrupacionByCriteria(agrupacionCriteria);
		if(agrupacions == null || agrupacions.length == 0) {
			return null;
		}
		return agrupacions[0];
	}
	
	public static Agrupacion[] listAgrupacionByCriteria(AgrupacionCriteria agrupacionCriteria) {
		return agrupacionCriteria.listAgrupacion();
	}
}
