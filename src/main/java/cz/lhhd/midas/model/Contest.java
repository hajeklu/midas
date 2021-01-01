package cz.lhhd.midas.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Contest {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String picturePatch;

    @Lob
    private String title;

    @Lob
    private String text;

    @Lob
    private String link;

    private LocalDateTime creation;

    private LocalDateTime operation;

    @ManyToMany
    private List<AnixaUser> users;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPicturePatch() {
        return picturePatch;
    }

    public void setPicturePatch(String picturePatch) {
        this.picturePatch = picturePatch;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public LocalDateTime getCreation() {
        return creation;
    }

    public void setCreation(LocalDateTime creation) {
        this.creation = creation;
    }

    public LocalDateTime getOperation() {
        return operation;
    }

    public void setOperation(LocalDateTime operation) {
        this.operation = operation;
    }

    public List<AnixaUser> getUsers() {
        return users;
    }

    public void setUsers(List<AnixaUser> users) {
        this.users = users;
    }
}
