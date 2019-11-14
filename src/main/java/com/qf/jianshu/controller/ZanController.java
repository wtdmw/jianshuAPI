package com.qf.jianshu.controller;




import com.qf.jianshu.entity.Zan;
import com.qf.jianshu.entity.ZanMsg;
import com.qf.jianshu.service.ZanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/zan")
public class ZanController {

    @Autowired
    ZanService zanService;

    @PostMapping(value = "/addZan")
    public ZanMsg addZan(@RequestParam("userId") Zan zan){
        zanService.delete(zan);
        zanService.addZan(zan);
        zan.setTimeStamp();
        ZanMsg msg = new ZanMsg();
        msg.setCode(100);
        msg.setMessage("点赞成功");
        Integer articleId = zan.getArticleId();
        Integer count = zanService.getArticleZan(articleId);
        msg.setCount(count);
        return msg;
    }

    @PostMapping(value = "/outZan")
    public ZanMsg outZan(@RequestBody Zan zan){
        zan.setTimeStamp();
        zanService.delete(zan);
        zanService.outZan(zan);
        ZanMsg msg = new ZanMsg();
        msg.setCode(100);
        msg.setMessage("取消赞成功");


        Integer articleId = zan.getArticleId();
        Integer count = zanService.getArticleZan(articleId);
        msg.setCount(count);
        System.out.println(msg);
        return msg;
    }

    @PostMapping(value = "/oppositionZan")
    public ZanMsg oppositionZan(@RequestBody Zan zan){
        zan.setTimeStamp();
        zanService.delete(zan);
        zanService.oppositionZan(zan);
        ZanMsg msg = new ZanMsg();
        msg.setCode(100);
        msg.setMessage("反对赞成功");

        Integer articleId = zan.getArticleId();
        Integer count = zanService.getArticleZan(articleId);
        msg.setCount(count);
        return msg;
    }

    @GetMapping("/getZanStatus")
    public ZanMsg getZanStatus( Zan zan){
        Integer status = zanService.getZanStatus(zan);
        ZanMsg msg = new ZanMsg();
        msg.setCode(100);
        System.out.println(status);

        if (status==null||status==0){
            msg.setMessage("无记录");
        }else if (status==1){
            msg.setMessage("已点赞");
        }else if (status==2){
            msg.setMessage("已反对");
        }

        Integer articleId = zan.getArticleId();
        Integer count = zanService.getArticleZan(articleId);
        msg.setCount(count);
        return msg;

    }

    @GetMapping("/getArticleZan")
    public ZanMsg getArticleZan(@RequestParam("articleId") Integer articleId){
        Integer articleZanCount = zanService.getArticleZan(articleId);
        System.out.println(articleZanCount);
        ZanMsg msg = new ZanMsg();
        msg.setCode(100);
        msg.setMessage("获取成功");
        msg.setCount(articleZanCount);
        return msg;
    }

    @GetMapping("/getUserZan")
    public ZanMsg getUserZan(@RequestParam("userId") String userId){
        System.out.println(userId);
        Integer userZanCount = zanService.getUserZan(userId);
        ZanMsg msg = new ZanMsg();
        msg.setCode(100);
        msg.setMessage("获取成功");
        msg.setCount(userZanCount);
        return msg;
    }

}
