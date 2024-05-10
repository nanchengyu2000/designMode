package Agency1;

public class RealPermission implements AbstractPermission{
    @Override
    public void modifyUserInfo() {
        System.out.println("修改用户消息");
    }

    @Override
    public void viewNote() {
        System.out.println("看帖子");
    }

    @Override
    public void publicNote() {
        System.out.println("发帖子");
    }

    @Override
    public void modifyNote() {
        System.out.println("修改贴子");
    }

    @Override
    public void setLevel(int level) {

    }
}
