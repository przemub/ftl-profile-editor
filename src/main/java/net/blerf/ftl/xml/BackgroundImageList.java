package net.blerf.ftl.xml;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import net.blerf.ftl.xml.BackgroundImage;


@XmlRootElement( name = "imageList" )
@XmlAccessorType( XmlAccessType.FIELD )
public class BackgroundImageList {

	@XmlAttribute( name = "name" )
	private String id;

	@XmlElement( name = "img" )
	private List<BackgroundImage> images;


	public void setImages( List<BackgroundImage> images ) {
		this.images = images;
	}

	public List<BackgroundImage> getImages() {
		return images;
	}

	public void setId( String id ) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return ""+id;
	}
}
