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

public class DepartamentoDAO {
	public static Departamento loadDepartamentoByORMID(int idDepartamento) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadDepartamentoByORMID(session, idDepartamento);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Departamento getDepartamentoByORMID(int idDepartamento) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getDepartamentoByORMID(session, idDepartamento);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Departamento loadDepartamentoByORMID(int idDepartamento, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadDepartamentoByORMID(session, idDepartamento, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Departamento getDepartamentoByORMID(int idDepartamento, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getDepartamentoByORMID(session, idDepartamento, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Departamento loadDepartamentoByORMID(PersistentSession session, int idDepartamento) throws PersistentException {
		try {
			return (Departamento) session.load(orm.Departamento.class, new Integer(idDepartamento));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Departamento getDepartamentoByORMID(PersistentSession session, int idDepartamento) throws PersistentException {
		try {
			return (Departamento) session.get(orm.Departamento.class, new Integer(idDepartamento));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Departamento loadDepartamentoByORMID(PersistentSession session, int idDepartamento, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Departamento) session.load(orm.Departamento.class, new Integer(idDepartamento), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Departamento getDepartamentoByORMID(PersistentSession session, int idDepartamento, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Departamento) session.get(orm.Departamento.class, new Integer(idDepartamento), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDepartamento(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryDepartamento(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDepartamento(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryDepartamento(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Departamento[] listDepartamentoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listDepartamentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Departamento[] listDepartamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listDepartamentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDepartamento(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Departamento as Departamento");
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
	
	public static List queryDepartamento(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Departamento as Departamento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Departamento", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Departamento[] listDepartamentoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDepartamento(session, condition, orderBy);
			return (Departamento[]) list.toArray(new Departamento[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Departamento[] listDepartamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDepartamento(session, condition, orderBy, lockMode);
			return (Departamento[]) list.toArray(new Departamento[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Departamento loadDepartamentoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadDepartamentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Departamento loadDepartamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadDepartamentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Departamento loadDepartamentoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Departamento[] departamentos = listDepartamentoByQuery(session, condition, orderBy);
		if (departamentos != null && departamentos.length > 0)
			return departamentos[0];
		else
			return null;
	}
	
	public static Departamento loadDepartamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Departamento[] departamentos = listDepartamentoByQuery(session, condition, orderBy, lockMode);
		if (departamentos != null && departamentos.length > 0)
			return departamentos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDepartamentoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateDepartamentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDepartamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateDepartamentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDepartamentoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Departamento as Departamento");
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
	
	public static java.util.Iterator iterateDepartamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Departamento as Departamento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Departamento", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Departamento createDepartamento() {
		return new orm.Departamento();
	}
	
	public static boolean save(orm.Departamento departamento) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().saveObject(departamento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Departamento departamento) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().deleteObject(departamento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Departamento departamento)throws PersistentException {
		try {
			if (departamento.getFacultad_idFacultad() != null) {
				departamento.getFacultad_idFacultad().departamento.remove(departamento);
			}
			
			orm.Profesor[] lProfesors = departamento.profesor.toArray();
			for(int i = 0; i < lProfesors.length; i++) {
				lProfesors[i].setDepartamento_idDepartamento(null);
			}
			return delete(departamento);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Departamento departamento, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (departamento.getFacultad_idFacultad() != null) {
				departamento.getFacultad_idFacultad().departamento.remove(departamento);
			}
			
			orm.Profesor[] lProfesors = departamento.profesor.toArray();
			for(int i = 0; i < lProfesors.length; i++) {
				lProfesors[i].setDepartamento_idDepartamento(null);
			}
			try {
				session.delete(departamento);
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
	
	public static boolean refresh(orm.Departamento departamento) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().refresh(departamento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Departamento departamento) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().evict(departamento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Departamento loadDepartamentoByCriteria(DepartamentoCriteria departamentoCriteria) {
		Departamento[] departamentos = listDepartamentoByCriteria(departamentoCriteria);
		if(departamentos == null || departamentos.length == 0) {
			return null;
		}
		return departamentos[0];
	}
	
	public static Departamento[] listDepartamentoByCriteria(DepartamentoCriteria departamentoCriteria) {
		return departamentoCriteria.listDepartamento();
	}
}
