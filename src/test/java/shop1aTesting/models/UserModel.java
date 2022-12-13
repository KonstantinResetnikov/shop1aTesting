package shop1aTesting.models;

import lombok.Data;

@Data
public class UserModel {
    public static UserModel userModel = new UserModel();
    public String userName;
    public String userSurname;
    public String userNameSurname;
    public String userPhone;

    }

