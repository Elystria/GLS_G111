/**
 */
package simplepdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.WorkDefinition#getLinksToPredecessors <em>Links To Predecessors</em>}</li>
 *   <li>{@link simplepdl.WorkDefinition#getLinksToSuccessors <em>Links To Successors</em>}</li>
 *   <li>{@link simplepdl.WorkDefinition#getName <em>Name</em>}</li>
 *   <li>{@link simplepdl.WorkDefinition#getLinktoresource <em>Linktoresource</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getWorkDefinition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nomUnique auMoins1Caractere'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nomUnique='WorkDefinition.allInstances()-&gt;\n\t\tforAll(wd | wd &lt;&gt; self implies wd.name &lt;&gt; name)' auMoins1Caractere='name.size() &gt;= 1'"
 * @generated
 */
public interface WorkDefinition extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Links To Predecessors</b></em>' reference list.
	 * The list contents are of type {@link simplepdl.WorkSequence}.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkSequence#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links To Predecessors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Predecessors</em>' reference list.
	 * @see simplepdl.SimplepdlPackage#getWorkDefinition_LinksToPredecessors()
	 * @see simplepdl.WorkSequence#getSuccessor
	 * @model opposite="successor"
	 * @generated
	 */
	EList<WorkSequence> getLinksToPredecessors();

	/**
	 * Returns the value of the '<em><b>Links To Successors</b></em>' reference list.
	 * The list contents are of type {@link simplepdl.WorkSequence}.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkSequence#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links To Successors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Successors</em>' reference list.
	 * @see simplepdl.SimplepdlPackage#getWorkDefinition_LinksToSuccessors()
	 * @see simplepdl.WorkSequence#getPredecessor
	 * @model opposite="predecessor"
	 * @generated
	 */
	EList<WorkSequence> getLinksToSuccessors();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simplepdl.SimplepdlPackage#getWorkDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simplepdl.WorkDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Linktoresource</b></em>' reference list.
	 * The list contents are of type {@link simplepdl.RequeteDeRessource}.
	 * It is bidirectional and its opposite is '{@link simplepdl.RequeteDeRessource#getWorkdefinition <em>Workdefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linktoresource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linktoresource</em>' reference list.
	 * @see simplepdl.SimplepdlPackage#getWorkDefinition_Linktoresource()
	 * @see simplepdl.RequeteDeRessource#getWorkdefinition
	 * @model opposite="workdefinition"
	 * @generated
	 */
	EList<RequeteDeRessource> getLinktoresource();

} // WorkDefinition
