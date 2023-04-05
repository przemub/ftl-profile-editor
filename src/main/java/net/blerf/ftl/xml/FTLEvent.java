package net.blerf.ftl.xml;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import net.blerf.ftl.xml.DefaultDeferredText;


@XmlRootElement( name = "event" )
@XmlAccessorType( XmlAccessType.FIELD )
public class FTLEvent {
	@XmlAttribute( name = "name", required = false )
	private String id;

	// The rest is uninteresting. ;)


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
