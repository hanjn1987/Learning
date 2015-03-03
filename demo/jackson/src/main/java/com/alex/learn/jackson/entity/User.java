package com.alex.learn.jackson.entity;

import java.util.Arrays;

/**
 * Created by hanjunnan on 15/3/3.
 */
public class User {
    public enum Gender {
        MALE, FEMALE
    }

    public static class Name {
        private String first;
        private String last;

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }

        @Override
        public String toString() {
            return "Name{" +
                    "first='" + first + '\'' +
                    ", last='" + last + '\'' +
                    '}';
        }
    }

    private Gender gender;
    private Name name;
    private boolean isVerified;
    private byte[] userImage;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public byte[] getUserImage() {
        return userImage;
    }

    public void setUserImage(byte[] userImage) {
        this.userImage = userImage;
    }

    @Override
    public String toString() {
        return "User{" +
                "gender=" + gender +
                ", name=" + name +
                ", isVerified=" + isVerified +
                ", userImage=" + Arrays.toString(userImage) +
                '}';
    }
}
