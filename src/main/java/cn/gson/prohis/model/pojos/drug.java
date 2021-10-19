package cn.gson.prohis.model.pojos;

import java.util.List;

public class drug {
    private List<LyhDrugEntity> lyhDrugEntity;

    public List<LyhDrugEntity> getLyhDrugEntity() {
        return lyhDrugEntity;
    }

    public void setLyhDrugEntity(List<LyhDrugEntity> lyhDrugEntity) {
        this.lyhDrugEntity = lyhDrugEntity;
    }

    private TyhJie tyhJie;

    public TyhJie getTyhJie() {
        return tyhJie;
    }

    public void setTyhJie(TyhJie tyhJie) {
        this.tyhJie = tyhJie;
    }
}
