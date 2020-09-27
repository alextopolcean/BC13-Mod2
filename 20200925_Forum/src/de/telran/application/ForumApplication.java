package de.telran.application;

import de.telran.dao.Forum;
import de.telran.data.Post;
import de.telran.data.User;
import de.telran.data.UserAdmin;

import java.util.Scanner;

public class ForumApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user1 = new User("Vasja", 28);
        User user2 = new User("Masha", 24);
        UserAdmin admin = new UserAdmin("Max", 32, "space");

        Post post1 = new Post(user1, "Hallo", "Today is beautiful day!");
        Post post2 = new Post(user2, "Wow!, ", "Great day!");
        Post post3 = new Post(admin, "Dream", "Blablabla!");
        Post post4 = new Post(user1, "Nice", "to meet you! ");
        Post post5 = new Post(user1, "Never", "say me tomorrow ");
        Post post6 = new Post(user1, "Hallo", "Today is beautiful day!");

        Forum forum = new Forum(100);
        forum.addPost(post1);
        forum.addPost(post2);
        forum.addPost(post3);
        forum.addPost(post4);
        forum.addPost(post5);
        forum.addPost(post6);

        System.out.println(post1.getLikes()); // вызываем количество лайков
        post1.addLike(); // добавляем лайк
        post1.addLike(); // добавляем лайк
        post1.addLike(); // добавляем лайк
        System.out.println(post1.getLikes()); // вызываем количество лайков

        forum.updatePostByAdmin(post5.getPostID(), scanner);
        System.out.println("--------------------");

        forum.updatePostByAdmin(115, scanner);
        System.out.println("--------------------");


        forum.deletePostByAdmin(post1, scanner);
        scanner.close();
    }
}
