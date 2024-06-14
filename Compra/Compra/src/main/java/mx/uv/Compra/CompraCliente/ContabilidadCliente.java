package mx.uv.Compra.CompraCliente;


import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import xx.mx.uv.contabilidad.wsdl.SolicitarPagoRequest;
import xx.mx.uv.contabilidad.wsdl.SolicitarPagoResponse;
import xx.mx.uv.contabilidad.wsdl.ValidarPagoRequest;
import xx.mx.uv.contabilidad.wsdl.ValidarPagoResponse;

public class ContabilidadCliente extends WebServiceGatewaySupport{

    public SolicitarPagoResponse solicitarPresupuesto(SolicitarPagoRequest request) {
        try {
            return (SolicitarPagoResponse) getWebServiceTemplate()
                    .marshalSendAndReceive(request, new SoapActionCallback("https://contabillidad-production.up.railway.app/ws/contabilidad.wsdl"));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }

    }

    public ValidarPagoResponse validarPago(ValidarPagoRequest request) {
        try {
            return (ValidarPagoResponse) getWebServiceTemplate()
                    .marshalSendAndReceive(request, new SoapActionCallback("https://contabillidad-production.up.railway.app/ws/contabilidad.wsdl"));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }

    }
}
