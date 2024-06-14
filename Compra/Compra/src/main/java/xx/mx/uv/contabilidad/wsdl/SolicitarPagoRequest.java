
package xx.mx.uv.contabilidad.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NombreProducto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Precio" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="FolioInventario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PresupuestoDependencia" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nombreProducto",
    "cantidad",
    "precio",
    "folioInventario",
    "presupuestoDependencia"
})
@XmlRootElement(name = "SolicitarPagoRequest")
public class SolicitarPagoRequest {

    @XmlElement(name = "NombreProducto", required = true)
    protected String nombreProducto;
    @XmlElement(name = "Cantidad")
    protected int cantidad;
    @XmlElement(name = "Precio")
    protected double precio;
    @XmlElement(name = "FolioInventario", required = true)
    protected String folioInventario;
    @XmlElement(name = "PresupuestoDependencia")
    protected double presupuestoDependencia;

    /**
     * Obtiene el valor de la propiedad nombreProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Define el valor de la propiedad nombreProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreProducto(String value) {
        this.nombreProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(double value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad folioInventario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioInventario() {
        return folioInventario;
    }

    /**
     * Define el valor de la propiedad folioInventario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioInventario(String value) {
        this.folioInventario = value;
    }

    /**
     * Obtiene el valor de la propiedad presupuestoDependencia.
     * 
     */
    public double getPresupuestoDependencia() {
        return presupuestoDependencia;
    }

    /**
     * Define el valor de la propiedad presupuestoDependencia.
     * 
     */
    public void setPresupuestoDependencia(double value) {
        this.presupuestoDependencia = value;
    }

}
