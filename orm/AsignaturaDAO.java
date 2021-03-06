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

public class AsignaturaDAO {
	public static Asignatura loadAsignaturaByORMID(int idAsignatura) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadAsignaturaByORMID(session, idAsignatura);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asignatura getAsignaturaByORMID(int idAsignatura) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getAsignaturaByORMID(session, idAsignatura);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asignatura loadAsignaturaByORMID(int idAsignatura, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadAsignaturaByORMID(session, idAsignatura, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asignatura getAsignaturaByORMID(int idAsignatura, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getAsignaturaByORMID(session, idAsignatura, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asignatura loadAsignaturaByORMID(PersistentSession session, int idAsignatura) throws PersistentException {
		try {
			return (Asignatura) session.load(orm.Asignatura.class, new Integer(idAsignatura));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asignatura getAsignaturaByORMID(PersistentSession session, int idAsignatura) throws PersistentException {
		try {
			return (Asignatura) session.get(orm.Asignatura.class, new Integer(idAsignatura));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asignatura loadAsignaturaByORMID(PersistentSession session, int idAsignatura, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Asignatura) session.load(orm.Asignatura.class, new Integer(idAsignatura), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asignatura getAsignaturaByORMID(PersistentSession session, int idAsignatura, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Asignatura) session.get(orm.Asignatura.class, new Integer(idAsignatura), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAsignatura(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryAsignatura(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAsignatura(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryAsignatura(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asignatura[] listAsignaturaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listAsignaturaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asignatura[] listAsignaturaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listAsignaturaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAsignatura(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Asignatura as Asignatura");
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
	
	public static List queryAsignatura(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Asignatura as Asignatura");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Asignatura", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asignatura[] listAsignaturaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAsignatura(session, condition, orderBy);
			return (Asignatura[]) list.toArray(new Asignatura[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asignatura[] listAsignaturaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAsignatura(session, condition, orderBy, lockMode);
			return (Asignatura[]) list.toArray(new Asignatura[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asignatura loadAsignaturaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadAsignaturaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asignatura loadAsignaturaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadAsignaturaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asignatura loadAsignaturaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Asignatura[] asignaturas = listAsignaturaByQuery(session, condition, orderBy);
		if (asignaturas != null && asignaturas.length > 0)
			return asignaturas[0];
		else
			return null;
	}
	
	public static Asignatura loadAsignaturaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Asignatura[] asignaturas = listAsignaturaByQuery(session, condition, orderBy, lockMode);
		if (asignaturas != null && asignaturas.length > 0)
			return asignaturas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAsignaturaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateAsignaturaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAsignaturaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateAsignaturaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAsignaturaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Asignatura as Asignatura");
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
	
	public static java.util.Iterator iterateAsignaturaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Asignatura as Asignatura");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Asignatura", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asignatura createAsignatura() {
		return new orm.Asignatura();
	}
	
	public static boolean save(orm.Asignatura asignatura) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().saveObject(asignatura);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Asignatura asignatura) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().deleteObject(asignatura);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Asignatura asignatura)throws PersistentException {
		try {
			orm.Profesor[] lProfesor_idProfesors = asignatura.profesor_idProfesor.toArray();
			for(int i = 0; i < lProfesor_idProfesors.length; i++) {
				lProfesor_idProfesors[i].asignatura_idAsignatura.remove(asignatura);
			}
			orm.Evaluacion[] lEvaluacions = asignatura.evaluacion.toArray();
			for(int i = 0; i < lEvaluacions.length; i++) {
				lEvaluacions[i].setAsignatura_idAsignatura(null);
			}
			orm.Clase[] lClases = asignatura.clase.toArray();
			for(int i = 0; i < lClases.length; i++) {
				lClases[i].setAsignaturaidAsignatura(null);
			}
			return delete(asignatura);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Asignatura asignatura, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Profesor[] lProfesor_idProfesors = asignatura.profesor_idProfesor.toArray();
			for(int i = 0; i < lProfesor_idProfesors.length; i++) {
				lProfesor_idProfesors[i].asignatura_idAsignatura.remove(asignatura);
			}
			orm.Evaluacion[] lEvaluacions = asignatura.evaluacion.toArray();
			for(int i = 0; i < lEvaluacions.length; i++) {
				lEvaluacions[i].setAsignatura_idAsignatura(null);
			}
			orm.Clase[] lClases = asignatura.clase.toArray();
			for(int i = 0; i < lClases.length; i++) {
				lClases[i].setAsignaturaidAsignatura(null);
			}
			try {
				session.delete(asignatura);
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
	
	public static boolean refresh(orm.Asignatura asignatura) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().refresh(asignatura);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Asignatura asignatura) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().evict(asignatura);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asignatura loadAsignaturaByCriteria(AsignaturaCriteria asignaturaCriteria) {
		Asignatura[] asignaturas = listAsignaturaByCriteria(asignaturaCriteria);
		if(asignaturas == null || asignaturas.length == 0) {
			return null;
		}
		return asignaturas[0];
	}
	
	public static Asignatura[] listAsignaturaByCriteria(AsignaturaCriteria asignaturaCriteria) {
		return asignaturaCriteria.listAsignatura();
	}
}
