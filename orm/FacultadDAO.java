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

public class FacultadDAO {
	public static Facultad loadFacultadByORMID(int idFacultad) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadFacultadByORMID(session, idFacultad);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Facultad getFacultadByORMID(int idFacultad) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getFacultadByORMID(session, idFacultad);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Facultad loadFacultadByORMID(int idFacultad, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadFacultadByORMID(session, idFacultad, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Facultad getFacultadByORMID(int idFacultad, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getFacultadByORMID(session, idFacultad, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Facultad loadFacultadByORMID(PersistentSession session, int idFacultad) throws PersistentException {
		try {
			return (Facultad) session.load(orm.Facultad.class, new Integer(idFacultad));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Facultad getFacultadByORMID(PersistentSession session, int idFacultad) throws PersistentException {
		try {
			return (Facultad) session.get(orm.Facultad.class, new Integer(idFacultad));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Facultad loadFacultadByORMID(PersistentSession session, int idFacultad, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Facultad) session.load(orm.Facultad.class, new Integer(idFacultad), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Facultad getFacultadByORMID(PersistentSession session, int idFacultad, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Facultad) session.get(orm.Facultad.class, new Integer(idFacultad), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFacultad(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryFacultad(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFacultad(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryFacultad(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Facultad[] listFacultadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listFacultadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Facultad[] listFacultadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listFacultadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFacultad(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Facultad as Facultad");
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
	
	public static List queryFacultad(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Facultad as Facultad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Facultad", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Facultad[] listFacultadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryFacultad(session, condition, orderBy);
			return (Facultad[]) list.toArray(new Facultad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Facultad[] listFacultadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryFacultad(session, condition, orderBy, lockMode);
			return (Facultad[]) list.toArray(new Facultad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Facultad loadFacultadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadFacultadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Facultad loadFacultadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadFacultadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Facultad loadFacultadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Facultad[] facultads = listFacultadByQuery(session, condition, orderBy);
		if (facultads != null && facultads.length > 0)
			return facultads[0];
		else
			return null;
	}
	
	public static Facultad loadFacultadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Facultad[] facultads = listFacultadByQuery(session, condition, orderBy, lockMode);
		if (facultads != null && facultads.length > 0)
			return facultads[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFacultadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateFacultadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFacultadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateFacultadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFacultadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Facultad as Facultad");
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
	
	public static java.util.Iterator iterateFacultadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Facultad as Facultad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Facultad", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Facultad createFacultad() {
		return new orm.Facultad();
	}
	
	public static boolean save(orm.Facultad facultad) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().saveObject(facultad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Facultad facultad) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().deleteObject(facultad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Facultad facultad)throws PersistentException {
		try {
			orm.Departamento[] lDepartamentos = facultad.departamento.toArray();
			for(int i = 0; i < lDepartamentos.length; i++) {
				lDepartamentos[i].setFacultad_idFacultad(null);
			}
			return delete(facultad);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Facultad facultad, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Departamento[] lDepartamentos = facultad.departamento.toArray();
			for(int i = 0; i < lDepartamentos.length; i++) {
				lDepartamentos[i].setFacultad_idFacultad(null);
			}
			try {
				session.delete(facultad);
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
	
	public static boolean refresh(orm.Facultad facultad) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().refresh(facultad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Facultad facultad) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().evict(facultad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Facultad loadFacultadByCriteria(FacultadCriteria facultadCriteria) {
		Facultad[] facultads = listFacultadByCriteria(facultadCriteria);
		if(facultads == null || facultads.length == 0) {
			return null;
		}
		return facultads[0];
	}
	
	public static Facultad[] listFacultadByCriteria(FacultadCriteria facultadCriteria) {
		return facultadCriteria.listFacultad();
	}
}
