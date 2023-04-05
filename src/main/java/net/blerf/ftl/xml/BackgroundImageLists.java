package net.blerf.ftl.xml;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import net.blerf.ftl.xml.BackgroundImageList;


@XmlRootElement( name = "imageLists" )
@XmlAccessorType( XmlAccessType.FIELD )
public class BackgroundImageLists {

	@XmlElement( name = "imageList", required = false )
	private List<BackgroundImageList> imageLists = new ArrayList<BackgroundImageList>();


	public void setImageLists( List<BackgroundImageList> imageLists ) {
		this.imageLists = imageLists;
	}

	public List<BackgroundImageList> getImageLists() {
		return imageLists;
	}
}
