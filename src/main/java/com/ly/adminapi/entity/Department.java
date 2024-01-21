package com.ly.adminapi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Integer id;

    @NotEmpty(message = "部门名称不能为空")
    private String departmentName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+16")
    private Date createTime;

    @JsonFormat(pattern = "YYYY-MM-DD HH:mm:ss",timezone = "GMT+16")
    private Date updateTime;
}
