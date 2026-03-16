import java.util.Scanner;

/**
 * 英雄大陆 · 角色属性分配
 * 任务：接收用户输入的角色名字、力量、敏捷、智力，计算总属性点并输出。
 */
public class RoleAttributes {
    public static void main(String[] args) {
        // 创建Scanner对象接收输入
        Scanner scanner = new Scanner(System.in);

        // TODO 1: 提示用户输入英雄名字
        System.out.println("请输入英雄名字：");
        String name = scanner.nextLine();

        // TODO 2: 提示用户输入力量值
        System.out.println("请输入力量值：");
        int strength = scanner.nextInt();

        // TODO 3: 提示用户输入敏捷值
        System.out.println("请输入敏捷值：");
        int agility = scanner.nextInt();

        // TODO 4: 提示用户输入智力值
        System.out.println("请输入智力值：");
        int intelligence = scanner.nextInt();

        // TODO 5: 计算总属性点（力量+敏捷+智力）
        int total = strength + agility + intelligence;

        // TODO 6: 输出总属性点
        System.out.println("总属性点: " + total);

        // 进阶挑战：如果总属性点超过30，提示“属性点超限，请重新分配”
        // 你可以使用if语句实现这个功能

        scanner.close();
    }
}
