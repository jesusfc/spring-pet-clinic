package toguru.jesusfc.springpetclinic.model;

import java.io.Serializable;

/**
 * Created By Jesús Fdez. Caraballo on 14/04/2021.
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
