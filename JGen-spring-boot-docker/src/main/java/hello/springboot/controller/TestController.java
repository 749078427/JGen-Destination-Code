package hello.springboot.controller;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.validation.executable.ValidateOnExecution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

import hello.springboot.config.Configinfo;
import hello.springboot.model.Evk_users;
import hello.springboot.model.UserDomain;
import hello.springboot.service.evk_users.*;
import hello.springboot.service.user.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import io.swagger.annotations.ApiImplicitParam;

@Api(value="/springboot", tags="测试接口模块")
@RestController
@RequestMapping("/springboot")
public class TestController {
	
	
	@RequestMapping
    public String test() {
        return "hello world2..";
    }
	
	@ApiOperation(value="简单类型的绑定，可以出来get和post", notes = "简单类型的绑定，可以出来get和post")
	@GetMapping(value = "/get")
    public HashMap<String, Object> get(@RequestParam String name) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("title", "hello eva");
        map.put("name", name);
        return map;
    }
    
	@ApiOperation(value="获得请求url中的动态参数", notes = "获得请求url中的动态参数")
	@GetMapping(value = "/get/{userid}/{username}")
    public UserDomain getUser(@PathVariable int userid, @PathVariable String username) {
		UserDomain userinfo = new UserDomain();
		userinfo.setUserId(userid);
		userinfo.setUserName(username);
        return userinfo;
    }
	
	@Value("${boot.name}")//逐个注解
	private String name;	

    @ApiOperation(value="逐个注解读取配置文件", notes = "逐个注解读取配置文件")
    @GetMapping(value="/getConfig")
	public String getConfig() throws UnsupportedEncodingException {
		return name;
	}
    
    @Autowired
	private Configinfo configinfo;//类注解
    
    @ApiOperation(value="类注解读取配置文件", notes = "类注解读取配置文件")
    @GetMapping(value="/getConfig2")
	public String getConfig2() throws UnsupportedEncodingException {
		//需要进行编码格式转换，不然会乱码
		return configinfo.getName();
	}
    
    @Autowired
    private UserService userService;

    @ApiOperation(value="添加userinfo示例", notes = "添加userinfo示例")
    @ResponseBody
    @PostMapping("/addUserinfo")
    public int addUserinfo(UserDomain user){
        return userService.addUser(user);
    }

    @ApiOperation(value="获取所有userinfo示例", notes = "获取所有userinfo示例")
    @ResponseBody
    @GetMapping("/findAllUser")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }
    
    @Autowired 
    private Evk_usersService evk_usersService;
    
    @ApiOperation(value="添加Evk_users示例", notes = "添加Evk_users示例")
    @ResponseBody
    @PostMapping("/addEvk_users")
    public int addEvk_users(Evk_users user){
        return evk_usersService.addEvk_users(user);
    }

    @ApiOperation(value="搜索Evk_users示例", notes = "搜索Evk_users示例")
    @ResponseBody
    @GetMapping("/findEvk_users")
    public Evk_users findEvk_users(
    		@RequestParam(name = "userid", required = false,defaultValue = "cy")
             		String userid){
        return evk_usersService.findEvk_users(userid);
    }
   
    @ApiOperation(value="获取所有Evk_users示例", notes = "获取所有Evk_users示例")
    @ResponseBody
    @GetMapping("/findallevk_users")
    public PageInfo<Evk_users> findAllEvk_users(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize){
        return evk_usersService.findAllEvk_users(pageNum,pageSize);
    }
   
    @ApiOperation(value="注解获取所有Evk_users示例", notes = "注解获取所有Evk_users示例")
    @ResponseBody
    @GetMapping("/getallevk_users")
    public PageInfo<Evk_users> getAllEvk_users(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize){
        return evk_usersService.getAllEvk_users(pageNum, pageSize);
    }
    
}
