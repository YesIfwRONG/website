package com.example.utils;

/**
 * @Title: JSONResult.java
 * @Package com.itzixi.utils
 * @Description:    200: success
 *                  500: err, error message in String msg
 *                  501: bean authentication err, return in map
 *                  502: token err
 *                  555: abnormal info throwing
 *                  556: qq authentication err
 *                  557: whether logged in on CAS, ticket authentication
 */
public class JSONResult {

    private Integer status;
    private String msg;
    private Object data;
    private String ok;
    public static JSONResult build(Integer status, String msg, Object data){
        return new JSONResult(status, msg, data);
    }

    public static JSONResult build(Integer status, String msg, Object data, String ok){
        return new JSONResult(status, msg, data, ok);
    }

    public static JSONResult ok(Object data){
        return new JSONResult(data);
    }

    public static JSONResult ok(){
        return new JSONResult(null);
    }

    public static JSONResult errorMsg(String msg){
        return new JSONResult(500, msg, null);
    }

    public static JSONResult errorUserTicket(String msg){
        return new JSONResult(557, msg, null);
    }

    public static JSONResult errorMap(Object data){
        return new JSONResult(501, "error", data);
    }

    public static JSONResult errorTokenMsg(String msg){
        return new JSONResult(502, msg, null);
    }

    public static JSONResult errorException(String msg){
        return new JSONResult(555, msg, null);
    }

    public static JSONResult errorUserQQ(String msg){
        return new JSONResult(556, msg, null);
    }

    public JSONResult(){

    }

    public JSONResult(Integer status, String msg, Object data){
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public JSONResult(Integer status, String msg, Object data, String ok){
        this.status = status;
        this.msg = msg;
        this.data = data;
        this.ok = ok;
    }

    public JSONResult(Object data){
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Boolean isOK(){
        return this.status == 200;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }
}
