package life.toughjourney.community.controller;

import life.toughjourney.community.dto.FileDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author YX
 * @version 1.0.0
 * @Description
 * @create 2020年01月31日 20:55:00
 */
@Controller
public class FileController {


    @RequestMapping("/file/upload")
    @ResponseBody
    public FileDto upload(){
    FileDto fileDto = new FileDto();
    fileDto.setSuccess(1);
    fileDto.setUrl("/images/wechat.jpg");
    return fileDto;
    }
}
