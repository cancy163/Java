import java.util.Scanner;

public class coversupermarket{
    public static void main(String[]arge){
        Scanner input = new Scanner(System.in);
        System.out.println("----------WELCOME老九学堂超市管理系统-----------");
        System.out.println("1.收银系统");
        System.out.println("2.商品管理");
        System.out.println("3.库存管理");
        System.out.println("4.推出系统");
        int choice = input.nextInt();
        if(choice == 1){
            System.out.println("-----------1.收银系统----------");
        }else if(choice == 2){
            System.out.println("-----------2.商品管理----------");
            System.out.println("1.添加商品");
            System.out.println("2.删除商品");
            System.out.println("3.修改商品");
            System.out.println("4.返回上一级菜单");
            System.out.print("请输入选择：");
            choice = input.nextInt();
            switch (choice){
            case 1:
                System.out.println("-----------1.添加商品----------");
                break;
            case 2:
                System.out.println("-----------2.删除商品----------");
                break;
            case 3:
                 System.out.println("-----------3.修改商品----------");
                break;
            case 4:
                 
                break;
            default:
                System.out.println("输入错误，请输入1-4选项。");
                System.exit(0);
            }
        }else if(choice == 3){
            System.out.println("-----------3.库存管理----------");
        }else if(choice == 4){
            System.exit(0);
        }else{
            System.out.println("输入不符合规范，请在(1-4)选项当中进行选择。");
        }
    }
}