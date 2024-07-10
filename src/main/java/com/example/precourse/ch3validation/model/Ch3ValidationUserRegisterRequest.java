package com.example.precourse.ch3validation.model;

import com.example.precourse.ch3validation.annotation.PhoneNumber;
import com.example.precourse.ch3validation.annotation.YearMonth;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Ch3ValidationUserRegisterRequest {
//    @NotNull
//    @NotEmpty
//    @NotBlank
    private String name;

    private String nickName;

    @Size(min=1, max = 12)
    @NotBlank
    private String password;

    @NotNull
    @Min(1)
    @Max(100)
    private Integer age;

    @Email
    private String email;

    @PhoneNumber
//    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message = "휴대폰 번호가 맞지 않습니다.")
    private String phoneNumber;

    @FutureOrPresent // 현재 또는 미래
    private LocalDateTime registerAt;

    @YearMonth(pattern = "yyyy-MM")
    private String birthDayYearMonth;

    @AssertTrue(message = "name or nickName은 반드시 1개가 존재해야 합니다.")
    public boolean isNameCheck(){
        if(Objects.nonNull(name) && !name.isBlank()){
            return true;
        }
        if(Objects.nonNull(nickName) &&!nickName.isBlank()){
            return true;
        }
        return false;
    }
}
