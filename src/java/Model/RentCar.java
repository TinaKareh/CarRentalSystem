/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author GraceTina
 */
@Entity
public class RentCar implements Serializable {
    private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long bookingId;
    private String county;
    public String district;
    private String pickLocation;
    private String dropLocation;
    private Date pickDate;
    private String pickTime;
    private Date dropDate;
    private String dropTime;
    private short passCount;
    
      @ManyToOne
    @PrimaryKeyJoinColumn
    private Customer appliedBy;

    public RentCar() {
    }

    public Customer getAppliedBy() {
        return appliedBy;
    }

    public void setAppliedBy(Customer appliedBy) {
        this.appliedBy = appliedBy;
    }
    
    

    public long getBookingId() {
        return bookingId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPickLocation() {
        return pickLocation;
    }

    public void setPickLocation(String pickLocation) {
        this.pickLocation = pickLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public Date getPickDate() {
        return pickDate;
    }

    public void setPickDate(Date pickDate) {
        this.pickDate = pickDate;
    }

    public String getPickTime() {
        return pickTime;
    }

    public void setPickTime(String pickTime) {
        this.pickTime = pickTime;
    }

    public Date getDropDate() {
        return dropDate;
    }

    public void setDropDate(Date dropDate) {
        this.dropDate = dropDate;
    }

    public String getDropTime() {
        return dropTime;
    }

    public void setDropTime(String dropTime) {
        this.dropTime = dropTime;
    }

    public short getPassCount() {
        return passCount;
    }

    public void setPassCount(short passCount) {
        this.passCount = passCount;
    }
    
    
    
}
