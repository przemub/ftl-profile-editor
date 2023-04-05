package net.blerf.ftl.xml;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "nameLists")
@XmlAccessorType(XmlAccessType.FIELD)
public class CrewNameLists {

	@XmlElement(name = "nameList")
	private List<CrewNameList> crewNameLists;

	public void setCrewNameLists( List<CrewNameList> crewNameLists ) {
		this.crewNameLists = crewNameLists;
	}

	public List<CrewNameList> getCrewNameLists() {
		return crewNameLists;
	}
}
