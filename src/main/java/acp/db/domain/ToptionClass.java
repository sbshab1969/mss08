package acp.db.domain;

//import java.sql.Date;
import java.util.Date;

import java.util.ArrayList;

public class ToptionClass {
  private int id;
  private ArrayList<String> pArray;
  private Date dateBegin;
  private Date dateEnd;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public ArrayList<String> getPArray() {
    return pArray;
  }

  public void setArrayP(ArrayList<String> pArray) {
    this.pArray = pArray;
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

}
