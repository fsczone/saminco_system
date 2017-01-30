package com.fgs.fsc_model;
// Generated Jan 30, 2017 9:37:16 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TbArticles generated by hbm2java
 */
@Entity
@Table(name="tb_articles"
    ,catalog="saminko_attendance_system"
)
public class TbArticles  implements java.io.Serializable {


     private Integer idarticles;
     private int articleId;
     private String articleTitles;
     private String articleContent;
     private String articleImage;
     private String articleDate;
     private String articleFlash;
     private String articleReadMore;
     private String articleAuthor;
     private String articleStatus;

    public TbArticles() {
    }

	
    public TbArticles(int articleId) {
        this.articleId = articleId;
    }
    public TbArticles(int articleId, String articleTitles, String articleContent, String articleImage, String articleDate, String articleFlash, String articleReadMore, String articleAuthor, String articleStatus) {
       this.articleId = articleId;
       this.articleTitles = articleTitles;
       this.articleContent = articleContent;
       this.articleImage = articleImage;
       this.articleDate = articleDate;
       this.articleFlash = articleFlash;
       this.articleReadMore = articleReadMore;
       this.articleAuthor = articleAuthor;
       this.articleStatus = articleStatus;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idarticles", unique=true, nullable=false)
    public Integer getIdarticles() {
        return this.idarticles;
    }
    
    public void setIdarticles(Integer idarticles) {
        this.idarticles = idarticles;
    }

    
    @Column(name="article_id", nullable=false)
    public int getArticleId() {
        return this.articleId;
    }
    
    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    
    @Column(name="article_titles", length=45)
    public String getArticleTitles() {
        return this.articleTitles;
    }
    
    public void setArticleTitles(String articleTitles) {
        this.articleTitles = articleTitles;
    }

    
    @Column(name="article_content", length=45)
    public String getArticleContent() {
        return this.articleContent;
    }
    
    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    
    @Column(name="article_image", length=45)
    public String getArticleImage() {
        return this.articleImage;
    }
    
    public void setArticleImage(String articleImage) {
        this.articleImage = articleImage;
    }

    
    @Column(name="article_date", length=45)
    public String getArticleDate() {
        return this.articleDate;
    }
    
    public void setArticleDate(String articleDate) {
        this.articleDate = articleDate;
    }

    
    @Column(name="article_flash", length=45)
    public String getArticleFlash() {
        return this.articleFlash;
    }
    
    public void setArticleFlash(String articleFlash) {
        this.articleFlash = articleFlash;
    }

    
    @Column(name="article_read_more", length=45)
    public String getArticleReadMore() {
        return this.articleReadMore;
    }
    
    public void setArticleReadMore(String articleReadMore) {
        this.articleReadMore = articleReadMore;
    }

    
    @Column(name="article_author", length=45)
    public String getArticleAuthor() {
        return this.articleAuthor;
    }
    
    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    
    @Column(name="article_status", length=45)
    public String getArticleStatus() {
        return this.articleStatus;
    }
    
    public void setArticleStatus(String articleStatus) {
        this.articleStatus = articleStatus;
    }




}

