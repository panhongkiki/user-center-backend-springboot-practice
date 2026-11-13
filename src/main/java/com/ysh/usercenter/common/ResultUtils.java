package com.ysh.usercenter.common;

/**
 * 返回工具类
 */
public class ResultUtils {

    private ResultUtils() {

    }

    /**
     * 成功
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 失败
     */
    public static <T> BaseResponse error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     */
    public static <T> BaseResponse error(int code, String message, String description) {
        return new BaseResponse<>(code, null, message, description);
    }

    /**
     * 失败
     */
    public static <T> BaseResponse error(ErrorCode errorCode, String message, String description) {
        return new BaseResponse<>(errorCode.getCode(), null, message, description);
    }

    /**
     * 失败
     */
    public static <T> BaseResponse error(ErrorCode errorCode, String description) {
        return new BaseResponse<T>(errorCode.getCode(), null, errorCode.getMessage(), description);
    }
}
