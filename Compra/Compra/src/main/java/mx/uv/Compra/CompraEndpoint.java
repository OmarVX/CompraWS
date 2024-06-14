package mx.uv.Compra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.uv.Compra.CompraCliente.ContabilidadCliente;
import mx.uv.t4is.compra.RealizarCompraRequest;
import mx.uv.t4is.compra.RealizarCompraResponse;
import mx.uv.t4is.compra.StatusPagoRequest;
import mx.uv.t4is.compra.StatusPagoResponse;
import xx.mx.uv.contabilidad.wsdl.SolicitarPagoRequest;
import xx.mx.uv.contabilidad.wsdl.SolicitarPagoResponse;
import xx.mx.uv.contabilidad.wsdl.ValidarPagoRequest;
import xx.mx.uv.contabilidad.wsdl.ValidarPagoResponse;

@Endpoint
public class CompraEndpoint {
    @Autowired
    ContabilidadCliente contabilidadCliente;

    @PayloadRoot(localPart = "RealizarCompraRequest", namespace = "t4is.uv.mx/compra")
    @ResponsePayload
    public RealizarCompraResponse realizarCompra(@RequestPayload RealizarCompraRequest peticion){
        RealizarCompraResponse respuesta = new RealizarCompraResponse();
        SolicitarPagoRequest solicitarPagoRequest = new SolicitarPagoRequest();
        solicitarPagoRequest.setNombreProducto(peticion.getNombreProducto());
        solicitarPagoRequest.setCantidad(peticion.getCantidad());
        solicitarPagoRequest.setPrecio(peticion.getPrecio());
        solicitarPagoRequest.setFolioInventario(peticion.getFolioInventario());
        solicitarPagoRequest.setPresupuestoDependencia(peticion.getPresupuestoDependencia());
        SolicitarPagoResponse solicitarPagoResponse = contabilidadCliente.solicitarPresupuesto(solicitarPagoRequest);

        respuesta.setFolio(solicitarPagoResponse.getFolioContabilidad());      
        respuesta.setRespuesta(solicitarPagoResponse.getRespuesta()); 

        return respuesta;

    }

    @PayloadRoot(localPart = "StatusPagoRequest", namespace = "t4is.uv.mx/compra")
    @ResponsePayload
    public StatusPagoResponse verificarStatusPago(@RequestPayload StatusPagoRequest peticion){
        StatusPagoResponse respuesta = new StatusPagoResponse();
        ValidarPagoRequest validarPagoRequest = new ValidarPagoRequest();
        validarPagoRequest.setFolioContabilidad(peticion.getFolio());
        
        ValidarPagoResponse validarPagoResponse = contabilidadCliente.validarPago(validarPagoRequest);
        respuesta.setRespuesta(validarPagoResponse.getPagoStatus());
        respuesta.setStatus(validarPagoResponse.isStatus());

        return respuesta;

    }
}
