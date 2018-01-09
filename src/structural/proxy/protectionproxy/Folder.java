package structural.proxy.protectionproxy;

public class Folder implements IFolder {

    @Override
    public void performReadOrWriteOperations() {
        System.out.println(this.getClass() + " : Performing read or write operation on the folder");
    }
}