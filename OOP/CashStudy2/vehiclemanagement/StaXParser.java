/****************************************************************************************
Name            : StaXParser
Revision Log    : 2015-09-21: Subhash Chander : created.
                : 
                : 
Use             : This class is used to take data from xml file
                :
 ****************************************************************************************/
package vehiclemanagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import vehiclemanagement.model.Car;
import vehiclemanagement.model.Vehicle;

import vehiclemanagement.model.Bike;

public class StaXParser {

	static final String ROW = "row";
	static final String TYPE = "type";
	static final String VEHICLEID = "vehicleId";
	static final String MAKE = "make";
	static final String MODEL = "model";
	static final String ENGINEINCC = "engineInCC";
	static final String FUELCAPACITY = "fuelCapacity";
	static final String MILEAGE = "mileage";
	static final String PRICE = "price";
	static final String ROADTAX = "roadTax";
	static final String AC = "ac";
	static final String POWERSTEERING = "powerSteering";
	static final String ACCESSORYKIT = "accessoryKit";
	static final String SELFSTART = "selfStart";
	static final String HELMETPRICE = "helmetPrice";

	/**
	 * readConfig method :This method is used to take data from xml file
	 * 
	 * @return : total price of bike include all acclessory.
	 */
	public List<Vehicle> readConfig(String path) {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		try {
			XMLInputFactory inputFactory = XMLInputFactory.newInstance();

			InputStream in = new FileInputStream(path);
			XMLEventReader eventReader = inputFactory.createXMLEventReader(in);

			Vehicle vechile = null;

			while (eventReader.hasNext()) {
				XMLEvent event = eventReader.nextEvent();

				
				if (event.isStartElement()) {

					StartElement startElement = event.asStartElement();

					if (startElement.getName().getLocalPart() == (ROW)) {

						@SuppressWarnings("unchecked")
						Iterator<Attribute> attributes = startElement
								.getAttributes();
						while (attributes.hasNext()) {
							Attribute attribute = attributes.next();
							if (attribute.getName().toString().equals(TYPE)) {
								if (attribute.getValue()
										.equalsIgnoreCase("car")) {
									vechile = new Car();
								} else {
									vechile = new Bike();
								}
							}
						}

					}
					if (event.isStartElement()) {
						if (event.asStartElement().getName().getLocalPart()
								.equals(VEHICLEID)) {

							event = eventReader.nextEvent();
							vechile.setVehicalid(Double.parseDouble(event
									.asCharacters().getData()));
							continue;
						}
					}
					if (event.isStartElement()) {
						if (event.asStartElement().getName().getLocalPart()
								.equals(MAKE)) {
							event = eventReader.nextEvent();
							vechile.setMake(event.asCharacters().getData());
							continue;
						}
					}
					if (event.isStartElement()) {
						if (event.asStartElement().getName().getLocalPart()
								.equals(MODEL)) {
							event = eventReader.nextEvent();
							vechile.setModel(event.asCharacters().getData());
							continue;
						}
					}
					if (event.isStartElement()) {
						if (event.asStartElement().getName().getLocalPart()
								.equals(ENGINEINCC)) {
							event = eventReader.nextEvent();
							vechile.setEnginInCC(Integer.parseInt(event
									.asCharacters().getData()));
							continue;
						}
					}
					if (event.isStartElement()) {
						if (event.asStartElement().getName().getLocalPart()
								.equals(FUELCAPACITY)) {
							event = eventReader.nextEvent();
							vechile.setFuelCapacity(Integer.parseInt(event
									.asCharacters().getData()));
							continue;
						}
					}
					if (event.asStartElement().getName().getLocalPart()
							.equals(MILEAGE)) {
						event = eventReader.nextEvent();
						vechile.setMilage(Integer.parseInt(event.asCharacters()
								.getData()));
						continue;
					}
					if (event.isStartElement()) {
						if (event.asStartElement().getName().getLocalPart()
								.equals(PRICE)) {
							event = eventReader.nextEvent();
							vechile.setPrice(Float.parseFloat(event
									.asCharacters().getData()));
							continue;
						}
					}
					if (event.isStartElement()) {
						if (event.asStartElement().getName().getLocalPart()
								.equals(ROADTAX)) {
							event = eventReader.nextEvent();
							vechile.setRoadTax(Float.parseFloat(event
									.asCharacters().getData()));
							continue;
						}
					}
					if (event.isStartElement()) {
						if (event.asStartElement().getName().getLocalPart()
								.equals(AC)) {
							event = eventReader.nextEvent();
							((Car) vechile).setAC(Boolean.parseBoolean(event
									.asCharacters().getData()));
							continue;
						}
					}
					if (event.isStartElement()) {
						if (event.asStartElement().getName().getLocalPart()
								.equals(POWERSTEERING)) {
							event = eventReader.nextEvent();
							((Car) vechile).setPowerSteering(Boolean
									.parseBoolean(event.asCharacters()
											.getData()));
							continue;
						}
					}
					if (event.isStartElement()) {
						if (event.asStartElement().getName().getLocalPart()
								.equals(ACCESSORYKIT)) {
							event = eventReader.nextEvent();
							((Car) vechile).setAccessoryKit(event
									.asCharacters().getData());
							// System.out.println(car);
							vehicles.add(vechile);
							continue;
						}
					}
					if (event.isStartElement()) {
						if (event.asStartElement().getName().getLocalPart()
								.equals(SELFSTART)) {
							event = eventReader.nextEvent();
							((Bike) vechile).setSelfStart(Boolean
									.parseBoolean(event.asCharacters()
											.getData()));
							// System.out.println(car);
							continue;
						}
					}
					if (event.isStartElement()) {
						if (event.asStartElement().getName().getLocalPart()
								.equals(HELMETPRICE)) {
							event = eventReader.nextEvent();
							((Bike) vechile).setHelmetPrize(Integer
									.parseInt(event.asCharacters().getData()));
							vehicles.add(vechile);
							continue;
						}
					}

					if (event.isEndElement()) {
						EndElement endElement = event.asEndElement();
						if (endElement.getName().getLocalPart() == (ROW)) {

						}
					}

				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
		return vehicles;
	}
}
