package com.example.realworld.modules.board.vo;

import com.example.realworld.modules.base.BaseEntity;
import com.example.realworld.modules.user.vo.User;
import lombok.*;

import javax.persistence.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Comment extends BaseEntity {

    private String body;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author",
            referencedColumnName = "id",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_COMMENT_AUTHOR"))
    private User author;
}
