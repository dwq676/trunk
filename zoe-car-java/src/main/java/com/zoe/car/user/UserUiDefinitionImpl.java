package com.zoe.car.user;

import com.zoe.commons.workbench.ui.MetaData;
import com.zoe.commons.workbench.ui.UiDefinition;
import org.springframework.stereotype.Controller;

/**
 * UserUiDefinitionImpl
 *
 * @author Dai Wenqing
 * @date 2015/10/12
 */
@Controller("car.user.ui-definition")
public class UserUiDefinitionImpl   {

    public String getUriPrefix() {
        return "/car/user/";
    }


    public String getMessageKeyPrefix() {
        return "car.user.";
    }


    public MetaData[] getMetaDatas() {
        return new MetaData[0];
    }
}
