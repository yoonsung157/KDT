package day06;

import java.util.Scanner;

class Post {
    String content;
    String writer;

    Post(String content, String writer){
        this.content = content;
        this.writer = writer;
    }
}

public class aaa{
    public static void main(String[] args) {
        Post posts[] = new Post[100];
        Scanner scan = new Scanner(System.in);

        for(;;){
            System.out.println("============= My Community ============");
            System.out.println("1. 게시물쓰기 2. 게시물출력");
            System.out.println("====================================");
            System.out.print("선택>");
            int ch = scan.nextInt();
            boolean result = false;

            if(ch == 1){
                scan.nextLine();
                System.out.print("내용: ");
                String content = scan.nextLine();
                System.out.print("작성자: ");
                String writer = scan.nextLine();

                Post post = new Post(content, writer);

                for(int i = 0; i < posts.length; i++){
                    if( posts[i] == null){
                        posts[i] = post;
                        result = true;
                        break;
                    }
                }
            }
            else if(ch == 2){
                for( Post post : posts) {
                    if( post != null ){
                        System.out.printf("작성자: %s , 내용: %s \n",post.writer,post.content);
                    }
                    
                }
            }

        }
    }
}