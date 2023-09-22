package com.jakegodsall.audiophilerestapi.entities;

import com.jakegodsall.audiophilerestapi.entities.enums.ViewportSize;
import jakarta.persistence.*;

@Entity
@Table(name = "image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    @Enumerated(EnumType.STRING)
    private ViewportSize viewport;
    private String filePath;

    public Image() {
    }

    public Image(Long id, String name, String type, String viewport, String filePath) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.viewport = ViewportSize.valueOf(viewport);
        this.filePath = filePath;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ViewportEnum getViewport() {
        return viewport;
    }

    public void setViewport(ViewportEnum viewport) {
        this.viewport = viewport;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}

