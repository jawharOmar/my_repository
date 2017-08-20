
package okm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for folder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="folder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.openkm.com}node">
 *       &lt;sequence>
 *         &lt;element name="hasChildren" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "folder", propOrder = {
    "hasChildren"
})
public class Folder
    extends Node
{

    protected boolean hasChildren;

    /**
     * Gets the value of the hasChildren property.
     * 
     */
    public boolean isHasChildren() {
        return hasChildren;
    }

    /**
     * Sets the value of the hasChildren property.
     * 
     */
    public void setHasChildren(boolean value) {
        this.hasChildren = value;
    }

}
