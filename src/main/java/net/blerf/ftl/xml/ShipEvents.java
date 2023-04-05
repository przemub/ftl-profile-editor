package net.blerf.ftl.xml;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement( name = "shipEvents" )
@XmlAccessorType( XmlAccessType.FIELD )
public class ShipEvents {

	@XmlElement( name = "ship" )
	private List<ShipEvent> shipEvents;


	public void setShipEvents( List<ShipEvent> shipEvents ) {
		this.shipEvents = shipEvents;
	}

	public List<ShipEvent> getShipEvents() {
		return shipEvents;
	}
}
