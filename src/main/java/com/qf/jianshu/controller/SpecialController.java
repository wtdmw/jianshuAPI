package com.qf.jianshu.controller;



import com.qf.jianshu.entity.Msg;
import com.qf.jianshu.entity.Special;
import com.qf.jianshu.service.SpecialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/c")
public class SpecialController {
    @Autowired
    SpecialService specialService;

    @PostMapping("/addSpecial")
    public Msg addSpecial(@RequestParam(value = "file",required = false) MultipartFile file, @RequestParam("userId") String userId,
                          @RequestParam("name") String name, @RequestParam("describe") String describe){
        Special special  = new Special();
        special.setName(name);
        special.setTimeStamp();
//        special.setHeadImgUrl();
        special.setUserId(userId);
        special.setDescribe(describe);
        System.out.println(userId+" "+name+" "+describe);
        Integer result = specialService.addSpecial(special);
        Msg msg = new Msg();
        if (result>0){
            msg.setCode(100);
            msg.setMessage("操作成功");
        }else {
            msg.setCode(200);
            msg.setMessage("操作失败");
        }
        return msg;
    }

    @GetMapping("/collection_info")
    public Msg collection_info(@RequestParam("sid") Integer id){

        Special special = specialService.collection_info(id);
        Msg msg = new Msg();
        msg.setCode(100);
        msg.setMessage("获取成功");
        msg.getExtend().put("collection_info",special);

        return msg;

    }


}
