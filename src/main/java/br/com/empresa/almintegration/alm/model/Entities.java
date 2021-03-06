package br.com.empresa.almintegration.alm.model;

import java.util.List;

/*

This file was generated by the JavaTM Architecture for XML Binding(JAXB)
Reference Implementation, vhudson-jaxb-ri-2.1-456
See http://www.oracle.com/technetwork/articles/javase/index-140168.html
Any modifications to this file will be lost upon recompilation of the source schema.


This example of an automatically generated class is an example of how one can
generate classes from XSDs via xjc to match jaxb standards.
XSD is a format for describing a class structure
(note: the CLASS not an INSTANCE of the class).
From an XSD one can generate a class java source file.
When compiling this source file, one can "marshal" an actual object instance
from the XML describing the object (this time we are talking about an instance,
not a class).

this process has many advantages, and is a form of serialization that is not
language dependent.
This is the recommended way of working with entities, though we do suggest you
customize your entity class with simpler accessors.


 */
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.empresa.almintegration.alm.infrastructure.Entity;

/**
 * Java class for anonymous complex type.
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Fields">
 *           <complexType>
 *             <complexContent>
 *               <restriction base=
 *                  "{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Field" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base=
 *                            "{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Value"
 *                               type="{http://www.w3.org/2001/XMLSchema}string"
 *                               maxOccurs="unbounded"/>
 *                           </sequence>
 *                           <attribute name="Name" use="required"
 *                             type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="Type" use="required"
 *           type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Entities")
public class Entities {

	@XmlElement(name = "Entity", required = true)
	private List<Entity> entityList;

	public List<Entity> getEntityList() {
		return entityList;
	}

	public void setEntityList(List<Entity> entityList) {
		this.entityList = entityList;
	}
}