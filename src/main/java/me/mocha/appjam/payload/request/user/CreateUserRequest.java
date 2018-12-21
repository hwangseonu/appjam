package me.mocha.appjam.payload.request.user;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CreateUserRequest {

    @NotNull
    @Min(4)
    private String username;

    @NotNull
    @Min(8)
    private String password;

    @NotNull
    @Min(2)
    private String name;

    @NotNull
    @Pattern(regexp = "^\\d{5}$")
    private String studentId;

}
