package uz.pdp.warehousedatarest.controller;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.warehousedatarest.entity.Attachment;
import uz.pdp.warehousedatarest.entity.AttachmentContent;
import uz.pdp.warehousedatarest.payload.Result;
import uz.pdp.warehousedatarest.repository.AttachmentContentRepository;
import uz.pdp.warehousedatarest.service.AttachmentService;

import java.util.List;

@RestController
@RequestMapping("/attachment")
public class AttachmentContentController {

    @Autowired
    AttachmentService attachmentService;

    @Autowired
    AttachmentContentRepository attachmentContentRepository;

    @SneakyThrows
    @PostMapping
    public Result add(@RequestBody MultipartHttpServletRequest multipartHttpServletRequest) {
        return attachmentService.add(multipartHttpServletRequest);
    }

    @GetMapping
    public List<Attachment> getAll() {
        return attachmentService.getAll();
    }

    @GetMapping("{id}")
    public AttachmentContent getById(@PathVariable Long id) {
        return attachmentService.getById(id);
    }

    @DeleteMapping("{id}")
    public Result delete(@PathVariable Long id) {
        return attachmentService.delete(id);
    }

}
