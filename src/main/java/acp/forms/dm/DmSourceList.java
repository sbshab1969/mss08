package acp.forms.dm;

import java.util.ArrayList;
import java.util.List;

import acp.db.domain.SourceClass;
import acp.db.service.SourceManagerList;
import acp.forms.frame.DmPanel;

public class DmSourceList extends DmPanel {
  private static final long serialVersionUID = 1L;

  private SourceManagerList tableManager;
  private List<SourceClass> cacheObj = new ArrayList<>();

  public DmSourceList(SourceManagerList tblMng) {
    tableManager = tblMng;
    setHeaders();
  }

  public void setManager(SourceManagerList tblMng) {
    tableManager = tblMng;
    setHeaders();
  }
  
  private void setHeaders() {
    if (tableManager != null) {
      headers = tableManager.getHeaders();
      types = tableManager.getTypes();
      colCount = headers.length;
    } else {
      headers = new String[] {};
      types = new Class<?>[] {};
      colCount = 0;
    }
  }
  
  // --- TableModel ---

  public int getRowCount() {
    return cacheObj.size();
  }

  public Object getValueAt(int row, int col) {
    SourceClass obj = cacheObj.get(row); 
    switch (col) {
    case 0:  
      return obj.getId();
    case 1:  
      return obj.getName();
    case 2:  
      return obj.getOwner();
    }  
    return null;
  }
  // --------------------------------------
  
  public void calcRecCount() {
    recCount = tableManager.countRecords();
  }

  public void fetchPage(int page) {
    int startRec = calcStartRec(page);
    cacheObj = tableManager.queryPartMove(startRec,recPerPage);
    fireTableChanged(null);
  }

  public void queryPage() {
    calcPageCount();
    if (currPage > pageCount) {
      currPage = pageCount;
    }  
    int startRec = calcStartRec(currPage);
    cacheObj = tableManager.queryPartOpen(startRec,recPerPage);
    fireTableChanged(null);
  }

  public void queryAll() {
    cacheObj = tableManager.queryAll();
    fireTableChanged(null);
  }

  public void queryClose() {
    tableManager.queryClose();
  }

}
