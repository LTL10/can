package com.xyh.can.exception;


import com.xyh.can.result.ResponseData;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * DefaultExceptionHandler:自定义异常处理器
 *
 * @author zhangxiaoxiang
 * @date: 2019/07/12
 */
@Slf4j
@ControllerAdvice(basePackages = "com.xyh.can") //不指定包默认加了@Controller和@RestController都能控制
//@ControllerAdvice(basePackages ="com.example.demo.controller")
public class DefaultExceptionHandler  {

    /**
     * 异常统一自定义处理
     */
    @ResponseBody
    @ExceptionHandler(value = MyException.class)
    public ResponseData MyException(MyException e) {
        ResponseData responseData=new ResponseData<>();
        responseData.setCode(200);
        responseData.setMsg(e.getMessage());
        responseData.setData(null);
        return responseData;
    }



    /**
     * 异常统一自定义处理
     */
    @ResponseBody
    @ExceptionHandler(value = PassMisException.class)
    public ResponseData PassMisException(PassMisException e) {
        ResponseData responseData=new ResponseData<>();
        responseData.setCode(200);
        responseData.setMsg(e.getMessage());
        responseData.setData(null);
        return responseData;
    }


    /**
     * 异常统一处理(最后的异常处理)
     */
    @ResponseBody
    @ExceptionHandler({Exception.class})
    public ResponseData allException(Exception e) {
        ResponseData responseData=new ResponseData<>();
            responseData.setCode(500);
            responseData.setMsg(e.getMessage());
        return responseData;

    }

}
