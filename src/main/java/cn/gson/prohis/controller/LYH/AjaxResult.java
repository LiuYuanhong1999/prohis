package cn.gson.prohis.controller.LYH;

public class AjaxResult {

    public static void main(String[] args) {
        //封装AjaxResult--返回后台数据
        AjaxResult.me().setSuccess(true).setMsg("恭喜你操作成功").setObject("你运气好，账号密码都是对的");
    }

    public static AjaxResult me(){
        return new AjaxResult();
    }

    private Boolean success = true;//默认操作成功
    private String msg = "操作成功";//返回前端操作的文字结果

    private Object object;//返回后台的对象

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}