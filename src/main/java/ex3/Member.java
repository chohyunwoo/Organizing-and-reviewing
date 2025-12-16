package ex3;

public class Member {
    String name;
    int age;
    int grade;

    public static class MethodInitMain2 {
        public static void main(String[] args) {

            Member[] members = initMember( "user1", 15, 90);
            for (Member arg : members) {
                System.out.println(arg.name);
                System.out.println(arg.age);
                System.out.println(arg.grade);
            }
        }

        private static Member[] initMember(String name, int age, int grade) {
            Member member1 = new Member();
            member1.name = name;
            member1.age = age;
            member1.grade =grade;
            return new Member[]{member1};
        }
    }
}
