package com.fgs.fsc_model;
// Generated Jan 30, 2017 9:37:16 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TbClassFees generated by hbm2java
 */
@Entity
@Table(name="tb_class_fees"
    ,catalog="saminko_attendance_system"
)
public class TbClassFees  implements java.io.Serializable {


     private Integer idclassFees;
     private TbClass tbClass;
     private String fees;
     private String classFeesStatus;

    public TbClassFees() {
    }

	
    public TbClassFees(TbClass tbClass) {
        this.tbClass = tbClass;
    }
    public TbClassFees(TbClass tbClass, String fees, String classFeesStatus) {
       this.tbClass = tbClass;
       this.fees = fees;
       this.classFeesStatus = classFeesStatus;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idclass_fees", unique=true, nullable=false)
    public Integer getIdclassFees() {
        return this.idclassFees;
    }
    
    public void setIdclassFees(Integer idclassFees) {
        this.idclassFees = idclassFees;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="class_idclass", nullable=false)
    public TbClass getTbClass() {
        return this.tbClass;
    }
    
    public void setTbClass(TbClass tbClass) {
        this.tbClass = tbClass;
    }

    
    @Column(name="fees", length=45)
    public String getFees() {
        return this.fees;
    }
    
    public void setFees(String fees) {
        this.fees = fees;
    }

    
    @Column(name="class_fees_status", length=45)
    public String getClassFeesStatus() {
        return this.classFeesStatus;
    }
    
    public void setClassFeesStatus(String classFeesStatus) {
        this.classFeesStatus = classFeesStatus;
    }




}

