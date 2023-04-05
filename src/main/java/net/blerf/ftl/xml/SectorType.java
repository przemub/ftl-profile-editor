package net.blerf.ftl.xml;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "sectorType")
@XmlAccessorType(XmlAccessType.FIELD)
public class SectorType {

	@XmlAttribute(name = "name")
	private String id;

	@XmlElement(name = "sector")
	public List<String> sectorIds;

	public void setId( String id ) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setSectorIds( List<String> sectorIds ) {
		this.sectorIds = sectorIds;
	}

	public List<String> getSectorIds() {
		return sectorIds;
	}
}
