package Agency1;

public interface AbstractPermission {
    void modifyUserInfo();
    void viewNote();
    void publicNote();
    void modifyNote();
    void setLevel(int level);
}
