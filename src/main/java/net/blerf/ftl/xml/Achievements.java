package net.blerf.ftl.xml;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement( name = "achievements" )
@XmlAccessorType( XmlAccessType.FIELD )
public class Achievements {

	@XmlElement( name = "achievement" )
	private List<Achievement> achievements = new ArrayList<Achievement>();


	public List<Achievement> getAchievements() {
		return achievements;
	}

	public void setAchievements(List<Achievement> achievements) {
		this.achievements = achievements;
	}
	
}
