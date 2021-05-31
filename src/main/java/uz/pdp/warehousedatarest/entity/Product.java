package uz.pdp.warehousedatarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.warehousedatarest.entity.template.AbsEntity;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product extends AbsEntity {

    private String code;

    @ManyToOne
    private Category category;

    @OneToOne
    private Attachment attachment;

    @ManyToOne
    private Measurement measurement;
}
