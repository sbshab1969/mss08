package acp.db.domain;

import java.sql.Timestamp;

public class FileOtherClass {
  private int id;
  private Timestamp dateEvent;
  private String desc;
  private int refId;
  private int confId;
  private int constId;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Timestamp getDateEvent() {
    return dateEvent;
  }

  public void setDateEvent(Timestamp dateEvent) {
    this.dateEvent = dateEvent;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public int getRefId() {
    return refId;
  }

  public void setRefId(int refId) {
    this.refId = refId;
  }

  public int getConfId() {
    return confId;
  }

  public void setConfId(int confId) {
    this.confId = confId;
  }

  public int getConstId() {
    return constId;
  }

  public void setConstId(int constId) {
    this.constId = constId;
  }

}
