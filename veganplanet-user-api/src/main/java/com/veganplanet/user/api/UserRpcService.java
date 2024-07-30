package com.veganplanet.user.api;

import com.veganplanet.user.api.dto.UserDTO;
import com.veganplanet.user.api.vo.UserVO;

public interface UserRpcService {

    /**
     * <p>获取用户信息</p>
     * @param
     * @return
     */
    UserDTO getUserInfo(UserVO userVO);

}
