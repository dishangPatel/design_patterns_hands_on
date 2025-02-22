package design_pattern.creational.singleton;

class Resource {
    private static Resource instance = null;

    private Resource() {
    }

    public static Resource getResource() {
        if (instance == null) {
            instance = new Resource();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("doSomething");
    }
}
