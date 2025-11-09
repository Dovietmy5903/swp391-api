package com.devmam.taraacademyapi.models.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.math.BigDecimal;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthenticationResponse implements Serializable {
    String id;
    String token;
    boolean authenticated;
    String message;
    String username;
    String email;
    String fullName;
    String phone;
    String customerCode;
    BigDecimal accountBalance;
    String avt;
}