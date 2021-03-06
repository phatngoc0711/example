package vn.myclass.core.persistence.entity;



import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="user")

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name="name")
    private  String name;
    @Column(name="password")
    private  String password;



    @Column(name="fullname")
    private String fullName;
    @Column(name="createddate")
    private Timestamp createDate;

    @OneToMany(mappedBy ="userEntity", fetch = FetchType.LAZY)
    private List<CommentEntity> commentEntityList;


    @ManyToOne
    @JoinColumn(name="roleid")
    private RoleEntity roleEntity;



    public RoleEntity getRole() {
        return roleEntity;
    }

    public void setRole(RoleEntity role) {
        this.roleEntity = role;
    }





    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public List<CommentEntity> getCommentEntityList() {
        return commentEntityList;
    }

    public void setCommentEntityList(List<CommentEntity> commentEntityList) {
        this.commentEntityList = commentEntityList;
    }
}
