package com.cklm.vo;




import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="user")
public class UserInfoVO    implements Serializable    {

        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        @Column(name = "id")
        private String id;

        @Column(name = "name")
        private String name;

        @Column(name = "password")
        private String password;

        @Column(name = "info")
        private String info;

        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getInfo() {
                return info;
        }

        public void setInfo(String info) {
                this.info = info;
        }
}
