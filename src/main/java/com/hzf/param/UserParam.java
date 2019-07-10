package com.hzf.param;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class UserParam {

    private Integer id;

    @NotBlank(message = "用户名不可以为空")
    @Length(min = 1, max = 20, message = "用户名长度需要在20个字以内")
    private String username;

    @NotBlank(message = "电话不可以为�?")
    @Length(min = 1, max = 13, message = "电话长度�?要在13个字以内")
    private String telephone;

    @NotBlank(message = "邮箱不允许为�?")
    @Length(min = 5, max = 50, message = "邮箱长度�?要在50个字符以�?")
    private String mail;

    @NotNull(message = "必须提供用户�?在的部门")
    private Integer deptId;

    @NotNull(message = "必须指定用户的状�?")
    @Min(value = 0, message = "用户状�?�不合法")
    @Max(value = 2, message = "用户状�?�不合法")
    private Integer status;

    @Length(min = 0, max = 200, message = "备注长度�?要在200个字以内")
    private String remark = "";
}
