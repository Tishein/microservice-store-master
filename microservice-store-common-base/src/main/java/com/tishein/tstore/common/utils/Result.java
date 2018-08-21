package com.tishein.tstore.common.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Result
 * @Description TODO
 * @Author Administrator
 * @Date 2018/8/17 0017 17:39
 */
@Data
public class Result<T> implements Serializable {

    private Integer code;

    private String massage;

    private T data;

    public Result() { }

    public Result(Integer code, String massage, T data) {
        this.code = code;
        this.massage = massage;
        this.data = data;
    }

    public static <T> Result<T> success() {
        return success(null);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(200, "ok", data);
    }

    public static <T> Result<T> error() {
        return new Result<>(500, "服务器错误", null);
    }


    public static <T> Result<T> error(Integer code, String massage) {
        return error(code, massage);
    }

    public static <T> Result<T> error(Integer code, String massage, T entity) {
        return new Result<>(code,  massage, entity);
    }


}
