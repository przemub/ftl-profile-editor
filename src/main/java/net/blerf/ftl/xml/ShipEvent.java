package net.blerf.ftl.xml;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import net.blerf.ftl.xml.DefaultDeferredText;


@XmlRootElement( name = "ship" )
@XmlAccessorType( XmlAccessType.FIELD )
public class ShipEvent {

	@XmlAttribute( name = "name" )
	private String id;

	@XmlAttribute( name = "auto_blueprint" )
	private String autoBlueprintId;

	// The rest is uninteresting. ;)


	public String getId() {
		return id;
	}

	public void setId( String id ) {
		this.id = id;
	}

	public String getAutoBlueprintId() {
		return autoBlueprintId;
	}

	public void setAutoBlueprintId( String autoBlueprintId ) {
		this.autoBlueprintId = autoBlueprintId;
	}

	@Override
	public String toString() {
		return ""+id;
	}
}
