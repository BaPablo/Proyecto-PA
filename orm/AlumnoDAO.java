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

public class AlumnoDAO {
	public static Alumno loadAlumnoByORMID(int idAlumno) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadAlumnoByORMID(session, idAlumno);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Alumno getAlumnoByORMID(int idAlumno) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getAlumnoByORMID(session, idAlumno);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Alumno loadAlumnoByORMID(int idAlumno, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadAlumnoByORMID(session, idAlumno, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Alumno getAlumnoByORMID(int idAlumno, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return getAlumnoByORMID(session, idAlumno, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Alumno loadAlumnoByORMID(PersistentSession session, int idAlumno) throws PersistentException {
		try {
			return (Alumno) session.load(orm.Alumno.class, new Integer(idAlumno));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Alumno getAlumnoByORMID(PersistentSession session, int idAlumno) throws PersistentException {
		try {
			return (Alumno) session.get(orm.Alumno.class, new Integer(idAlumno));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Alumno loadAlumnoByORMID(PersistentSession session, int idAlumno, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Alumno) session.load(orm.Alumno.class, new Integer(idAlumno), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Alumno getAlumnoByORMID(PersistentSession session, int idAlumno, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Alumno) session.get(orm.Alumno.class, new Integer(idAlumno), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAlumno(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryAlumno(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAlumno(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return queryAlumno(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Alumno[] listAlumnoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listAlumnoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Alumno[] listAlumnoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return listAlumnoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAlumno(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Alumno as Alumno");
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
	
	public static List queryAlumno(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Alumno as Alumno");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Alumno", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Alumno[] listAlumnoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAlumno(session, condition, orderBy);
			return (Alumno[]) list.toArray(new Alumno[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Alumno[] listAlumnoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAlumno(session, condition, orderBy, lockMode);
			return (Alumno[]) list.toArray(new Alumno[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Alumno loadAlumnoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadAlumnoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Alumno loadAlumnoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return loadAlumnoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Alumno loadAlumnoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Alumno[] alumnos = listAlumnoByQuery(session, condition, orderBy);
		if (alumnos != null && alumnos.length > 0)
			return alumnos[0];
		else
			return null;
	}
	
	public static Alumno loadAlumnoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Alumno[] alumnos = listAlumnoByQuery(session, condition, orderBy, lockMode);
		if (alumnos != null && alumnos.length > 0)
			return alumnos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAlumnoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateAlumnoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAlumnoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPersistentManager.instance().getSession();
			return iterateAlumnoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAlumnoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Alumno as Alumno");
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
	
	public static java.util.Iterator iterateAlumnoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Alumno as Alumno");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Alumno", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Alumno createAlumno() {
		return new orm.Alumno();
	}
	
	public static boolean save(orm.Alumno alumno) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().saveObject(alumno);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Alumno alumno) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().deleteObject(alumno);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Alumno alumno)throws PersistentException {
		try {
			if (alumno.getApoderado_idApoderado() != null) {
				alumno.getApoderado_idApoderado().alumno.remove(alumno);
			}
			
			if (alumno.getDireccion_idDireccion() != null) {
				alumno.getDireccion_idDireccion().alumno.remove(alumno);
			}
			
			orm.Agrupacion[] lAgrupacion_idAgrups = alumno.agrupacion_idAgrup.toArray();
			for(int i = 0; i < lAgrupacion_idAgrups.length; i++) {
				lAgrupacion_idAgrups[i].alumno_idAlumno.remove(alumno);
			}
			orm.Condicionsalud[] lCondicionSalud_idCondicionSaluds = alumno.condicionSalud_idCondicionSalud.toArray();
			for(int i = 0; i < lCondicionSalud_idCondicionSaluds.length; i++) {
				lCondicionSalud_idCondicionSaluds[i].alumno_idAlumno.remove(alumno);
			}
			orm.Intereses[] lIntereses_idInteresess = alumno.intereses_idIntereses.toArray();
			for(int i = 0; i < lIntereses_idInteresess.length; i++) {
				lIntereses_idInteresess[i].alumno_idAlumno.remove(alumno);
			}
			orm.Ramadeportiva[] lRamaDeportiva_idRamaDeportivas = alumno.ramaDeportiva_idRamaDeportiva.toArray();
			for(int i = 0; i < lRamaDeportiva_idRamaDeportivas.length; i++) {
				lRamaDeportiva_idRamaDeportivas[i].alumno_idAlumno.remove(alumno);
			}
			orm.Asistencia[] lAsistencias = alumno.asistencia.toArray();
			for(int i = 0; i < lAsistencias.length; i++) {
				lAsistencias[i].setAlumno_idAlumno(null);
			}
			return delete(alumno);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Alumno alumno, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (alumno.getApoderado_idApoderado() != null) {
				alumno.getApoderado_idApoderado().alumno.remove(alumno);
			}
			
			if (alumno.getDireccion_idDireccion() != null) {
				alumno.getDireccion_idDireccion().alumno.remove(alumno);
			}
			
			orm.Agrupacion[] lAgrupacion_idAgrups = alumno.agrupacion_idAgrup.toArray();
			for(int i = 0; i < lAgrupacion_idAgrups.length; i++) {
				lAgrupacion_idAgrups[i].alumno_idAlumno.remove(alumno);
			}
			orm.Condicionsalud[] lCondicionSalud_idCondicionSaluds = alumno.condicionSalud_idCondicionSalud.toArray();
			for(int i = 0; i < lCondicionSalud_idCondicionSaluds.length; i++) {
				lCondicionSalud_idCondicionSaluds[i].alumno_idAlumno.remove(alumno);
			}
			orm.Intereses[] lIntereses_idInteresess = alumno.intereses_idIntereses.toArray();
			for(int i = 0; i < lIntereses_idInteresess.length; i++) {
				lIntereses_idInteresess[i].alumno_idAlumno.remove(alumno);
			}
			orm.Ramadeportiva[] lRamaDeportiva_idRamaDeportivas = alumno.ramaDeportiva_idRamaDeportiva.toArray();
			for(int i = 0; i < lRamaDeportiva_idRamaDeportivas.length; i++) {
				lRamaDeportiva_idRamaDeportivas[i].alumno_idAlumno.remove(alumno);
			}
			orm.Asistencia[] lAsistencias = alumno.asistencia.toArray();
			for(int i = 0; i < lAsistencias.length; i++) {
				lAsistencias[i].setAlumno_idAlumno(null);
			}
			try {
				session.delete(alumno);
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
	
	public static boolean refresh(orm.Alumno alumno) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().refresh(alumno);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Alumno alumno) throws PersistentException {
		try {
			orm.ProyectoPersistentManager.instance().getSession().evict(alumno);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Alumno loadAlumnoByCriteria(AlumnoCriteria alumnoCriteria) {
		Alumno[] alumnos = listAlumnoByCriteria(alumnoCriteria);
		if(alumnos == null || alumnos.length == 0) {
			return null;
		}
		return alumnos[0];
	}
	
	public static Alumno[] listAlumnoByCriteria(AlumnoCriteria alumnoCriteria) {
		return alumnoCriteria.listAlumno();
	}
}
