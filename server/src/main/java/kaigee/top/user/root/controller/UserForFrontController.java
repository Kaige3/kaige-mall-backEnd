package kaigee.top.user.root.controller;
import cn.dev33.satoken.annotation.SaCheckDisable;
import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import io.qifan.infrastructure.common.constants.ResultCode;
import io.qifan.infrastructure.common.exception.BusinessException;
import kaigee.top.infrastructure.model.QueryRequest;
import kaigee.top.menu.entity.Menu;
import kaigee.top.menu.repository.MenuRepository;
import kaigee.top.user.root.entity.User;
import kaigee.top.user.root.entity.dto.UserInput;
import kaigee.top.user.root.entity.dto.UserLoginInput;
import kaigee.top.user.root.entity.dto.UserSpec;
import kaigee.top.user.root.repository.UserRepository;
import kaigee.top.user.root.service.UserService;
import lombok.AllArgsConstructor;
import org.babyfish.jimmer.client.FetchBy;
import org.babyfish.jimmer.client.meta.DefaultFetcherOwner;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("front/user")
@AllArgsConstructor
@DefaultFetcherOwner(UserRepository.class)
@Transactional
@SaCheckDisable
public class UserForFrontController {

    private final UserService userService;

    private final UserRepository userRepository;

    @PostMapping("info")
    public @FetchBy(value = "USER_ROLE_FETCHER") User getUserInfo(){
        return userRepository.findById(StpUtil.getLoginIdAsString(),UserRepository.USER_ROLE_FETCHER)
                .orElseThrow( ()->new BusinessException(ResultCode.NotFindError,"数据不存在"));
    }

    @GetMapping("{id}")
    public @FetchBy(value = "USER_ROLE_FETCHER") User findById(@PathVariable String id) {
        return userService.findById(id);
    }

    @PostMapping("query")
    public Page< @FetchBy(value = "COMPLEX_FETCHER") User> query(@RequestBody QueryRequest<UserSpec> queryRequest) {
        return userService.query(queryRequest);
    }

    @PostMapping("save")
    public String save(@RequestBody @Validated UserInput user) {
        return userService.save(user);
    }

    @PostMapping("delete")
    public Boolean delete(@RequestBody List<String> ids) {
        return userService.delete(ids);
    }

    @PostMapping("login")
    public SaTokenInfo login(@RequestBody @Validated UserLoginInput userLoginInput){
       return userService.login(userLoginInput);
    }

    @GetMapping("menus")
    public List<@FetchBy(value = "SIMPLE_FETCHER",ownerType = MenuRepository.class) Menu>  getUserMenus(){
        return  userService.getUserMenus();
    }

}