package bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class UserAddress implements Serializable {
    private Long id;
    private String userName;
    private String address;

    public UserAddress(Long id, String userName, String address) {
        this.id = id;
        this.userName = userName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
