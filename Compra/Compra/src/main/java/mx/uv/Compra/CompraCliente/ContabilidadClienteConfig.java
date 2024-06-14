package mx.uv.Compra.CompraCliente;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ContabilidadClienteConfig {

    @Bean
    public Jaxb2Marshaller marshallerContabilidad(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("xx.mx.uv.contabilidad.wsdl");
        return marshaller;
    }

    @Bean
    public ContabilidadCliente clienteContabilidad(Jaxb2Marshaller marshallerContabilidad){
        ContabilidadCliente contabilidadCliente = new ContabilidadCliente();
        contabilidadCliente.setDefaultUri("https://contabillidad-production.up.railway.app/ws/contabilidad.wsdl");
        contabilidadCliente.setMarshaller(marshallerContabilidad);
        contabilidadCliente.setUnmarshaller(marshallerContabilidad);
        return contabilidadCliente;
    }

}
