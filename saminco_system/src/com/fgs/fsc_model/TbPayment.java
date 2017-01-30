package com.fgs.fsc_model;
// Generated Jan 30, 2017 9:37:16 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TbPayment generated by hbm2java
 */
@Entity
@Table(name="tb_payment"
    ,catalog="saminko_attendance_system"
)
public class TbPayment  implements java.io.Serializable {


     private Integer idpayment;
     private int paymentId;
     private String paymentDateTime;
     private String paymentTotal;
     private Set<TbStudentHasPayment> tbStudentHasPayments = new HashSet<TbStudentHasPayment>(0);

    public TbPayment() {
    }

	
    public TbPayment(int paymentId) {
        this.paymentId = paymentId;
    }
    public TbPayment(int paymentId, String paymentDateTime, String paymentTotal, Set<TbStudentHasPayment> tbStudentHasPayments) {
       this.paymentId = paymentId;
       this.paymentDateTime = paymentDateTime;
       this.paymentTotal = paymentTotal;
       this.tbStudentHasPayments = tbStudentHasPayments;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idpayment", unique=true, nullable=false)
    public Integer getIdpayment() {
        return this.idpayment;
    }
    
    public void setIdpayment(Integer idpayment) {
        this.idpayment = idpayment;
    }

    
    @Column(name="payment_id", nullable=false)
    public int getPaymentId() {
        return this.paymentId;
    }
    
    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    
    @Column(name="payment_date_time", length=45)
    public String getPaymentDateTime() {
        return this.paymentDateTime;
    }
    
    public void setPaymentDateTime(String paymentDateTime) {
        this.paymentDateTime = paymentDateTime;
    }

    
    @Column(name="payment_total", length=45)
    public String getPaymentTotal() {
        return this.paymentTotal;
    }
    
    public void setPaymentTotal(String paymentTotal) {
        this.paymentTotal = paymentTotal;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbPayment")
    public Set<TbStudentHasPayment> getTbStudentHasPayments() {
        return this.tbStudentHasPayments;
    }
    
    public void setTbStudentHasPayments(Set<TbStudentHasPayment> tbStudentHasPayments) {
        this.tbStudentHasPayments = tbStudentHasPayments;
    }




}

