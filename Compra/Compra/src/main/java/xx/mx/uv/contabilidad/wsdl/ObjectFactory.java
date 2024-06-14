
package xx.mx.uv.contabilidad.wsdl;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xx.mx.uv.contabilidad.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xx.mx.uv.contabilidad.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SolicitarPagoRequest }
     * 
     */
    public SolicitarPagoRequest createSolicitarPagoRequest() {
        return new SolicitarPagoRequest();
    }

    /**
     * Create an instance of {@link SolicitarPagoResponse }
     * 
     */
    public SolicitarPagoResponse createSolicitarPagoResponse() {
        return new SolicitarPagoResponse();
    }

    /**
     * Create an instance of {@link ValidarPagoRequest }
     * 
     */
    public ValidarPagoRequest createValidarPagoRequest() {
        return new ValidarPagoRequest();
    }

    /**
     * Create an instance of {@link ValidarPagoResponse }
     * 
     */
    public ValidarPagoResponse createValidarPagoResponse() {
        return new ValidarPagoResponse();
    }

}
