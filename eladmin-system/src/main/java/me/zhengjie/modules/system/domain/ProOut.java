package me.zhengjie.modules.system.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 角色
 * @author jie
 * @date 2018-11-22
 */
@Entity
@Table(name = "ProOut")
@Getter
@Setter
public class ProOut implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(groups = {Update.class})
    private Long id;

    @OneToOne
    @JoinColumn(name = "dept_id")
    private Dept dept;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "officeSupplier_id")
    private OfficeSupplier officeSupplier;

    @NotNull
    private Long count;

    @CreationTimestamp
    @Column(name = "create_time")
    private Timestamp createTime;

    public interface Update{}
}