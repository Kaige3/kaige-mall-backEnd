package kaigee.top.dict.entity.dto.controller;
import kaigee.top.dict.entity.dto.DictInput;

@RestController
@RequestMapping("dictInput")
@AllArgsConstructor
@DefaultFetcherOwner(DictInputRepository.class)
public class DictInputController {
    private final DictInputService dictInputService;

    @GetMapping("{id}")
    public @FetchBy(value = "COMPLEX_FETCHER") DictInput findById(@PathVariable String id) {
        return dictInputService.findById(id);
    }

    @PostMapping("query")
    public Page< @FetchBy(value = "COMPLEX_FETCHER") DictInput> query(@RequestBody QueryRequest<DictInputSpec> queryRequest) {
        return dictInputService.query(queryRequest);
    }

    @PostMapping("save")
    public String save(@RequestBody @Validated DictInputInput dictInput) {
        return dictInputService.save(dictInput);
    }

    @PostMapping("delete")
    public Boolean delete(@RequestBody List<String> ids) {
        return dictInputService.delete(ids);
    }
}