package com.zoe.car.error;

import org.springframework.stereotype.Component;

/**
 * com.zoe.car.error.FailureCode
 *
 * @author Dai Wenqing
 * @date 2015/11/11
 */
@Component("com.zoe.car.error.code")
public class FailureCode {
    public final static String E_IN_ILLEGAL = "error.40001";
    public final static String E_EXIST = "error.40002";
    public final static String E_ADD_ERROR = "error.40003";
    public final static String E_UPDATE_ERROR = "error.40004";
    public final static String E_DELETE_ERROR = "error.40005";
    public final static String E_SELECT_NO_EXIST = "error.40006";

}
