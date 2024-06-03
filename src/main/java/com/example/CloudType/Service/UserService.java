package com.example.CloudType.Service;

import com.example.CloudType.DTO.UserDTO;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    UserDTO getUserByUid(String uid);
    boolean isUidDuplicate(String uid);
    boolean isNicknameDuplicate(String nickname);
    UserDTO updateUser(String uid, UserDTO userDTO);
    void deleteUser(String uid);
    UserDTO login(String uid, String password);
}
