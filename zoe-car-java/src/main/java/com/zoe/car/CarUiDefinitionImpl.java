package com.zoe.car;

import com.zoe.commons.bean.BeanFactory;
import com.zoe.commons.workbench.ui.MetaData;
import org.springframework.stereotype.Controller;

/**
 * UserUiDefinitionImpl
 *
 * @author Dai Wenqing
 * @date 2015/10/12
 */
@Controller("car.ui-definition")
public class CarUiDefinitionImpl  {

    public String getUriPrefix() {
        return "/car/";
    }


    public String getMessageKeyPrefix() {
        return "car.";
    }


    public MetaData[] getMetaDatas() {
        MetaData metaData1 = createMetaData();
        metaData1.setType(MetaData.TYPE_GRID);
        metaData1.setUris("query", "add", "edit", "save", "saveList", "delete");

        MetaData metaData2 = createMetaData();
        metaData2.setType(MetaData.TYPE_TREE);
        metaData2.setUris("tree");

        return new MetaData[] { metaData1, metaData2 };
    }

    protected MetaData createMetaData() {
        MetaData metaData = BeanFactory.getBean(MetaData.class);
        metaData.setUiDefinition(null);
        metaData.setModelClass(CarModel.class);

        metaData.setLabel("color", "car.color");
        metaData.setLabel("model", "car.model");
        metaData.setLabel("modelCode", "car.model-code");
        metaData.setLabel("van", "car.van");
        metaData.setLabel("seat", "car.seat");
        metaData.setLabel("lefts", "car.lefts");
        metaData.setLabel("licence", "car.licence");

        return metaData;
    }
}
