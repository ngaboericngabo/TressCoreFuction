/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tres.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@MappedSuperclass
public abstract class CommonDomain implements Serializable {
private static final long serialVersionUID = -3333275582900585705L;
public CommonDomain() {

  }

  @Column(name = "createdBy")
  private String createdBy;

  @Column(name = "crtdDtTime")
  private Timestamp crtdDtTime;

  @Version
  @Column(name = "optLock")
  private Timestamp optLock;

  @Column(name = "upDtTime")
  private Timestamp upDtTime;

  @Column(name = "updatedBy")
  private String updatedBy;

   public String getCreatedBy() {
    return this.createdBy;
  }

   public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  @XmlJavaTypeAdapter(TimeStampAdapter.class)
  public Timestamp getCrtdDtTime() {
    return this.crtdDtTime;
  }

  public void setCrtdDtTime(Timestamp crtdDtTime) {
    this.crtdDtTime = crtdDtTime;
  }

  @XmlJavaTypeAdapter(TimeStampAdapter.class)
  public Timestamp getOptLock() {
    return this.optLock;
  }


  @XmlJavaTypeAdapter(TimeStampAdapter.class)
  public Timestamp getUpDtTime() {
    return this.upDtTime;
  }

  public void setUpDtTime(Timestamp upDtTime) {
    this.upDtTime = upDtTime;
  }

  public String getUpdatedBy() {
    return this.updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }
}
