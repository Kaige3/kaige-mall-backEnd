package kaigee.top.box.category.controller;
import kaigee.top.box.category.entity.MysteryBoxCategory;
import kaigee.top.box.category.entity.dto.MysteryBoxCategoryInput;
import kaigee.top.box.category.entity.dto.MysteryBoxCategorySpec;
import kaigee.top.box.category.repository.MysteryBoxCategoryRepository;
import kaigee.top.box.category.service.MysteryBoxCategoryService;
import kaigee.top.infrastructure.model.QueryRequest;
import lombok.AllArgsConstructor;
import org.babyfish.jimmer.client.FetchBy;
import org.babyfish.jimmer.client.meta.DefaultFetcherOwner;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("mysteryBoxCategory")
@AllArgsConstructor
@DefaultFetcherOwner(MysteryBoxCategoryRepository.class)
public class MysteryBoxCategoryController {
    private final MysteryBoxCategoryService mysteryBoxCategoryService;

    @GetMapping("{id}")
    public @FetchBy(value = "COMPLEX_FETCHER") MysteryBoxCategory findById(@PathVariable String id) {
        return mysteryBoxCategoryService.findById(id);
    }

    @PostMapping("query")
    public Page< @FetchBy(value = "COMPLEX_FETCHER") MysteryBoxCategory> query(@RequestBody QueryRequest<MysteryBoxCategorySpec> queryRequest) {
        return mysteryBoxCategoryService.query(queryRequest);
    }

    @PostMapping("save")
    public String save(@RequestBody @Validated MysteryBoxCategoryInput mysteryBoxCategory) {
        return mysteryBoxCategoryService.save(mysteryBoxCategory);
    }

    @PostMapping("delete")
    public Boolean delete(@RequestBody List<String> ids) {
        return mysteryBoxCategoryService.delete(ids);
    }
}