//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.03.24 at 06:13:46 PM IST 
//


package org.dspace.workflow;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * 
 * 		The 'workflow' element describes what workflow actions
 * 		can be taken upon completion of the task. In the
 * 		example above, the vscan (virus scan) task has been
 * 		given the power to 'reject': meaning that if the task
 * 		fails - viz. a virus is detected - the item will be
 * 		rejected like a reviewer would reject it.
 * 
 * 		The other 'workflow' value is 'approve', which skips
 * 		any further tasks and advances the item.
 * 	    
 * 
 * <p>Java class for workflow-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workflow-type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;https://dspace.org/workflow-curation&gt;action-type"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workflow-type", namespace = "https://dspace.org/workflow-curation", propOrder = {
    "value"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2025-03-24T18:13:46+05:30")
public class WorkflowType {

    @XmlValue
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2025-03-24T18:13:46+05:30")
    protected ActionType value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2025-03-24T18:13:46+05:30")
    public ActionType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2025-03-24T18:13:46+05:30")
    public void setValue(ActionType value) {
        this.value = value;
    }

}
