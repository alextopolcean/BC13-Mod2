package de.telran.dao;

import de.telran.data.Post;
import de.telran.data.UserAdmin;

import java.util.Scanner;

public class Forum {
    private Post[] posts;
    private int size;

    public Forum(int capacity) {
        posts = new Post[capacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean addPost(Post post) {
        if (size < posts.length) {
            posts[size] = post;
            size++;
            return true;

        }
        return false;
    }

    public Post[] getLastPostByAuthor(String author, int numberOfPost) {
        Post[] authorPosts = new Post[numberOfPost];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (posts[i].getAuthor().getUserName().equalsIgnoreCase(author) && index < numberOfPost) {
                authorPosts[index] = posts[i];
                index++;
            }
        }
        return authorPosts;
    }

    public int getCountLikesByTitel(String title) {

        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().equalsIgnoreCase(title)) {
                return posts[i].getLikes();
            }
        }
        return -1;
    }

    public boolean checkPasswort(Scanner scanner) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getAuthor().getClass().getSimpleName().equals("UserAdmin")) {
                UserAdmin admin = (UserAdmin) posts[i].getAuthor();
                int count = 3;
                while (count > 0) {
                    System.out.println("enter passwort, please");
                    String passwort = scanner.nextLine();
                    if (admin.getPasswort().equals(passwort))
                        return true;
                    else count--;
                }
                break;
            }
        }
        return false;
    }

    public void updatePostByAdmin(int postID, Scanner scanner) {
        if (checkPasswort(scanner)) {
            boolean flag = false;
            for (int i = 0; i < size; i++) {
                if (posts[i].getPostID() == postID) {
                    System.out.println("Old content: " + posts[i].getContent());
                    System.out.println("Enter new content");
                    posts[i].setContent(scanner.nextLine());
                    System.out.println(postID + " content change to: " + posts[i].getContent());
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("post not found");
            }
        } else {
            System.out.println("access is denied");
        }
    }

    public void deletePostByAdmin(Post post, Scanner scanner) {
        if (checkPasswort(scanner)) {
            boolean check = false;
            for (int i = 0; i < size; i++) {
                if (posts[i].equals(post)) {
                    System.out.println("you are deleting this post ");
                    System.out.println(posts[i].toString());
                    posts[i] = posts[size - 1];
                    size--;
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("post was not found");
            }
        } else {
            System.out.println("access denied");
        }
    }

}
