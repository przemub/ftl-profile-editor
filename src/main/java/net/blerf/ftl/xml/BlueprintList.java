package net.blerf.ftl.xml;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "blueprintList")
@XmlAccessorType(XmlAccessType.FIELD)
public class BlueprintList {
	
	@XmlAttribute
	private String name;
	
	@XmlElement(name = "name")
	private List<String> items;

}
