package exam04;

import java.util.Objects;

public class Customer extends java.lang.Object{ //데이터 클래스
    private int id; // 고객번호
    private String name; // 고객명
    private String email; // 이메일

    public Customer(int id, String name, String email) { // hashCode 생성
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Customer customer){
            // id, name, email 이 같으면 동등하다.
            if (id == customer.id && name.equals(customer.name) && email.equals(customer.email)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name,email);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
