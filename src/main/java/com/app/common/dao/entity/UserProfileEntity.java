/*
 * Created on 13 Aug 2016 ( Time 12:34:04 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.app.common.dao.entity;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.util.Date;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "user_profile"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="user_profile")
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="UserProfileEntity.countAll", query="SELECT COUNT(x) FROM UserProfileEntity x" )
} )
public class UserProfileEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="user_id", nullable=false)
    private Long       userId       ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="user_description", nullable=false, length=30)
    private String     userDescription ;

    @Column(name="pics", length=30)
    private String     pics         ;

    @Column(name="user_tag_line", nullable=false, length=100)
    private String     userTagLine  ;

    @Temporal(TemporalType.DATE)
    @Column(name="hobbies", nullable=false)
    private Date       hobbies      ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="user_id", referencedColumnName="id", insertable=false, updatable=false)
    private UsersEntity users       ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public UserProfileEntity() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setUserId( Long userId ) {
        this.userId = userId ;
    }
    public Long getUserId() {
        return this.userId;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : user_description ( VARCHAR ) 
    public void setUserDescription( String userDescription ) {
        this.userDescription = userDescription;
    }
    public String getUserDescription() {
        return this.userDescription;
    }

    //--- DATABASE MAPPING : pics ( VARCHAR ) 
    public void setPics( String pics ) {
        this.pics = pics;
    }
    public String getPics() {
        return this.pics;
    }

    //--- DATABASE MAPPING : user_tag_line ( VARCHAR ) 
    public void setUserTagLine( String userTagLine ) {
        this.userTagLine = userTagLine;
    }
    public String getUserTagLine() {
        return this.userTagLine;
    }

    //--- DATABASE MAPPING : hobbies ( DATE ) 
    public void setHobbies( Date hobbies ) {
        this.hobbies = hobbies;
    }
    public Date getHobbies() {
        return this.hobbies;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setUsers( UsersEntity users ) {
        this.users = users;
    }
    public UsersEntity getUsers() {
        return this.users;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(userId);
        sb.append("]:"); 
        sb.append(userDescription);
        sb.append("|");
        sb.append(pics);
        sb.append("|");
        sb.append(userTagLine);
        sb.append("|");
        sb.append(hobbies);
        return sb.toString(); 
    } 

}
