/*
 * Created on 13 Aug 2016 ( Time 12:34:03 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.app.common.dao.entity;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;


import javax.persistence.*;

/**
 * Persistent class for entity stored in table "group_contents"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="group_contents")
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="GroupContentsEntity.countAll", query="SELECT COUNT(x) FROM GroupContentsEntity x" )
} )
public class GroupContentsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="content_id", nullable=false)
    private Integer    contentId    ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="content_type", nullable=false, length=50)
    private String     contentType  ;

    @Column(name="content", nullable=false, length=500)
    private String     content      ;

    @Column(name="description", nullable=false, length=500)
    private String     description  ;

	// "groupId" (column "group_id") is not defined by itself because used as FK in a link 
	// "userId" (column "user_id") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="user_id", referencedColumnName="id")
    private UsersEntity users       ;

    @ManyToOne
    @JoinColumn(name="group_id", referencedColumnName="group_id")
    private GroupsEntity groups      ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public GroupContentsEntity() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setContentId( Integer contentId ) {
        this.contentId = contentId ;
    }
    public Integer getContentId() {
        return this.contentId;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : content_type ( VARCHAR ) 
    public void setContentType( String contentType ) {
        this.contentType = contentType;
    }
    public String getContentType() {
        return this.contentType;
    }

    //--- DATABASE MAPPING : content ( VARCHAR ) 
    public void setContent( String content ) {
        this.content = content;
    }
    public String getContent() {
        return this.content;
    }

    //--- DATABASE MAPPING : description ( VARCHAR ) 
    public void setDescription( String description ) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
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

    public void setGroups( GroupsEntity groups ) {
        this.groups = groups;
    }
    public GroupsEntity getGroups() {
        return this.groups;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(contentId);
        sb.append("]:"); 
        sb.append(contentType);
        sb.append("|");
        sb.append(content);
        sb.append("|");
        sb.append(description);
        return sb.toString(); 
    } 

}
