package cn.gson.prohis.model.pojos;


import java.util.List;

/**
 * 权限列表
 */
public class YxjFunctionInfo {

  private Integer funcId;
  private Integer ftId;
  private String funcName;
  private String funcCode;
  private String funcPath;
  private String funcIcon;
  private String funcMeta;
  private Integer funcShow;
  private Integer parentId;

  private List<YxjFunctionInfo> children;

  public Integer getFuncId() {
    return funcId;
  }

  public void setFuncId(Integer funcId) {
    this.funcId = funcId;
  }

  public Integer getFtId() {
    return ftId;
  }

  public void setFtId(Integer ftId) {
    this.ftId = ftId;
  }

  public String getFuncName() {
    return funcName;
  }

  public void setFuncName(String funcName) {
    this.funcName = funcName;
  }

  public String getFuncCode() {
    return funcCode;
  }

  public void setFuncCode(String funcCode) {
    this.funcCode = funcCode;
  }

  public String getFuncPath() {
    return funcPath;
  }

  public void setFuncPath(String funcPath) {
    this.funcPath = funcPath;
  }

  public String getFuncIcon() {
    return funcIcon;
  }

  public void setFuncIcon(String funcIcon) {
    this.funcIcon = funcIcon;
  }

  public String getFuncMeta() {
    return funcMeta;
  }

  public void setFuncMeta(String funcMeta) {
    this.funcMeta = funcMeta;
  }

  public Integer getFuncShow() {
    return funcShow;
  }

  public void setFuncShow(Integer funcShow) {
    this.funcShow = funcShow;
  }

  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  public List<YxjFunctionInfo> getChildren() {
    return children;
  }

  public void setChildren(List<YxjFunctionInfo> children) {
    this.children = children;
  }
}
