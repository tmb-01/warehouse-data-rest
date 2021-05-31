package uz.pdp.warehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousedatarest.entity.AttachmentContent;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Long> {

    AttachmentContent findByAttachmentId(Long attachment_id);

    void deleteByAttachment_Id(Long attachment_id);
}
