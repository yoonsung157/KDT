package day07;

import java.util.Scanner;

class reviewTable{
    int reviewID;
    int CigarID;
    int MemberID;
    String review;
    int score;
    String listDay;
}

class Brandtable {
    int brandID;
    String brandName;
    String brandLogo;

    Brandtable(){}

    Brandtable(int brandID, String brandName){
        this.brandID = brandID;
        this.brandName = brandName;
    }

}

class Repository {

    Brandtable[] posts = new Brandtable[100];

    // 게시물 저장
    boolean save(Brandtable brandtable) {
        for (int index = 0; index < posts.length; index++) {
            if (posts[index] == null) {
                posts[index] = brandtable;
                return true;
            }
        }
        return false;
    }
    // 게시물 전체 목록 반환
    Brandtable[] findAll() {
        return posts;
    }
}

public class Project {
    public static void main(String[] args) {
        Repository repository = new Repository();
        Scanner scan = new Scanner(System.in);
        for (;;) {
            System.out.println("============ 브랜드 관리 ============ ");
            System.out.println("1.브랜드추가 2.브랜드목록");
            System.out.println("====================================== ");
            System.out.print("선택>");
            int ch = scan.nextInt();

            if (ch == 1) {
                
                System.out.print("id : ");     int brandID = scan.nextInt();
                scan.nextLine();
                System.out.print("이름 : ");   String brandName = scan.nextLine();

                Brandtable brandtable = new Brandtable(brandID, brandName);
                boolean result = repository.save(brandtable);

                if (result) { System.out.println("[안내] 추가 성공");} 
                else { System.out.println("[안내] 추가 실패"); }

            } else if (ch == 2) {
                Brandtable[] posts = repository.findAll();
                for (Brandtable brandtable : posts) {
                    if (brandtable != null) {
                        System.out.printf("브랜드 ID:  , 브랜드 이름 : %s %s \n", brandtable.brandID, brandtable.brandName);
                    }
                }
            }
        } // for end
    } // main end
} // class end

