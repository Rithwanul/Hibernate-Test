package com.example.test.models;

import javax.persistence.*;

@Entity
public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "story_name")
    private String storyName;

    public Story() {
    }

    public Story(int id, String storyName) {
        this.id = id;
        this.storyName = storyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStoryName() {
        return storyName;
    }

    public void setStoryName(String storyName) {
        this.storyName = storyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Story story = (Story) o;

        if (id != story.id) return false;
        return storyName.equals(story.storyName);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + storyName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Story{" +
                "id=" + id +
                ", storyName='" + storyName + '\'' +
                '}';
    }
}
