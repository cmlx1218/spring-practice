package com.tt.spring.annotation.reflect.dto;

import com.tt.spring.annotation.reflect.annotation.JianCha;
import lombok.Data;

/**
 * @Desc
 * @Author cmlx
 * @Date 2020-4-24 0024 12:24
 */
@Data
public class NoBugDto {

    @JianCha
    public void suanshu() {
        System.out.println("1234567890");
    }

    @JianCha
    public void jiafa() {
        System.out.println("1+1=" + (1 + 1));
    }

    @JianCha
    public void jianfa() {
        System.out.println("1-2=" + (1 - 2));
    }

    @JianCha
    public void chengfa() {
        System.out.println("2x2=" + (2 * 2));
    }

    @JianCha
    public void chufa() {
        System.out.println("2/0=" + (2 / 0));
    }

    @JianCha
    public void ziwojieshao() {
        System.out.println("完成啦！");
    }

}
