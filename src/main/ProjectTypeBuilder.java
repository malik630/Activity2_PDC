package main;

public class ProjectTypeBuilder implements ProjectBuilder {
    @Override
    public void buildProject() {
        createPreProject();
        createShooting();
        createPostProject();
    }
    private void createPreProject() {
    }
    private void createShooting() {
    }
    private void createPostProject() {
    }
}
