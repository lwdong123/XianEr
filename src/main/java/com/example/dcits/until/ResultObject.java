package com.example.dcits.until;

/**
 * @author yaozhongjie
 */
public class ResultObject {
    private Boolean success;
    private Object data;
    private String message;

    public Boolean isSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    private static class ResultObjectHolder{
        private final static ResultObject INSTANCE =new ResultObject();
    }
    public static ResultObject getInstance(){
         ResultObject res= ResultObjectHolder.INSTANCE;
         res.setMessage(null);
         res.setData(null);
         res.setSuccess(null);
        return res;
    }

    public void setInstanceData(Object data){
        this.data=data;
        this.success=true;
    }
    public void setInstanceMessage(Object data,String message,Boolean success){
        this.success=success;
        this.data=data;
        this.message=message;
    }
    public void setInstanceMessage(String message,Boolean success){
        this.success=success;
        this.message=message;
    }
}
