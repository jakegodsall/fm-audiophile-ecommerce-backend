package com.jakegodsall.audiophilerestapi.payload;

public class ImageDto {
    private Long id;
    private String name;
    private String type;
    private String viewport;
    private String filepath;

    public ImageDto() {
    }

    public ImageDto(Long id, String name, String type, String viewport, String filepath) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.viewport = viewport;
        this.filepath = filepath;
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

    public String getViewport() {
        return viewport;
    }

    public void setViewport(String viewport) {
        this.viewport = viewport;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public String toString() {
        return "ImageDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", viewport='" + viewport + '\'' +
                ", filepath='" + filepath + '\'' +
                '}';
    }
}
