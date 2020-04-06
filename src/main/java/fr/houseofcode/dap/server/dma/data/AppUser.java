/**
 * 
 */
package fr.houseofcode.dap.server.dma.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//TODO DMA by Djer |Audit Code| Prends en compte les remarques de CheckStyle !

/**
 * @author dimam
 *
 */
@Entity
public class AppUser {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
