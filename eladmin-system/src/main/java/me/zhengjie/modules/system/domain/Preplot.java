package me.zhengjie.modules.system.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 角色
 * @author jie
 * @date 2018-11-22
 */
@Entity
@Table(name = "preplot")
@Getter
@Setter
public class Preplot implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(groups = {Update.class})
    private Long id;

    @Column(nullable = false)
    @NotBlank
    private String name;

    @Column(nullable = false)
    @NotBlank
    private String specification;

    @Column(nullable = false)
    @NotBlank
    private String units;

    @Column(nullable = false)
    private String imageUrl;
    public interface Update{}
}