package co.edu.konrad.marketplace.entities;

import co.edu.konrad.marketplace.entities.carritoEntity;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-05T23:44:08")
@StaticMetamodel(facturaEntity.class)
public class facturaEntity_ { 

    public static volatile SingularAttribute<facturaEntity, carritoEntity> idCarrito;
    public static volatile SingularAttribute<facturaEntity, LocalDate> fecha;
    public static volatile SingularAttribute<facturaEntity, Long> totalFactura;
    public static volatile SingularAttribute<facturaEntity, Long> idFactura;
    public static volatile SingularAttribute<facturaEntity, String> medioPago;

}