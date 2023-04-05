package net.blerf.ftl.xml;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * One of the "text" tags in lookup files.
 */
@XmlRootElement( name = "text" )
@XmlAccessorType( XmlAccessType.FIELD )
public class NamedText {

	@XmlAttribute( name = "name" )
	private String id;

	@XmlValue
	private String text;


	public void setId( String id ) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setText( String s ) {
		text = s;
	}

	public String getText() {
		return text;
	}
}
