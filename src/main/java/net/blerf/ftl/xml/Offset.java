package net.blerf.ftl.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;


/**
 * A simple (x,y) object.
 *
 * @see net.blerf.ftl.xml.ShipChassis
 * @see net.blerf.ftl.xml.WeaponAnim
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Offset {

	@XmlAttribute
	public int x, y;
}
