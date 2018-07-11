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

public class RamadeportivaDAO {
	public static Ramadeportiva loadRamadeportivaByORMID(int idRamaDeportiva) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadRamadeportivaByORMID(session, idRamaDeportiva);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramadeportiva getRamadeportivaByORMID(int idRamaDeportiva) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getRamadeportivaByORMID(session, idRamaDeportiva);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramadeportiva loadRamadeportivaByORMID(int idRamaDeportiva, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadRamadeportivaByORMID(session, idRamaDeportiva, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramadeportiva getRamadeportivaByORMID(int idRamaDeportiva, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getRamadeportivaByORMID(session, idRamaDeportiva, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramadeportiva loadRamadeportivaByORMID(PersistentSession session, int idRamaDeportiva) throws PersistentException {
		try {
			return (Ramadeportiva) session.load(orm.Ramadeportiva.class, new Integer(idRamaDeportiva));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramadeportiva getRamadeportivaByORMID(PersistentSession session, int idRamaDeportiva) throws PersistentException {
		try {
			return (Ramadeportiva) session.get(orm.Ramadeportiva.class, new Integer(idRamaDeportiva));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramadeportiva loadRamadeportivaByORMID(PersistentSession session, int idRamaDeportiva, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Ramadeportiva) session.load(orm.Ramadeportiva.class, new Integer(idRamaDeportiva), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramadeportiva getRamadeportivaByORMID(PersistentSession session, int idRamaDeportiva, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Ramadeportiva) session.get(orm.Ramadeportiva.class, new Integer(idRamaDeportiva), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRamadeportiva(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryRamadeportiva(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRamadeportiva(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryRamadeportiva(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramadeportiva[] listRamadeportivaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listRamadeportivaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramadeportiva[] listRamadeportivaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listRamadeportivaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRamadeportiva(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Ramadeportiva as Ramadeportiva");
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
	
	public static List queryRamadeportiva(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Ramadeportiva as Ramadeportiva");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Ramadeportiva", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramadeportiva[] listRamadeportivaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryRamadeportiva(session, condition, orderBy);
			return (Ramadeportiva[]) list.toArray(new Ramadeportiva[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramadeportiva[] listRamadeportivaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryRamadeportiva(session, condition, orderBy, lockMode);
			return (Ramadeportiva[]) list.toArray(new Ramadeportiva[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramadeportiva loadRamadeportivaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadRamadeportivaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramadeportiva loadRamadeportivaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadRamadeportivaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramadeportiva loadRamadeportivaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Ramadeportiva[] ramadeportivas = listRamadeportivaByQuery(session, condition, orderBy);
		if (ramadeportivas != null && ramadeportivas.length > 0)
			return ramadeportivas[0];
		else
			return null;
	}
	
	public static Ramadeportiva loadRamadeportivaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Ramadeportiva[] ramadeportivas = listRamadeportivaByQuery(session, condition, orderBy, lockMode);
		if (ramadeportivas != null && ramadeportivas.length > 0)
			return ramadeportivas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateRamadeportivaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateRamadeportivaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRamadeportivaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateRamadeportivaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRamadeportivaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Ramadeportiva as Ramadeportiva");
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
	
	public static java.util.Iterator iterateRamadeportivaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Ramadeportiva as Ramadeportiva");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Ramadeportiva", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramadeportiva createRamadeportiva() {
		return new orm.Ramadeportiva();
	}
	
	public static boolean save(orm.Ramadeportiva ramadeportiva) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().saveObject(ramadeportiva);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Ramadeportiva ramadeportiva) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().deleteObject(ramadeportiva);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Ramadeportiva ramadeportiva)throws PersistentException {
		try {
			orm.Alumno[] lAlumno_idAlumnos = ramadeportiva.alumno_idAlumno.toArray();
			for(int i = 0; i < lAlumno_idAlumnos.length; i++) {
				lAlumno_idAlumnos[i].ramaDeportiva_idRamaDeportiva.remove(ramadeportiva);
			}
			return delete(ramadeportiva);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Ramadeportiva ramadeportiva, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Alumno[] lAlumno_idAlumnos = ramadeportiva.alumno_idAlumno.toArray();
			for(int i = 0; i < lAlumno_idAlumnos.length; i++) {
				lAlumno_idAlumnos[i].ramaDeportiva_idRamaDeportiva.remove(ramadeportiva);
			}
			try {
				session.delete(ramadeportiva);
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
	
	public static boolean refresh(orm.Ramadeportiva ramadeportiva) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().refresh(ramadeportiva);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Ramadeportiva ramadeportiva) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().evict(ramadeportiva);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramadeportiva loadRamadeportivaByCriteria(RamadeportivaCriteria ramadeportivaCriteria) {
		Ramadeportiva[] ramadeportivas = listRamadeportivaByCriteria(ramadeportivaCriteria);
		if(ramadeportivas == null || ramadeportivas.length == 0) {
			return null;
		}
		return ramadeportivas[0];
	}
	
	public static Ramadeportiva[] listRamadeportivaByCriteria(RamadeportivaCriteria ramadeportivaCriteria) {
		return ramadeportivaCriteria.listRamadeportiva();
	}
}
