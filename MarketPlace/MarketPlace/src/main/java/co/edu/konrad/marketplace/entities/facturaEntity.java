/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.marketplace.entities;

import java.io.Serializable;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *Entidad factura
 * @author Sergio E. Riveros R.
 */
@Entity
public class facturaEntity implements Serializable {

    /*
    *llave primaria 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_factura")
    private Long idFactura;
    /*
    * atributo many to one cliente
     */
    @ManyToOne
    @JoinColumn(name = "carrito")
    private carritoEntity idCarrito;
    /*
    *atributo cantidad
     */
    @Column(name = "total_factura")
    private long totalFactura;
     /*
    *atributo fecha de la factura
    */
    @Column (name = "fecha")
    private Date fecha;
     /*
    *atributo fecha de la factura
    */
    @Column (name = "medio_pago")
    private String medioPago;

    public facturaEntity() {
    }

    public Long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Long idFactura) {
        this.idFactura = idFactura;
    }

    public carritoEntity getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(carritoEntity idCarrito) {
        this.idCarrito = idCarrito;
    }

    public long getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(long totalFactura) {
        this.totalFactura = totalFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }
    
    
}
