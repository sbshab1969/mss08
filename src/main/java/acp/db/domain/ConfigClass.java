package acp.db.domain;

import java.sql.Clob;
import java.sql.Timestamp;

//import java.sql.Date;
import java.util.Date;

public class ConfigClass {
  private int id;
  private String name;
  private Clob config;
  private Date dateBegin;
  private Date dateEnd;
  private String comment;
  private Timestamp dateCreate;
  private Timestamp dateModify;
  private String owner;
  private int sourceId;
  private SourceClass source;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Clob getConfig() {
    return config;
  }

  public void setConfig(Clob config) {
    this.config = config;
  }

  public Date getDateBegin() {
    return dateBegin;
  }

  public void setDateBegin(Date dateBegin) {
    this.dateBegin = dateBegin;
  }

  public Date getDateEnd() {
    return dateEnd;
  }

  public void setDateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Timestamp getDateCreate() {
    return dateCreate;
  }

  public void setDateCreate(Timestamp dateCreate) {
    this.dateCreate = dateCreate;
  }

  public Timestamp getDateModify() {
    return dateModify;
  }

  public void setDateModify(Timestamp dateModify) {
    this.dateModify = dateModify;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public int getSourceId() {
    return sourceId;
  }

  public void setSourceId(int sourceId) {
    this.sourceId = sourceId;
  }

  public SourceClass getSource() {
    return source;
  }

  public void setSource(SourceClass source) {
    this.source = source;
  }

  public String toString() {
    String str = id + "/" + name + "/" + dateBegin + "/" + dateEnd + "/"
        + comment + "/" + dateCreate + "/" + dateModify + "/" + owner + "/"
        + sourceId + "/" + config;
    return str;
  }

}
