package com.example.tokenanalysis.DTO;

import com.example.tokenanalysis.enums.Gender;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



import java.util.ArrayList;
@Getter
@Setter
@NoArgsConstructor
public class TraderDTO {
    @NotBlank
    @Size(max = 15, min = 2)
    private String firstName;
    @NotBlank
    @Size(max = 15, min = 2)
    private String lastName;
    private String userName;
    @NotBlank
    @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
    private String passWord;
    @NotNull
    private String confirmPassWord;
    @NotBlank
    @Pattern(regexp = "^\\d{10}$")
    private String phone;
    private Gender gender;
    @NotBlank
    @Email
    private String email;
    private ArrayList<WalletDTO> wallet;
    private ArrayList<TradeDTO> sellTrade;
    private ArrayList<TradeDTO> buyTrade;

}
