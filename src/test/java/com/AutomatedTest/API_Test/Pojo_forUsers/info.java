package com.AutomatedTest.API_Test.Pojo_forUsers;

import com.google.gson.annotations.SerializedName;

public class info {
        @SerializedName("postId")
        private int postId=2;
        private int id=1;
        private String name="serdar serkan";
        private String email="serdar4661@gmail.com";
        private String body="API is fun";

        public info(){

        }

    public info(int postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "info{" +
                "postId=" + postId +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", body=" + body +
                '}';
    }
}

