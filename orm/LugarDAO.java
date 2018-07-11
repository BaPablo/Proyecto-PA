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

public class LugarDAO {
	public static Lugar loadLugarByORMID(int idLugar) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadLugarByORMID(session, idLugar);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lugar getLugarByORMID(int idLugar) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getLugarByORMID(session, idLugar);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lugar loadLugarByORMID(int idLugar, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadLugarByORMID(session, idLugar, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lugar getLugarByORMID(int idLugar, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getLugarByORMID(session, idLugar, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lugar loadLugarByORMID(PersistentSession session, int idLugar) throws PersistentException {
		try {
			return (Lugar) session.load(orm.Lugar.class, new Integer(idLugar));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lugar getLugarByORMID(PersistentSession session, int idLugar) throws PersistentException {
		try {
			return (Lugar) session.get(orm.Lugar.class, new Integer(idLugar));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lugar loadLugarByORMID(PersistentSession session, int idLugar, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Lugar) session.load(orm.Lugar.class, new Integer(idLugar), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lugar getLugarByORMID(PersistentSession session, int idLugar, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Lugar) session.get(orm.Lugar.class, new Integer(idLugar), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLugar(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryLugar(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLugar(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryLugar(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lugar[] listLugarByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listLugarByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lugar[] listLugarByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listLugarByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLugar(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Lugar as Lugar");
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
	
	public static List queryLugar(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Lugar as Lugar");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Lugar", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lugar[] listLugarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryLugar(session, condition, orderBy);
			return (Lugar[]) list.toArray(new Lugar[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lugar[] listLugarByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryLugar(session, condition, orderBy, lockMode);
			return (Lugar[]) list.toArray(new Lugar[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lugar loadLugarByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadLugarByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lugar loadLugarByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadLugarByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lugar loadLugarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Lugar[] lugars = listLugarByQuery(session, condition, orderBy);
		if (lugars != null && lugars.length > 0)
			return lugars[0];
		else
			return null;
	}
	
	public static Lugar loadLugarByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Lugar[] lugars = listLugarByQuery(session, condition, orderBy, lockMode);
		if (lugars != null && lugars.length > 0)
			return lugars[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLugarByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateLugarByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLugarByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateLugarByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLugarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Lugar as Lugar");
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
	
	public static java.util.Iterator iterateLugarByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Lugar as Lugar");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Lugar", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lugar createLugar() {
		return new orm.Lugar();
	}
	
	public static boolean save(orm.Lugar lugar) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().saveObject(lugar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Lugar lugar) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().deleteObject(lugar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Lugar lugar)throws PersistentException {
		try {
			orm.Evaluacion[] lEvaluacions = lugar.evaluacion.toArray();
			for(int i = 0; i < lEvaluacions.length; i++) {
				lEvaluacions[i].setLugar_idLugar(null);
			}
			return delete(lugar);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Lugar lugar, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Evaluacion[] lEvaluacions = lugar.evaluacion.toArray();
			for(int i = 0; i < lEvaluacions.length; i++) {
				lEvaluacions[i].setLugar_idLugar(null);
			}
			try {
				session.delete(lugar);
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
	
	public static boolean refresh(orm.Lugar lugar) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().refresh(lugar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Lugar lugar) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().evict(lugar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lugar loadLugarByCriteria(LugarCriteria lugarCriteria) {
		Lugar[] lugars = listLugarByCriteria(lugarCriteria);
		if(lugars == null || lugars.length == 0) {
			return null;
		}
		return lugars[0];
	}
	
	public static Lugar[] listLugarByCriteria(LugarCriteria lugarCriteria) {
		return lugarCriteria.listLugar();
	}
}
