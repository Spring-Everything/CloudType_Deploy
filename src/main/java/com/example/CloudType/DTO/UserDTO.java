package com.example.CloudType.DTO;

import com.example.CloudType.Entity.UserEntity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserDTO {
    private Long id;
    private String uid;
    private String password;
    private String nickname;

    public static UserDTO entityToDto(UserEntity userEntity) {
        return new UserDTO(
                userEntity.getId(),
                userEntity.getUid(),
                userEntity.getPassword(),
                userEntity.getNickname()
        );
    }

    public UserEntity dtoToEntity() {
        return new UserEntity(id, uid, password, nickname);
    }
}
