package com.suraj.gateway.models;


import lombok.*;

import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AuthResponse {

    private String userId;

    private String accessToken;

    private String refreshToken;

    private Long expireAt;

    private Collection<String>  authorities;
}
