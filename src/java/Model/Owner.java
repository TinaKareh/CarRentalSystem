/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author GraceTina
 */
@Entity
@XmlRootElement
public class Owner {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long adminId;
    
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users stakeholder; 

    public Owner() {
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Users getStakeholder() {
        return stakeholder;
    }

    public void setStakeholder(Users stakeholder) {
        this.stakeholder = stakeholder;
    }
    
    
}
