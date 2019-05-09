/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author GraceTina
 */
@Entity
@XmlRootElement
public class Customer {
     private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;
    
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users stakeholder;
    
    @OneToMany(mappedBy = "appliedBy")
    private Set<RentCar> rentCar;

    public Customer() {
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Users getStakeholder() {
        return stakeholder;
    }

    public void setStakeholder(Users stakeholder) {
        this.stakeholder = stakeholder;
    }
    
    
}
