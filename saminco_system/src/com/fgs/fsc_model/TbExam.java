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
 * TbExam generated by hbm2java
 */
@Entity
@Table(name="tb_exam"
    ,catalog="saminko_attendance_system"
)
public class TbExam  implements java.io.Serializable {


     private Integer idexam;
     private int examId;
     private String examName;
     private String examStatus;
     private Set<TbClassHasExam> tbClassHasExams = new HashSet<TbClassHasExam>(0);
     private Set<TbStudentHasExam> tbStudentHasExams = new HashSet<TbStudentHasExam>(0);

    public TbExam() {
    }

	
    public TbExam(int examId) {
        this.examId = examId;
    }
    public TbExam(int examId, String examName, String examStatus, Set<TbClassHasExam> tbClassHasExams, Set<TbStudentHasExam> tbStudentHasExams) {
       this.examId = examId;
       this.examName = examName;
       this.examStatus = examStatus;
       this.tbClassHasExams = tbClassHasExams;
       this.tbStudentHasExams = tbStudentHasExams;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idexam", unique=true, nullable=false)
    public Integer getIdexam() {
        return this.idexam;
    }
    
    public void setIdexam(Integer idexam) {
        this.idexam = idexam;
    }

    
    @Column(name="exam_id", nullable=false)
    public int getExamId() {
        return this.examId;
    }
    
    public void setExamId(int examId) {
        this.examId = examId;
    }

    
    @Column(name="exam_name", length=45)
    public String getExamName() {
        return this.examName;
    }
    
    public void setExamName(String examName) {
        this.examName = examName;
    }

    
    @Column(name="exam_status", length=45)
    public String getExamStatus() {
        return this.examStatus;
    }
    
    public void setExamStatus(String examStatus) {
        this.examStatus = examStatus;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbExam")
    public Set<TbClassHasExam> getTbClassHasExams() {
        return this.tbClassHasExams;
    }
    
    public void setTbClassHasExams(Set<TbClassHasExam> tbClassHasExams) {
        this.tbClassHasExams = tbClassHasExams;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbExam")
    public Set<TbStudentHasExam> getTbStudentHasExams() {
        return this.tbStudentHasExams;
    }
    
    public void setTbStudentHasExams(Set<TbStudentHasExam> tbStudentHasExams) {
        this.tbStudentHasExams = tbStudentHasExams;
    }




}


