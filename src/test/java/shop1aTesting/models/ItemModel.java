package shop1aTesting.models;

import lombok.Data;

@Data
public class ItemModel {
    public static ItemModel itemModel = new ItemModel();
    public String goodsName;
    public String goodsPrice;
}
