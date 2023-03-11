package com.admin.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotEmpty;

@Data
@TableName("t_department")
public class Department {
    @TableId(type = IdType.AUTO)
    private Integer id;

    @Length(max = 50,message = "部门名称最大长度为50")
    @NotEmpty(message = "部门名称为必填项")
    private String departmentName;

    private int pid;
    private String parentName;
    private String isDelete;
}
