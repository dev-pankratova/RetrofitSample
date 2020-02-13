package com.project.retrofitsample;

import androidx.annotation.Nullable;

public class Message {
    private float id;
    private String text;
    private float time;
    @Nullable
    private String image;

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    @Nullable
    public String getImage() {
        return image;
    }

    public void setImage(@Nullable String image) {
        this.image = image;
    }
}
