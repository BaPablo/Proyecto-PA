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

public class ProfesorSetCollection extends org.orm.util.ORMSet {
	public ProfesorSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int targetKey, int collType) {
		super(owner, adapter, ownerKey, targetKey, true, collType);
	}
	
	public ProfesorSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int collType) {
		super(owner, adapter, ownerKey, -1, false, collType);
	}
	
	/**
	* Return an iterator over the persistent objects
	* @return The persistent objects iterator
	*/
	public java.util.Iterator getIterator() {
		return super.getIterator(_ownerAdapter);
	}
	
	/**
	 * Add the specified persistent object to ORMSet
	 * @param value the persistent object
	 */
	public void add(Profesor value) {
		if (value != null) {
			super.add(value, value._ormAdapter);
		}
	}
	
	/**
	 * Remove the specified persistent object from ORMSet
	 * @param value the persistent object
	 */
	public void remove(Profesor value) {
		super.remove(value, value._ormAdapter);
	}
	
	/**
	 * Return true if ORMSet contains the specified persistent object
	 * @param value the persistent object
	 * @return True if this contains the specified persistent object
	 */
	public boolean contains(Profesor value) {
		return super.contains(value);
	}
	
	/**
	 * Return an array containing all of the persistent objects in ORMSet
	 * @return The persistent objects array
	 */
	public Profesor[] toArray() {
		return (Profesor[]) super.toArray(new Profesor[size()]);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>idProfesor</li>
	 * <li>rutProfesor</li>
	 * <li>primerNombre</li>
	 * <li>segundoNombre</li>
	 * <li>primerApellido</li>
	 * <li>segundoApellido</li>
	 * <li>fechaNacimiento</li>
	 * <li>sexo</li>
	 * <li>email</li>
	 * <li>telefonoMovil</li>
	 * <li>grado</li>
	 * <li>fechaIngreso</li>
	 * <li>fechaTermino</li>
	 * </ul>
	 * @return The persistent objects sorted array
	 */
	public Profesor[] toArray(String propertyName) {
		return toArray(propertyName, true);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>idProfesor</li>
	 * <li>rutProfesor</li>
	 * <li>primerNombre</li>
	 * <li>segundoNombre</li>
	 * <li>primerApellido</li>
	 * <li>segundoApellido</li>
	 * <li>fechaNacimiento</li>
	 * <li>sexo</li>
	 * <li>email</li>
	 * <li>telefonoMovil</li>
	 * <li>grado</li>
	 * <li>fechaIngreso</li>
	 * <li>fechaTermino</li>
	 * </ul>
	 * @param ascending true for ascending, false for descending
	 * @return The persistent objects sorted array
	 */
	public Profesor[] toArray(String propertyName, boolean ascending) {
		return (Profesor[]) super.toArray(new Profesor[size()], propertyName, ascending);
	}
	
	protected PersistentManager getPersistentManager() throws PersistentException {
		return orm.ProyectoPersistentManager.instance();
	}
	
}

