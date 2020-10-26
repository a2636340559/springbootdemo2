package com.beic.springbootdemo2.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Component
public class CommonResult implements Serializable {
    public CommonResult(String message) {
        this.message = message;
    }

    private static final long serialVersionUID = 1094761266823792233L;
    private String status="failed";
    private Object result;
    private String message;

    public CommonResult() {
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString()
    {
        return "{\n"+
                    "status:"+status+",\n"+
                    "result:"+((result==null)?null:result.toString())+",\n"+
                    "message:"+message+"\n}\n";
    }
}
