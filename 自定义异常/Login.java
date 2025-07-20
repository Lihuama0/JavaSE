public class Login { // 实现自定义异常(受查异常)

    public String userName = "LiHua";
    public String passWord = "hehe";

    public void loginInfo(String userName, String passWord) throws UserNameException,PassWordException{ // 受查异常需要声明
        if (!userName.equals(this.userName)) {
            throw new UserNameException("用户名有问题");
        }
        if (!passWord.equals(this.passWord)) {
            throw new PassWordException("密码有问题");
        }
        System.out.println("登陆成功");
    }

    public static void main(String[] args) {
        Login login = new Login();
        // login.loginInfo("LiHua", "haha");
        try {
            login.loginInfo("LiHua", "heihei");
        } catch (UserNameException e1) {
            System.out.println("捕获了 UserNameException 异常");
            e1.printStackTrace();
        } catch (PassWordException e2) {
            System.out.println("捕获了 PassWordException 异常");
            e2.printStackTrace();
        }
    }
}