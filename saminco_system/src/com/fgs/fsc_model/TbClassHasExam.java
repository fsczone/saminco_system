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
 * TbClassHasExam generated by hbm2java
 */
@Entity
@Table(name="tb_class_has_exam"
    ,catalog="saminko_attendance_system"
)
public class TbClassHasExam  implements java.io.Serializable {


     private Integer idclassHasExam;
     private TbClass tbClass;
     private TbExam tbExam;
     private String classHasExamStatus;

    public TbClassHasExam() {
    }

	
    public TbClassHasExam(TbClass tbClass, TbExam tbExam) {
        this.tbClass = tbClass;
        this.tbExam = tbExam;
    }
    public TbClassHasExam(TbClass tbClass, TbExam tbExam, String classHasExamStatus) {
       this.tbClass = tbClass;
       this.tbExam = tbExam;
       this.classHasExamStatus = classHasExamStatus;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idclass_has_exam", unique=true, nullable=false)
    public Integer getIdclassHasExam() {
        return this.idclassHasExam;
    }
    
    public void setIdclassHasExam(Integer idclassHasExam) {
        this.idclassHasExam = idclassHasExam;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="class_idclass", nullable=false)
    public TbClass getTbClass() {
        return this.tbClass;
    }
    
    public void setTbClass(TbClass tbClass) {
        this.tbClass = tbClass;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="exam_idexam", nullable=false)
    public TbExam getTbExam() {
        return this.tbExam;
    }
    
    public void setTbExam(TbExam tbExam) {
        this.tbExam = tbExam;
    }

    
    @Column(name="class_has_exam_status", length=45)
    public String getClassHasExamStatus() {
        return this.classHasExamStatus;
    }
    
    public void setClassHasExamStatus(String classHasExamStatus) {
        this.classHasExamStatus = classHasExamStatus;
    }




}


