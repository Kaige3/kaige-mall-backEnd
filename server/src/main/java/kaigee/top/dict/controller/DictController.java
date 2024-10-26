package kaigee.top.dict.controller;

import kaigee.top.dict.entity.Dict;
import kaigee.top.dict.entity.dto.DictInput;
import kaigee.top.dict.entity.dto.DictSpec;
import kaigee.top.dict.repository.DictRepository;
import kaigee.top.dict.service.DictService;
import kaigee.top.infrastructure.model.QueryRequest;
import lombok.AllArgsConstructor;
import org.babyfish.jimmer.client.FetchBy;
import org.babyfish.jimmer.client.meta.DefaultFetcherOwner;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.List;

@RestController
@RequestMapping("dict")
@AllArgsConstructor
@DefaultFetcherOwner(DictRepository.class)
public class DictController {
    private final DictService dictService;

    @GetMapping("{id}")
    public @FetchBy(value = "COMPLEX_FETCHER") Dict findById(@PathVariable String id) {
        return dictService.findById(id);
    }

    @PostMapping("query")
    public Page<@FetchBy(value = "COMPLEX_FETCHER") Dict> query(@RequestBody QueryRequest<DictSpec> queryRequest) {
        return dictService.query(queryRequest);
    }

    @PostMapping("save")
    public String save(@RequestBody @Validated DictInput dict) {
        return dictService.save(dict);
    }

    @PostMapping("delete")
    public Boolean delete(@RequestBody List<String> ids) {
        return dictService.delete(ids);
    }

    @GetMapping("ts")
    public byte[] generateTS() {
        return dictService.generateTS().getBytes(StandardCharsets.UTF_8);
    }

    @GetMapping("java")
    public void generateJava() {
        dictService.generateJava();
    }
}