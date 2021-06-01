package uz.pdp.warehousedatarest.service;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.warehousedatarest.entity.Attachment;
import uz.pdp.warehousedatarest.entity.AttachmentContent;
import uz.pdp.warehousedatarest.payload.Result;
import uz.pdp.warehousedatarest.repository.AttachmentContentRepository;
import uz.pdp.warehousedatarest.repository.AttachmentRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class AttachmentService {

    @Autowired
    AttachmentRepository attachmentRepository;

    @Autowired
    AttachmentContentRepository attachmentContentRepository;

    @SneakyThrows
    public Result add(MultipartHttpServletRequest multipartHttpServletRequest) {
        Iterator<String> fileNames = multipartHttpServletRequest.getFileNames();
        List<String> takenFileNames = new ArrayList<>();
        while (fileNames.hasNext()) {
            takenFileNames.add(fileNames.next());
        }

        AttachmentContent attachmentContent = new AttachmentContent();
        Attachment attachment = new Attachment();
        for (String takenFileName : takenFileNames) {
            MultipartFile file = multipartHttpServletRequest.getFile(takenFileName);
            attachment.setContentType(file.getContentType());
            attachment.setName(file.getOriginalFilename());
            attachment.setSize(file.getSize());
            Attachment savedAttachment = attachmentRepository.save(attachment);

            attachmentContent.setAttachment(savedAttachment);
            attachmentContent.setData(file.getBytes());
            AttachmentContent savedAttachmentContent = attachmentContentRepository.save(attachmentContent);
            return new Result("saved", true, savedAttachmentContent.getId());
        }
        return new Result("something went wrong", false);
    }

    public List<Attachment> getAll() {
        return attachmentRepository.findAll();
    }

    public AttachmentContent getById(Long id) {
        return attachmentContentRepository.findByAttachmentId(id);
    }

    public Result delete(Long id) {
        if (attachmentRepository.existsById(id)) {
            attachmentContentRepository.deleteByAttachment_Id(id);
            attachmentRepository.deleteById(id);
            return new Result("Deleted", true);
        }
        return new Result("no attachment exist with this id", false);
    }
}