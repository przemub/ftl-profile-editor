package net.blerf.ftl.xml;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import net.blerf.ftl.xml.FTLEvent;


@XmlRootElement(name = "eventList")
@XmlAccessorType(XmlAccessType.FIELD)
public class FTLEventList {
	@XmlAttribute(name = "name")
	private String id;

	//@XmlElement(name="event",required=false)
	//private List<FTLEvent> eventList;

	public String getId() {
		return id;
	}

	public void setId( String id ) {
		this.id = id;
	}

	@Override
	public String toString() {
		return ""+id;
	}
}
