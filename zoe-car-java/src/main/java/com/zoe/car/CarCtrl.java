package com.zoe.car;

import com.zoe.commons.ctrl.execute.Execute;
import com.zoe.commons.workbench.base.BaseControllerSupport;
import org.springframework.stereotype.Controller;

/**
 * CarCtrl
 *
 * @author Dai Wenqing
 * @date 2015/10/15
 */
@Controller("car.ctrl")
public class CarCtrl extends BaseControllerSupport {
    @Execute(name = "/", template = "module/index/html/index", type = "freemarker")
    public Object getIndex() {
        return success();
    }
}
