package com.example.realworld.modules.board.vo;

import com.example.realworld.modules.base.BaseEntity;
import com.example.realworld.modules.user.vo.User;
import lombok.*;
import org.springframework.util.StringUtils;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Article extends BaseEntity {

    private String slug;
    private String title;
    private String description;
    @Lob
    private String body;

    private String tags;
    // private List<Tag> tagList = new ArrayList<>();

    private boolean favorited;
    private Integer favoritesCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author",
            referencedColumnName = "id",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_ARTICLE_AUTHOR"))
    private User author;

    public List<String> getTagList() {
        if (!StringUtils.hasLength(getTags())) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(getTags().split(","));
    }
}
