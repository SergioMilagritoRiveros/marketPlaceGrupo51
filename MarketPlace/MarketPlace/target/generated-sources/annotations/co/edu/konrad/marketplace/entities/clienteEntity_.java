package co.edu.konrad.marketplace.entities;

import co.edu.konrad.marketplace.entities.tipoDocumentoEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-05T23:44:08")
@StaticMetamodel(clienteEntity.class)
public class clienteEntity_ { 

    public static volatile SingularAttribute<clienteEntity, Long> idCliente;
    public static volatile SingularAttribute<clienteEntity, String> nombreCliente;
    public static volatile SingularAttribute<clienteEntity, tipoDocumentoEntity> tipo_documento;
    public static volatile SingularAttribute<clienteEntity, String> apellidoCliente;
    public static volatile SingularAttribute<clienteEntity, String> fecha_nacimiento;
    public static volatile SingularAttribute<clienteEntity, Long> numero_documento;

}