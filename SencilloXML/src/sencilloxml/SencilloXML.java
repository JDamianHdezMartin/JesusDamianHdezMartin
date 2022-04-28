/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sencilloxml;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "estudiante")
@XmlAccesortype(XmlAccesType.NONE);
class Alumno {
    
    String nombre;

    //@XmlElement(name="name")
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    //@XmlElement(name="age")
    //@XmlAttribute(name="atrEdad")
    public void setEdad(int edad) {
        this.edad = edad;
    }
    int edad;

    public Alumno() {
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + 
                ", notas=" + notas +'}';
    }

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    
    ArrayList<Integer>notas = new ArrayList<Integer>();


    //@XmlTransient
    //@XmlElementWrapper(name="resultados")
    //@XmlElement(name="score")
    public ArrayList<Integer> getNotas() {
        return notas;
    }


    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
}

public class SencilloXML {

     public static void main(String[] args) {
        Alumno p = new Alumno("lala", 20);
        p.notas.add(5);
        p.notas.add(4);
        p.notas.add(6);
        
        try {
            //Informamos la clase que queremos llevar a XML
            JAXBContext context = JAXBContext.newInstance(Alumno.class);
            Marshaller marshaller = context.createMarshaller();
            
            //queremos saltos de linea identación etc:
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            
            //marshal() es convertir a XML El método permite salida 
            //a un tipo: File, Writer, OutputStream entre otros
            //primero vemos volcando en un OutputStream:
            marshaller.marshal(p, System.out);
            
            //Volcando en un Writer. En este caso un StringWriter
            StringWriter sw = new StringWriter();
            marshaller.marshal(p, sw);

            String textoXML = sw.toString();
            System.out.println(textoXML);
            
            
            //
            //   Ahora veamos la lectura y obtener un Alumno desde el XML
            //
            
            JAXBContext context2 = JAXBContext.newInstance(Alumno.class);
            Unmarshaller marshaller2 = context2.createUnmarshaller();
            
            //creamos un reader desde el Strin con el XML que obtuvimos antes
            StringReader sr = new StringReader(textoXML);
            
            //unmarshal recibe el equivalente de antes: File, Reader, InputStream
            //como devuelve Object hay que castear
            Alumno q = (Alumno)marshaller2.unmarshal(sr);
            
            System.out.println(q);
            
            
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }


    }

}
