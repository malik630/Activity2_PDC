package main;

public class AssignedResources {
    private  String name;
    private String resource;
    private static AssignedResources assignedResources;
    private AssignedResources(String name, String resource) {
        this.name = name;
    }
    public static AssignedResources create(String name, String resource) {
        if(assignedResources == null) {
            assignedResources = new AssignedResources(name, resource);
        }
        return assignedResources;
    }
}
