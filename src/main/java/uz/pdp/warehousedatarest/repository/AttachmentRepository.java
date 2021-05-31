package uz.pdp.warehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.warehousedatarest.entity.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {

}
