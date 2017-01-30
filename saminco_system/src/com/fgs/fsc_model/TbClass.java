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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TbClass generated by hbm2java
 */
@Entity
@Table(name="tb_class"
    ,catalog="saminko_attendance_system"
)
public class TbClass  implements java.io.Serializable {


     private Integer idclass;
     private TbCategory tbCategory;
     private TbType tbType;
     private int classId;
     private String className;
     private String classStatus;
     private String classYear;
     private Set<TbClassFees> tbClassFeeses = new HashSet<TbClassFees>(0);
     private Set<TbAttendance> tbAttendances = new HashSet<TbAttendance>(0);
     private Set<TbStudentHasClass> tbStudentHasClasses = new HashSet<TbStudentHasClass>(0);
     private Set<TbClassHasExam> tbClassHasExams = new HashSet<TbClassHasExam>(0);
     private Set<TbClassHasTute> tbClassHasTutes = new HashSet<TbClassHasTute>(0);

    public TbClass() {
    }

	
    public TbClass(TbCategory tbCategory, TbType tbType, int classId) {
        this.tbCategory = tbCategory;
        this.tbType = tbType;
        this.classId = classId;
    }
    public TbClass(TbCategory tbCategory, TbType tbType, int classId, String className, String classStatus, String classYear, Set<TbClassFees> tbClassFeeses, Set<TbAttendance> tbAttendances, Set<TbStudentHasClass> tbStudentHasClasses, Set<TbClassHasExam> tbClassHasExams, Set<TbClassHasTute> tbClassHasTutes) {
       this.tbCategory = tbCategory;
       this.tbType = tbType;
       this.classId = classId;
       this.className = className;
       this.classStatus = classStatus;
       this.classYear = classYear;
       this.tbClassFeeses = tbClassFeeses;
       this.tbAttendances = tbAttendances;
       this.tbStudentHasClasses = tbStudentHasClasses;
       this.tbClassHasExams = tbClassHasExams;
       this.tbClassHasTutes = tbClassHasTutes;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idclass", unique=true, nullable=false)
    public Integer getIdclass() {
        return this.idclass;
    }
    
    public void setIdclass(Integer idclass) {
        this.idclass = idclass;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="category_idcategory", nullable=false)
    public TbCategory getTbCategory() {
        return this.tbCategory;
    }
    
    public void setTbCategory(TbCategory tbCategory) {
        this.tbCategory = tbCategory;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="type_idtype", nullable=false)
    public TbType getTbType() {
        return this.tbType;
    }
    
    public void setTbType(TbType tbType) {
        this.tbType = tbType;
    }

    
    @Column(name="class_id", nullable=false)
    public int getClassId() {
        return this.classId;
    }
    
    public void setClassId(int classId) {
        this.classId = classId;
    }

    
    @Column(name="class_name", length=45)
    public String getClassName() {
        return this.className;
    }
    
    public void setClassName(String className) {
        this.className = className;
    }

    
    @Column(name="class_status", length=45)
    public String getClassStatus() {
        return this.classStatus;
    }
    
    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }

    
    @Column(name="class_year", length=45)
    public String getClassYear() {
        return this.classYear;
    }
    
    public void setClassYear(String classYear) {
        this.classYear = classYear;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbClass")
    public Set<TbClassFees> getTbClassFeeses() {
        return this.tbClassFeeses;
    }
    
    public void setTbClassFeeses(Set<TbClassFees> tbClassFeeses) {
        this.tbClassFeeses = tbClassFeeses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbClass")
    public Set<TbAttendance> getTbAttendances() {
        return this.tbAttendances;
    }
    
    public void setTbAttendances(Set<TbAttendance> tbAttendances) {
        this.tbAttendances = tbAttendances;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbClass")
    public Set<TbStudentHasClass> getTbStudentHasClasses() {
        return this.tbStudentHasClasses;
    }
    
    public void setTbStudentHasClasses(Set<TbStudentHasClass> tbStudentHasClasses) {
        this.tbStudentHasClasses = tbStudentHasClasses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbClass")
    public Set<TbClassHasExam> getTbClassHasExams() {
        return this.tbClassHasExams;
    }
    
    public void setTbClassHasExams(Set<TbClassHasExam> tbClassHasExams) {
        this.tbClassHasExams = tbClassHasExams;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbClass")
    public Set<TbClassHasTute> getTbClassHasTutes() {
        return this.tbClassHasTutes;
    }
    
    public void setTbClassHasTutes(Set<TbClassHasTute> tbClassHasTutes) {
        this.tbClassHasTutes = tbClassHasTutes;
    }




}


