package com.veganplanet.user.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {
    /**
     *用户编号
     */
    private Integer userNo;
    /**
     *姓名
     */
    private String name;
    /**
     *手机号
     */
    private String mobile;
}
