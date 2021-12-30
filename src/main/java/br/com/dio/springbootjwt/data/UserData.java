package br.com.dio.springbootjwt.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserData implements Serializable {

    private String userName;

    private String password;

}
